package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 *
 * @author Casa
 */
public class ControlOrdenCompra implements IfaceSolicitud {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());
    /** Variable para trabajar con los items*/
    private ControlItem controlItem;
    /** Variable para trabajar con el inventario de los centros*/
    private ControlInventario controlInventario;

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlOrdenCompra() throws IOException {
        bitacora.info("Iniciando controlador de OrdenCompra");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Operacion para registrar una orden de compra en el sistema
     * @param orden objeto orden de compra con sus items
     * @return boolean resultado de la operacion
     */
    public boolean agregarOrden(OrdenCompra orden) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) sqlMap.insert("agregarOrden", orden);
            orden.setId(pk - 1);
            bitacora.info("Orden: " + orden.getId() + " agregado con éxito");
            if (pk != null) {
                Collection<Item> coleccionItem = orden.getColeccionProductos();
                this.controlItem = new ControlItem();
                for (Item item : coleccionItem) {
                    item.setIdSolicitud(pk - 1);
                    this.controlItem.agregarItem(item);
                }
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + orden.getId() +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener el siguiente numero de orden de compra
     * @return int el siguiente numero
     */
    public int obtenerSiguienteNumeroOrden() {
        Integer resultado = 0;
        try {
            resultado = (Integer) sqlMap.queryForObject("siguienteNumeroOrden");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todas las ordenes de compra del sistema
     * @return Coleccion de objetos OrdenCompra
     */
    public Collection<OrdenCompra> traerTodasLasOrdenesDeCompra() {
        Collection<OrdenCompra> resultado = null;
        try {
            resultado = sqlMap.queryForList("todasOrdenCompra");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para buscar una orden de compra
     * @param numeroOrden int el numero de orden de la orden a buscar
     * @return Objeto Orden de Compra con la coleccion de Items
     */
    public OrdenCompra buscarOrdenCompra(int numeroOrden) {
        OrdenCompra aux = null;
        Collection<Item> items = null;
        try {
            aux = (OrdenCompra) this.sqlMap.queryForObject("buscarOrden", numeroOrden);
            items = this.controlItem.traerTodosItems(numeroOrden);
            aux.setColeccionProductos(items);
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return aux;
        }
    }

    /**
     * Operacion para cambiar el estado de una orden de compra
     * @param oc Objeto Orden de Compra
     * @return bolean con el resultado de la operacion
     */
    public boolean cambiarEstadoOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        try {
            int na = 0;
            na = sqlMap.update("cambiarEstadoOrden", oc);
            if (na > 0) {
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    public boolean actualizarOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        int codigoCentro = oc.getCentroCodigo();
        switch (oc.getStatus()) {
            case 2: {
                Collection<Item> coleccion = oc.getColeccionProductos();
                for (Item item : coleccion) {
                    Integer cantidad = item.getCantidad();
                    int idProducto = item.getIdProducto();
                    Inventario inven = new Inventario(codigoCentro, idProducto, cantidad);
                    boolean exitoInv = this.actualizarInventario(inven);
                    break;
                }
            }
            case 3: {
            }
            default:
                break;
        }
        resultado = this.cambiarEstadoOrdenCompra(oc);
        return resultado;
    }

    /**
     * Operacion para actualizar el inventario de un centro
     * @param aAct objeto de tipo inventario
     * @return boolean del resultado
     */
    public boolean actualizarInventario(Object aAct) {
        boolean resultado = false;
        if (aAct instanceof Inventario) {
            try {
                this.controlInventario = new ControlInventario();
                resultado = this.controlInventario.modificarInventarioTeoCentro((Inventario) aAct);
            } catch (IOException ex) {
                bitacora.error("No se pudo operar porque " + ex.getMessage());
            } finally {
                return resultado;
            }
        } else {
            return resultado;
        }
    }
}
