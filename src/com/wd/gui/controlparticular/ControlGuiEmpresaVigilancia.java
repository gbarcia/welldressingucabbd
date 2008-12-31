package com.wd.gui.controlparticular;

/**
 *
 * @author Gabylis
 */
import com.wd.dominio.EmpresaVigilancia;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

public class ControlGuiEmpresaVigilancia {
    
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    public ControlGuiEmpresaVigilancia() {
        this.controlador = new ControlGui();
    }

    /**
     * Metodo para agregar una empresa de vigilancia
     * @param emp EmpresaVigilancia a agregar
     */
    public void agregarEmpresaVigilancia(EmpresaVigilancia emp){
        boolean resultado = ControlGeneral.getInstance().agregarEmpresaVigilancia(emp);
        if (resultado) {
        controlador.mostrarMensaje("Centro de Distribución agregado con éxito",0);
        }
        else controlador.mostrarMensaje("Operacion fallida", 1);
    }

    /**
    * Metodo para buscar todas las empresas de vigilancia registradas en el
    * sistema
    * @return Vector vector con todos los objetos EmpresaVigilancia del sistema
    */
    public Vector traerTodasLasEmpresas () {
        Vector<EmpresaVigilancia> vectorResult = null;
        Collection<EmpresaVigilancia> coleccion = ControlGeneral.getInstance().todasLasEmpresas();
        vectorResult = new Vector();
        for (EmpresaVigilancia emp : coleccion) {
            vectorResult.add(emp);
        }
        return vectorResult;
    }

    /**
     * Metodo para modificar una empresa de vigilancia del sistema
     * @param emp objeto EmpresaVigilancia a modificar
     */
    public void modificarEmpresadelSistema(EmpresaVigilancia emp) {
        boolean resultado = ControlGeneral.getInstance().modificarEmpresaVigilancia(emp);
        if (resultado){
            controlador.mostrarMensaje("Empresa modificada con éxito", 0);
        }else{
            controlador.mostrarMensaje("Operación fallida",1);
        }
    }

    /**
     * Metodo para eliminar una empresa de vigilancia del sistema
     * @param rif String rif de la EmpresaVigilancia a eliminar
     */
    public void  eliminarCentrodelSistema (String rif){
        int resultado = ControlGeneral.getInstance().eliminarEmpresaVigilancia(rif);
        if (resultado==1) {
        controlador.mostrarMensaje("Centro eliminado con éxito",0);
        }
        else  if (resultado==0)
        controlador.mostrarMensaje("Operacion fallida", 1);
    }

}