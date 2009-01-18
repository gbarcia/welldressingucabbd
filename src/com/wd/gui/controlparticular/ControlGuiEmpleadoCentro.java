package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.dominio.NominaCentro;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class ControlGuiEmpleadoCentro{

    public ControlGuiEmpleadoCentro() {
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
        for (Empleado empleado : coleccion) {
            vectorResult.add(empleado);
        }
        return vectorResult;
    }

}
