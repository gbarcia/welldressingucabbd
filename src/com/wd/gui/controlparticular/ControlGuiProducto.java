/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Producto;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Jonathan Trujillo
 */
public class ControlGuiProducto {

    /** variable para el manejo de la entidad producto*/
    private Producto producto;

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlGeneral = ControlGeneral.getInstance();

    /**
     * Contructor de la clase
     */
    public ControlGuiProducto() {
        this.controlador = new ControlGui();
    }

    /**
     * Metodo para agregar un producto
     * @param nombre el nombre del producto
     * @param descripcion la descripcion del producto
     */
    public boolean agregarProducto(String nombre, String descripcion){
        this.producto = new Producto(0, nombre, descripcion);
        boolean  resultado = this.controlGeneral.agregarProducto(producto);
        if (resultado) {
            controlador.mostrarMensaje("Producto agregado con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
            return resultado;
    }

    public Vector<Producto> traerTodosLosProductos() {
        return new Vector<Producto>(controlGeneral.traerTodosLosProductos());
    }

     /**
     * Metodo para buscar un determinado producto y sus proveedores
     * @param codigoProd int codigo del producto
     * @return vectorResult Vector con el producto y sus proveedores
     */
    public Vector traerProductoConProveedores(int codigoProd) {
        Vector<Producto> vectorResult = null;
        Collection<Producto> coleccion = ControlGeneral.getInstance().consultaProductoProveedor(codigoProd);
        vectorResult = new Vector();
        for (Producto prod : coleccion) {
            vectorResult.add(prod);
        }
        return vectorResult;
    }

    public boolean modificarProducto(Producto producto) {
        boolean resultado = controlGeneral.modificarProducto(producto);
        if (resultado) {
            controlador.mostrarMensaje("Producto modificado con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
            return resultado;
    }

    public boolean eliminarProducto(int id) {
        boolean resultado = controlGeneral.eliminarProducto(id);
        if (resultado) {
            controlador.mostrarMensaje("Producto eliminado con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida. \nVerifique que no existan registros de historial.", 1);
        }
            return resultado;
    }

}
