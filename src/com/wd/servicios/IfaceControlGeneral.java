
package com.wd.servicios;

import com.wd.dominio.Horario;

/**
 * Interface para el Control general
 * @author Gerardo Barcia
 */
public interface IfaceControlGeneral {
    
/**
 * Metodo para agregar un nuevo Horario
 * @param horario objeto horario a insertar
 * @return boolean resultado de la operacion
 */    
        public boolean agregarNuevoHorario (Horario horario);
}
