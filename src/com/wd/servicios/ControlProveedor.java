package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Proveedor;
import com.wd.dominio.Servicio;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
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
    public boolean agregarProveedor(Proveedor proveedor) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) sqlMap.insert("agregarProveedor", proveedor);
            bitacora.info("Provedor: " + pk + " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("No se pudo agregar el proveedor " + proveedor.getNombre() + " porque " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para editar un proveedor en el sistema
     * @param proveedor el proveedor a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarProveedor(Proveedor proveedor) {
        boolean resultado = false;
        try {
            int rowa = sqlMap.update("actualizarProveedor", proveedor);
            if (rowa > 0) {
                resultado = true;
                bitacora.info("Provedor: " + proveedor.getRif() + " actualizado con éxito");
            }
        } catch (SQLException ex) {
            resultado = false;
            bitacora.error("No se pudo actualizar el proveedor " + proveedor.getNombre()
                    + " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar un proveedor en el sistema
     * @param rif String rif del proveedor a consultar
     * @return resultado Proveedor con los datos de la consulta
     */
    public Proveedor consultarProveedor (String rif) {
        Proveedor resultado = null;
        try {
             bitacora.info("Iniciando operacion para consultar proveedor: " + rif);
             resultado = (Proveedor) sqlMap.queryForObject("buscarUnProveedor", rif);
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los proveedores registrados en el sistema     
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedores() {
        Collection<Proveedor> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los proveedores");
            resultado = sqlMap.queryForList("TodosLosProveedores");
        } catch (SQLException ex) {
             bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los proveedores con mas ordenes de compra
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedoresMasOC() {
        Collection<Proveedor> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los proveedores");
            resultado = sqlMap.queryForList("TraerProveedoresMasOC");
        } catch (SQLException ex) {
             bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar un proveedor del sistema
     * @param rif String rif del proveedor a eliminar
     * @return resultado boolean de exito o no de la operacion
     */
    public boolean eliminarProveedor (String rif) {
        boolean resultado = false;
        int rowA = 0;
        try {
             bitacora.info("Iniciando operacion para eliminar proveedor " + rif);
            rowA = sqlMap.delete("borrarProveedor", rif);
            if (rowA > 0) {
                bitacora.info("proveedor " + rif + " eliminado con exito");
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los proveedores de un centro de distribucion
     * en especifico registrados en el sistema
     * @param codigoCentro int codigo del centro al q prestan servicio los
     * proveedores
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedoresCentro(int codigoCentro) {
        Collection<Proveedor> resultado = null;
        try {
            bitacora.info("Iniciando operacion para traer todos los proveedores");
            resultado = sqlMap.queryForList("proveedoresPorCentro",codigoCentro);
        } catch (SQLException ex) {
             bitacora.error("No se pudo realizar la operacion porque: "
                    + ex.getMessage());
        }
        finally {
            return resultado;
        }
    }
    
}
