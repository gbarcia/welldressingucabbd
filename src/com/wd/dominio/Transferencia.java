package com.wd.dominio;

import com.wd.servicios.ControlItem;
import java.io.IOException;
import java.sql.Date;
import java.util.Collection;

/**
 * Clase para el manejo de las transferencias
 * @author Gerardo Barcia
 */
public class Transferencia extends Solicitud {

    /** variable del id de la tienda que transfiere */
    private Integer idTiendaQueTransfiere;
    /** variable del id de la tienda que recibe la transferencia */
    private Integer idTiendaQueRecibe;
    /** variable del nombre de la tienda que transfiera (para consultas) */
    private String nombreTiendaQueTransfiere;
    /** variable del nombre de la tienda que recibe la transferecia (para consultas)*/
    private String nombreTiendaQueRecibe;
    /** variable para controlador item */
    private ControlItem controlItem;

    /**
     * Constructor por defecto
     */
    public Transferencia() {
    }

    /**
     * Constructor general 1
     * Para cuando se vaya a realizar transacciones con la bd
     * @param idTiendaQueTransfiere id de la tienda que transfiere
     * @param idTiendaQueRecibe id de la tienda que recibe
     * @param FechaGen fecha generada
     * @param FechaEst fecha estimada de entrega
     * @param status estado del pedido
     */
    public Transferencia(Integer idTiendaQueTransfiere, Integer idTiendaQueRecibe,
            Date FechaGen, Date FechaEst, Integer status) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
        this.idTiendaQueRecibe = idTiendaQueRecibe;
        super.setFechaEstimada(FechaEst); // llamadas a la clase padre solicitud
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
    }

    /**
     * Constructor general 2
     * Para cuando halla que traer consultas de la base de datos
     * @param idTransferencia el identificador de la transferencia, aveces no se
     * usa y podria llevar cualquier valor
     * @param idTiendaQueTransfiere id de la tienda que transfiere
     * @param idTiendaQueRecibe id de la tienda que recibe
     * @param nombreTiendaQueTransfiere nombre de la tienda que transfiere
     * @param nombreTiendaQueRecibe nombre de la tienda que recibe
     * @param FechaGen fecha generada
     * @param FechaEst fecha estimada de entrega
     * @param status estado del pedido
     */
    public Transferencia(Integer idTransferencia, Integer idTiendaQueTransfiere, Integer idTiendaQueRecibe,
            String nombreTiendaQueTransfiere, String nombreTiendaQueRecibe,
            Date FechaGen, Date FechaEst, Integer status) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
        this.idTiendaQueRecibe = idTiendaQueRecibe;
        this.setNombreTiendaQueTransfiere(nombreTiendaQueTransfiere);
        this.setNombreTiendaQueRecibe(nombreTiendaQueRecibe);
        super.setFechaEstimada(FechaEst); // llamadas a la clase padre solicitud
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
        super.setId(idTransferencia);
        try {
            this.controlItem = new ControlItem(); // instanciando el manejador de items
        } catch (IOException ex) {
        }
        this.coleccionProductos = this.controlItem.traerTodosItems(idTransferencia); // consultando todos los items de esta transferencia
    }

    /**
     * Obtener el id de la tienda que recibe la transferencia
     * @return int id tienda que recibe
     */
    public Integer getIdTiendaQueRecibe() {
        return idTiendaQueRecibe;
    }

    /**
     * Establecer el id de la tienda que recibe la transferencia
     * @param idTiendaQueRecibe int tienda que recibe
     */
    public void setIdTiendaQueRecibe(Integer idTiendaQueRecibe) {
        this.idTiendaQueRecibe = idTiendaQueRecibe;
    }

    /**
     * Obtener el id de la tienda que transfiere
     * @return int id de la tienda que transfiere
     */
    public Integer getIdTiendaQueTransfiere() {
        return idTiendaQueTransfiere;
    }

    /**
     * Establecer el id de la tienda que transfiere
     * @param idTiendaQueTransfiere int id de la tienda que transfiere
     */
    public void setIdTiendaQueTransfiere(Integer idTiendaQueTransfiere) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
    }

    /**
     * obtener el nombre de la tienda que recibe la transferencia
     * @return String nombre de la tienda que recibe
     */
    public String getNombreTiendaQueRecibe() {
        return nombreTiendaQueRecibe;
    }

    /**
     * Establecer el nombre de la tienda que recibe la transferencia
     * @param nombreTiendaQueRecibe String nombre de la tienda que recibe
     */
    public void setNombreTiendaQueRecibe(String nombreTiendaQueRecibe) {
        this.nombreTiendaQueRecibe = nombreTiendaQueRecibe.toUpperCase();
    }

    /**
     * obtenere el nombre de la tienda que transfiere
     * @return Strring nombre de la tienda que transfiere
     */
    public String getNombreTiendaQueTransfiere() {
        return nombreTiendaQueTransfiere;
    }

    /**
     * establecer el nombre de la tienda que transfiere
     * @param nombreTiendaQueTransfiere String nombre de al tienda que transfiere
     */
    public void setNombreTiendaQueTransfiere(String nombreTiendaQueTransfiere) {
        this.nombreTiendaQueTransfiere = nombreTiendaQueTransfiere.toUpperCase();
    }

    /**
     * Obtener la coleccion de items asociados a la transferencia
     * @return Coleccion de obtetos Item asociados a la transferencia
     */
    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    /**
     * Establecer la coleccion de itemes asociados a la transferencia
     * @param coleccionProductos Coleccion de objetos Item asociados
     */
    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}
