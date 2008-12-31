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
     * Metodo para gregar una Tienda
     * @param codigo
     * @param nombre
     * @param tamano
     * @param telefono
     * @param correo
     * @param direccion
     * @param LUGAR_id
     * @param HORARIO_id
     * @param EMPRESA_SERVICIO_rif
     */
    public void agregarTienda(int codigo, String nombre, int tamano,
            String telefono, String correo, String direccion,
            int LUGAR_id, int HORARIO_id, String EMPRESA_SERVICIO_rif){
        tienda = new Tienda(0, nombre, tamano, telefono, correo, direccion,
                LUGAR_id, HORARIO_id, EMPRESA_SERVICIO_rif);
        boolean resultado = controlGeneral.agregarTienda(tienda);
        if (resultado) controlador.mostrarMensaje("Horario agregado con éxito",0);
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }















}
