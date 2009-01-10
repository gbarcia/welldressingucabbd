package com.wd.gui.controlparticular;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Servicio;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;

/**
 * Manejador de la interfaz gráfica para agregar Vigilancia a Centro
 * @author gerardo
 */
public class ControlGuiAgregarVigilanciaCentro {

    /* variable para el manejo de la entidad centro de distribucion  */
    private CentroDistribucion centro;
    /* variable para el manejo de la entidad empresa de vigilancia  */
    private EmpresaVigilancia empresaVigilancia;
    /* variable para el manejo de la entidad del servicio de vigilancia prestado */
    private Servicio servicio;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private ControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiAgregarVigilanciaCentro() {
        this.controlador = new ControlGui();
    }

    /** Operacion para traer todas las empresas de vigilancia
     * @return Collection de objetos EmpresaVigilancia
     */
    public Collection<EmpresaVigilancia> traerTodasLasEmpresasVIgilancia() {
        return this.controlG.todasLasEmpresas();
    }

    /** Operacion para traer todas las empresas de vigilancia
     * @return Collection de objetos CentroDistribucion
     */
    public Collection<CentroDistribucion> traerTodosLosCentros() {
        return this.controlG.traerTodosLosCentros();
    }

    /** Operacion para comprar si el centro ya esta vigilado
     * @param rif el rif de la empresa de vigilancia
     * @param codigoCentro el codigo del centro de distribucion a comprobar
     * @return boolean si el centro ya esta vigilado o no
     */
    private boolean esCentroSinVigilancia(String rif, int codigoCentro) {
        boolean resultado = true;
        Collection<Servicio> servicios;
        servicios = this.controlG.todosLosServicios(rif);
        for (Servicio servicioT : servicios) {
            if (servicioT.getCentroDistribucionCodigo() == codigoCentro) {
                resultado = false;
            }
        }
        return resultado;
    }

    /** Operacion para borrar una empresa de vigilancia de un centro
     * @param rif el rif de la empresa de vigilancia
     * @param codigoCentro el codigo del centro de distribucion a comprobar
     * @return boolean si el centro ya esta vigilado o no
     */
    private boolean BorrarCentroVigilancia(int codigoCentro) {
        boolean resultado = false;
        int e = -1;
        this.servicio = new Servicio(codigoCentro, null);
        e = controlG.eliminarServicio(servicio);
        if (e == 1) {
            resultado = true;
        }
        return resultado;
    }

    /** Operacion para agregar o renovar una empresa de vigilancia a un centro
     * @param rif el rif de la empresa de vigilancia
     * @param codigoCentro el codigo del centro de distribucion a comprobaro
     */
    public void agregarActualizarVigilanciaCentro(String rif, int codigoCentro) {
        boolean resultado = false;
        boolean sinVigilancia = true;
        boolean borrado = false;
        this.servicio = new Servicio(codigoCentro, rif);
        sinVigilancia = this.esCentroSinVigilancia(rif, codigoCentro);
        if (sinVigilancia) {
            resultado = controlG.agregarServicio(servicio);
        } else if (!sinVigilancia) {
            borrado = this.BorrarCentroVigilancia(codigoCentro);
            if (borrado) {
                resultado = controlG.agregarServicio(servicio);
            }
        }
        if (resultado) {
            controlador.mostrarMensaje("Actualizada Empresa de Vigilancia: " + rif + "\n" + "para centro: " + codigoCentro, 0);
        } else if (!resultado) {
            controlador.mostrarMensaje("Error: Operacion Fallida", 1);
        }
    }
}
