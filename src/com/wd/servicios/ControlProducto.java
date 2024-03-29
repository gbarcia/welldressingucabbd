package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Producto;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el control y gestion de productos
 * @author Jonathan Trujillo
 */
public class ControlProducto {

     /** variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** variable de manejo de bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /**
     * Constructor que inicia SQLMap y la bitacora
     * @throws java.io.IOException
     */
    public ControlProducto() throws IOException{
        this.bitacora.info("Iniciando controlador de Producto");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        this.sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar un producto
     * @param producto el producto a agregar
     * @return resultado de la operacion
     */
    public boolean agregarProducto(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarProducto", producto);
            this.bitacora.info("Producto: " + producto.getId() + " agregado con " +
                    "éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto: " + producto.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar un producto
     * @param producto el producto a modificar
     * @return resultado de la operacion
     */
    public boolean modificarProducto(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.update("modificarProducto", producto);
            this.bitacora.info("Producto: " + producto.getId() + " modificado " +
                    "con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto: " + producto.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un producto
     * @param id el id del producto
     * @return resultado de la operacion
     */
    public boolean eliminarProducto(int id){
        boolean resultado = false;
        try {
            this.sqlMap.delete("eliminarProducto", id);
            this.bitacora.info("Producto: " + id + " eliminado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto: " + id + " operacion fallida: " +
                    ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un registro de Producto-Departamento
     * @param id el producto a eliminar
     * @return resultado de la operacion
     */
    public boolean eliminarProductoDepartamento(int id){
        boolean resultado = false;
        try {
            this.sqlMap.delete("eliminarProductoDepartamento", id);
            this.bitacora.info("ProductoDepartamento: " + id +
                    " eliminado con éxito de sus registro de departamento");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("ProductoDepartamento: " + id
                    + " operacion fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }


    /**
     * Metodo para consultar productos
     * @return coleccion de productos
     */
    public Collection<Producto> consultarProductos(){
        Collection<Producto> coleccionProductos = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todos los Productos");
            coleccionProductos = this.sqlMap.queryForList("consultarProductos");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionProductos;
        }
    }

    /**
     * Metodo para consultar productos de una tienda
     * @return coleccion de productos
     */
    public Collection<Producto> consultarProductosTienda(Integer codigoTienda){
        Collection<Producto> coleccionProductos = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todos los " +
            "Productos de una tienda");
            coleccionProductos = this.sqlMap.queryForList("traerProductosTienda",codigoTienda);
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionProductos;
        }
    }
    /**
     * Metodo para consultar productos con sus proveedores
     * @param codigoProducto int codigo del producto.
     * @return coleccion de productos
     */
    public Collection<Producto> consultarProductoConProveedores(int codigoProducto){
        Collection<Producto> coleccionProductos = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todos un producto con sus proveedores");
            coleccionProductos = this.sqlMap.queryForList("consultarProductoConProveedor",codigoProducto);
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionProductos;
        }
    }

      /**
     * Metodo para consultar productos para un determinado proveedor
     * @param rif String con el rif del proveedor a consultar los productos
     * @return resultado coleccion de productos
     */
    public Collection<Producto> consultaProductosProveedor (String rif) {
        Collection<Producto> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los Productos del " +
                    "Provedor:" + rif);
            resultado = sqlMap.queryForList("consultarProductosProveedor", rif);
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

     /**
     * Metodo para consultar los productos mas solicitados por una tienda
     * @param codigoTienda Integer codigo de la tienda en cuestion
     * @return resultado coleccion de productos
     */
    public Collection<Producto> consultaProductosMasSolicitados(Integer codigoTienda) {
        Collection<Producto> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los Productos mas " +
                    "solicitados");
            resultado = sqlMap.queryForList("productosMasSolicitados",codigoTienda);
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    /**
     * Metodo para agregar registro al historial de Productos-Departamentos
     * @param producto el producto a agregar
     * @return resultado de la operacion
     */
    public boolean agregarProductoDepartamento(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarProductoDepartamento", producto);
            this.bitacora.info("ProductoDepartamento: " + producto.getId() +
                    " agregado con éxito al departamento " + producto.getDepartamentoId());
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("ProductoDepartamento: " + producto.getId()
                    + " operacion fallida: " + ex.getMessage()
                    + "Departamento " + producto.getDepartamentoId());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para traer todos los productos y sus departamentos
     * @return todos los productos y sus departamentos
     */
    public Collection<Producto> consultarProductoDepartamento(){
        Collection<Producto> coleccionProductos = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todos los departamnetos de un producto");
            coleccionProductos = this.sqlMap.queryForList("consultarProductoDepartamento");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionProductos;
        }
    }

    public Collection<Producto> consultaProductoProveedor(Producto producto){
        Collection<Producto> coleccionProductos = null;
        try {
            this.bitacora.info("Iniciando operacion para traer Productos-Proveedor");
            coleccionProductos = this.sqlMap.queryForList("consultaProductoProveedor", producto);
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionProductos;
        }
    }

    public boolean agregarProductoProveedor(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarProductoProveedor", producto);
            this.bitacora.info("Producto-Proveedor: " + producto.getId() + " agregado con " +
                    "éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto: " + producto.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    public boolean modificarProductoProveedor(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.update("modificarProductoProveedor", producto);
            this.bitacora.info("Producto-Proveedor: " + producto.getId() + " modificado " +
                    "con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto-Proveedor: " + producto.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    public boolean eliminarProductoProveedor(Producto producto){
        boolean resultado = false;
        try {
            this.sqlMap.delete("eliminarProductoProveedor", producto);
            this.bitacora.info("Producto-Proveedor: " + producto.getId() + " eliminado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Producto-Proveedor: " + producto.getId() + " operacion fallida: " +
                    ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

}
