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
import java.util.logging.Level;
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
    public boolean agregarEmpleadoTienda(Empleado emp) {
        boolean resultado = false;
        Collection<HistorialEmpleado> historial = null;
        try {
            sqlMap.insert("agregarEmpleado", emp);
            bitacora.info("Empleado: " + emp.getNombre() + " agregado con éxito");
            historial = emp.getHistorial();
            for (HistorialEmpleado object : historial) {
                sqlMap.insert("agregarHistorial", object);
                bitacora.info("Historial Empleado: " + emp.getNombre() +
                        " agregado con éxito");
            }
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + emp.getNombre() +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para actualizar la informacion de un empleado en el sistema
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarEmpleadoTienda(Empleado emp) {
        boolean resultado = false;
        int nra = -1;
        try {
            nra = sqlMap.update("actualizarEmpleado", emp);
            if (nra != -1) {
                resultado = true;
                bitacora.info("Empleado: " + emp.getNombre() + " actualizado con éxito");
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + emp.getNombre() +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar un empleado en el sistema
     * @param cedula Int numero de cedula del empleado a buscar
     * @return resultado Objeto empleado con la información o null si no existe
     */
    public Empleado consultarEmpleado(Integer cedula) {
        Empleado resultado = null;
        try {
            resultado = (Empleado) sqlMap.queryForObject("buscarEmpleado", cedula);
            bitacora.info("Empleado: " + cedula + " buscado con éxito");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + cedula +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los empleados del sistema    
     * @return Coleccion de objetos Empleado
     */
    public Collection<Empleado> traerTodosLosEmpleados() {
        Collection<Empleado> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los empleados");
            resultado = sqlMap.queryForList("todosLosEmpleados");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los empleados de las tiendas
     * @return Coleccion de objetos Empleado
     */
    public Collection<Empleado> traerTodosLosEmpleadosTienda() {
        Collection<Empleado> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los empleados de las tiendas");
            resultado = sqlMap.queryForList("todosLosEmpleadosTiendas");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar el historial de un determinado empleado
     * @param cedula Int el numero de cedula del empleado
     * @return Coleccion de objetos HistorialEmpleado
     */
    public Collection<HistorialEmpleado> consultarHistorialEmpleado(Integer cedula) {
        Collection<HistorialEmpleado> resultado = null;
        try {
            bitacora.info("Iniciando operacion para buscar el historial del empleado: " + cedula);
            resultado = sqlMap.queryForList("consultaHistorialEmpleado", cedula);
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }
}
