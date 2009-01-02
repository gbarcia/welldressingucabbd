package com.wd.gui.controlparticular;

import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;

/**
 * Manejador de la interfaz gráfica para Tienda
 * @author Jonathan Trujillo
 */
public class ControlGuiTienda {

    /** variable para el manejo de la entidad Tienda */
    private Tienda tienda;

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlGeneral = ControlGeneral.getInstance();
    
}
