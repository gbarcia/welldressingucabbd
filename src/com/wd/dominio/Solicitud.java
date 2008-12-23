
package com.wd.dominio;

import java.util.Collection;
import java.util.Date;

/**
 * Clase abstracta para el manejo de solicitudes
 * @author Gerardo Barcia
 */
public abstract class Solicitud {

    protected Integer id;

    protected Date fechaGenerada;

    protected Date fechaEstimada;

    protected Integer status;

    protected Collection<Item> coleccionProductos;

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


