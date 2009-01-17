
package com.wd.dominio;

import java.util.Collection;

/**
 *
 * @author Gerardo Barcia
 */
public class Transferencia extends Solicitud {

    private Integer idTiendaQueTransfiere;

    private Integer idTiendaQueRecibe;

    private String nombreTiendaQueTransfiere;

    private String nombreTiendaQueRecibe;

    public Transferencia() {
    }

    public Transferencia(Integer idTiendaQueTransfiere, Integer idTiendaQueRecibe) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
        this.idTiendaQueRecibe = idTiendaQueRecibe;
    }

    public Transferencia(Integer idTiendaQueTransfiere, Integer idTiendaQueRecibe,
            String nombreTiendaQueTransfiere, String nombreTiendaQueRecibe) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
        this.idTiendaQueRecibe = idTiendaQueRecibe;
        this.nombreTiendaQueTransfiere = nombreTiendaQueTransfiere;
        this.nombreTiendaQueRecibe = nombreTiendaQueRecibe;
    }

    public Integer getIdTiendaQueRecibe() {
        return idTiendaQueRecibe;
    }

    public void setIdTiendaQueRecibe(Integer idTiendaQueRecibe) {
        this.idTiendaQueRecibe = idTiendaQueRecibe;
    }

    public Integer getIdTiendaQueTransfiere() {
        return idTiendaQueTransfiere;
    }

    public void setIdTiendaQueTransfiere(Integer idTiendaQueTransfiere) {
        this.idTiendaQueTransfiere = idTiendaQueTransfiere;
    }

    public String getNombreTiendaQueRecibe() {
        return nombreTiendaQueRecibe;
    }

    public void setNombreTiendaQueRecibe(String nombreTiendaQueRecibe) {
        this.nombreTiendaQueRecibe = nombreTiendaQueRecibe;
    }

    public String getNombreTiendaQueTransfiere() {
        return nombreTiendaQueTransfiere;
    }

    public void setNombreTiendaQueTransfiere(String nombreTiendaQueTransfiere) {
        this.nombreTiendaQueTransfiere = nombreTiendaQueTransfiere;
    }

    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}
