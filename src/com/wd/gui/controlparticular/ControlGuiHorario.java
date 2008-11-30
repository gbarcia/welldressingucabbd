/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui.controlparticular;

import com.wd.dominio.Horario;

import com.wd.servicios.ControlGeneral;

/**
 *
 * @author Gerardo Barcia
 */
public class ControlGuiHorario {

    private Horario horario;

    public void agregarHorarioalSistema (int horaIni, int horaFin, String diaIni,
                            String diaFin) {
        horario = new Horario(0,horaIni,horaFin,diaIni,diaFin);
        ControlGeneral.getInstance().agregarNuevoHorario(horario);
    }
}
