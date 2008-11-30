
package com.wd.gui;

/**
 *Clase para el manejo de las ventanas de la aplicacion y otras funcionalidades
 * @author Gerardo Barcia
 */
public class ControlGui {

/** variable de la ventana de inicio*/
    private VentanaInicio ventanaInicio = new VentanaInicio();

/** Constructor del ControlGui */
    public ControlGui() {

    }

/**
 * metodo para ocultar o mostrar la ventana de inicio
 * @param var booleano que indica si mostrar o no la ventana
 */
    public void iniciarCerrarVentanaInicio (boolean var) {
        ventanaInicio.setVisible(var);
    }
}
