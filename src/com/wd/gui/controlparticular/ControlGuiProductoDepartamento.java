/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Producto;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;

/**
 *
 * @author Jonathan Trujillo
 */
public class ControlGuiProductoDepartamento {

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlGeneral = ControlGeneral.getInstance();

    /**
     * Contructor de la clase
     */
    public ControlGuiProductoDepartamento() {}

    public boolean agregarProductoDepartamento(Producto producto) {
        return controlGeneral.agregarProductoDepartamento(producto);
    }

    public Collection traerTodosLosProductoDepartamento() {
        return controlGeneral.traerTodosLosProductoDepartamento();
    }

    public boolean eliminarProductoDepartamento(Producto producto) {
        return controlGeneral.eliminarProductoDepartamento(producto);
    }

    public Collection traerTodasLasSubclases() {
        return controlGeneral.traerTodasLasSubclases();
    }

    

}
