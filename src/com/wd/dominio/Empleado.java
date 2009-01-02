package com.wd.dominio;

import java.sql.Date;
import java.util.Collection;

/**
 * Entidad para el manejo de la información de empleado para el sistema
 * maneja además su historial de registro de las tiendas donde ha estado durante
 * un determinado periodo y su respectivo cargo
 * @author gerardo
 */
public class Empleado {

    /** cedula del empleado*/
    private int cedula;

    /** nombre del empleado*/
    private String nombre;

    /** apellido del empleado*/
    private String apellido;

    /** fecha de nacimiento del empleado*/
    private Date fechaNacimiento;

    /** telefono del empleado*/
    private String telefono;

    /** estado civil del empleado
     *  0 para soltero
     *  1 para casado
     *  2 para divorciado
     *  3 para viudo
     */
    private int estadoCivil;

     /** sexo del empleado
     *  M para masculino
     *  F para feminino
     */
    private String sexo;

     /** nivel de estudios del empleado
     *  0 para ninguno
     *  1 para educacion primaria
     *  2 para educacion secundaria
     *  3 para educacion superior
     */
    private int nivelEstudios;

    /** direccion del empleado */
    private String direccion;

     /** tipo o cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     */
    private int tipo;

    /** clave indentificadora del lugar donde vive */
    private int lugarId;

    /** nombre de la ciudad donde vive */
    private String ciudadVive;
    
    /** coleccion con todos sus historiales */
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

    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId, String ciudadVive,
            Collection<HistorialEmpleado> historial) {
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
        this.historial = historial;
    }

    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId, String ciudadVive, Date fechaInicio,
            Date fechaFin,String rifEmpresa) {
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
        this.nuevoObjetoHistorial(fechaFin, fechaFin, rifEmpresa, tipo);
    }

    private void nuevoObjetoHistorial (Date fechaIni,Date fechaFin, String rifEmpresa,
            int cargo) {
        HistorialEmpleado he = new HistorialEmpleado(this.cedula,rifEmpresa,fechaIni,
                fechaFin,cargo);
        this.historial.add(he);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase();
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
        this.ciudadVive = ciudadVive.toUpperCase();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion.toUpperCase();
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
        this.nombre = nombre.toUpperCase();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.toUpperCase();
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
