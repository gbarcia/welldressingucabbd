
package com.wd.gui.controlparticular;

import com.wd.dominio.Horario;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 * Manejador de la interfaz gráfica para agregar un nuevo horario
 * @author Gerardo Barcia
 */
public class ControlGuiHorario {

/** variable para el manejo de la entidad horario */
    private Horario horario;

/** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

/** constructor que inicia el control general GUI */
    public ControlGuiHorario() {
        this.controlador = new ControlGui();
    }

/**
 * Metodo para agregar un horario al sistema
 * @param horaIni int hora de inicio
 * @param horaFin int hora de fin
 * @param diaIni String dia de inicio
 * @param diaFin String dia de Fin
 * @param diaLibre String dia libre
 */
    public void  agregarHorarioalSistema (int horaIni, int horaFin, String diaIni,
                            String diaFin, String diaLibre) {
        horario = new Horario(0,horaIni,horaFin,diaIni,diaFin,diaLibre);
        boolean resultado = ControlGeneral.getInstance().agregarNuevoHorario(horario);
        if (resultado) {
        controlador.mostrarMensaje("Horario agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
    * Metodo para buscar todos los horarios registrados en el sistema
    * @return Vector vector con todos los objetos Horario del sistema
    */
    public Vector traerTodosLosHorarios () {
        Vector<Horario> vectorResult = null;
        Collection<Horario> coleccion = ControlGeneral.getInstance().traerTodosLosHorarios();     
        vectorResult = new Vector();
        for (Horario horarios : coleccion) {
            vectorResult.add(horarios);
        }
        return vectorResult;
    }
}
