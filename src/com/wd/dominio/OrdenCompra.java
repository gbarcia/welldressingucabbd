package com.wd.dominio;

import java.sql.Date;
import java.util.Collection;

/**
 * Clase para el manejo de una orden de compra
 * @author Gerardo Barcia
 */
public class OrdenCompra extends Solicitud {

    /** variable para el codigo del centro de distribucion */
    private Integer centroCodigo;
    /** variable para el rif del proveedor */
    private String proveedorRif;
    /** variable para el manejo de la placa del camion*/
    private String placaCamion;
    /** variable para la cedula del conductor */
    private Integer idConductor;
    /** variable para el nombre del centro de distribucion */
    private String nombreCentro;
    /** variable para el nombre del proveedor */
    private String nombreProveedor;
    /** variable para el nombre del conductor */
    private String nombreConductor;

    /**
     * Constructor por defecto
     */
    public OrdenCompra() {
    }

    /**
     * Constructor general 1
     * @param CentroCodigo codigo del centro
     * @param ProveedorRif rif del proveedor
     * @param placaCamion placa del camion
     * @param idConductor cedula del conductor
     * @param FechaGen fecha de generacion
     * @param FechaEst fecha estimada de entrega
     * @param status estado de la orden
     */
    public OrdenCompra(Integer CentroCodigo, String ProveedorRif, String placaCamion,
            Integer idConductor, Date FechaGen, Date FechaEst, Integer status) {
        this.centroCodigo = CentroCodigo;
        this.proveedorRif = ProveedorRif;
        this.placaCamion = placaCamion;
        this.idConductor = idConductor;
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
    }

    /**
     * Constructor general 2
     * Cuando nos interese conocer los detalles de los nombres de los atributos
     * @param CentroCodigo codigo del centro
     * @param ProveedorRif rif del proveedor
     * @param placaCamion placa del camion
     * @param idConductor cedula del conductor
     * @param nombreCentro nombre del centro de distribucion
     * @param nombreProveedor nombre del proveedor
     * @param nombreConductor nombre del conductor
     * @param FechaGen fecha de generacion
     * @param FechaEst fecha estimada de entrega
     * @param status estado de la orden
     */
    public OrdenCompra(Integer CentroCodigo, String ProveedorRif, String placaCamion,
            Integer idConductor, String nombreCentro, String nombreProveedor, String nombreConductor,
            Date FechaGen, Date FechaEst, Integer status) {
        this.centroCodigo = CentroCodigo;
        this.proveedorRif = ProveedorRif;
        this.placaCamion = placaCamion;
        this.idConductor = idConductor;
        this.nombreCentro = nombreCentro;
        this.nombreProveedor = nombreProveedor;
        this.nombreConductor = nombreConductor;
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
    }

    public Integer getCentroCodigo() {
        return centroCodigo;
    }

    public void setCentroCodigo(Integer CentroCodigo) {
        this.centroCodigo = CentroCodigo;
    }

    public String getProveedorRif() {
        return proveedorRif;
    }

    public void setProveedorRif(String ProveedorCodigo) {
        this.proveedorRif = ProveedorCodigo.toUpperCase();
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
        this.nombreCentro = nombreCentro.toUpperCase();
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor.toUpperCase();
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor.toUpperCase();
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion.toUpperCase();
    }

    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}

  