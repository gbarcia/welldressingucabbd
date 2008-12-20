package com.wd.servicios;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.apache.log4j.Logger;

/**
 * Clase para el control y gestion de productos
 * @author Jonathan Trujillo
 */
public class ControlProducto {

     /** variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** variable de manejo de bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    public ControlProducto(){
        this.bitacora.info("Iniciando controlador de producto");
    }
}
