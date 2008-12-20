package com.wd.dominio;

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

    /**
     * Contructor de la clase
     */
    public Producto(){}

    /**
     * Constructor de la clase
     * @param id
     * @param nombre
     * @param descripcion
     */
    public Producto(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

}
