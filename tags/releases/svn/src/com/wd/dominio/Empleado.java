package com.wd.dominio;

import java.sql.Date;
import java.util.Collection;
import java.util.Vector;

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
    private Collection<HistorialEmpleado> historial = new Vector<HistorialEmpleado>();

    /** constructor por defecto */
    public Empleado() {
    }

    /** Constructor de empleado Regular 1
     *  Para instanciaciones de objeto empleado donde no sea relevante su historial
     * @param cedula int el numero de cedula
     * @param nombre String el nombre del empleado
     * @param fechaNacimiento Date la fecha de nacimiento del empleado
     * @param telefono String el numero de telefono del empleado
     * @param estadoCivil int el estado civil del empleado
     *    0 para soltero
     *    1 para casado
     *    2 para divorciado
     *    3 para viudo
     * @param sexo String el sexo del empleado
     *  M para masculino
     *  F para feminino
     * @param nivelEstudios int el nivel de estudios del empleado
     *  0 para ninguno
     *  1 para educacion primaria
     *  2 para educacion secundaria
     *  3 para educacion superior
     * @param direccion Strind direccion del empleado
     * @param tipo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     * @param lugarId int el indice del lugar donde vive el empleado
     */
    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setEstadoCivil(estadoCivil);
        this.setSexo(sexo);
        this.setNivelEstudios(nivelEstudios);
        this.setDireccion(direccion);
        this.setTipo(tipo);
        this.setLugarId(lugarId);
    }

      /** Constructor de empleado Regular 2
     *  Para instanciaciones de objeto empleado donde no sea relevante su historial
     *  y ademas queremos conocer el nombre de la ciudad donde vive
     * @param cedula int el numero de cedula
     * @param nombre String el nombre del empleado
     * @param fechaNacimiento Date la fecha de nacimiento del empleado
     * @param telefono String el numero de telefono del empleado
     * @param estadoCivil int el estado civil del empleado
     *  0 para soltero
     *  1 para casado
     *  2 para divorciado
     *  3 para viudo
     * @param sexo String el sexo del empleado
     *  M para masculino
     *  F para feminino
     * @param nivelEstudios int el nivel de estudios del empleado
     *  0 para ninguno
     *  1 para educacion primaria
     *  2 para educacion secundaria
     *  3 para educacion superior
     * @param direccion Strind direccion del empleado
     * @param tipo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     * @param lugarId int el indice del lugar donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive
     */
    public Empleado(int cedula, String nombre, String apellido, Date
            fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId,
            String ciudadVive) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setEstadoCivil(estadoCivil);
        this.setSexo(sexo);
        this.setNivelEstudios(nivelEstudios);
        this.setDireccion(direccion);
        this.setTipo(tipo);
        this.setLugarId(lugarId);
        this.setCiudadVive(ciudadVive);
    }

      /** Constructor de empleado Regular 3
     *  Para instanciaciones de objeto empleado donde sea relevante conocer el
     *  historial del empleado y ademas conocer el nombre de la ciudad donde vive
     * @param cedula int el numero de cedula
     * @param nombre String el nombre del empleado
     * @param fechaNacimiento Date la fecha de nacimiento del empleado
     * @param telefono String el numero de telefono del empleado
     * @param estadoCivil int el estado civil del empleado
     *  0 para soltero
     *  1 para casado
     *  2 para divorciado
     *  3 para viudo
     * @param sexo String el sexo del empleado
     *  M para masculino
     *  F para feminino
     * @param nivelEstudios int el nivel de estudios del empleado
     *  0 para ninguno
     *  1 para educacion primaria
     *  2 para educacion secundaria
     *  3 para educacion superior
     * @param direccion Strind direccion del empleado
     * @param tipo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     * @param lugarId int el indice del lugar donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive
     * @param historial Coleccion con todos los historiales del empleado
     */
    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId, String ciudadVive,
            Collection<HistorialEmpleado> historial) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setEstadoCivil(estadoCivil);
        this.setSexo(sexo);
        this.setNivelEstudios(nivelEstudios);
        this.setDireccion(direccion);
        this.setTipo(tipo);
        this.setLugarId(lugarId);
        this.setCiudadVive(ciudadVive);
        this.setHistorial(historial);
    }

      /** Constructor de empleado Regular 4
     * Para instanciaciones de objeto empleado durante el momento del registro
     * del sistema o actualizaciones donde se registrara un nuevo historial
     * @param cedula int el numero de cedula
     * @param nombre String el nombre del empleado
     * @param fechaNacimiento Date la fecha de nacimiento del empleado
     * @param telefono String el numero de telefono del empleado
     * @param estadoCivil int el estado civil del empleado
     *  0 para soltero
     *  1 para casado
     *  2 para divorciado
     *  3 para viudo
     * @param sexo String el sexo del empleado
     *  M para masculino
     *  F para feminino
     * @param nivelEstudios int el nivel de estudios del empleado
     *  0 para ninguno
     *  1 para educacion primaria
     *  2 para educacion secundaria
     *  3 para educacion superior
     * @param direccion Strind direccion del empleado
     * @param tipo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     * @param lugarId int el indice del lugar donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive
     * @param fechaInicio Date la fecha de inicio de historial del empleado
     * @param fechaFin Date la fecha de fin de historial del empleado
     * @param codigo el codigo de la empresa donde trabajara el empleado
     * @param nombreEmpresa el nombre de la empresa donde trabara el empleado
     */
    public Empleado(int cedula, String nombre, String apellido, Date fechaNacimiento,
            String telefono, int estadoCivil, String sexo, int nivelEstudios,
            String direccion, int tipo, int lugarId, String ciudadVive, Date fechaInicio,
            Date fechaFin,int codigo, String nombreEmpresa) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setEstadoCivil(estadoCivil);
        this.setSexo(sexo);
        this.setNivelEstudios(nivelEstudios);
        this.setDireccion(direccion);
        this.setTipo(tipo);
        this.setLugarId(lugarId);
        this.setCiudadVive(ciudadVive);
        this.nuevoObjetoHistorial(fechaInicio, fechaFin, codigo, tipo,nombreEmpresa);
    }

    /**
     * Metodo para crear un nuevo objeto historial y guardalo en la coleccion de historiales
     * esta operacion es valida en los casos donde se tenga que agregar historial nuevo
     * @param cargo int el cargo del empleado
     *  0 para gerente
     *  1 para empleado regular
     *  2 para conductor
     * @param nombreEmpresa String nombre de la empresa
     * @param fechaIni Date la fecha de inicio de historial del empleado
     * @param fechaFin Date la fecha de fin de historial del empleado
     * @param codigo el codigo de la empresa donde trabajara el empleado
     */
    private void nuevoObjetoHistorial (Date fechaIni,Date fechaFin, int codigo,
            int cargo, String nombreEmpresa) {
        HistorialEmpleado he = new HistorialEmpleado(this.cedula,codigo,fechaIni,
                fechaFin,cargo,nombreEmpresa);
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
