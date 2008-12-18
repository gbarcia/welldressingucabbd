package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Departamento;
import com.wd.dominio.Horario;
import com.wd.dominio.Lugar;
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
    /** Variable para trabajar con el controlador de los centros de distribucion*/
    private ControlCentroDistribucion controlCentroDistribucion;
    /** Variable para trabajar con el controlador de los departamentos*/
    private ControlDepartamento controlDepartamento;
    /** Variable para trabajar con el controlador de los lugares*/
    private ControlLugar controlLugar;
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
     * Metodo para modificar un Departamento
     * @param newDpto objeto Departamento a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarDepartamento(Departamento newDpto) {
        boolean resultado = false;
        try{
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarDepartamento(newDpto);
            resultado = true;
        }catch(IOException ex){
            bitacora.error("No se pudo iniciar el control horario por "
            + ex.getMessage());
            resultado = false;
        }finally{
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los horarios del sistema
     * @return Collection todos los horarios registrados
     */
    public Collection traerTodosLosHorarios() {
        Collection<Horario> horarios = null;
        try {
            this.controlHorario = new ControlHorario();
            bitacora.info("Control Horario Iniciado correctamente");
            horarios = controlHorario.traerTodosLosHorarios();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control horario por " + ex.getMessage());
        } finally {
            return horarios;
        }
    }

    /**
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public boolean agregarTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.controlTienda = new ControlTienda();
            this.bitacora.info("ControlTienda iniciado correctamente");
            this.controlTienda.agregarTienda(tienda);
            resultado = true;
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlTienda por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nuevo Centro de Distribución
     * @param centro el nuevo centro a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarCentroDistribucion(CentroDistribucion centro) {
        boolean resultado = false;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control CentroDistribucion Iniciado correctamente");
            controlCentroDistribucion.agregarCentroDistribucion(centro);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control centroDistribucion por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nuevo Departamento
     * @param departamento el nuevo departamento a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarDepartamento(Departamento departamento) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarDepartamento(departamento);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los departamentos del sistema
     * @return Collection todos los departamentos registrados
     */
    public Collection traerTodosLosDepartamentos() {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodosLosDepartamentos();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar un Departamento
     * @param departamento el nuevo departamento a agregar
     * @return int resultado de la operación
     */
    public int eliminarDepartamento(Departamento departamento) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.eliminarDepartamento(departamento);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }

     /**
     * Metodo para  traer todos los lugares. Tiene dos operaciones en una
     * la primera para traer todos los estados y la segunda todas las ciudades
     * con sus correspondientes estados
     * @param operacion int 1: trae todos los estados, 2: trae todas las ciudades
     * @return Collection coleccion de objetos Lugar
     */
    public Collection<Lugar> traerTodosLosLuagres(int operacion) {
        Collection<Lugar> resultado = null;
        try {
            this.controlLugar = new ControlLugar();
            bitacora.info("Control Lugar Iniciado correctamente");
            switch (operacion) {
                case 1: {
                    bitacora.info("Iniciando traer todos los estados");
                    resultado = this.controlLugar.traerTodosLosEstados();
                    break;
                }
                case 2: {
                    bitacora.info("Iniciando traer todos los lugares");
                    resultado = this.controlLugar.traerTodosLosLugares();
                    break;
                }
                default: {
                    bitacora.error("Parametro introducido erroneo, num " + operacion);
                    break;
                }
            }
        } catch (IOException ex) {
             bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nueva Clase
     * @param departamento la nueva clase a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarClase(Departamento newClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarClase(newClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una Clase
     * @param newClase objeto Departamento a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarClase(Departamento newClase) {
        boolean resultado = false;
        try{
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarClase(newClase);
            resultado = true;
        }catch(IOException ex){
            bitacora.error("No se pudo iniciar el control departamento por "
            + ex.getMessage());
            resultado = false;
        }finally{
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las clases del sistema
     * @return Collection todos las clases registradas
     */
    public Collection traerTodasLasClases() {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodosLasClases();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar una clase
     * @param clase la clase a eliminar
     * @return int resultado de la operación
     */
    public int eliminarClase(Departamento clase) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.eliminarClase(clase);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nueva SubClase
     * @param departamento la nueva Subclase a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarSubClase(newSubClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una SubClase
     * @param newClase objeto Departamento de tipo subclase a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try{
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarSubClase(newSubClase);
            resultado = true;
        }catch(IOException ex){
            bitacora.error("No se pudo iniciar el control departamento por "
            + ex.getMessage());
            resultado = false;
        }finally{
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las Subclases del sistema
     * @return Collection todos las Subclases registradas
     */
    public Collection traerTodasLasSubClases() {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodasLasSubClases();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar una Subclase
     * @param clase objeto Departamento de tipo subclase a eliminar
     * @return int resultado de la operación
     */
    public int eliminarSubClase(Departamento Subclase) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.eliminarSubClase(Subclase);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }
}
