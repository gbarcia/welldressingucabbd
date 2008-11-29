
package com.wd.servicios;

import com.wd.dominio.Horario;

/**
 * Clase que reunira todos los controles particulares integrados en uno
 * para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class ControlGeneral implements IfaceControlGeneral {
    
    private ControlHorario controlHorario;

    public boolean agregarNuevoHorario(Horario horario) { 
        return false;
        
    }

}
