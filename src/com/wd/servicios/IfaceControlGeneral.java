package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Horario;
import com.wd.dominio.Tienda;
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
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public  boolean agregarNuevaTienda(Tienda tienda);

     /**
      * Metodo para buscar todos los horarios del sistema
      * @return Collection todos los horarios registrados
      */
     public Collection traerTodosLosHorarios ();
     /**
      * Metodo para agregar un nuevo Centro de Distribucion
      * @param centro objeto CentroDistribucion a insertar
      * @return boolean resultado de la operacion
      */
     public boolean agregarCentroDistribucion(CentroDistribucion centro);
}
