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

    public Item() {
    }

    public Item(Integer idProducto, Integer idSolicitud, Integer cantidad) {
        this.idProducto = idProducto;
        this.idSolicitud = idSolicitud;
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
}
