package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Camion;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el control y gestio de productos
 * @author Jonathan Trujillo
 */
public class ControlCamion {

    /** variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** variable de manejo de bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /**
     * Constructor que inicia SQLMap y la bitacora
     * @throws java.io.IOException
     */
    public ControlCamion() throws IOException{
        this.bitacora.info("Iniciando controlador de Camion");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        this.sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar un camion
     * @param camion el camion a agregar
     * @return resultado de la operacion
     */
    public boolean agregarCamion(Camion camion){
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarCamion", camion);
            this.bitacora.info("Camion: " + camion.getId() + " agregado con " +
                    "éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Camion: " + camion.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar un camion
     * @param camion el camion a modificar
     * @return resultado de la operacion
     */
    public boolean modificarCamion(Camion camion){
        boolean resultado = false;
        try {
            this.sqlMap.update("modificarCamion", camion);
            this.bitacora.info("Camion: " + camion.getId() + " modificado " +
                    "con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Camion: " + camion.getId() + " operacion " +
                    "fallida: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un camion
     * @param id el id del camion
     * @return resultado de la operacion
     */
    public boolean eliminarCamion(int id){
        boolean resultado = false;
        try {
            this.sqlMap.delete("eliminarCamion", id);
            this.bitacora.info("Camion: " + id + " eliminado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Camion: " + id + " operacion fallida: " +
                    ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar camiones
     * @return coleccion de camiones
     */
    public Collection<Camion> consultarCamiones(){
        Collection<Camion> coleccionCamiones = null;
        try {
            this.bitacora.info("Iniciando operacion para traer todos los Camiones");
            coleccionCamiones = this.sqlMap.queryForList("consultarCamiones");
        } catch (SQLException ex) {
            this.bitacora.error("No se pudo realizar la operacion porque: " +
                    ex.getMessage());
        } finally {
            return coleccionCamiones;
        }
    }

}
