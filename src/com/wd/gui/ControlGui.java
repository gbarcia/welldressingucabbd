/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.gui;

/**
 *
 * @author Gerardo Barcia
 */
public class ControlGui {

    private VentanaInicio ventanaInicio = new VentanaInicio();

    public ControlGui() {

        this.iniciarCerrarVentanaInicio(true);
    }

    public void iniciarCerrarVentanaInicio (boolean var) {
        ventanaInicio.setVisible(var);
    }




}
