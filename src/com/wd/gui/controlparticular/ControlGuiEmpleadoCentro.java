/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;

/**
 *
 * @author Jonathan Trujillo
 */
public class ControlGuiEmpleadoCentro {

    /* variable para el manejo de la entidad empleado  */
    private Empleado empleado;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiEmpleadoCentro() {
        this.controlador = new ControlGui();
    }

    public boolean agregarEmpleadoCentro(Empleado emp) {
        return controlG.agregarEmpleadoCentro(emp);
    }



}
