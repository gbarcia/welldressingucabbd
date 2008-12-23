
package com.wd.dominio;

/**
 *
 * @author Gerardo Barcia
 */
public class OrdenCompra extends Solicitud {

    private Integer CentroCodigo;

    private Integer ProvedorCodigo;

    public Integer getCentroCodigo() {
        return CentroCodigo;
    }

    public void setCentroCodigo(Integer CentroCodigo) {
        this.CentroCodigo = CentroCodigo;
    }

    public Integer getProvedorCodigo() {
        return ProvedorCodigo;
    }

    public void setProvedorCodigo(Integer ProvedorCodigo) {
        this.ProvedorCodigo = ProvedorCodigo;
    }        
}
