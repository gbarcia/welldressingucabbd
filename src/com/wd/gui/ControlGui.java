package com.wd.gui;

import javax.swing.JOptionPane;

/**
 *Clase para el manejo de las ventanas de la aplicacion y otras funcionalidades
 * @author Gerardo Barcia
 */
public class ControlGui {

/** variable de la ventana de inicio*/
    private VentanaInicio ventanaInicio = new VentanaInicio();

/** variable de la ventana agregar nuevo horario*/
    private VentanaNuevoHorario ventanaNuevoHorario;

/** Constructor del ControlGui */
    public ControlGui() {
    }

/**
* metodo para ocultar o mostrar la ventana de inicio
 * @param var booleano que indica si mostrar o no la ventana
*/
    public void iniciarCerrarVentanaInicio(boolean var) {
        ventanaInicio.setVisible(var);    
    }

/**
* metodo para ocultar o mostrar la ventana de agregar nuevo horario
 * @param var booleano que indica si mostrar o no la ventana
*/
    public void iniciarCerrarVentanaNuevoHorario (boolean var) {
        ventanaNuevoHorario = new VentanaNuevoHorario();
        ventanaNuevoHorario.setVisible(true);
    }

/**
* Operacion para mostrar un mensaje de salida en pantalla
* @param mensaje mensaje a mostrar
* @param tipo tipo de mensaje a mostrar. Si es "1" es un mensaje de error,
* y "0" si el mensaje es de informacion
*/
    public void mostrarMensaje(String mensaje, int tipo) {
        if (tipo == 0) {
            JOptionPane.showMessageDialog(null, mensaje, "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo == 1) {
            JOptionPane.showMessageDialog(null, mensaje, "Resultado",
                    JOptionPane.ERROR_MESSAGE);
        } 
    }

/**
* Operacion para realizar una confirmacion. Despliega en la pantalla una ventana
* de confirmacion donde aparece una opcion de "aceptar" o "cancelar"
* @param mensaje mensaje a mostrar
* @return int 0 si se apreto aceptar y 2 si se apreto cancelar
*/
    public int dialogoConfirmacion (String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje, "CONFIRMACION",
                    JOptionPane.OK_CANCEL_OPTION);
    }
}
