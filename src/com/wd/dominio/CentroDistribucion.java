package com.wd.dominio;

/**En esta clase se almacenará el control de centros de distribución que son los
 * que reciben toda la mercancia que proviene de nuestros proveedores y
 * abastecen a nuestras tiendas con los productos solicitados por esta.
 * @author Gabylis
 */
public class CentroDistribucion {

    /**Variable identificadora*/
    private int codigo;
    /**Variable para el nombre del centro*/
    private String nombre;
    /**Variable para el numero telefonico del centro*/
    private String telefono;
    /**Variable para la direccion del centro*/
    private String direccion;
    /**Variable para la identificar la ciudad en donde se encuentra el centro*/
    private int LUGAR_id;


    /**
     * Constructor de la clase con todos los atributos
     * @param codigo identificador clave primaria
     * @param nombre nombre del centro
     * @param telefono numero telefonico del centro
     * @param direccion calle/Av edificio donde se encuentra el centro
     * @param LUGAR_id identificador de la ciudad donde se encuentra el centro
     */

    public CentroDistribucion(int codigo, String nombre, String telefono, String direccion, int LUGAR_id) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.LUGAR_id = LUGAR_id;
    }
    /**Constructor por defecto*/
    public CentroDistribucion() {
    }

     /** Metodo para obtener el identificador de la ciudad donde se encuentra el
     * centro*/
    public int getLUGAR_id() {
        return LUGAR_id;
    }

    /**
     * Metodo para establecer el identificador de la ciudad del centro
     * @param LUGAR_id
     */
    public void setLUGAR_id(int LUGAR_id) {
        this.LUGAR_id = LUGAR_id;
    }

    /**Metodo para obtener el codio identificador*/
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo para Establecer el codigo identificador
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**Metodo para obtener la direccion*/
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para establecer la direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**Metodo para obtener el nombre*/
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Metodo para obtener el telefono*/
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para establecer el numero de telefono
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
