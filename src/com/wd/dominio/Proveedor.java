package com.wd.dominio;

/**
 * Clase que guarda la información de las instancias de proveedor en el sistema
 * el tipo sera siempre 0 ya que en la tabla de la base de datos, la generaliza
 * cion de la empresa de servicio califica a la de provedor con el numero 0
 * @author gerardo
 */
public class Proveedor {

    /** variable del rif del proveedor*/
    private String rif;
    /** constante del tipo de provedor siempre en cero*/
    private final int tipo = 0;
    /** variable que contiene el nombre del proveedor*/
    private String nombre;
    /** variable que contiene el telefono del proveedor*/
    private String telefono;
    /** variable que contiene la direccion del proveedor*/
    private String direccion;
    /** variable que contiene el indice de la ciudad donde se encuentra*/
    private Integer lugarID;
    /** variable que contiene el nombre de la ciudad donde se encuentra*/
    private String nombreCiudad;
    /** variable que contiene el nombre de la persona de contacto*/
    private String nombreContacto;
    /** variable que contiene el apellido de la persona de contacto*/
    private String apellidoContacto;

    /** Constructor por defecto*/
    public Proveedor() {
    }

    /** Constructor sin el nombre del lugar donde se encuentra*/
    public Proveedor(String rif, String nombre, String telefono, String direccion,
                     Integer lugarID, String nombreContacto, String apellidoContacto) {
        this.rif = rif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.setDireccion(direccion);
        this.lugarID = lugarID;
        this.nombreContacto = nombreContacto;
        this.setApellidoContacto(apellidoContacto);
    }

    /** Constructor con el nombre del lugar donde se encuentra*/
    public Proveedor(String rif, String nombre, String telefono, String direccion,
                    Integer lugarID, String nombreCiudad, String nombreContacto,
                    String apellidoContacto) {
        this.rif = rif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.setDireccion(direccion);
        this.lugarID = lugarID;
        this.nombreCiudad = nombreCiudad;
        this.nombreContacto = nombreContacto;
        this.setApellidoContacto(apellidoContacto);
    }

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
        this.apellidoContacto = apellidoContacto.toUpperCase();
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
        this.direccion = direccion.toUpperCase();
    }

     /** metodo para obtener el indice del lugar donde se encuentra
     * @return Integer el indice del lugar donde se encuentra
     */
    public Integer getLugarID() {
        return lugarID;
    }

     /** metodo para establecer el lugar donde se encuentra
     * @param lugarID Integer indice del lugar donde se encuentra
     */
    public void setLugarID(Integer lugarID) {
        this.lugarID = lugarID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad.toUpperCase();
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto.toUpperCase();
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif.toUpperCase();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.toUpperCase();
    }    
}
