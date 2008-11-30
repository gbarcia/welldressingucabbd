
package com.wd.gui.controlparticular;

import com.wd.dominio.Horario;

import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;

/**
 * Manejador de la interfaz gráfica para agregar un nuevo horario
 * @author Gerardo Barcia
 */
public class ControlGuiHorario {

    private Horario horario;
    private ControlGui controlador;

    public ControlGuiHorario() {
        this.controlador = new ControlGui();
    }



    public void  agregarHorarioalSistema (int horaIni, int horaFin, String diaIni,
                            String diaFin) {
        horario = new Horario(0,horaIni,horaFin,diaIni,diaFin);
        boolean resultado = ControlGeneral.getInstance().agregarNuevoHorario(horario);
        if (resultado) {
        controlador.mostrarMensaje("Horario agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }
}
