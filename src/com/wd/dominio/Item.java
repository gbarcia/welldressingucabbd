package com.wd.dominio;

/**
 * Clase para el manejo de los Items en las solicitudes
 * @author Gerardo Barcia
 */
public class Item {

    /** variable para el identificar de producto */
    private Integer idProducto;
    /** variable para el numero de solicitud */
    private Integer idSolicitud;
    /** variable para la cantidad de productos */
    private Integer cantidad;
    /** variable para el costo de productos */
    private Integer costo;

    /** Constructor por defecto */
    public Item() {
    }

    /**
     * Constructor primario
     * @param idProducto int id del producto
     * @param idSolicitud int id de la solicitud
     * @param cantidad int cantidad del producto
     * @param costo costo del producto
     */
    public Item(Integer idProducto, Integer idSolicitud, Integer cantidad, Integer costo) {
        this.idProducto = idProducto;
        this.idSolicitud = idSolicitud;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    /**
     * Operacion para obtener la cantidad
     * @return int cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Operacion para establecer la cantidad
     * @param cantidad int
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Operacion para obtener el id del producto
     * @return int id del producto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * operacion para establecer el id del producto
     * @param idProducto int id del producto
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * operacion para obtener el id de la solicitud
     * @return int id de la solicitud
     */
    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Operacion para establecer el id de solicitud
     * @param idSolicitud int id solicitud
     */
    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    /**
     * operacion para obtener el costo del producto
     * @return int costo del producto
     */
    public Integer getCosto() {
        return costo;
    }

    /**
     * Operacion para establecer el costo del producto
     * @param costo int costo del producto
     */
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}
