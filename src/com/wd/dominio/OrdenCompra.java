package com.wd.dominio;

import java.util.Collection;

/**
 *
 * @author Gerardo Barcia
 */
public class OrdenCompra extends Solicitud {

    private Integer CentroCodigo;
    private Integer ProveedorCodigo;
    private String placaCamion;
    private Integer idConductor;
    private String nombreCentro;
    private String nombreProveedor;
    private String nombreConductor;

    public OrdenCompra() {
    }

    public OrdenCompra(Integer CentroCodigo, Integer ProveedorCodigo, String placaCamion,
            Integer idConductor) {
        this.CentroCodigo = CentroCodigo;
        this.ProveedorCodigo = ProveedorCodigo;
        this.placaCamion = placaCamion;
        this.idConductor = idConductor;
    }

    public OrdenCompra(Integer CentroCodigo, Integer ProveedorCodigo, String placaCamion,
            Integer idConductor, String nombreCentro, String nombreProveedor, String nombreConductor) {
        this.CentroCodigo = CentroCodigo;
        this.ProveedorCodigo = ProveedorCodigo;
        this.placaCamion = placaCamion;
        this.idConductor = idConductor;
        this.nombreCentro = nombreCentro;
        this.nombreProveedor = nombreProveedor;
        this.nombreConductor = nombreConductor;
    }

    public Integer getCentroCodigo() {
        return CentroCodigo;
    }

    public void setCentroCodigo(Integer CentroCodigo) {
        this.CentroCodigo = CentroCodigo;
    }

    public Integer getProveedorCodigo() {
        return ProveedorCodigo;
    }

    public void setProveedorCodigo(Integer ProveedorCodigo) {
        this.ProveedorCodigo = ProveedorCodigo;
    }

    public Integer getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion;
    }

    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}

  