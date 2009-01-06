package com.wd.gui.controlparticular;

import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

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

    /**
     * Contructor de la clase
     */
    public ControlGuiTienda() {
        this.controlador = new ControlGui();
    }

    /**
     * Metodo para agregar una Tienda
     * @param nombre el nombre de la tienda
     * @param tamano el tamano de la tienda
     * @param horario_id el identificador del horario de operacion de la tienda
     * @param telefono el telefono de la tienda
     * @param correo el correo de la tienda
     * @param ciudad_id el identificador de la ciudad de la tienda
     * @param direccion la direccion de la tinda
     * @param empresa_id la empresa de vigilancia de la tienda
     */
    public void agregarTienda(String nombre, int tamano, int horario_id,
            String telefono , String correo, int ciudad_id, String direccion,
            String empresa_id){
        this.tienda = new Tienda(0, nombre, tamano, telefono, correo, direccion,
                ciudad_id, horario_id, empresa_id);
        boolean resultado = this.controlGeneral.agregarTienda(tienda);
        if (resultado) {
            controlador.mostrarMensaje("Tienda agregada con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }

    /**
     * Metodo para modificar una tienda
     * @param codigo el codigo de la tienda
     * @param nombre el nombre de la tienda
     * @param tamano el tamano de la tienda
     * @param horario_id el identificador del horario de operacion de la tienda
     * @param telefono el telefono de la tienda
     * @param correo el correo de la tienda
     * @param ciudad_id el identificador de la ciudad de la tienda
     * @param direccion la direccion de la tinda
     * @param empresa_id la empresa de vigilancia de la tienda
     */
    public void modificarTienda(int codigo, String nombre, int tamano,
            int horario_id, String telefono , String correo, int ciudad_id,
            String direccion, String empresa_id){
        this.tienda = new Tienda(codigo, nombre, tamano, telefono, correo,
                direccion, ciudad_id, horario_id, empresa_id);
        boolean resultado = this.controlGeneral.modificarTienda(tienda);
        if (resultado) {
            controlador.mostrarMensaje("Tienda modificada con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }

    /**
     * Metodo para eliminar una Tienda
     * @param codigo el codigo de la tienda
     */
    public void eliminarTienda(int codigo){
        boolean resultado = this.controlGeneral.eliminarTienda(codigo);
        if (resultado) {
            controlador.mostrarMensaje("Tienda eliminada con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }
    
    /**
     * Metodo para consultar las Tiendas del sistema
     * @return todas las Tiendas del sistemas
     */
    public Vector consultarTiendas(){
        Vector<Tienda> vectorTiendas = null;
        Collection<Tienda> coleccionTiendas = this.controlGeneral.traerTodasLasTienda();
        vectorTiendas = new Vector();
        for (Tienda tiendas : coleccionTiendas) {
            vectorTiendas.add(tiendas);
        }
        return vectorTiendas;
    }

}
