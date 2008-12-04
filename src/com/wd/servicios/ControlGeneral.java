package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Horario;
import com.wd.dominio.Tienda;
import java.io.IOException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase que reunira todos los controles particulares integrados en uno
 * para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class ControlGeneral implements IfaceControlGeneral {

    /** Variable para trabajar con el controlador de los horario*/
    private ControlHorario controlHorario;
    /** Variable para trabajar con el controlador de las tiendas*/
    private ControlTienda controlTienda;
    /** Variable para trabajar con el controlador de los centros de distribucion
    */
    private ControlCentroDistribucion controlCentroDistribucion;
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
            bitacora.error("No se pudo iniciar el control horario por "
                    + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
    /**
    * Metodo para buscar todos los horarios del sistema
    * @return Collection todos los horarios registrados
    */
    public Collection traerTodosLosHorarios () {
        Collection<Horario> horarios = null;
        try {
            this.controlHorario = new ControlHorario();
            bitacora.info("Control Horario Iniciado correctamente");
            horarios = controlHorario.traerTodosLosHorarios();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control horario por "
                    + ex.getMessage());
        }
        finally {
            return horarios;
        }
    }

    /**
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public  boolean agregarNuevaTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.controlTienda = new ControlTienda();
            this.bitacora.info("ControlTienda iniciado correctamente");
            this.controlTienda.agregarNuevaTienda(tienda);
            resultado = true;
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlTienda por "
                    + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

        public boolean agregarCentroDistribucion(CentroDistribucion centro) {
        boolean resultado = false;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control Horario Iniciado correctamente");
            controlCentroDistribucion.agregarCentroDistribucion(centro);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control centroDistribucion por "
                    + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

}
