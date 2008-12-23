
package com.wd.dominio;

/**
 *
 * @author Gerardo Barcia
 */
public class Transferencia extends Solicitud {

    private Integer idTiendaQueTransfiere;

    private Integer idTiendaQueRecibe;

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
        
}
