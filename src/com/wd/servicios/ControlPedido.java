package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.Pedido;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * Clase que ofrece los servicios para trabajar con los pedidos
 * @author Casa
 */
public class ControlPedido implements IfaceSolicitud {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());
    /** Variable para trabajar con los items*/
    private ControlItem controlItem;
    /** Variable para trabajar con el inventario de los centros*/
    private ControlInventario controlInventario;

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlPedido() throws IOException {
        bitacora.info("Iniciando controlador de Pedido");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Operacion para agregar un pedido en la base de datos
     * @param p objeto pedido a agregar con su coleccion de items
     * @return boolean con el resultado de la operacion
     */
    public boolean agregarUnPedido(Pedido p) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) this.sqlMap.insert("agregarPedido", p);
            p.setId(pk - 1);
            bitacora.info("Pedido: " + p.getId() + " agregado con éxito");
            if (pk != null) {
                Collection<Item> coleccionItem = p.getColeccionProductos();
                this.controlItem = new ControlItem();
                for (Item item : coleccionItem) {
                    item.setIdSolicitud(pk - 1);
                    this.controlItem.agregarItem(item);
                }
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + p.getId() +
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

    public boolean actualizarInventario(Object aAct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Operacion que retorna el invenario actual de un centro de distribucion
     * @param codigoCentro int codigo del centro a consultar su inventario
     * @return Coleccion de objetos Inventario
     */
    public Collection<Inventario> traerInventarioActualCentro(int codigoCentro) {
        try {
            this.controlInventario = new ControlInventario();
        } catch (IOException ex) {
        } finally {
            return this.controlInventario.traerInventarioTeoCentro(codigoCentro);
        }
    }

    /**
     * Operacion para obtener si un producto existe en el inventario de un centro y que cantidad tiene
     * @param idProducto int id del producto
     * @param idCentro int ide del centro
     * @return null si no existe o un numero entero con su cantidad
     */
    private Integer obtenerCantidadActualProductoyExistencia(int idProducto, int idCentro) {
        Inventario inv = new Inventario();
        try {
            this.controlInventario = new ControlInventario();
            inv.setProductoId(idProducto);
            inv.setCentroDistribucionCodigo(idCentro);
            inv.setCantidad(0);
        } catch (IOException ex) {
        } finally {
            return this.controlInventario.verificarSiExisteProductoYcantidad(inv);
        }
    }

    /**
     * Operacion para agregar un producto al inventario de un centro
     * @param inv objeto inventario a agregar
     * @return booleano de la operacion
     */
    private boolean agregarProductoInventarioCentro(Inventario inv) {
        try {
            this.controlInventario = new ControlInventario();
        } catch (IOException ex) {
        } finally {
            return this.controlInventario.agregarRegistroInventario(inv);
        }
    }

    /**
     * Operacion para actualizar el inventario de un centro
     * @param col coleccion de objetos inventarios a actualizar
     * @param operacion la operacion a realizar 0 suma 1 resta
     * @return boleano con el exito de la operacion
     */
    public boolean ActualizarInventarioCentro(Collection<Inventario> col, int operacion) {
        int cantidadNueva = 0;
        boolean resultado = false;
        try {
            this.controlInventario = new ControlInventario();
            for (Inventario inventario : col) {
                Integer cantidad = this.obtenerCantidadActualProductoyExistencia(inventario.getProductoId(), inventario.getCentroDistribucionCodigo());
                if (cantidad == null) {
                    resultado = this.agregarProductoInventarioCentro(inventario);
                } else {
                    if (operacion == 0) //suma
                    {
                        cantidadNueva = cantidad + inventario.getCantidad();
                    } else if (operacion == 1) // resta
                    {
                        cantidadNueva = cantidad - inventario.getCantidad();
                    }
                    inventario.setCantidad(cantidadNueva);
                    resultado = this.controlInventario.modificarInventarioTeoCentro(inventario);
                }
            }
        } catch (IOException ex) {
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener si un producto existe en el inventario de un centro y que cantidad tiene
     * @param idProducto int id del producto
     * @param idTienda int id de la tienda
     * @return null si no existe o un numero entero con su cantidad
     */
    public Integer obtenerCantidadActualProductoyExistenciaTienda(int idProducto, int idTienda) {
        Inventario inv = new Inventario();
        try {
            this.controlInventario = new ControlInventario();
            inv.setProductoId(idProducto);
            inv.setTiendaCodigo(idTienda);
            inv.setCantidad(0);
        } catch (IOException ex) {
        } finally {
            return this.controlInventario.verificarSiExisteProductoYcantidadTienda(inv);
        }
    }

    /**
     * Operacion para agregar un producto al inventario de un centro
     * @param inv objeto inventario a agregar
     * @return booleano de la operacion
     */
    private boolean agregarProductoInventarioTienda(Inventario inv) {
        try {
            this.controlInventario = new ControlInventario();
        } catch (IOException ex) {
        } finally {
            return this.controlInventario.agregarRegistroInventarioTienda(inv);
        }
    }

    /**
     * Operacion para actualizar el inventario de un centro
     * @param col coleccion de objetos inventarios a actualizar
     * @param operacion la operacion a realizar 0 suma 1 resta
     * @return boleano con el exito de la operacion
     */
    public boolean ActualizarInventarioTienda(Collection<Inventario> col, int operacion) {
        int cantidadNueva = 0;
        boolean resultado = false;
        try {
            this.controlInventario = new ControlInventario();
            for (Inventario inventario : col) {
                Integer cantidad = this.obtenerCantidadActualProductoyExistenciaTienda(inventario.getProductoId(), inventario.getTiendaCodigo());
                if (cantidad == null) {
                    resultado = this.agregarProductoInventarioTienda(inventario);
                } else {
                    if (operacion == 0) //suma
                    {
                        cantidadNueva = cantidad + inventario.getCantidad();
                    } else if (operacion == 1) // resta
                    {
                        cantidadNueva = cantidad - inventario.getCantidad();
                    }
                    inventario.setCantidad(cantidadNueva);
                    resultado = this.controlInventario.modificarInventarioTienda(inventario);
                }
            }
        } catch (IOException ex) {
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para traer todos los pedidos registrados en el sistema
     * @return Coleccion de objetos Pedido
     */
    public Collection<Pedido> traerTodosLosPedidos() {
        Collection<Pedido> resultado = null;
        try {
            resultado = sqlMap.queryForList("todosLosPedidos");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para buscar un pedido particular en el sistema
     * @param numeroPedido int numero de pedido a consultar
     * @return Objeto Pedido
     */
    public Pedido buscarPedido(int numeroPedido) {
        Pedido aux = null;
        Collection<Item> items = null;
        try {
            aux = (Pedido) this.sqlMap.queryForObject("buscarPedido", numeroPedido);
            this.controlItem = new ControlItem();
            items = this.controlItem.traerTodosItems(numeroPedido);
            aux.setColeccionProductos(items);
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return aux;
        }
    }

    /**
     * Operacion para cambiar el estado de un pedido
     * @param p el pedido a cambiarle el estado
     * @return boleano del resultado de la operacion
     */
    public boolean cambiarEstadoPedido(Pedido p) {
        boolean resultado = false;
        try {
            int na = 0;
            na = sqlMap.update("cambiarEstadoPedido", p);
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
     * Operacion para actualizar un pedido dependiendo de su estado
     * @param p Objeto Pedido a actualizar
     * @return boleano con el resultado de la operacion
     */
    public boolean actualizarPedido(Pedido p) {
        boolean resultado = false;
        Collection<Item> coleccion = p.getColeccionProductos();
        Collection<Inventario> colInv = new Vector<Inventario>();
        boolean re = this.actualizarListaItems(coleccion);
        switch (p.getStatus()) {
            case 1: { //despachado
                for (Item item : coleccion) {
                    Inventario i = new Inventario();
                    i.setCentroDistribucionCodigo(p.getCentroCodigo());
                    i.setProductoId(item.getIdProducto());
                    i.setCantidad(item.getCantidad());
                    colInv.add(i);
                }
                this.ActualizarInventarioCentro(colInv, 1); // Descontar Inventario Centro
                break;
            }
            case 2: { // recibido
                for (Item item : coleccion) {
                    Inventario i = new Inventario();
                    i.setTiendaCodigo(p.getTiendaCodigo());
                    i.setProductoId(item.getIdProducto());
                    i.setCantidad(item.getCantidad());
                    colInv.add(i);
                }
                this.ActualizarInventarioTienda(colInv, 0); // Aumentar Inventario de la Tienda
                break;
            }
            case 3: { // cancelado
                for (Item item : coleccion) {
                    Inventario i = new Inventario();
                    i.setCentroDistribucionCodigo(p.getCentroCodigo());
                    i.setProductoId(item.getIdProducto());
                    i.setCantidad(item.getCantidad());
                    colInv.add(i);
                }
                this.ActualizarInventarioCentro(colInv, 0); // Aumentar Inventario Centro
                break;
            }
            default:
                break;
        }
        resultado = this.cambiarEstadoPedido(p);
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
}
