package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Item;
import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 *
 * @author Casa
 */
public class ControlOrdenCompra implements IfaceSolicitud {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());
    /** Variable para trabajar con los items*/
    private ControlItem controlItem;

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlOrdenCompra() throws IOException {
        bitacora.info("Iniciando controlador de OrdenCompra");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Operacion para registrar una orden de compra en el sistema
     * @param orden objeto orden de compra con sus items
     * @return boolean resultado de la operacion
     */
    public boolean agregarOrden(OrdenCompra orden) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) sqlMap.insert("agregarOrden", orden);
            orden.setId(pk - 1);
            bitacora.info("Orden: " + orden.getId() + " agregado con éxito");
            if (pk != null) {
                Collection<Item> coleccionItem = orden.getColeccionProductos();
                this.controlItem = new ControlItem();
                for (Item item : coleccionItem) {
                    item.setIdSolicitud(pk - 1);
                    this.controlItem.agregarItem(item);
                }
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + orden.getId() +
                    " porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener el siguiente numero de orden de compra
     * @return int el siguiente numero
     */
    public int obtenerSiguienteNumeroOrden() {
        Integer resultado = 0;
        try {
            resultado = (Integer) sqlMap.queryForObject("siguienteNumeroOrden");
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar porque " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * 
     * @param aAct
     * @return
     */
    public boolean actualizarInventario(Object aAct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
