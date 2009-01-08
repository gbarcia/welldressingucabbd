package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Servicio;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el control y gestion de las empresas de vigilancia
 * @author Gabylis
 */
public class ControlEmpresaVigilancia {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    public ControlEmpresaVigilancia() throws IOException {
        bitacora.info("Iniciando controlador de Empresa de Vigilancia");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Metodo para agregar una Empresa de Vigilancia
     * @param emp objeto EmpresaVigilancia a instertar
     * @return boolean resultado exito o no de la operacion
     */
    public boolean agregarEmpresaVigilancia(EmpresaVigilancia emp) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarEmpresa", emp);
            bitacora.info("Empresa de Vigilancia: " + emp.getRif() +
            " agregada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Empresa de Vigilancia: " +emp.getRif() +
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
    * Operacion para asociar una empresa de vigilancia a un centro de distribucion
    * @param serv Servicio a registrar
    * @return boolean resultado de la operacion
    */
    public boolean agregarServicio(Servicio serv){
        boolean resultado = false;
        try {
            sqlMap.insert("agregarServicio", serv);
            bitacora.info("Empresa de Vigilancia:" + serv.getEmpresaServicioRif() +
            " asociada a un centro de distribucion con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Empresa de Vigilancia: " +serv.getEmpresaServicioRif()+
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todas las empresas de vigilancia del sistema
     * @return Collection todos las empresas de vigilancia registradas
     */
    public Collection<EmpresaVigilancia> traerTodasLasEmpresas () {
        Collection<EmpresaVigilancia> coleccionEmps = null;
        try {
            bitacora.info("Iniciando operacion para traer todos las " +
            "Empresas de Vigilancia");
            coleccionEmps = sqlMap.queryForList("TodasLasEmpresas");
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionEmps;
        }

    }

    /**
     * Metodo para buscar todas las empresas de vigilancia de un centro de dist.
     * @param rif String RIF de la empresa de vigilancia que presta el servicio
     * @return Collection todos los servicios registrados
     */
    public Collection<Servicio> traerLosServicios (String rif) {
        Collection<Servicio> coleccionServs = null;
        try {
            bitacora.info("Iniciando operacion para traer los Servicios");
            coleccionServs = sqlMap.queryForList("traerLosServicios",rif);
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return coleccionServs;
        }

    }

    /**
     * Metodo eliminar una Empresa de Vigilancia del sistema
     * @param  rif String de la empresa a eliminar
     * @return int resultado de la operacion
     */
    public int eliminarEmpresa(String rif) {
        int resultado = 0;
        try {
            resultado = sqlMap.delete("eliminarEmpresa",rif);
            bitacora.info("Empresa de Vigilancia: " + rif +
            " eliminada con éxito");
            //resultado = 1;
        } catch (SQLException ex) {
            bitacora.error("No se pudo realizar la operacion porque: " + ex.getMessage());
        }
        finally {
            return resultado;
        }

    }

    /**
     * Metodo para modificar cualquier atributo de una Empresa de vigilancia
     * @param emp objeto EmpresaVigilancia a modificar
     * @return resultado de la operacion
     */
    public boolean modificarEmpresaVigilancia(EmpresaVigilancia emp){
        boolean resultado = false;
        try {
            sqlMap.update("modificarEmpresa", emp);
            bitacora.info("Empresa de Vigilancia:: " + emp.getRif() +
            " modificada con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Empresa de Vigilancia:: " + emp.getRif()+
            " operacion" + " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

}
