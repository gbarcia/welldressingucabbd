
package com.wd.dominio;

import java.sql.Date;

/**
 * Clase para el manejo de la informacion de cada movimiento historial de un
 * empleado en el sistema
 * @author gerardo
 */
public class HistorialEmpleado {

    /** cedula del empleado*/
    private int cedula;

    /** codigo de la tienda o centro donde trabaja o trabajo el empleado*/
    private int codigo;

    /** nombre de la empresa donde trabaja o trabajo el empleado*/
    private String nombreEmpresa;

    /** fecha de inicio del periodo de trabajo*/
    private Date fechaInicio;

    /** fecha de fin del periodo de trabajo*/
    private Date fechaFin;

    /** cargo ejercido durante el perido de trabajo*/
    private int cargo;

    /** Constructor por defecto*/
    public HistorialEmpleado() {
    }

    /**
     *  Constructor regular 1
     * @param cedula int el numero de cedula
     * @param fechaInicio Date la fecha de inicio de historial del empleado
     * @param fechaFin Date la fecha de fin de historial del empleado
     * @param codigo el codigo de la empresa donde trabajara el empleado
     * @param nombreEmpresa el nombre de la empresa donde trabara el empleado
     * @param cargo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     */
    public HistorialEmpleado(int cedula, int codigo, Date fechaInicio,
            Date fechaFin, int cargo, String nombreEmpresa) {
        this.cedula = cedula;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cargo = cargo;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

     public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
