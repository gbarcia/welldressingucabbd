/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Producto;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;

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
     * @param subclase_id el id de la subclase del producto
     */
    public void agregarProducto(String nombre, String descripcion, int subclase_id){
        this.producto = new Producto(subclase_id, nombre, descripcion);
        boolean resultado = this.controlGeneral.agregarProducto(producto);
        if (resultado) {
            controlador.mostrarMensaje("Producto agregado con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }

    public void validarAgregarProducto(String nombre, int subclase_id){

    }
}