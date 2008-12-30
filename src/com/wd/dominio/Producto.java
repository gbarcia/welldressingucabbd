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

    /** variable de fecha de creacion del proyecto*/
    private Date fecha_creacion;

    /** variable de fecha de ultima moficacion del proyecto*/
    private Date fecha_ultima_modificacion;

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
        this.nombre = nombre;
        this.descripcion = descripcion;
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
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha_creacion = fecha_creacion;
        this.fecha_ultima_modificacion = fecha_ultima_modificacion;
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
        this.nombre = nombre;
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
        this.descripcion = descripcion;
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

}
