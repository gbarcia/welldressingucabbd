
package com.wd.dominio;

import java.sql.Date;

/**
 * Clase para el manejo de la informacion de cada movimiento historial de un
 * empleado en el sistema
 * @author gerardo
 */
public class HistorialEmpleado {

    private int cedula;

    private String rif;

    private Date fechaInicio;

    private Date fechaFin;

    private int cargo;

    public HistorialEmpleado() {
    }

    public HistorialEmpleado(int cedula, String rif, Date fechaInicio,
            Date fechaFin, int cargo) {
        this.cedula = cedula;
        this.rif = rif;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cargo = cargo;
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

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }
}
