package com.wd.dominio;

import java.util.Collection;

/**
 * Clase para el manejo de los pedidos
 * @author Gerardo Barcia
 */
public class Pedido extends Solicitud {

    private Integer tiendaCodigo;
    private Integer centroCodigo;
    private Integer ciConductor;
    private String placaCamion;
    private String nombreTienda;
    private String nombreCebtro;
    private String nombreConductor;

    public Pedido() {
    }

    public Pedido(Integer tiendaCodigo, Integer centroCodigo, Integer ciConductor, String placaCamion) {
        this.tiendaCodigo = tiendaCodigo;
        this.centroCodigo = centroCodigo;
        this.ciConductor = ciConductor;
        this.placaCamion = placaCamion;
    }

    public Pedido(Integer tiendaCodigo, Integer centroCodigo, Integer ciConductor,
            String placaCamion, String nombreTienda, String nombreCebtro, String nombreConductor) {
        this.tiendaCodigo = tiendaCodigo;
        this.centroCodigo = centroCodigo;
        this.ciConductor = ciConductor;
        this.placaCamion = placaCamion;
        this.nombreTienda = nombreTienda;
        this.nombreCebtro = nombreCebtro;
        this.nombreConductor = nombreConductor;
    }

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

    public String getNombreCebtro() {
        return nombreCebtro;
    }

    public void setNombreCebtro(String nombreCebtro) {
        this.nombreCebtro = nombreCebtro;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
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

    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}
