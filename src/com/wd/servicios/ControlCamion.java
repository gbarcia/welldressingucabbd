package com.wd.servicios;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.apache.log4j.Logger;

/**
 * Clase para el control y gestio de productos
 * @author Jonathan Trujillo
 */
public class ControlCamion {

    /** variable para trabajar con el SQLMap*/
    private SqlMapClient sqlMap;
    /** variable de manejo de bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

}
