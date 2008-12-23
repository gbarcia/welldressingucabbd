
package com.wd.dominio;

/**
 *
 * @author Gerardo Barcia
 */
public class Pedido extends Solicitud {

    private Integer tiendaCodigo;

    private Integer centroCodigo;

    private Integer ciConductor;

    private String placaCamion;

    public Integer getCentroCodigo() {
        return centroCodigo;
    }

    public void setCentroCodigo(Integer centroCodigo) {
        this.centroCodigo = centroCodigo;
    }

    public Integer getCiConductor() {
        return ciConductor;
    }

    public void setCiConductor(Integer ciConductor) {
        this.ciConductor = ciConductor;
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion;
    }

    public Integer getTiendaCodigo() {
        return tiendaCodigo;
    }

    public void setTiendaCodigo(Integer tiendaCodigo) {
        this.tiendaCodigo = tiendaCodigo;
    }
        
}
