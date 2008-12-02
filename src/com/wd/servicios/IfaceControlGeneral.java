
package com.wd.servicios;

import com.wd.dominio.Horario;
import java.util.Collection;

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

 /**
  * Metodo para buscar todos los horarios del sistema
  * @return Collection todos los horarios registrados
  */
        public Collection traerTodosLosHorarios ();
}
