package com.wd.servicios;

import com.wd.dominio.Horario;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Clase que reunira todos los controles particulares integrados en uno
 * para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class ControlGeneral implements IfaceControlGeneral {

    /** Variable para trabajar con el controlador de los horario*/
    private ControlHorario controlHorario;
    /** Variable para obtener una instancia de esta clase (patron singleton)*/
    private static ControlGeneral INSTANCIA = null;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** constructor de la clase privado (patron singleton)*/
    private ControlGeneral() {
    }

    /** metodo para crear una instancia de esta clase (patron singleton)*/
    private synchronized static void crearInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new ControlGeneral();
        }
    }

    /** metodo para obtener una instancia de esta clase(patron singleton)*/
    public static ControlGeneral getInstance() {
        if (INSTANCIA == null) {
            crearInstancia();
        }
        return INSTANCIA;
    }

    /**
     * Metodo para agregar un nuevo Horario
     * @param horario objeto horario a insertar
     * @return boolean resultado de la operacion
     */
    public boolean agregarNuevoHorario(Horario horario) {
        boolean resultado = false;
        try {
            this.controlHorario = new ControlHorario();
            bitacora.info("Control Horario Iniciado correctamente");
            controlHorario.agregarNuevoHorario(horario);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control horario por "
                    + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
}
