package com.wd.gui;

import java.util.Vector;
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

/** Variable de la ventana agregar centro*/
    private VentanaAgregarCentro ventanaAgregarCentro;

/** Variable de la ventana ver horarios*/
    private VentanaConsultaHorarios ventanaConsultaHorarios;

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
    public void iniciarVentanaNuevoHorario (boolean var) {
        ventanaNuevoHorario = new VentanaNuevoHorario();
        ventanaNuevoHorario.setVisible(var);      
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar centro
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaAgregarCentro (boolean var) {
        ventanaAgregarCentro = new VentanaAgregarCentro();
        ventanaAgregarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de ver horarios
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarHorario (boolean var, Vector result) {
        ventanaConsultaHorarios = new VentanaConsultaHorarios(result);
        ventanaConsultaHorarios.setVisible(var);
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
