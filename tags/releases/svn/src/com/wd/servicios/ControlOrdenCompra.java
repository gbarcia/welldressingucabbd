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
 * Clase control para el manejo de las ordenes de compra
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
            resultado = (Integer) sqlMap.queryForObject("siguienteNumeroOrden2");
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
            this.controlItem = new ControlItem();
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

    /**
     * Operacion para actualizar una orden de compra
     * @param oc orden de compra a actualizar
     * @return booleano de la operacion
     */
    public boolean actualizarOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        int codigoCentro = oc.getCentroCodigo();
        Collection<Item> coleccion = oc.getColeccionProductos();
        boolean re = this.actualizarListaItems(coleccion);
        switch (oc.getStatus()) {
            case 2: { // despachado
                for (Item item : coleccion) {
                    Integer cantidad = item.getCantidad();
                    int idProducto = item.getIdProducto();
                    Inventario inven = new Inventario();
                    inven.setCentroDistribucionCodigo(codigoCentro);
                    inven.setProductoId(idProducto);
                    inven.setCantidad(cantidad);
                    Integer cantidadProductoActual = this.obtenerCantidadProductoActual(inven);
                    if (cantidadProductoActual == null) {
                        boolean exitoIng = this.agregarObjetoInventario(inven);
                    } else {
                        Integer cantTotal = cantidadProductoActual + cantidad;
                        inven.setCantidad(cantTotal);
                        boolean exitoInv = this.actualizarInventario(inven);
                    }

                }
                break;
            }
            case 3: { // cancelado
                for (Item item : coleccion) {
                    Integer cantidad = item.getCantidad();
                    int idProducto = item.getIdProducto();
                    Inventario inven = new Inventario();
                    inven.setCentroDistribucionCodigo(codigoCentro);
                    inven.setProductoId(idProducto);
                    inven.setCantidad(cantidad);
                    Integer cantidadProductoActual = this.obtenerCantidadProductoActual(inven);
                    Integer canTotal = cantidadProductoActual - cantidad;
                    if (canTotal < 0) {
                        canTotal = 0;
                    }
                    inven.setCantidad(canTotal);
                    boolean exitoInv = this.actualizarInventario(inven);
                }
                break;
            }
            default:
                break;
        }
        resultado = this.cambiarEstadoOrdenCompra(oc);
        return resultado;
    }

    /**
     * Operacion para actualizar los registros de Items
     * @param items Coleccion de itemes
     * @return boolean de resultado de la operacion
     */
    public boolean actualizarListaItems(Collection<Item> items) {
        boolean resultado = false;
        try {
            this.controlItem = new ControlItem();
            for (Item item : items) {
                this.controlItem.actualizatItem(item);
            }
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
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

    /**
     * Operacion para averiguar la cantidad y si existe de un producto en el inventario
     * del centro
     * @param i Objeto Inventario
     * @return null si no existe Integer con una cantidad si existe
     */
    public Integer obtenerCantidadProductoActual(Inventario i) {
        Integer cantidad = null;
        try {
            this.controlInventario = new ControlInventario();
            cantidad = this.controlInventario.verificarSiExisteProductoYcantidad(i);
        } catch (IOException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return cantidad;
        }
    }

    /**
     * Operacion para agregar un objeto inventario en el sistema
     * @param inv Objeto Inventario a agregar
     * @return booleano con el resultado de la operacion
     */
    public boolean agregarObjetoInventario(Inventario inv) {
        boolean resultado = false;
        try {
            this.controlInventario = new ControlInventario();
            resultado = this.controlInventario.agregarRegistroInventario(inv);
        } catch (IOException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }
}
