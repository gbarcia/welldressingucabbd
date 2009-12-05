package com.wd.guiSolicitud.particular;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Item;
import com.wd.dominio.OrdenCompra;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.RegistroSolicitud;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

/**
 * Clase para el manejo de interfaz de las ordenes de compra
 * @author Casa
 */
public class ControlGuiOrdenCompra {

    /** variable para el manejo de las operaciones de solicitud*/
    private RegistroSolicitud registro = new RegistroSolicitud();
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private ControlGeneral controlG = ControlGeneral.getInstance();

    /**
     * Constructor por defecto
     */
    public ControlGuiOrdenCompra() {
        this.controlador = new ControlGui();
    }

    /**
     * Operacion para consultar todos los proveedores
     * @return Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> traerTodosLosProveedores() {
        return controlG.todosLosProveedores();
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
     * Operacion para consultar todos los productos que posee un proveedor
     * @param rif String rif del proveedor a consultar
     * @return Coleccion de obhetos Producto
     */
    public Collection<Producto> traerProductosParaProveedor(String rif) {
        return this.controlG.consultaProductosProveedor(rif);
    }

    /**
     * Operacion para validar el formualrio
     * @param fechaGen fecha de generacion
     * @param fechaEst fecha estimada de entrega
     * @param col el carrito de compras
     * @return boolean del resultado de la operacion
     */
    private boolean validarFormulario(Date fechaGen, Date fechaEst, ArrayList<Producto> col) {
        boolean resultado = false;
        if ((fechaEst != null) && (fechaGen != null) && (!col.isEmpty())) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Operacion para pasar del carrito de compras a una coleccion de itemes
     * necesarios para poder ingresarlos en la bd
     * @param col el carrito de compras
     * @param idSolicitud el numero de solicitud
     * @return Coleccion de objetos Item
     */
    public Collection<Item> productoToItem(ArrayList<Producto> col, int idSolicitud) {
        Collection<Item> resultado = new Vector();
        for (Producto producto : col) {
            Item i = new Item(producto.getId(), idSolicitud, producto.getDepartamentoId(),
                    producto.getPrecio());
            resultado.add(i);
        }
        return resultado;
    }

    /**
     * Operacion para buscar un producto en una coleccion de productos
     * @param idProducto identificador del producto
     * @param col coleccion de productos
     * @return objeto producto a encontrar o null en caso contrario
     */
    public Producto buscarProductoAux(Integer idProducto, Collection<Producto> col) {
        Producto resultado = null;
        for (Producto producto : col) {
            if (idProducto == producto.getId()) {
                resultado = producto;
            }
        }
        return resultado;
    }

    /**
     * Operacion para pasar los objetos items a objetos producto
     * @param col coleccion de objetos item
     * @param rif rif del proveedor a quien pertencen los productos
     * @return Coleccion de productos
     */
    public ArrayList<Producto> itemToProducto(Collection<Item> col, String rif) {
        ArrayList<Producto> resultado = new ArrayList<Producto>();
        Collection<Producto> productosProve = this.controlG.consultaProductosProveedor(rif);
        for (Item item : col) {
            Producto p = this.buscarProductoAux(item.getIdProducto(), productosProve);
            p.setDepartamentoId(item.getCantidad());
            resultado.add(p);
        }
        return resultado;
    }

    /**
     * Operacion para traer todas las ordenes de compra
     * @return Coleccion de objetos OrdenCompra
     */
    public Collection<OrdenCompra> traerTodasLasOrdenes() {
        Collection<OrdenCompra> resultado = null;
        resultado = this.registro.traerTodasLasOrdenesDeCompra();
        return resultado;
    }

    /**
     * Operacion para buscar una orden de compra
     * @param numeroOrden int el numero de orden de la orden a buscar
     * @return Objeto Orden de Compra con la coleccion de Items
     */
    public OrdenCompra buscarOrdenCompra(int numeroOrden) {
        return this.registro.buscarOrdenCompra(numeroOrden);
    }

    /**
     * Operacion para procesar una orden de compra
     * @param codigoCentro codigo del centro
     * @param rifProve rif del proveedor
     * @param fechaGen fecha Generacion
     * @param fechaEst fecha estimada de entrega
     * @param productos coleccion de productos
     * @param idSol numero de la solicitud
     */
    public void procesarOrdenCompra(int codigoCentro, String rifProve, Date fechaGen,
            Date fechaEst, ArrayList<Producto> productos, int idSol) {
        boolean formularioValido = this.validarFormulario(fechaGen, fechaEst, productos);
        boolean resultado = false;
        Collection<Item> coleccionItems;
        if (formularioValido) {
            OrdenCompra oc = new OrdenCompra(codigoCentro, rifProve, "", 0, fechaGen, fechaEst, 0);
            coleccionItems = this.productoToItem(productos, idSol);
            oc.setColeccionProductos(coleccionItems);
            resultado = this.registro.procesarOrdenCompra(oc);
            if (resultado) {
                controlador.mostrarMensaje("Orden de compra: " + idSol + " registrada con exito", 0);
            } else if (!resultado) {
                controlador.mostrarMensaje("Error: Operacion Fallida", 1);
            }
        } else if (!formularioValido) {
            controlador.mostrarMensaje("Error: Faltan elementos", 1);
        }
    }

    /**
     * Operacion para actualizar una orden de compra en el sistema
     * @param oc la orden de compra a actualizar
     */
    public void actualizarOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        if (oc.getColeccionProductos() != null) {
            resultado = this.registro.actualizarOrdenCompra(oc);
            if (resultado) {
                controlador.mostrarMensaje("Orden de compra: " + oc.getId() + " actualizada con exito", 0);
            } else {
                controlador.mostrarMensaje("Error: Operacion Fallida", 1);
            }
        } else {
            controlador.mostrarMensaje("Error: Faltan elementos", 1);
        }
    }
}
