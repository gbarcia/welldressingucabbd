package com.wd.dominio;

import java.util.Collection;
import java.util.Date;

/**
 * Clase abstracta para el manejo de solicitudes
 * @author Gerardo Barcia
 */
public abstract class Solicitud {

    /** variable del identificador de la solicitud */
    protected Integer id;

    /** variable de la fecha de generacion de la solicitud*/
    protected Date fechaGenerada;

    /** variable de la fecha estimada de entrega*/
    protected Date fechaEstimada;

    /** variable del estatus de la solicitud
     * 0 solicitud aprobada
     * 1 solicitud despachada
     * 2 solicitud recibida
     * 3 solicitud cancelada
     */
    protected Integer status;

    /** Coleccion de productos involucrados en la solicitud*/
    protected Collection<Item> coleccionProductos;

    /**
     * Operacion para agregar un item a la solicitud
     * @param idProducto
     * @param idSolicitud
     * @param idCantidad
     */
    public void agregarItem (Integer idProducto, Integer idSolicitud, Integer idCantidad, Integer idCosto) {
        Item i = new Item(idProducto, idSolicitud, idCantidad,idCosto);
        this.coleccionProductos.add(i);
    }

    public Date getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}