
package com.wd.gui.controlparticular;

import com.wd.dominio.Lugar;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Vector;

/**
 * Manejador de la interfaz gráfica para Lugar
 * @author Gerardo Barcia
 */
public class ControlGuiLugar {

    /** variable para el manejo de la entidad lugar */
    private Lugar lugar;

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();
    
    /** constructor que inicia el control general GUI */
    public ControlGuiLugar() {
        this.controlador = new ControlGui();
    }

    public Vector traerTodosLosLugares () {
        return null;
    }
}
