package com.wd.dominio;

import java.sql.Date;

/**
 * Entidad encarga de almacenar la informacion de un producto. Refiere al nombre
 * y descripcion para cada uno.
 * @author Jonathan Trujillo
 */
public class Producto {

    /** variable de identificador*/
    private int id;

    /** variable de nombre*/
    private String nombre;

    /** variable de descripcion*/
    private String descripcion;

    /** variable de precio*/
    private int precio;

    /** variable de fecha de creacion del producto*/
    private Date fecha_creacion;

    /** variable de fecha de ultima moficacion del producto*/
    private Date fecha_ultima_modificacion;

    /** variable de identificador de departamento*/
    private int departamentoId;

    /**
     * Contructor de la clase
     */
    public Producto(){}

    /**
     * Constructor de la clase
     * @param id el identificador del producto
     * @param nombre el nombre del producto
     * @param descripcion la descripcion del producto
     */
    public Producto(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre.toUpperCase();
        this.descripcion = descripcion.toUpperCase();
    }

    /**
     * Constructor de la clase
     * @param id el identificador del producto
     * @param nombre el nombre del producto
     * @param descripcion la descripcion del producto
     * @param precio el precio del producto
     * @param fecha_creacion la fecha de creacion del producto
     * @param fecha_ultima_modificacion la fecha de ultima modificacion del producto
     */
    public Producto(int id, String nombre, String descripcion, int precio, Date fecha_creacion, Date fecha_ultima_modificacion) {
        this.id = id;
        this.nombre = nombre.toUpperCase();
        this.descripcion = descripcion.toUpperCase();
        this.precio = precio;
        this.fecha_creacion = fecha_creacion;
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
    }

    public Producto(int id, int departamentoId) {
        this.id = id;
        this.departamentoId = departamentoId;
    }

    /**
     * @return identificador del producto
     */
    public int getId() {
        return id;
    }

    /**
     * @param id el identificador del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    /**
     * @return descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion la descripcion del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.toUpperCase();
    }

    /**
     * @return precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio precio del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return fecha de creacion del producto
     */
    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    /**
     * @param fecha_creacion fecha de cracion del producto
     */
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    /**
     * @return fecha de ultima modificacion del producto
     */
    public Date getFecha_ultima_modificacion() {
        return fecha_ultima_modificacion;
    }

    /**
     * @param fecha_ultima_modificacion fecha de ultima modificacion del producto
     */
    public void setFecha_ultima_modificacion(Date fecha_ultima_modificacion) {
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
    }

    /**
     * Get the value of departamentoId
     *
     * @return the value of departamentoId
     */
    public int getDepartamentoId() {
        return departamentoId;
    }

    /**
     * Set the value of departamentoId
     *
     * @param departamentoId new value of departamentoId
     */
    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }


}
