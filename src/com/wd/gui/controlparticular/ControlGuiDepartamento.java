package com.wd.gui.controlparticular;

import com.wd.dominio.Departamento;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 * Manejador de la interfaz gráfica para agregar un nuevo horario
 * @author Gabylis
 */
public class ControlGuiDepartamento {

/** variable para el manejo de la entidad Departamento */
    private Departamento departamento;

/** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

/** constructor que inicia el control general GUI */
    public ControlGuiDepartamento() {
        this.controlador = new ControlGui();
    }

/**
 * Metodo para agregar un Departamento al sistema
 * @param nombre String nombre del departamento
 * @param descripcion String descripcion del departamento 
 */
    public void  agregarDepartamentoalSistema (String nombre, String descripcion){
        departamento = new Departamento(0,nombre,descripcion,2,0);
        boolean resultado = ControlGeneral.getInstance().agregarDepartamento(departamento);
        if (resultado) {
        controlador.mostrarMensaje("Departamento agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
    * Metodo para buscar todos los horarios registrados en el sistema
    * @return Vector vector con todos los objetos Horario del sistema
    */
    public Vector traerTodosLosDepartamentos () {
        Vector<Departamento> vectorResult = null;
        Collection<Departamento> coleccion = ControlGeneral.getInstance().traerTodosLosDepartamentos();
        vectorResult = new Vector();
        for (Departamento departamentos : coleccion) {
            vectorResult.add(departamentos);
        }
        return vectorResult;
    }

    /**
     * Metodo para eliminarr un Departamento del sistema
     * @param dpto Departamento departamento a eliminar
     */
    public void  eliminarDepartamentodelSistema (Departamento dpto){
        int resultado = ControlGeneral.getInstance().eliminarDepartamento(dpto);
        if (resultado==1) {
        controlador.mostrarMensaje("Departamento eliminado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }
}