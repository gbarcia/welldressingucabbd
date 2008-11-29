package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Horario;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *Clase para el control y gestion de Horario
 * @author Gerardo Barcia
 */
public class ControlHorario {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlHorario() throws IOException {
        bitacora.info("Iniciando controlador de horario");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar un Nuevo Horario
     * @param horario objeto horario a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarNuevoHorario(Horario horario) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarNuevoHorario", horario);
            bitacora.info("Horario: " + horario.getId() + " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Horario: " + horario.getId() + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
}
