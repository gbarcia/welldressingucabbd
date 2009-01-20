package com.wd.servicios;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.wd.dominio.Item;
import com.wd.dominio.Pedido;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 * Clase que ofrece los servicios para trabajar con los pedidos
 * @author Casa
 */
public class ControlPedido implements IfaceSolicitud {

    /** Variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());
    /** Variable para trabajar con los items*/
    private ControlItem controlItem;
    /** Variable para trabajar con el inventario de los centros*/
    private ControlInventario controlInventario;

    /** Constructor que inicia el SQLMAP y la bitacora*/
    public ControlPedido() throws IOException {
        bitacora.info("Iniciando controlador de Pedido");
        String resource = "com/wd/configuracion/configuracionIbatis.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
    }

    /**
     * Operacion para agregar un pedido en la base de datos
     * @param p objeto pedido a agregar con su coleccion de items
     * @return boolean con el resultado de la operacion
     */
    public boolean agregarUnPedido(Pedido p) {
        boolean resultado = false;
        Integer pk = -1;
        try {
            pk = (Integer) this.sqlMap.insert("agregarPedido", p);
            p.setId(pk - 1);
            bitacora.info("Pedido: " + p.getId() + " agregado con éxito");
            if (pk != null) {
                Collection<Item> coleccionItem = p.getColeccionProductos();
                this.controlItem = new ControlItem();
                for (Item item : coleccionItem) {
                    item.setIdSolicitud(pk - 1);
                    this.controlItem.agregarItem(item);
                }
                resultado = true;
            }
        } catch (SQLException ex) {
            bitacora.error("No se pudo operar " + p.getId() +
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

    public boolean actualizarInventario(Object aAct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
