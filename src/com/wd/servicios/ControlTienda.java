package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.wd.dominio.Tienda;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
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

    /** Constructor que inicia SQLMap y la bitacora*/
    public ControlTienda() throws IOException {
        this.bitacora.info("Iniciando controlador de tienda");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    public boolean agregarNuevaTienda(Tienda tienda){
        boolean resultado = false;
        try {
            this.sqlMap.insert("agregarNuevaTienda", tienda);
            this.bitacora.info("Tienda: " + tienda.getCodigo() + " agregada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            this.bitacora.error("Tienda: " + tienda.getCodigo() + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        }finally {
            return resultado;
        }
    }

}
