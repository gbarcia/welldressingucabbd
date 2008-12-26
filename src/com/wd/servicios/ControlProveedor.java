
package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Proveedor;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * Clase para el manejo del CRUD de la entidad proveedor
 * @author gerardo
 */
public class ControlProveedor {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;

    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlProveedor() throws IOException {
        bitacora.info("Iniciando controlador de Proveedor");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

     /**
    * Operacion para agregar un proveedor al sistema
    * @param proveedor el proveedor a registrar
    * @return boolean resultado de la operacion
    */
    public boolean agregarProveedor (Proveedor proveedor) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) sqlMap.insert("agregarProveedor", proveedor);
            bitacora.info("Provedor: " + pk + " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo agregar el proveedor " + proveedor.getNombre()
                    + " porque " + ex.getMessage());
            resultado = false;
        }
        finally {
            return resultado;
        }
    }

}
