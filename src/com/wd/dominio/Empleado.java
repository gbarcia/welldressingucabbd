
package com.wd.dominio;

import java.sql.Date;
import java.util.Collection;

/**
 * Entidad para el manejo de la información de empleado para el sistema
 * @author gerardo
 */
public class Empleado {

    private int cedula;

    private String nombre;

    private String apellido;

    private Date fechaNacimiento;

    private String telefono;

    private int estadoCivil;

    private String sexo;

    private int nivelEstudios;

    private String direccion;

    private int tipo;

    private int lugarId;

    private String ciudadVive;

    private Collection<HistorialEmpleado> historial;

    public Empleado() {
    }
    
}
