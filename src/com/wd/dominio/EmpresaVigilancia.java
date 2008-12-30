package com.wd.dominio;

/**
 * Clase que guarda las instancias de las empresas de Vigilancia en el sistemas
 * el tipo siempre sera 1 ya que en la base de datos se generaliza como empresa
 * de servicio, y se asigna a la empresa de vigilancia el tipo 1
 * @author Gabylis
 */
public class EmpresaVigilancia {

    /** variable del rif del proveedor*/
    private String rif;
    /** constante del tipo de empresa de vigilancia siempre en uno*/
    private final int tipo = 1;
    /** variable que contiene el nombre de la empresa de vigilancia*/
    private String nombre;
    /** variable que contiene el telefono de la empresa de vigilancia*/
    private String telefono;
    /** variable que contiene la direccion de la empresa de vigilancia*/
    private String direccion;
    /** variable que contiene el indice de la ciudad donde se encuentra*/
    private Integer lugarId;
    /** variable que contiene el nombre de la persona de contacto*/
    private String nombreContacto;
    /** variable que contiene el apellido de la persona de contacto*/
    private String apellidoContacto;

    /** metodo para obtener el apellido de la persona de contacto
     * @return String apellido del contacto
     */
    public String getApellidoContacto() {
        return apellidoContacto;
    }

    /** metodo para establecer el apellido de la persona de contacto
     * @param apellidoContacto String del apellido del contacto
     */
    public void setApellidoContacto(String apellidoContacto) {
        this.apellidoContacto = apellidoContacto;
    }

    /** metodo para obtener la direccion del proveedor
     * @return String con la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /** metodo para establecer la direccion del proveedor
     * @param direccion la direccion del proveedor
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /** metodo para obtener el indice del lugar donde se encuentra
     * @return Integer el indice del lugar donde se encuentra
     */
    public Integer getLugarId() {
        return lugarId;
    }

    /** metodo para establecer el lugar donde se encuentra
     * @param lugarId Integer indice del lugar donde se encuentra
     */
    public void setLugarId(Integer lugarId) {
        this.lugarId = lugarId;
    }

    /** metodo para obtener el nombre de la empresa de vigilancia
     * @return String nombre de la empresa de vigilancia
     */
    public String getNombre() {
        return nombre;
    }

    /** metodo para establecer el nombre de la empresa de vigilancia
     * @param nombre String nombre de la empresa de vigilancia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** metodo para obtener el nombre de la persona de contacto
     * @return String nombre de la persona de contacto
     */
    public String getNombreContacto() {
        return nombreContacto;
    }

    /** metodo para establecer el nombre de la persona de contacto
     * @param nombreContacto String con el nombre de la persona de contacto
     */
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    /** metodo para obtener el rif
     * @return String rif de la empresa de vigilancia
     */
    public String getRif() {
        return rif;
    }

    /** metodo para establecer el rif
     * @param rif String el rif de la empresa de vigilancia
     */
    public void setRif(String rif) {
        this.rif = rif;
    }

    /** metodo para obtener el telefono de la empresa de vigilancia
     * @return String telefono de la empresa de vigilancia
     */
    public String getTelefono() {
        return telefono;
    }

    /** metodo para establecer el telefono de la empresa de vigilancia
     * @param telefono String telefono de la empresa de vigilancia
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
