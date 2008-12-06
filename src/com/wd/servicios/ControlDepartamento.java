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
        bitacora.info("Iniciando controlador de centro de distribucion");
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
}
