package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el manejo del CRUD de la entidad empleado
 * @author gerardo
 */
public class ControlEmpleado {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlEmpleado() throws IOException {
        bitacora.info("Iniciando controlador de Empleado");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Operacion para agregar un empleado al sistema junto con su historial
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarEmpleado(Empleado emp) {
        boolean resultado = false;
        Integer pk = -1;
        Integer pk2 = -1;
        Collection<HistorialEmpleado> historial = null;
        try {
            pk = (Integer) sqlMap.insert("agregarEmpleado", emp);
            bitacora.info("Empleado: " + pk + " agregado con éxito");
            if (pk != -1) {
                historial = emp.getHistorial();
                for (HistorialEmpleado object : historial) {
                    pk2 = (Integer) sqlMap.insert("agregarHistorial", object);
                     bitacora.info("Historial Empleado: " + pk +
                                   " agregado con éxito");
                }
                resultado = true;
            }
        } catch (SQLException ex) {
             bitacora.error("No se pudo operar " + emp.getNombre() +
                     " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }
}
