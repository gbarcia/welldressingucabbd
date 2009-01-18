package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Inventario;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para la gestion y el control de los inventarios tanto para las tiendas
 * como para los centros de distribucion
 * @author Casa
 */
public class ControlInventario {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    public ControlInventario() throws IOException {
        bitacora.info("Iniciando controlador de Inventario");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para buscar el inventario de un centro de distribucion
     * @return Collection todos los inventarios registrados
     */
    public Collection<Inventario> traerInventarioCentro (int codigoCentro) {
        Collection<Inventario> coleccion = null;
        try {
            bitacora.info("Iniciando operacion para traer el inventario " +
            "de un centro de distribucion");
            coleccion = sqlMap.queryForList("modificarCantidadInvTeoCentro",codigoCentro);
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccion;
        }
    }

    /**
     * Metodo para buscar el inventario de una tienda
     * @return Collection todos los inventarios registrados
     */
    public Collection<Inventario> traerInventarioTeoTienda (Integer codigoTienda) {
        Collection<Inventario> coleccion = null;
        try {
            bitacora.info("Iniciando operacion para traer el inventario " +
            "de un centro de distribucion");
            coleccion = sqlMap.queryForList("modificarCantidadInvTeoTienda",codigoTienda);
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccion;
        }
    }
    /**
     * Metodo para modificar la cantidad de un producto en un inventario de un
     * centro de distribucion
     * @param inv objeto Inventario a modificar
     * @return resultado de la operacion
     */
    public boolean modificarInventarioTeoCentro(Inventario inv){
        boolean resultado = false;
        try {
            sqlMap.update("modificarCantidadInvCentro", inv);
            bitacora.info("Inventario modificado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Inventario operacion" + " fallida porque: "
            + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar la cantidad de un producto en un inventario de una
     * tienda
     * @param inv objeto Inventario a modificar
     * @return resultado de la operacion
     */
    public boolean modificarInventarioTienda(Inventario inv){
        boolean resultado = false;
        try {
            sqlMap.update("modificarCantidadInvTienda", inv);
            bitacora.info("Inventario modificado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Inventario operacion" + " fallida porque: "
            + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

}
