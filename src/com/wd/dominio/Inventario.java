package com.wd.dominio;

/**
 *  Clase que maneja la gestion de los inventarios tanto para tienda como para
 * centros de distribucion
 * @author Casa
 */
public class Inventario {

    /**Variable codigo del centro de distribucion*/
    private int centroDistribucionCodigo;
    /**Variable id del producto que pertenece al inventario*/
    private int productoId;
    /**variable para manejar la cantidad del producto en un inventario*/
    private int cantidad;
    /**variable para manejar el codigo de la tienda al que pertenezca el inventario*/
    private Integer tiendaCodigo;

    /**Constructor por defecto*/
    public Inventario() {
    }

    /**
     * Constructor para un inventario de centro de distribucion
     * @param centroDistribucionCodigo int codigo del centro al que pertenece
     * @param productoId int codigo del producto presente en el inventario
     * @param cantidad int cantidad del producto en el centro
     */
    public Inventario(int centroDistribucionCodigo, int productoId, int cantidad) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    /**
     * Constructor para crear un inventario para una tienda
     * @param productoId int codigo del producto presente en el inventario
     * @param cantidad int cantidad del producto en la tienda
     * @param tiendaCodigo Integer codigo de la tienda a la que pertenece el inv.
     */
    public Inventario(int productoId, int cantidad, Integer tiendaCodigo) {
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.tiendaCodigo = tiendaCodigo;
    }

    /**Metodo para obtener la cantidad*/
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para establecer la cantidad
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**Metodo para obtener el codigo del centro de distribucion*/
    public int getCentroDistribucionCodigo() {
        return centroDistribucionCodigo;
    }

    /**
     * Metodo para establecer el codigo del centro de distribucion
     * @param centroDistribucionCodigo int codigo del centro de distribucion
     */
    public void setCentroDistribucionCodigo(int centroDistribucionCodigo) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
    }

    /**
     * Metodo para establecer el id del producto
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * Metodo para obtener el id del producto
     * @param productoId int id del producto
     */
    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    /** Metodo para obtener el codigo de la tienda*/
    public Integer getTiendaCodigo() {
        return tiendaCodigo;
    }

    /**
     * Metodo para establecer el codigo de la tienda
     * @param tiendaCodigo int codigo de la tienda a la que pertenece el inventario
     */
    public void setTiendaCodigo(Integer tiendaCodigo) {
        this.tiendaCodigo = tiendaCodigo;
    }

}
