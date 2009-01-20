package com.wd.gui.controlparticular;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Proveedor;
import com.wd.dominio.Servicio;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;

/**
 * Clase Para el manejo de la interfaz 
 * @author Casa
 */
public class ControlAgregarProveedoresCentro {

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private ControlGeneral controlG = ControlGeneral.getInstance();

    public ControlAgregarProveedoresCentro() {
        this.controlador = new ControlGui();
    }

    /**
     * Operacion para traerTodosLosCentrosDistribucion del sistema
     * @return Coleccion de objetos CentroDistribucion
     */
    public Collection<CentroDistribucion> traerTodosLosCentros() {
        return controlG.traerTodosLosCentros();
    }

    /**
     * Operacion para traer todos los proveedores registrados en el sistema
     * @return Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> traerTodosLosProveedores() {
        return controlG.todosLosProveedores();
    }

    /**
     * Operacion para agregar una lista de proveedores al centro
     * @param codigoCentro int el codigo del centro a agregar
     * @param prove Coleccion de Strings con los rif de cada proveedor
     */
    public void agregarProveedoresCentro(int codigoCentro, Collection<String> prove) {
        boolean resultado = false;
        for (String rif : prove) {
            Servicio servicio = new Servicio(codigoCentro, rif);
            resultado = this.controlG.agregarServicio(servicio);
        }
        if (resultado) {
            controlador.mostrarMensaje("Operacion exitosa", 0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }
}
