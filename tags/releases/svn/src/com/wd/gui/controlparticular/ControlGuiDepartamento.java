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
     * Metodo para agregar un Departamento de tipo SubClase al sistema
     * @param nombre String nombre de la SubClase
     * @param descripcion String descripcion de la Subclase
     * @param departamentoCodigo int codigo del departamento al que pertenece la
     * clase
    */
    public void  agregarSubClasealSistema (String nombre, String descripcion, int departamentoCodigo){
        departamento = new Departamento(0,nombre,descripcion,0,departamentoCodigo);
        boolean resultado = ControlGeneral.getInstance().agregarSubClase(departamento);
        if (resultado) {
        controlador.mostrarMensaje("SubClase agregada con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
     * Metodo para modificar una Subclase del sistema
     * @param newSubClase objeto departamento a modificar
     */
    public void modificarSubClasedelSistema(Departamento newSubClase) {
        boolean resultado = ControlGeneral.getInstance().modificarSubClase(newSubClase);
        if (resultado){
            controlador.mostrarMensaje("SubClase modificada con éxito", 0);
        }else{
            controlador.mostrarMensaje("Operación fallida",1);
        }
    }

    /**
    * Metodo para buscar todos las subclases registrados en el sistema
    * @return Vector vector con todos los objetos Departamento del sistema
    */
    public Vector traerTodasLasSubClases (Departamento dueño) {
        Vector<Departamento> vectorResult = null;
        Collection<Departamento> coleccion = ControlGeneral.getInstance().traerTodasLasSubClases(dueño);
        vectorResult = new Vector();
        for (Departamento departamentos : coleccion) {
            vectorResult.add(departamentos);
        }
        return vectorResult;
    }

    /**
     * Metodo para eliminar una Subclase del sistema
     * @param Subclase Departamento Subclase a eliminar
     */
    public void  eliminarSubClasedelSistema (Departamento Subclase){
        int resultado = ControlGeneral.getInstance().eliminarSubClase(Subclase);        
        if (resultado == 1) {
        controlador.mostrarMensaje("Departamento eliminado con éxito",0);
        }
        else  if (resultado == 0)
        controlador.mostrarMensaje("Operacion fallida", 1);
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

    public void modificarDepartamentodelSistema(Departamento newDpto) {
        boolean resultado = ControlGeneral.getInstance().modificarDepartamento(newDpto);
        if (resultado){
            controlador.mostrarMensaje("Departamento modificado con éxito", 0);
        }else{
            controlador.mostrarMensaje("Operación fallida",1);
        }
    }

    /**
     * Metodo para agregar un Departamento de tipo Clase al sistema
     * @param nombre String nombre del departamento
     * @param descripcion String descripcion del departamento
     * @param departamentoCodigo int codigo del departamento al que pertenece la
     * clase
    */
    public void  agregarClasealSistema (String nombre, String descripcion, int departamentoCodigo){
        departamento = new Departamento(0,nombre,descripcion,1,departamentoCodigo);
        boolean resultado = ControlGeneral.getInstance().agregarClase(departamento);
        if (resultado) {
        controlador.mostrarMensaje("Clase agregada con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
     * Metodo para modificar una clase del sistema
     * @param newClase objeto departamento a modificar
     */
    public void modificarClasedelSistema(Departamento newClase) {
        boolean resultado = ControlGeneral.getInstance().modificarClase(newClase);
        if (resultado){
            controlador.mostrarMensaje("Clase modificada con éxito", 0);
        }else{
            controlador.mostrarMensaje("Operación fallida",1);
        }
    }

    /**
    * Metodo para buscar todos las clases registradas en el sistema
    * @return Vector vector con todos los objetos Departamento del sistema
    */
    public Vector traerTodasLasClases (Departamento dueño) {
        Vector<Departamento> vectorResult = null;
        Collection<Departamento> coleccion = ControlGeneral.getInstance().traerTodasLasClases(dueño);
        vectorResult = new Vector();
        for (Departamento departamentos : coleccion) {
            vectorResult.add(departamentos);
        }
        return vectorResult;
    }

    /**
     * Metodo para eliminar una clase del sistema
     * @param clase Departamento clases a eliminar
     */
    public void  eliminarClasedelSistema (Departamento clase){
        int resultado = ControlGeneral.getInstance().eliminarClase(clase);
        System.out.println("resultado-->"+resultado);
        if (resultado==1) {
        controlador.mostrarMensaje("Departamento eliminado con éxito",0);        
        }
        else  if (resultado==0)
        controlador.mostrarMensaje("Operacion fallida, problemas de referencia " +
        "elimine las subclases asociadas a esta clase primero " +
        "y luego intente de nuevo", 1);
    }

    /**
    * Metodo para buscar todos los horarios registrados en el sistema
    * @return Vector vector con todos los objetos Departamento del sistema
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
     * Metodo para eliminar un Departamento del sistema
     * @param dpto Departamento departamento a eliminar
     */
    public void  eliminarDepartamentodelSistema (Departamento dpto){
        int resultado = ControlGeneral.getInstance().eliminarDepartamento(dpto);
        if (resultado==1) {
        controlador.mostrarMensaje("Departamento eliminado con éxito",0);
        }
        else  if (resultado==0)
        controlador.mostrarMensaje("Operacion fallida, Problemas de referencia:" +
        " Este departamento tiene clases asociadas, primero eliminelas" +
        " y luego intente de nuevo", 1);
    }
}