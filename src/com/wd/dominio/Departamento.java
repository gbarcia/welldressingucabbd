package com.wd.dominio;

/**
 * En esta entidad se almacera el control de departamentos, clases y subclases
 * en las cuales estan clasificados nuestros productos. Esto se hara por medio
 * de un nombre, una descripcion y un tipo que indicara si el departamento es
 * un departamento, una clase o una subclase.
 * @author Gabylis
 */
public class Departamento {

    /** Variable identificador*/
    private int codigo;
    /** Variable para el nombre del departamento*/
    private String nombre;
    /**Variable para la descripcion del departamento*/
    private String descripcion;
    /**Variable para indicar el tipo de departamento*/
    private int tipo;
    /**Variable para indicar el departamento con el que se relaciona*/
    private int departamentoCodigo;

    /**Constructor por defecto*/
    public Departamento() {
    }

    /**
     * Constructor de la clase con todos sus atributos
     * @param codigo clave primaria
     * @param nombre nombre del departamento
     * @param descripcion descripcion del departamento
     * @param tipo {0 si es una subclase,1 si es una clase,
     * 2 si es un departamento}
     */
    public Departamento(int codigo, String nombre, String descripcion, int tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    /**Metodo para obtener el codigo identificador*/
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo para establecer el codigo
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**Metodo para obtener la descripcion del departamento*/
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para establecer la descripcion del departamento
     * @param descripcion descripcion del departamento
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**Metodo para obtener el nombre del departamento*/
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre del departamento
     * @param nombre nombre del departamento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Metodo para obtener el tipo de departamento*/
    public int getTipo() {
        return tipo;
    }

    /**
     * Metodo para establecer el tipo de departamento
     * @param tipo tipo de departamento
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**Metodo para obtener el codigo del departamento con el que se relaciona*/
    public int getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    /**
     * Metodo para establecer el codigo del departamento con el que se relaciona
     * @param departamentoCodigo codigo del departamento al que pertenece
     */
    public void setDepartamentoCodigo(int departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }


}
