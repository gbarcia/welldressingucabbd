package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Departamento;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 *Clase para el control y gestion de Departamentos
 * @author Gabylis
 */
public class ControlDepartamento {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlDepartamento() throws IOException {
        bitacora.info("Iniciando controlador de Departamento");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar un Departamento
     * @param departamento objeto Departamento a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarDepartamento(Departamento departamento) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarDepartamento", departamento);
            bitacora.info("Departamento: " + departamento.getCodigo() +
            " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Departamento: " + departamento.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los departamentos del sistema
     * @return Collection todos los departamentos registrados
     */
    public Collection<Departamento> traerTodosLosDepartamentos () {
        Collection<Departamento> coleccionDepartamentos = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los " +
            "Departamentos");
            coleccionDepartamentos = sqlMap.queryForList("TodosLosDepartamentos");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionDepartamentos;
        }

    }

    /**
     * Metodo eliminar un departamento del sistema
     * @return int resultado de la operacion
     */
    public int eliminarDepartamento (Departamento dpto) {
        int resultado = 0;
        try {
            resultado = sqlMap.delete("borrarDepartamento",dpto);            
            bitacora.info("Departamento: " + dpto.getCodigo() +
            " eliminado con éxito");
            //resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());            
        }
        finally {
            return resultado;
        }

    }

    /**
     * Metodo para modificar cualquier atributo de un departamento
     * @param newDpto objeto departamento a modificar
     * @return resultado de la operacion
     */
    public boolean modificarDepartamento(Departamento newDpto) {
        boolean resultado = false;
        try {
            sqlMap.update("modificarDepartamento", newDpto);
            bitacora.info("Departamento: " + newDpto.getCodigo() +
            " modificado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Departamento: " + newDpto.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para agregar una SubClase
     * @param departamento objeto Departamento a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarSubClase", newSubClase);
            bitacora.info("Clase: " + newSubClase.getCodigo() +
            " agregada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Clase: " + newSubClase.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las Subclases del sistema
     * @return Collection todos los Subclases registradas
     */
    public Collection<Departamento> traerTodasLasSubClases () {
        Collection<Departamento> coleccionClases = null;
        try {
            bitacora.info("Iniciando operacion para traer todos las " +
            "SubClases");
            coleccionClases = sqlMap.queryForList("TodasLasSubClases");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionClases;
        }
    }

    /**
     * Metodo eliminar una Subclase del sistema
     * @return int resultado de la operacion
     */
    public int eliminarSubClase (Departamento subclase) {
        int resultado = 0;
        try {
            resultado = sqlMap.delete("borrarSubClase",subclase);
            bitacora.info("SubClase: " + subclase.getCodigo() +
            " eliminada con éxito");
            //resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

     /**
     * Metodo para modificar cualquier atributo de una Subclase
     * @param newClase objeto departamento a modificar
     * @return resultado de la operacion
     */
    public boolean modificarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try {
            sqlMap.update("modificarSubClase", newSubClase);
            bitacora.info("Clase: " + newSubClase.getCodigo() +
            " modificada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Departamento: " + newSubClase.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para agregar una Clase
     * @param departamento objeto Departamento a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarClase(Departamento newClase) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarClase", newClase);
            bitacora.info("Clase: " + newClase.getCodigo() +
            " agregada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Clase: " + newClase.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las clases del sistema
     * @return Collection todos los clases registradas
     */
    /*public Collection<Departamento> traerTodosLasClases () {
        Collection<Departamento> coleccionClases = null;
        try {
            bitacora.info("Iniciando operacion para traer todos las " +
            "Clases");
            coleccionClases = sqlMap.queryForList("TodasLasClases");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionClases;
        }
    }*/

    /**
     * Metodo para buscar todos las clases del sistema
     * @return Collection todos los clases registradas
     */
    public Collection<Departamento> traerTodosLasClases (Departamento dueño) {
        Collection<Departamento> coleccionClases = null;
        try {
            bitacora.info("Iniciando operacion para traer todos las " +
            "Clases");
            coleccionClases = sqlMap.queryForList("TodasLasClases",dueño);
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionClases;
        }
    }

    /**
     * Metodo eliminar una clase del sistema
     * @return int resultado de la operacion
     */
    public int eliminarClase (Departamento clase) {
        int resultado = 0;
        try {
            resultado = sqlMap.delete("borrarClase",clase);
            bitacora.info("Clase: " + clase.getCodigo() +
            " eliminada con éxito");
            //resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

     /**
     * Metodo para modificar cualquier atributo de una clase
     * @param newClase objeto departamento a modificar
     * @return resultado de la operacion
     */
    public boolean modificarClase(Departamento newClase) {
        boolean resultado = false;
        try {
            sqlMap.update("modificarDClase", newClase);
            bitacora.info("Clase: " + newClase.getCodigo() +
            " modificada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Departamento: " + newClase.getCodigo() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
}
