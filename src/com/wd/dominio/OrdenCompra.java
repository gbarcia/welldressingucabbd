package com.wd.dominio;

import com.wd.servicios.ControlItem;
import java.io.IOException;
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
    /** variable para conocer el total de la orden */
    private Integer total;
    /** variable para controlador item */
    private ControlItem controlItem;

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
        this.setProveedorRif(ProveedorRif);
        this.setPlacaCamion(placaCamion);
        this.idConductor = idConductor;
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
    }

    /**
     * Constructor general 2
     * Cuando nos interese conocer los detalles de los nombres de los atributos
     * @param solicitudId id de la solicitud
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
    public OrdenCompra(Integer solicitudId, Integer CentroCodigo, String ProveedorRif, String placaCamion,
            Integer idConductor, String nombreCentro, String nombreProveedor, String nombreConductor,
            Date FechaGen, Date FechaEst, Integer status) {
        this.centroCodigo = CentroCodigo;
        this.setProveedorRif(ProveedorRif);
        this.setPlacaCamion(placaCamion);
        this.idConductor = idConductor;
        this.setNombreCentro(nombreCentro);
        this.setNombreProveedor(nombreProveedor);
        this.setNombreConductor(nombreConductor);
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
        super.setId(solicitudId);
        try {
            this.controlItem = new ControlItem();
        } catch (IOException ex) {
        }
        this.coleccionProductos = this.controlItem.traerTodosItems(solicitudId);
    }

    /**
     * Operacion para calcular el total neto de la orden
     */
    private void calcularTotalNeto() {
        for (Item Item : coleccionProductos) {
            this.total += Item.getSubTotal();
        }
    }

    /**
     * metodo para obtener el codigo del centro
     * @return int centro codigo
     */
    public Integer getCentroCodigo() {
        return centroCodigo;
    }

    /**
     * metodo para establecer el codigo del centro
     * @param CentroCodigo int el codigo del centro
     */
    public void setCentroCodigo(Integer CentroCodigo) {
        this.centroCodigo = CentroCodigo;
    }

    /**
     * metodo para obtener el rif del proveedor
     * @return String rif del proveedor
     */
    public String getProveedorRif() {
        return proveedorRif;
    }

    /**
     * metodo para establecer el rif del proveedor
     * @param ProveedorCodigo String el rif del proveedor
     */
    public void setProveedorRif(String ProveedorCodigo) {
        this.proveedorRif = ProveedorCodigo.toUpperCase();
    }

    /**
     * Metodo para obtener la cedula del conductor
     * @return int cedula del conductor
     */
    public Integer getIdConductor() {
        return idConductor;
    }

    /**
     * Metodo para establecer la cedula del conductor
     * @param idConductor la cedula del conductor
     */
    public void setIdConductor(Integer idConductor) {
        this.idConductor = idConductor;
    }

    /**
     * Operacion para obtener el nombre de un centro
     * @return String nombre del centro
     */
    public String getNombreCentro() {
        return nombreCentro;
    }

    /**
     * Operacion para establecer el nombre de un centro
     * @param nombreCentro String nombre del centro
     */
    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro.toUpperCase();
    }

    /**
     * Operacion para obtener el nombre del conductor
     * @return String nombre del conductor
     */
    public String getNombreConductor() {
        return nombreConductor;
    }

    /**
     * Operacion para establecer el nombre del conductor
     * @param nombreConductor String nombre del conductor
     */
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor.toUpperCase();
    }

    /**
     * Obtener el nombre del proveedor
     * @return String nombre del proveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Operacion para establecer el nombre del proveedor
     * @param nombreProveedor String nombre del proveedor
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor.toUpperCase();
    }

    /**
     * Operacion para obtener la placa del camion
     * @return String la placa del camion
     */
    public String getPlacaCamion() {
        return placaCamion;
    }

    /**
     * Operacion para establecer la placa del camion
     * @param placaCamion String la placa del camion
     */
    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion.toUpperCase();
    }

    /**
     * Operacion para obtener la coleccion de Items
     * @return Coleccion de Objetos Item
     */
    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    /**
     * Operacion para establecer la coleccion de items
     * @param coleccionProductos Coleccion de objetos Item
     */
    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }

    /**
     * Operacion para obtener el total
     * @return Int total de la orden de compra
     */
    public Integer getTotal() {
        this.calcularTotalNeto();
        return total;
    }

    /**
     * Operacion para establecer el total
     * @param total int total orden
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
}

  