
package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Lugar;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el manejo CRUD de la entidad Lugar
 * @author Gerardo Barcia
 */
public class ControlLugar {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;

    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlLugar() throws IOException {
        bitacora.info("Iniciando controlador de lugar");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

     /**
      * Metodo para obtener todos los lugares
      * @return objetos de tipo lugar con informacion sobre las ciudades con su
      * id y tipo cada una y además con el estado a quien pertenecen, con el id
      * del estado respectivo
      */
    public Collection<Lugar> traerTodosLosLugares () {
        Collection<Lugar> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los Lugares");
            resultado = sqlMap.queryForList("todosLosLugares");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

     /**
      * Metodo para obtener todos los Estados
      * @return objetos de tipo lugar con informacion sobre los estados con su
      * respectivo nombre, id y tipo
      */
    public Collection<Lugar> traerTodosLosEstados () {
        Collection<Lugar> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los Estados");
            resultado = sqlMap.queryForList("todosLosEstados");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }
}
