package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.dominio.NominaCentro;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class ControlGuiEmpleadoCentro{

    /* variable para el manejo de la entidad empleado  */
    private Empleado empleado;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiEmpleadoCentro() {
        this.controlador = new ControlGui();
    }

    /** Operacion para conocer si un string es número
     * @return resultado boolean si es numero o no
     */
    private boolean isNumber(String arg) {
        boolean resultado = false;
        try {
            Integer number = Integer.parseInt(arg);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**Operacion para validar el formulario de registro
     * @param cedula int numero de cedula
     * @param nombre String nombre del empleado
     * @param apellido String apellido del empleado
     * @param telefono String telefono del empleado
     * @param direccion String direccion del empleado
     * @return resultado boolean si es valido o no
     */
    private boolean validarForm(String cedula, String nombre, String apellido,
            String telefono, String direccion) {
        boolean resultado = true;
        if (cedula.equals("") ||
                nombre.equals("") ||
                apellido.equals("") ||
                telefono.equals("") ||
                direccion.equals("")) {
            resultado = false;
        }
        return resultado;
    }

    /**Operacion para registrar un Empleado en el sistema
     * operacion para registrar un nuevo empleado en el sistema
     * @param cedula int numero de cedula
     * @param nombre String nombre del empleado
     * @param apellido String apellido del empleado
     * @param fechaNacimiento java.sql.Date la fecha de nacimiento del empleado
     * @param telefono String telefono del empleado
     * @param estadoCivil int estado civil del empleado
     * @param sexo String sexo del empleado
     * @param nivelEstudios int nivel de estudios del empleado
     * @param direccion String direccion del empleado
     * @param tipo int tipo de cargo del empleado
     * @param lugarId int el indice de la ciudad donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive el empleado
     * @param codigo int codigo del centro donde trabajara el empleado
     * @param nombreEmpresa String nombre de la empresa o tienda donde trabajara
     * el empleado
     */
    public void registrarNuevoEmpleado(String cedula, String nombre, String apellido,
            java.sql.Date fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId, String ciudadVive,
            int codigo, String nombreEmpresa) {
        boolean resultado = false;
        boolean datosValidos = false;
        boolean esNumero = false;
        esNumero = this.isNumber(cedula);
        if (esNumero) {
            datosValidos = this.validarForm(sexo, nombre, apellido, telefono, direccion);
            int ci = Integer.parseInt(cedula); // conviertiendo la cedula en numero entero
            if (datosValidos) {
                Date fecha = new Date();
                java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
                empleado = new Empleado(ci, nombre, apellido, fechaNacimiento, telefono,
                        estadoCivil, sexo, nivelEstudios, direccion, tipo, lugarId,
                        ciudadVive, fechaSQL, null, codigo, nombreEmpresa);
                resultado = controlG.agregarEmpleadoTienda(empleado);
                if (resultado) {
                    controlador.mostrarMensaje("Empleado " + nombre + " agregado con éxito", 0);
                } else if (!resultado) {
                    controlador.mostrarMensaje("Operacion fallida", 1);
                }
            } else if (!datosValidos) {
                controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
            }
        } else if (!esNumero) {
            controlador.mostrarMensaje("Error: el campo cedula debe ser número", 1);
        }
    }

   /**
    * Metodo consultar el historial de empleados de los centros de distribucion
    * @return Vector vector con todos los objetos EmpresaVigilancia del sistema
    */
    public Vector<NominaCentro> traerNominaCentro(int codigoCentro) {
        Vector<NominaCentro> vectorResult = null;
        Collection<NominaCentro> coleccion = ControlGeneral.getInstance().traerNominaCentro(codigoCentro);
        vectorResult = new Vector();
        for (NominaCentro nominaCentro : coleccion) {
            vectorResult.add(nominaCentro);
        }
        return vectorResult;
    }

    /**
    * Metodo para traer todos los empleados de un centro de distribucion
    * @param codigoCentro int codigo del centro d distribucion
    * @return Vector vector con todos los empleados de un centro de distribucion
    */
    public Vector<Empleado> traerTodosLosEmpleadosCentro(int codigoCentro) {
        Vector<Empleado> vectorResult = null;
        Collection<Empleado> coleccion = ControlGeneral.getInstance().traerTodosLosEmpleadosCentro(codigoCentro);
        vectorResult = new Vector();
        for (Empleado e : coleccion) {
            vectorResult.add(e);
        }
        return vectorResult;
    }

}
