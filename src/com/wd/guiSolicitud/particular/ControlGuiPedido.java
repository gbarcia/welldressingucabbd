package com.wd.guiSolicitud.particular;

import com.wd.dominio.Camion;
import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Empleado;
import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.Pedido;
import com.wd.dominio.Producto;
import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.ControlInventario;
import com.wd.servicios.ControlPedido;
import com.wd.servicios.RegistroSolicitud;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

/**
 * Clase para el manejo de la interfaz de los Pedidos
 * @author Casa
 */
public class ControlGuiPedido {

    /** variable para el manejo de las operaciones de solicitud*/
    private RegistroSolicitud registro = new RegistroSolicitud();
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private ControlGeneral controlG = ControlGeneral.getInstance();
    /** variable para trabajar con el control de los Inventarios */
    private ControlInventario controlInventario;
    /** variable para trabajar con el control de las oc*/
    private ControlGuiOrdenCompra controlOc;
    /** variable para trabajar con el control de las oc*/
    private ControlPedido controlP;

    /**
     * Constructor por defecto
     */
    public ControlGuiPedido() {
        this.controlador = new ControlGui();
    }

    /**
     * Operacion para consultar todas las tiendas
     * @return Coleccion de objetos Tienda
     */
    public Collection<Tienda> traerTodasLasTiendas() {
        return controlG.traerTodasLasTienda();
    }

    /**
     * Operacion para consultar todos los centros
     * @return Colecccion de objetos Centro
     */
    public Collection<CentroDistribucion> traerTodosLosCentros() {
        return this.controlG.traerTodosLosCentros();
    }

    /**
     * Operacion para obtener el siguiente numero de orden de compra
     * @return int el siguiente numero
     */
    public int obtenerNumeroDeOrden() {
        return this.registro.obtenerSiguienteNumeroOrden();
    }

    /**
     * Operacion que retorna el invenario actual de un centro de distribucion
     * @param codigoCentro int codigo del centro a consultar su inventario
     * @return Coleccion de objetos Producto
     */
    public Collection<Producto> traerInventarioActualCentro(int codigoCentro) {
        return this.InventarioToProducto(this.registro.traerInventarioActualCentro(codigoCentro));
    }

    /**
     * Operacion para trasladar o traducir de inventario a productos
     * @param col coleccion de objetos Inventario
     * @return coleccion de objetos Producto
     */
    public Collection<Producto> InventarioToProducto(Collection<Inventario> col) {
        Collection<Producto> resultado = new Vector<Producto>();
        Collection<Producto> coleccionGeneral = this.controlG.traerTodosLosProductos();
        this.controlOc = new ControlGuiOrdenCompra();
        for (Inventario inventario : col) {
            Producto p = this.controlOc.buscarProductoAux(inventario.getProductoId(), coleccionGeneral);
            p.setDepartamentoId(inventario.getCantidad()); // trabajando con id departamento como cantidad
            resultado.add(p);
        }
        return resultado;
    }

    /**
     * Operacion para traer todos los conductores
     * @return Coleccion de Empleado tipo conductor
     */
    public Collection<Empleado> traerTodosLosConductores() {
        return this.controlG.coductoresMasEntregas(); //Reusabilidad!!
    }

    /**
     * Operacion para traer todos los camiones
     * @return Coleccion objetos Camion
     */
    public Collection<Camion> traerTodosLosCamiones() {
        return this.controlG.traerTodosLosCamiones();
    }

    /**
     * Operacion para registrar un pedido en el sistema
     * @param tiendaCodigo int codigo de la tienda
     * @param centroCodigo int codigo del centro
     * @param ciConductor int cedula del conductor
     * @param placaCamion int id del camion
     * @param FechaGen Date fecha emicion
     * @param FechaEst Date fecha estimada
     * @param productos ArraList de productos
     * @param idSolicitud int id del pedido
     */
    public void registrarPedido(int tiendaCodigo, int centroCodigo, int ciConductor,
            int placaCamion, Date FechaGen, Date FechaEst,
            ArrayList<Producto> productos, int idSolicitud) {
        boolean resultado = false;
        Collection<Item> coleccionItems;
        coleccionItems = this.controlOc.productoToItem(productos, idSolicitud);
        Pedido p = new Pedido(tiendaCodigo, centroCodigo, ciConductor, placaCamion, FechaGen, FechaEst, 0);
        p.setColeccionProductos(coleccionItems);
        resultado = this.registro.procesarPedido(p);
        if (resultado) {
            controlador.mostrarMensaje("Pedido: " + p.getId() + " procesado con exito", 0);
        } else {
            controlador.mostrarMensaje("Error: Operacion Fallida", 1);
        }
    }

    /**
     * Operacion para traer todos los pedidos registrados en el sistema
     * @return Coleccion de objetos Pedido
     */
    public Collection<Pedido> traerTodosLosPedidos() {
        Collection<Pedido> resultado = null;
        try {
            this.controlP = new ControlPedido();
            resultado = this.controlP.traerTodosLosPedidos();
        } catch (IOException ex) {
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para buscar un pedido
     * @param numero int numero del pedido
     * @return Objeto Pedido con sus items
     */
    public Pedido buscarPedido(int numero) {
        Pedido resultado = null;
        try {
            this.controlP = new ControlPedido();
            resultado = this.controlP.buscarPedido(numero);
        } catch (IOException ex) {
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para pasar los objetos items a objetos producto
     * @param col coleccion de objetos item
     * @param tiendaCodigo codigo de la tienda
     * @return Coleccion de productos
     */
    public ArrayList<Producto> itemToProducto(Collection<Item> col, int tiendaCodigo) {
        ArrayList<Producto> resultado = new ArrayList<Producto>();
        Collection<Producto> productosProve = this.controlG.traerTodosLosProductos();
        this.controlOc = new ControlGuiOrdenCompra();
        for (Item item : col) {
            Producto p = this.controlOc.buscarProductoAux(item.getIdProducto(), productosProve);
            p.setDepartamentoId(item.getCantidad());
            resultado.add(p);
        }
        return resultado;
    }

    /**
     * Operacion para obtener el inventario actual de una tienda
     * @param codigoTienda int codigo de la tienda
     * @return Coleccion de productos
     */
    public Collection<Producto> traerInventarioActualTienda(int codigoTienda) {
        try {
            this.controlInventario = new ControlInventario();
        } catch (IOException ex) {
        }
        return this.InventarioToProducto(this.controlInventario.traerInventarioTeoTienda(codigoTienda));
    }

    /**
     * Operacion para actualizar una pedido en el sistema
     * @param p el pedido a actualizar
     */
    public void actualizarOrdenCompra(Pedido p) {
        boolean resultado = false;
        if (p.getColeccionProductos() != null) {
            try {
                this.controlP = new ControlPedido();
            } catch (IOException ex) {
            }
            resultado = this.controlP.actualizarPedido(p);
            if (resultado) {
                controlador.mostrarMensaje("Pedido: " + p.getId() + " actualizado con exito", 0);
            } else {
                controlador.mostrarMensaje("Error: Operacion Fallida", 1);
            }
        } else {
            controlador.mostrarMensaje("Error: Faltan elementos", 1);
        }
    }
}
