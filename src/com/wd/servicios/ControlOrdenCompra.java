/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author Casa
 */
public class ControlOrdenCompra implements IfaceSolicitud {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlOrdenCompra() throws IOException {
        bitacora.info("Iniciando controlador de OrdenCompra");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    public boolean agregarOrden(OrdenCompra orden) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarOrden", orden);
             bitacora.info("Orden: " + orden.getId() + " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
             bitacora.error("No se pudo operar " + orden.getId() +
                    " porque " + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    public boolean actualizarInventario(Object aAct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
