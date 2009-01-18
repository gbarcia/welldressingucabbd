package com.wd.dominio;

import java.util.Collection;
import java.util.Date;
import java.util.Vector;

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
    protected Collection<Item> coleccionProductos = new Vector();

    /**
     * Operacion para agregar un item a la solicitud
     * @param idProducto
     * @param idSolicitud
     * @param idCantidad
     */
    public void agregarItem(Integer idProducto, Integer idSolicitud, Integer idCantidad, Integer idCosto) {
        Item i = new Item(idProducto, idSolicitud, idCantidad, idCosto);
        this.coleccionProductos.add(i);
    }

    /**
     * obtener la fecha estimada de entrega
     * @return Date fecha estimada
     */
    public Date getFechaEstimada() {
        return fechaEstimada;
    }

    /**
     * Establecer la fecha estimada de entrega
     * @param fechaEstimada
     */
    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    /**
     * obtener la fecha de generacion de la solicitud
     * @return Date fecha generada
     */
    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    /**
     * Establecer la fecha de generacion de la solicitud
     * @param fechaGenerada Date fecha generada
     */
    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    /**
     * Obtener el id de la solicitud
     * @return Integer id de la solicitud
     */
    public Integer getId() {
        return id;
    }

    /**
     * Establecer el id de la solicitud
     * @param id int id de la solicitud
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtener el estatus de la solicitud
     * 0 aprobada
     * 1 despachada
     * 2 recibida
     * 3 cancelada
     * @return int estatus de la solicitud
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * establecer el estatus de la solicitud
     * 0 aprobada
     * 1 despachada
     * 2 recibida
     * 3 cancelada
     * @param status int estatus de la solicitud
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}