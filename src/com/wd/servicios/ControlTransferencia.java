package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.Transferencia;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 *
 * @author Casa
 */
public class ControlTransferencia implements IfaceSolicitud {
    
    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());
    /** Variable para trabajar con los items*/
    private ControlItem controlItem;
    /** Variable para trabajar con el inventario de los centros*/
    private ControlInventario controlInventario;

    public ControlTransferencia() throws IOException {
        bitacora.info("Iniciando controlador de Transferencia");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }



    /**
     * Operacion para registrar una tranferencia en el sistema
     * @param orden objeto transferencia con sus items
     * @return boolean resultado de la operacion
     */
    public boolean agregarTransferencia(Transferencia trans) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) sqlMap.insert("agregarTransferencia", trans);
            trans.setId(pk - 1);
            bitacora.info("Transferencia: " + trans.getId() + " agregada con éxito");
            if (pk != null) {
                Collection<Item> coleccionItem = trans.getColeccionProductos();
                this.controlItem = new ControlItem();
                for (Item item : coleccionItem) {
                    item.setIdSolicitud(pk - 1);
                    this.controlItem.agregarItem(item);
                }
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + trans.getId() +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener el siguiente numero de transferencia
     * @return int el siguiente numero
     */
    public int obtenerSiguienteNumeroOrden() {
        Integer resultado = 0;
        try {
            resultado = (Integer) sqlMap.queryForObject("siguienteNumeroTrans");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todas las ordenes de compra del sistema
     * @return Coleccion de objetos Transferencia
     */
    public Collection<Transferencia> traerTodasLasTransferencias() {
        Collection<Transferencia> resultado = null;
        try {
            resultado = sqlMap.queryForList("todasLasTransferencias");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para buscar una Transferencia
     * @param numeroTrans int el numero de orden de la transferencia a buscar
     * @return Objeto Orden de Compra con la coleccion de Items
     */
    public Transferencia buscarTransferencia(int numeroTrans) {
        Transferencia aux = null;
        Collection<Item> items = null;
        try {
            aux = (Transferencia) this.sqlMap.queryForObject("buscarTrasferencia", numeroTrans);
            this.controlItem = new ControlItem();
            items = this.controlItem.traerTodosItems(numeroTrans);
            aux.setColeccionProductos(items);
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return aux;
        }
    }

    /**
     * Operacion para cambiar el estado de una transferencia
     * @param trans Objeto Transferencia
     * @return boolean con el resultado de la operacion
     */
    public boolean cambiarEstadoTransferencia(Transferencia trans) {
        boolean resultado = false;
        try {
            int na = 0;
            na = sqlMap.update("cambiarEstadoTransferencia", trans);
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
     * Operacion para actualizar una transferencia
     * @param trans transferencia a actualizar
     * @return booleano de la operacion
     */
    public boolean actualizarTransferencia(Transferencia trans) {
        boolean resultado = false;
        int codigoTiendaTransfiere = trans.getIdTiendaQueTransfiere();
        int codigoTiendaRecibe = trans.getIdTiendaQueRecibe();
        Collection<Item> coleccion = trans.getColeccionProductos();
        boolean re = this.actualizarListaItems(coleccion);
        switch (trans.getStatus()) {
            case 1: { // despachada
                for (Item item : coleccion) {
                    Integer cantidad = item.getCantidad();
                    int idProducto = item.getIdProducto();
                    Inventario inven = new Inventario();
                    inven.setTiendaCodigo(codigoTiendaTransfiere);
                    inven.setProductoId(idProducto);
                    inven.setCantidad(cantidad);
                    Integer cantidadProductoActual = this.obtenerCantidadProductoActual(inven);
                    if (cantidadProductoActual == null) {
                        boolean exitoIng = false;//Porq el inventario producto no existe ne la tienda
                    } else {
                        if(cantidadProductoActual > cantidad){
                            Integer cantTotal = cantidadProductoActual - cantidad;
                            inven.setCantidad(cantTotal);
                            boolean exitoInv = this.actualizarInventario(inven);
                        }
                    }
                }
                break;
            }
            case 2: { // recibida
                for (Item item : coleccion) {
                    Integer cantidad = item.getCantidad();
                    int idProducto = item.getIdProducto();
                    Inventario invenRecibido = new Inventario();
                    invenRecibido.setTiendaCodigo(codigoTiendaRecibe);
                    invenRecibido.setProductoId(idProducto);
                    invenRecibido.setCantidad(cantidad);
                    Inventario inven = new Inventario();
                    inven.setTiendaCodigo(codigoTiendaTransfiere);
                    inven.setProductoId(idProducto);
                    inven.setCantidad(cantidad);
                    Integer cantidadProductoActual = this.obtenerCantidadProductoActual(invenRecibido);
                    if (cantidadProductoActual == null) {
                        boolean exitoIng  = this.agregarObjetoInventario(invenRecibido);
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
                    inven.setTiendaCodigo(codigoTiendaTransfiere);
                    inven.setProductoId(idProducto);
                    inven.setCantidad(cantidad);
                    Integer cantidadProductoActual = this.obtenerCantidadProductoActual(inven);
                    Integer canTotal = cantidadProductoActual + cantidad;
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
        resultado = this.cambiarEstadoTransferencia(trans);
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
                resultado = this.controlInventario.modificarInventarioTienda((Inventario) aAct);
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
     * Operacion para averiguar la cantidad y si existe de un producto en el
     * inventario de ima tienda
     * @param i Objeto Inventario
     * @return null si no existe Integer con una cantidad si existe
     */
    public Integer obtenerCantidadProductoActual(Inventario i) {
        Integer cantidad = null;
        try {
            this.controlInventario = new ControlInventario();
            cantidad = this.controlInventario.verificarSiExisteProductoYcantidadTienda(i);
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
            resultado = this.controlInventario.agregarRegistroInventarioTienda(inv);
        } catch (IOException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

}
