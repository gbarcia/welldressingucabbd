package com.wd.dominio;

import com.wd.servicios.ControlItem;
import java.io.IOException;
import java.sql.Date;
import java.util.Collection;

/**
 * Clase para el manejo de los pedidos
 * @author Gerardo Barcia
 */
public class Pedido extends Solicitud {

    /**codigo de la tienda*/
    private Integer tiendaCodigo;
    /**codigo del centro*/
    private Integer centroCodigo;
    /**cedula del conductor*/
    private Integer ciConductor;
    /**placa del camion*/
    private String placaCamion;
    /**nombre de la tienda*/
    private String nombreTienda;
    /**nombre del centro*/
    private String nombreCebtro;
    /**nombre del conductor*/
    private String nombreConductor;
    /** variable para controlador item */
    private ControlItem controlItem;

    /**
     * Constructor por defecto
     */
    public Pedido() {
    }

    /**
     * Constructor general uno, solo los datos primarios
     * @param tiendaCodigo codigo de la tienda
     * @param centroCodigo codigo del centro
     * @param ciConductor cedula del conductor
     * @param placaCamion placa del camion
     * @param FechaGen fecha generada
     * @param FechaEst fecha estimada de entrega
     * @param status estado del pedido
     */
    public Pedido(Integer tiendaCodigo, Integer centroCodigo, Integer ciConductor,
            String placaCamion, Date FechaGen, Date FechaEst, Integer status) {
        this.tiendaCodigo = tiendaCodigo;
        this.centroCodigo = centroCodigo;
        this.ciConductor = ciConductor;
        this.setPlacaCamion(placaCamion);
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
    }

    /**
     * Constructor General 2, con los datos de los nombres
     * @param pedidoId id de la solicitud
     * @param tiendaCodigo codigo de la tienda
     * @param centroCodigo codigo del centro
     * @param ciConductor cedula del conductor
     * @param placaCamion placa del camion
     * @param nombreTienda nombre de la tienda
     * @param nombreCebtro nombre del centro
     * @param nombreConductor nombre del conductor
     * @param FechaGen fecha generada
     * @param FechaEst fecha estimada de entrega
     * @param status estado del pedido
     */
    public Pedido(Integer pedidoId, Integer tiendaCodigo, Integer centroCodigo, Integer ciConductor,
            String placaCamion, String nombreTienda, String nombreCebtro, String nombreConductor,
            Date FechaGen, Date FechaEst, Integer status) {
        this.tiendaCodigo = tiendaCodigo;
        this.centroCodigo = centroCodigo;
        this.ciConductor = ciConductor;
        this.setPlacaCamion(placaCamion);
        super.setFechaEstimada(FechaEst);
        super.setFechaGenerada(FechaGen);
        super.setStatus(status);
        super.setId(pedidoId);
        this.setNombreTienda(nombreTienda);
        this.setNombreCebtro(nombreCebtro);
        this.setNombreConductor(nombreConductor);
        try {
            this.controlItem = new ControlItem();
        } catch (IOException ex) {
        }
        this.coleccionProductos = this.controlItem.traerTodosItems(pedidoId);
    }

    /**
     * obtener el codigo del centro
     * @return codigo del centro
     */
    public Integer getCentroCodigo() {
        return centroCodigo;
    }

    /**
     * establecer el codigo del centro
     * @param centroCodigo
     */
    public void setCentroCodigo(Integer centroCodigo) {
        this.centroCodigo = centroCodigo;
    }

    /**
     * obtener la cedula del conductor
     * @return int cedula
     */
    public Integer getCiConductor() {
        return ciConductor;
    }

    /**
     * establecer la cedula del conductor
     * @param ciConductor
     */
    public void setCiConductor(Integer ciConductor) {
        this.ciConductor = ciConductor;
    }

    /**
     * obtener el nombre del centro
     * @return nombre del centro
     */
    public String getNombreCebtro() {
        return nombreCebtro;
    }

    /**
     * Establecer el nombre del centro
     * @param nombreCebtro String
     */
    public void setNombreCebtro(String nombreCebtro) {
        this.nombreCebtro = nombreCebtro.toUpperCase();
    }

    /**
     * obtener el nombre del conductor
     * @return nombre del conductor
     */
    public String getNombreConductor() {
        return nombreConductor;
    }

    /**
     * Establecer nombre del conductor
     * @param nombreConductor
     */
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor.toUpperCase();
    }

    /**
     * Obtener el nombre de la tienda
     * @return nombre de la tienda
     */
    public String getNombreTienda() {
        return nombreTienda;
    }

    /**
     * Establecer nombre de la tienda
     * @param nombreTienda
     */
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda.toUpperCase();
    }

    /**
     * obenter la placa del camion
     * @return placa del camion
     */
    public String getPlacaCamion() {
        return placaCamion;
    }

    /**
     * Establecer la placa del camion
     * @param placaCamion
     */
    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion.toUpperCase();
    }

    /**
     * Obtener el codigo de la tienda
     * @return codigo de la tienda
     */
    public Integer getTiendaCodigo() {
        return tiendaCodigo;
    }

    /**
     * Establecer el codigo de la tienda
     * @param tiendaCodigo
     */
    public void setTiendaCodigo(Integer tiendaCodigo) {
        this.tiendaCodigo = tiendaCodigo;
    }

    /**
     * Obtener la coleccion de productos asociado al pedido
     * @return Coleccion de objetos Item
     */
    public Collection<Item> getColeccionProductos() {
        return coleccionProductos;
    }

    /**
     * Establecer la coleccion de productos asociados al pedido
     * @param coleccionProductos
     */
    public void setColeccionProductos(Collection<Item> coleccionProductos) {
        this.coleccionProductos = coleccionProductos;
    }
}
