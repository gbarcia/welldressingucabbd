package com.wd.dominio;

/**
 *  Clase para el manejo de la informacion de cada movimiento historial de los
 * empleados de los centros de distribucion en el sistema
 * @author Gabylis
 */
public class NominaCentro {

    /** Codigo del centro de distribucion al que pertenece el empleado*/
    private int centroDistribucionCodigo;
    /** Cedula de identidad del empleado*/
    private String empleadoCi;
    /** Fecha en la que comenzo a trabajar en el centro*/
    private String fechaIni;
    /** Fecha fin en la que el empleado dejo de trabajr en el centro*/
    private String fechaFin;
    /** entero que indica el cargo q ocupa en el centro, 0 para gerente, 1 para
     * empleado regular y 2 para conductor*/
    private int cargo;

    public NominaCentro() {
    }

    public NominaCentro(int centroDistribucionCodigo, String empleadoCi, String fechaIni, String fechafin, int cargo) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
        this.empleadoCi = empleadoCi;
        this.fechaIni = fechaIni;
        this.fechaFin = fechafin;
        this.cargo = cargo;
    }

    /**
     * Metodo para obtener el cargo
     * @return int cargo 0 para gerente, 1 para empleado regular, 2 para
     * conductor
     */
    public int getCargo() {
        return cargo;
    }

    /**
     * Metodo para establecer el cargo
     * @param cargo int 0 para gerente, 1 para empleado regular, 2 para
     * conductor
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    /**
     * Metodo para obtener el codigo del centro de distribución
     */
    public int getCentroDistribucionCodigo() {
        return centroDistribucionCodigo;
    }

    /**
     * Metodo para establecer el codigo del centro dde distribucion
     * @param centroDistribucionCodigo int
     */
    public void setCentroDistribucionCodigo(int centroDistribucionCodigo) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
    }

    /**
     * Metodo para obtener la cedula del empleado
     */
    public String getEmpleadoCi() {
        return empleadoCi;
    }

    /**
     * Metodo para establecer la cedula del empleado
     * @param empleadoCi String cedula del empleado
     */
    public void setEmpleadoCi(String empleadoCi) {
        this.empleadoCi = empleadoCi;
    }

    /**
     * Metodo para obtener la fecha inicial en la qie comenzo a trabajar en el
     * centro de distribucion
     */
    public String getFechaIni() {
        return fechaIni;
    }

    /**
     * Metodo para establecer la fecha inicial
     * @param fechaIni String fecha inicial
     */
    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    /**
     * Metodo para obtener la fecha final en la que termino de trabajar en el
     * centro de distribucion
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Metodo para establecer la fecha final
     * @param fechafin String fecha final
     */
    public void setFechaFin(String fechafin) {
        this.fechaFin = fechafin;
    }

}
