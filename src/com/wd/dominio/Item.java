/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.dominio;

/**
 *
 * @author Gerardo Barcia
 */
public class Item {

    private Integer idProducto;

    private Integer idSolicitud;

    private Integer cantidad;

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
