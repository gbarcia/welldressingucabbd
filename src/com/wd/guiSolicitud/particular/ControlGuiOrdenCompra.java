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

    private boolean validarFormulario(Date fechaGen, Date fechaEst, ArrayList<Producto> col) {
        boolean resultado = false;
        if ((fechaEst != null) && (fechaGen != null) && (!col.isEmpty())) {
            resultado = true;
        }
        return resultado;
    }

    private Collection<Item> productoToItem(ArrayList<Producto> col, int idSolicitud) {
        Collection<Item> resultado = new Vector();
        for (Producto producto : col) {
            Item i = new Item(producto.getId(), idSolicitud, producto.getDepartamentoId(),
                    producto.getPrecio());
            resultado.add(i);
        }
        return resultado;
    }

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
}
