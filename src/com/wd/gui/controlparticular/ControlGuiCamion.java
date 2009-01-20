/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Camion;
import com.wd.dominio.CentroDistribucion;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Johnny
 */
public class ControlGuiCamion {

    /** variable para el manejo de la entidad Tienda */
    private Camion camion;

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlGeneral = ControlGeneral.getInstance();

    public ControlGuiCamion() {
        this.controlador = new ControlGui();
    }

    public boolean  agregarCamion(String placa, String modelo, String color, String estado, String capacidad, int centro) {
        if (!this.esEntero(capacidad)) return false;
        this.camion = new Camion(0, placa, modelo, color, estado, Integer.parseInt(capacidad), centro);
        boolean resultado = controlGeneral.agregarCamion(camion);
        if (resultado) {
            controlador.mostrarMensaje("Camion agregado con éxito",0);
        } else if (!resultado) {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
        return resultado;
    }

    public Vector<Camion> traerTodosLosCamiones() {
        return new Vector<Camion>(controlGeneral.traerTodosLosCamiones());
    }

    public boolean modificarCamion(Camion camion) {
        boolean resultado =  controlGeneral.modificarCamion(camion);
        if (resultado) {
            controlador.mostrarMensaje("Camion modificado con éxito",0);
        } else if (!resultado) {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
        return resultado;
    }

    public boolean eliminarCamion(int id) {
        boolean resultado = controlGeneral.eliminarCamion(id);
        if (resultado) {
            controlador.mostrarMensaje("Camion eliminado con éxito",0);
        } else if (!resultado) {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
        return resultado;
    }

    public Vector<CentroDistribucion> traerTodosLosCentros() {
        return new Vector<CentroDistribucion>(controlGeneral.traerTodosLosCentros());
    }

    public boolean esEntero(String string){
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
