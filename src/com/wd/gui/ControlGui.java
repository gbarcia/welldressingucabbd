
package com.wd.gui;

import javax.swing.JOptionPane;

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

    /**
* Operacion para mostrar un mensaje de salida en pantalla
* @param mensaje mensaje a mostrar
* @param tipo tipo de mensaje a mostrar. Si es "1" es un mensaje de error, "2"
* si el mensaje es de confirmacion y "0" si el mensaje es de informacion
*/
    public void mostrarMensaje (String mensaje, int tipo) {
        if (tipo == 0)
            JOptionPane.showMessageDialog(null,mensaje,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        else if (tipo == 1)
            JOptionPane.showMessageDialog(null,mensaje,"Resultado",JOptionPane.ERROR_MESSAGE);        
    }
}
