package com.wd.gui.controlparticular;

import com.wd.dominio.Lugar;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 * Manejador de la interfaz gráfica para Lugar
 * @author Gerardo Barcia
 */
public class ControlGuiLugar {

    /** variable para el manejo de la entidad lugar */
    private Lugar lugar;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiLugar() {
        this.controlador = new ControlGui();
    }

    /**
     * Operacion para retornas todoso los lugares sengun: Estado o Ciudad
     * @param operacion int si es 1 trae todos los estads, si es 2 todas las ciudades
     * @return Vector con todas los lugares resultantes de la operacion
     */
    public Vector<Lugar> traerTodosLosLugares(int operacion) {
        Vector<Lugar> resultado = null;
        Collection<Lugar> coleccion = controlG.traerTodosLosLuagres(operacion);
        resultado = new Vector();
        for (Lugar lugars : coleccion) {
            resultado.add(lugars);
        }
        return resultado;
    }
    
     /**
     * Operacion para agregar un lugar de tipo estado en el sistema
     * @param estado estado a agregar de tipo lugar
     * @return resultado boolean de exito o no de la operacion
     */
    private boolean agregarEstado(Lugar estado) {
        boolean resultado = false;
        resultado = controlG.agregarLugar(estado);
        return resultado;
    }

     /**
     * Operacion para agregar un lugar de tipo ciudad en el sistema
     * @param ciudad ciudad a agregar de tipo lugar
     * @return resultado boolean de exito o no de la operacion
     */
    private boolean agregarCiudad(Lugar ciudad) {
        boolean resultado = false;
        resultado = controlG.agregarLugar(ciudad);
        return resultado;
    }

     /**
     * Operacion para agregar un lugar en el sistema, no recibe el identificador
     * puesto que en la base de datos esta dispuesto con la caracteristica
     * auto_increment
     * @param nombrePropio el nombre del lugar
     * @param tipo el tipo de lugar 0 para estado y 1 para ciudad
     * @param LugarId el id del lugar al que pertenece (FK)
     */
    public void agregarLugarAlSistema(String nombrePropio, int tipo,
            int LugarId) {
        Lugar estado = null;
        Lugar ciudad = null;
        boolean resultado = false;
        if (tipo == 0) {
            estado = new Lugar(0, nombrePropio, tipo);
            resultado = this.agregarEstado(estado);
        } else {
            ciudad = new Lugar(tipo, nombrePropio, tipo, LugarId, nombrePropio);
            resultado = this.agregarCiudad(ciudad);
        }
        if (resultado) {
        controlador.mostrarMensaje("Lugar " + nombrePropio +  " agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }
}
