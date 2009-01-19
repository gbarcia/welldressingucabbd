package com.wd.servicios;

import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Clase que reunira todos los controles particulares de solicitudes integrados
 * en uno para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class RegistroSolicitud {

    /** Variable para trabajar con el controlador de los horario*/
    private ControlOrdenCompra controlOC;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /**
     * Constructor por defecto
     * @throws java.io.IOException
     */
    public RegistroSolicitud() {
    }

    /**
     * Operacion para procesar una orden de compra en el sistema
     * @param oc objeto orden de compra con sus items
     * @return boolean del resultado de la operacion
     */
    public boolean procesarOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
            resultado = controlOC.agregarOrden(oc);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener el siguiente numero de orden de compra
     * @return int el siguiente numero
     */
    public int obtenerSiguienteNumeroOrden() {
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        }
        return controlOC.obtenerSiguienteNumeroOrden();
    }
}
