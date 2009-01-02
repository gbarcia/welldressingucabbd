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

    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.nivelEstudios = nivelEstudios;
        this.direccion = direccion;
        this.tipo = tipo;
        this.lugarId = lugarId;
    }

    public Empleado(int cedula, String nombre, String apellido, Date
            fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId,
            String ciudadVive) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.nivelEstudios = nivelEstudios;
        this.direccion = direccion;
        this.tipo = tipo;
        this.lugarId = lugarId;
        this.ciudadVive = ciudadVive;
    }

    private HistorialEmpleado nuevoObjetoHistorial () {
        return new HistorialEmpleado();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCiudadVive() {
        return ciudadVive;
    }

    public void setCiudadVive(String ciudadVive) {
        this.ciudadVive = ciudadVive;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Collection<HistorialEmpleado> getHistorial() {
        return historial;
    }

    public void setHistorial(Collection<HistorialEmpleado> historial) {
        this.historial = historial;
    }

    public int getLugarId() {
        return lugarId;
    }

    public void setLugarId(int lugarId) {
        this.lugarId = lugarId;
    }

    public int getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(int nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
