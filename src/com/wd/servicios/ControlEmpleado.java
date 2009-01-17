package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;
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
                this.agregarObjetoHistorialEmpleadoTienda(object);
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
    public boolean editarEmpleado(Empleado emp) {
        boolean resultado = false;
        int nra = -1;
        try {
            nra = sqlMap.update("actualizarEmpleado", emp);
            if (nra != 0) {
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
     * Operacion para consultar un empleado y su historial en el sistema
     * @param cedula Int numero de cedula del empleado a buscar
     * @return resultado Objeto empleado con la información inclutendo su historial
     * o null si no existe
     */
    public Empleado consultarEmpleadoTienda(Integer cedula) {
        Empleado resultado = null;
        Collection<HistorialEmpleado> historial = null;
        try {
            resultado = (Empleado) sqlMap.queryForObject("buscarEmpleado", cedula);
            bitacora.info("Empleado: " + cedula + " buscado con éxito");
            historial = this.consultarHistorialEmpleadoTienda(cedula);
            if (historial != null) {
                bitacora.info("Historia de : " + cedula + " se agregara a la coleccion");
                resultado.setHistorial(historial);
            }
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
            Collection<Empleado> resultadoP = sqlMap.queryForList("todosLosEmpleadosTiendas");
            resultado = this.agregarHistorialListaEmpleadosTienda(resultadoP);
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
    public Collection<HistorialEmpleado> consultarHistorialEmpleadoTienda(Integer cedula) {
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

    /**
     * Operacion para actualizar el historial de un empleado. Metodo usado para
     * el momento de promocion o de transferencia entre empleados
     * @param cedula int numero de cedula del empleado
     * @return boolean de exito o no de la operacion
     */
    public boolean actualizarHistorialEmpleadoTienda(int cedula) {
        boolean resultado = false;
        Empleado emp = this.consultarEmpleadoTienda(cedula);
        Collection<HistorialEmpleado> historial = emp.getHistorial();
        int longitud = historial.size();
        Vector<HistorialEmpleado> vec = new Vector(historial);
        HistorialEmpleado he = vec.get(longitud - 1);
        Date fecha = new Date();
        java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
        he.setFechaFin(fechaSQL);
        try {
            bitacora.info("Iniciando operacion para actualizar historial de: " + cedula);
            int ra = sqlMap.update("actualizarHistorial", he);
            if (ra > 0) {
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para agregar a cada objeto emplado de una lista de empleados
     * su historial correspondiente
     * @param coleccion la coleccion inicial de objetos empleado sin historial
     * @return Coleccion de objetos Empleado con su correspondiente historial
     */
    private Collection<Empleado> agregarHistorialListaEmpleadosTienda(Collection<Empleado> coleccion) {
        Collection<Empleado> resultado = new Vector();
        for (Empleado empleado : coleccion) {
            int cedula = empleado.getCedula();
            Collection<HistorialEmpleado> historial = this.consultarHistorialEmpleadoTienda(cedula);
            empleado.setHistorial(historial);
            resultado.add(empleado);
        }
        return resultado;
    }

    /**
     * Operacion para agregar un nuevo objeto historial a un empleado en el sistema
     * @param he Objeto de tipo historial Empleado que se quiere agregar
     * @return boolean de exito o no de la operacion
     */
    public boolean agregarObjetoHistorialEmpleadoTienda(HistorialEmpleado he) {
        boolean resultado = false;
        try {
            bitacora.info("Iniciando operacion para agregar objeto Historial " + he.getCedula());
            sqlMap.insert("agregarHistorial", he);
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar el historial de un empleado en el sistema
     * @param cedula int el numero de cedula del empleado que se quiere borrar
     * el historial
     * @return boolean de exito o no de la operacion
     */
    private boolean borrarHistorialEmpleadoTienda(int cedula) {
        boolean resultado = false;
        int nra = -1;
        try {
            bitacora.info("Iniciando operacion para eliminar historial de " + cedula);
            nra = sqlMap.delete("borrarHistorialEmpleadoTienda", cedula);
            if (nra > 0) {
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar un empleado en el sistema
     * @param cedula int el numero de cedula del empleado que se quiere borrar   
     * @return boolean de exito o no de la operacion
     */
    public boolean borrarEmpleado(int cedula) {
        boolean resultado = false;
        int nra = -1;
        try {
            bitacora.info("Iniciando operacion para borrar empleado: " + cedula);
            resultado = this.borrarHistorialEmpleadoTienda(cedula);
            nra = sqlMap.delete("borrarEmpleado", cedula);
            if (nra > 0) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para traer los conductores ordenados por mas entregas
     * @return Coleccion de Objetos Empleado 
     */
    public  Collection<Empleado> coductoresMasEntregas() {
        Collection<Empleado> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer conductores mas entregas");
            resultado = sqlMap.queryForList("conductoresMasEntregas");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }
}
