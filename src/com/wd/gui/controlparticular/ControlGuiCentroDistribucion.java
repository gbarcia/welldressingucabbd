package com.wd.gui.controlparticular;

/**
 *
 * @author Gabylis
 */
import com.wd.dominio.CentroDistribucion;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

public class ControlGuiCentroDistribucion {
    /** variable para el manejo de la entidad CentroDistribucion */
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
    public void  agregarCentroDistribucion (int codigo, String nombre,
    String telefono, String direccion, int LUGAR_id) {
        centro = new CentroDistribucion(0,nombre,telefono,direccion,LUGAR_id);
        boolean resultado = ControlGeneral.getInstance().agregarCentroDistribucion(centro);
        if (resultado) {
        controlador.mostrarMensaje("Centro de Distribución agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
    * Metodo para buscar todos los centros de distribucion registrados en el
    * sistema
    * @return Vector vector con todos los objetos CentroDistribucion del sistema
    */
    public Vector traerTodosLosCentros () {
        Vector<CentroDistribucion> vectorResult = null;
        Collection<CentroDistribucion> coleccion = ControlGeneral.getInstance().traerTodosLosCentros();
        vectorResult = new Vector();
        for (CentroDistribucion centro : coleccion) {
            vectorResult.add(centro);
        }
        return vectorResult;
    }

    /**
     * Metodo para eliminar un centro de distribucion del sistema
     * @param centro CentroDistribucion a eliminar
     */
    public void  eliminarCentrodelSistema (CentroDistribucion centro){
        int resultado = ControlGeneral.getInstance().eliminarCentro(centro);
        if (resultado==1) {
        controlador.mostrarMensaje("Centro eliminado con éxito",0);
        }
        else  if (resultado==0)
        controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
     * Metodo para modificar un centro de distribucion del sistema
     * @param centro objeto CentroDistribucion a modificar
     */
    public void modificarCentrodelSistema(CentroDistribucion centro) {
        boolean resultado = ControlGeneral.getInstance().modificarCentro(centro);
        if (resultado){
            controlador.mostrarMensaje("Centro modificado con éxito", 0);
        }else{
            controlador.mostrarMensaje("Operación fallida",1);
        }
    }

}
