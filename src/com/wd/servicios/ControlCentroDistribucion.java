package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.CentroDistribucion;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 *Clase para el control y gestion de Centro de Distribucion
 * @author Gabylis
 */
public class ControlCentroDistribucion {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlCentroDistribucion() throws IOException {
        bitacora.info("Iniciando controlador de centro de distribucion");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar un Centro de Distribucion
     * @param centro objeto CentroDistribucion a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarCentroDistribucion(CentroDistribucion centro) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarCentroDistribucion", centro);
            bitacora.info("Centro Distribucion: " + centro.getCodigo() +
            " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Centro Distribucion: " + centro.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los centros de distribuición del sistema
     * @return Collection todos los centros de distribuición registrados
     */
    public Collection<CentroDistribucion> traerTodosLosCentros () {
        Collection<CentroDistribucion> coleccionCentros = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los " +
            "Centros de distribucion");
            coleccionCentros = sqlMap.queryForList("TodosLosCentros");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionCentros;
        }

    }

    /**
     * Metodo eliminar un Centro de Distribucion del sistema
     * @return int resultado de la operacion
     */
    public int eliminarCentro(CentroDistribucion centro) {
        int resultado = 0;
        try {
            resultado = sqlMap.delete("borrarCentro",centro);
            bitacora.info("Centro Distribución: " + centro.getCodigo() +
            " eliminado con éxito");
            //resultado = 1;
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return resultado;
        }

    }

    /**
     * Metodo para modificar cualquier atributo de un centro de distribucion
     * @param centro objeto centroDistribucion a modificar
     * @return resultado de la operacion
     */
    public boolean modificarCentro(CentroDistribucion centro){
        boolean resultado = false;
        try {
            sqlMap.update("modificarCentro", centro);
            bitacora.info("Centro de Distribucion: " + centro.getCodigo() +
            " modificado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Centro de Distribucion: " + centro.getCodigo()+
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
}
