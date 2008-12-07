package com.wd.gui.controlparticular;

/**
 *
 * @author Gabylis
 */
import com.wd.dominio.CentroDistribucion;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;

public class ControlGuiCentroDistribucion {
    /** variable para el manejo de la entidad horario */
    private CentroDistribucion centro;

/** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

/** constructor que inicia el control general GUI */
    public ControlGuiCentroDistribucion() {
        this.controlador = new ControlGui();
    }

/**
 * Metodo para agregar un centro de distribucion al sistema
 * @param codigo int codigo del centro
 * @param nombre String nombre del centro
 * @param telefono String telefono del centro
 * @param direccion String direccion del centro
 * @param LUGAR_id int lugar donde se encuentra el centro
 */
    public void  agregarCentroDistribucion (int codigo, String nombre, String telefono, String direccion, int LUGAR_id) {
        centro = new CentroDistribucion(0,nombre,telefono,direccion,LUGAR_id);
        boolean resultado = ControlGeneral.getInstance().agregarCentroDistribucion(centro);
        if (resultado) {
        controlador.mostrarMensaje("Horario agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

}
