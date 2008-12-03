package com.wd.dominio;

/**
 * Entidad encargada de almacenar la informacion de una tienda. Puntualmente se
 * refiere a la informacion fisica, informacion de contacto, locacion, y la 
 * empresa que le presta el servicio de vigilancia a dicha tienda.
 * @author Jonathan Trujillo
 */
public class Tienda {
    
    /** variable de identificador*/
    private int codigo;
    /** variable del nombre de la tienda*/
    private String nombre;
    /** variable del tamano de la tienda*/
    private int tamano;
    /** variable del telefono de la tienda*/
    private String telefono;
    /** variable del correo electronico de la tienda*/
    private String correo;
    /** variable de la direccion de la tienda*/
    private String direccion;
    /** variable de identificador de ciudad de ubicacion de la tienda*/
    private int LUGAR_id;
    /** variable de identificador de horario de operacion de la tienda*/
    private int HORARIO_id;
    /** variable de identificador de empresa de servicio de vigilancia de la tienda*/
    private String EMPRESA_SERVICIO_rif;

    /**
     * Constructor de la Clase
     */
    public Tienda() {
    }

    /**
     * Constructor de la Clase
     * @param codigo identificador de la tienda
     * @param nombre nombre de la tienda
     * @param tamano tamano de la tienda
     * @param telefono telefono de la tienda
     * @param correo correo electronico de la tienda
     * @param direccion direccion de la tienda
     * @param LUGAR_id identificador de la ciudad donde se ubica la tienda
     * @param HORARIO_id identificador del horario de operacion de la tienda
     * @param EMPRESA_SERVICIO_rif identificador de la empresa de servicio de vigilancia
     * de la tienda
     */
    public Tienda(int codigo, String nombre, int tamano, String telefono,
           String correo, String direccion, int LUGAR_id, int HORARIO_id,
           String EMPRESA_SERVICIO_rif) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tamano = tamano;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.LUGAR_id = LUGAR_id;
        this.HORARIO_id = HORARIO_id;
        this.EMPRESA_SERVICIO_rif = EMPRESA_SERVICIO_rif;
    }

    /**
     * @return codigo de la tienda
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo el codigo a asignar
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return nombre de la tienda
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return tamano de la tienda
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano el tamano a asignar
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return telefono de la tienda
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono el telefono a asignar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return correo electronico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo el correo electronico a asignar
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return direccion de la tienda
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion la direccion a asignar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return LUGAR_id de la ciudad de ubicacion de la tienda
     */
    public int getLUGAR_id() {
        return LUGAR_id;
    }

    /**
     * @param LUGAR_id el LUGAR_id a asignar
     */
    public void setLUGAR_id(int LUGAR_id) {
        this.LUGAR_id = LUGAR_id;
    }

    /**
     * @return HORARIO_id del horario de operacion de la tienda
     */
    public int getHORARIO_id() {
        return HORARIO_id;
    }

    /**
     * @param HORARIO_id el HORARIO_id a asignar
     */
    public void setHORARIO_id(int HORARIO_id) {
        this.HORARIO_id = HORARIO_id;
    }

    /**
     * @return EMPRESA_SERVICIO_rif de la empresa de servicio de vigilancia de
     * la tienda
     */
    public String getEMPRESA_SERVICIO_rif() {
        return EMPRESA_SERVICIO_rif;
    }

    /**
     * @param EMPRESA_SERVICIO_rif el EMPRESA_SERVICIO_rif a asignar
     */
    public void setEMPRESA_SERVICIO_rif(String EMPRESA_SERVICIO_rif) {
        this.EMPRESA_SERVICIO_rif = EMPRESA_SERVICIO_rif;
    }

}
