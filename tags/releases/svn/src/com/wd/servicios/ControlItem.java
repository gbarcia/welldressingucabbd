package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Item;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase para el manejo CRUD de la entidad items
 * @author Casa
 */
public class ControlItem {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlItem() throws IOException {
        bitacora.info("Iniciando controlador de items");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * operacion para agregar un item en la base de datos
     * @param i Item objeto item a agregar
     * @return boleano con exito o no de la operacion
     */
    public boolean agregarItem(Item i) {
        boolean resultado = false;
        try {
            sqlMap.insert("agregarItem", i);
            bitacora.info("Item para: " + i.getIdSolicitud() + " agregado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Item: " + i.getIdSolicitud() + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para actualizar un registro de item en la base de datos
     * @param i Item objeto del item a actualizar
     * @return boleano con exito o no de la operacion
     */
    public boolean actualizatItem(Item i) {
        boolean resultado = false;
        try {
            sqlMap.update("editarItem", i);
            bitacora.info("Item para: " + i.getIdSolicitud() + " actualizado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Item: " + i.getIdSolicitud() + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para traer todos los objetos item correspondiente a una solicitud
     * @param  idSolicitud int identificador de la solicitud
     * @return Coleccion de Objetos Item
     */
    public Collection<Item> traerTodosItems(Integer idSolicitud) {
        Collection<Item> resultado = null;
        try {
            resultado = sqlMap.queryForList("traerTodosItems", idSolicitud);
            bitacora.info("Iniciada operacion para traer todos los items de: " + idSolicitud);
        } catch (SQLException ex) {
            bitacora.error("operacion fallida porque: " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para buscar un determinado item en la base de datos
     * @param idSolicitud int numero de la solicitud
     * @param idProducto int identificador del producto
     * @return objeto Item
     */
    public Item buscarItem(Integer idSolicitud, Integer idProducto) {
        Item resultado = null;
        Item i = new Item(idProducto, idSolicitud, 0, 0);
        try {
            resultado = (Item) sqlMap.queryForObject("buscarItem", i);
            bitacora.info("Iniciada operacion para buscar item");
        } catch (SQLException ex) {
            bitacora.error("operacion fallida porque: " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrrar un item de la base de datos
     * se debe especificar en el objeto item los atributos de id_solicitud
     * e id_producto para eliminarlo
     * @param i
     * @return boleano con exito o no de la operacion
     */
    public boolean borrarItem(Item i) {
        boolean resultado = false;
        try {
            sqlMap.delete("borrarItem", i);
            bitacora.info("Item para: " + i.getIdSolicitud() + " borrado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Item: " + i.getIdSolicitud() + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar todos los itemes para una determinada solicitud
     * @param idSolicitud int numero de solicitud
     * @return boleano con exito o no de la operacion
     */
    public boolean borrarTodosItem(Integer idSolicitud) {
        boolean resultado = false;
        try {
            sqlMap.delete("borrarTodosLosItems", idSolicitud);
            bitacora.info("Item para: " + idSolicitud + " borrado con éxito");
            resultado = true;
        } catch (SQLException ex) {
            bitacora.error("Item: " + idSolicitud + " operacion" +
                    " fallida porque: " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }
}
