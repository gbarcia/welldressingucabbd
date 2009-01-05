
package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.dominio.Lugar;
import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.sql.Date;
import java.util.Collection;

/**
 * Manejador de la interfaz gráfica para Empleado Tienda
 * @author gerardo
 */
public class ControlGuiEmpleadoTienda {

    /* variable para el manejo de la entidad empleado  */
    private Empleado empleado;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiEmpleadoTienda() {
        this.controlador = new ControlGui();
    }

    public void registrarNuevoEmpleado (int cedula, String nombre, String apellido,
            Date fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId, String ciudadVive,
            int codigo, String nombreEmpresa) {
        empleado = new Empleado(cedula, nombre, apellido, fechaNacimiento, telefono,
                estadoCivil, sexo, nivelEstudios, direccion, tipo, lugarId,
                ciudadVive, null, null, codigo, nombreEmpresa);
    }

    /** Operacion para traer todas las ciudades
     * @return Collection con todas las ciudades
     */
    public Collection<Lugar> obtenerTodosLosLugares() {
        Collection<Lugar> resultado = null;
        resultado = controlG.traerTodosLosLuagres(2);
        return resultado;
    }

    /** Operacion para traer todas las tiendas
     * @return Collection con todas las tiendas
     */
    public Collection<Tienda> obtenerTodasLasTiendas() {
        Collection<Tienda> resultado = null;
        resultado = controlG.traerTodasLasTienda();
        return resultado;
    }

}
