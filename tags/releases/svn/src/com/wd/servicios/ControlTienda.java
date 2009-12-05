package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.wd.dominio.Tienda;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para control y gestion de Tienda
 * @author Jonathan Trujillo
 */
public class ControlTienda {

    /** variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** variable de manejo de bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /**
     * Constructor que inicia SQLMap y la bitacora
     * @throws java.io.IOException
     */
    public ControlTienda() throws IOException {
        this.bitacora.info("Iniciando controlador de Tienda");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        this.sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar una Tienda
     * @param tienda la tienda a agregar
     * @return resultado de la operacion
     */
    public boolean agregarTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarTienda", tienda);
            this.bitacora.info("Tienda: " + tienda.getCodigo() + " agregada con " +
                    "éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Tienda: " + tienda.getCodigo() + " operacion " +
                    "fallida: " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una Tienda
     * @param tienda la tienda a modificar
     * @return resultado de la operacion
     */
    public boolean modificarTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.sqlMap.update("modificarTienda", tienda);
            this.bitacora.info("Tienda: " + tienda.getCodigo() + " modificada " +
                    "con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Tienda: " + tienda.getCodigo() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar una Tienda
     * @param codigo el codigo de la Tienda
     * @return resultado de la operacion
     */
    public boolean eliminarTienda(int codigo) {
        boolean resultado = false;
        try {
            this.sqlMap.delete("eliminarTienda", codigo);
            this.bitacora.info("Tienda: " + codigo + " eliminada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Tienda: " + codigo + " operacion fallida: " +
                    ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar Tiendas
     * @return todas las Tiendas del sistema
     */
    public Collection<Tienda> consultarTiendas() {
        Collection<Tienda> coleccionTiendas = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todas las Tiendas");
            coleccionTiendas = this.sqlMap.queryForList("consultarTiendas");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionTiendas;
        }
    }

    /**
     * Metodo para traer las tiendas y su variedad de productos
     * @return coleccion de tiendas
     */
    public Collection<Tienda> consultarTiendasVariedadDesc() {
        Collection<Tienda> coleccionTiendas = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todas las Tiendas y sus variedades");
            coleccionTiendas = this.sqlMap.queryForList("consultarTiendasVariedadDesc");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionTiendas;
        }
    }

    /**
     * Metodo para traer las tiendas y su variedad de productos
     * @return coleccion de tiendas
     */
    public Collection<Tienda> consultarTiendasVariedadAsc() {
        Collection<Tienda> coleccionTiendas = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todas las Tiendas y sus variedades");
            coleccionTiendas = this.sqlMap.queryForList("consultarTiendasVariedadAsc");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionTiendas;
        }
    }

    /**
     * Metodo para consultar Tiendas en base a su tamaño en orden de mayor a menor
     * o de menor a mayor
     * @param orden int 1 de mayor a menor 2 de menor a mayor
     * @return todas las Tiendas del sistema segun orden
     */
    public Collection<Tienda> traerTiendasOrdenTamano(int orden) {
        Collection<Tienda> resultado = null;
        try {
            switch (orden) {
                case 1:
                    this.bitacora.info("Iniciando operacion para traer todas " +
                            "las Tiendas en orden de mayor tamaño");
                    resultado = sqlMap.queryForList("consultarTiendasMayorTamano");
                    break;
                case 2:
                    this.bitacora.info("Iniciando operacion para traer todas " +
                            "las Tiendas en orden de menor tamaño");
                    resultado = sqlMap.queryForList("consultarTiendasMenorTamano");
                    break;
            }
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return resultado;
        }
    }
}
