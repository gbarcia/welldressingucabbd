package com.wd.guiSolicitud.particular;

import com.wd.dominio.Item;
import com.wd.dominio.Producto;
import com.wd.dominio.Tienda;
import com.wd.dominio.Transferencia;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.RegistroSolicitud;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class ControlGuiTransferencia {

    /** variable para el manejo de las operaciones de solicitud*/
    private RegistroSolicitud registro = new RegistroSolicitud();
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private ControlGeneral controlG = ControlGeneral.getInstance();

    /**
     * Constructor por defecto
     */
    public ControlGuiTransferencia() {
        this.controlador = new ControlGui();
    }

    /**
     * Operacion para consultar todos los centros
     * @return Colecccion de objetos Centro
     */
    public Collection<Tienda> traerTodasLasTiendas() {
        return this.controlG.traerTodasLasTienda();
    }

    /**
     * Operacion para obtener el siguiente numero de transferencia
     * @return int el siguiente numero
     */
    public int obtenerNumeroDeOrden() {
        return this.registro.obtenerSiguienteNumeroOrden();
    }

    /**
     * Operacion para consultar todos los productos que de una tienda
     * @param rif String rif del proveedor a consultar
     * @return Coleccion de obhetos Producto
     */
    public Collection<Producto> traerProductosTienda(Integer codigoTienda) {
        return this.controlG.traerTodosLosProductosTienda(codigoTienda);
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
            Item i = new Item(producto.getId(), idSolicitud, producto.getCantidad(),0);
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
     * Operacion para traer todas las Transferencias
     * @return Coleccion de objetos OrdenCompra
     */
    public Collection<Transferencia> traerTodasLasTransferencias() {
        Collection<Transferencia> resultado = null;
        resultado = this.registro.traerTodasLasTransferencias();
        return resultado;
    }

    /**
     * Operacion para buscar una Transferencia
     * @param numeroOrden int el numero de orden de la Transferencia a buscar
     * @return Objeto Transferencia con la coleccion de Items
     */
    public Transferencia buscarTransferencia(int numeroOrden) {
        return this.registro.buscarTransferencia(numeroOrden);
    }

    /**
     * Operacion para procesar una transferencia
     * @param codigoTiendaTransfiere int  codigo de la tienda q transfiere
     * @param codigoTiendaRecibe int  codigo de la tienda q recibe
     * @param fechaGen fecha Generacion
     * @param fechaEst fecha estimada de entrega
     * @param productos coleccion de productos
     * @param idSol numero de la solicitud
     */
    public void procesarTransferencia(int codigoTiendaTransfiere, int codigoTiendaRecibe, Date fechaGen,
            Date fechaEst, ArrayList<Producto> productos, int idSol) {
        boolean formularioValido = this.validarFormulario(fechaGen, fechaEst, productos);
        boolean resultado = false;
        Collection<Item> coleccionItems;
        if (formularioValido) {
            Transferencia trans = new Transferencia(codigoTiendaTransfiere, codigoTiendaRecibe, fechaGen, fechaEst, 0);
            coleccionItems = this.productoToItem(productos, idSol);
            trans.setColeccionProductos(coleccionItems);
            resultado = this.registro.procesarTransferencia(trans);
            if (resultado) {
                controlador.mostrarMensaje("Transferencia: " + idSol + " registrada con exito", 0);
            } else if (!resultado) {
                controlador.mostrarMensaje("Error: Operacion Fallida", 1);
            }
        } else if (!formularioValido) {
            controlador.mostrarMensaje("Error: Faltan elementos", 1);
        }
    }

    /**
     * Operacion para actualizar una Transferencia en el sistema
     * @param oc la orden de compra a actualizar
     */
    public void actualizarTransferencia(Transferencia trans) {
        boolean resultado = false;
        if (trans.getColeccionProductos() != null) {
            resultado = this.registro.actualizarTransferencia(trans);
            if (resultado) {
                controlador.mostrarMensaje("Transferencia: " + trans.getId() + " actualizada con exito", 0);
            } else {
                controlador.mostrarMensaje("Error: Operacion Fallida", 1);
            }
        } else {
            controlador.mostrarMensaje("Error: Faltan elementos", 1);
        }
    }

}
