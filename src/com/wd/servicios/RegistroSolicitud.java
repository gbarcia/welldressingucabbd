package com.wd.servicios;

import com.wd.dominio.Inventario;
import com.wd.dominio.OrdenCompra;
import com.wd.dominio.Pedido;
import java.io.IOException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase que reunira todos los controles particulares de solicitudes integrados
 * en uno para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class RegistroSolicitud {

    /** Variable para trabajar con el controlador de las ordenes de compra*/
    private ControlOrdenCompra controlOC;
    /** Variable para trabajar con el controlador de los pedidos*/
    private ControlPedido controlPedido;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /**
     * Constructor por defecto
     * @throws java.io.IOException
     */
    public RegistroSolicitud() {
    }

    /**
     * Operacion para procesar una orden de compra en el sistema
     * @param oc objeto orden de compra con sus items
     * @return boolean del resultado de la operacion
     */
    public boolean procesarOrdenCompra(OrdenCompra oc) {
        boolean resultado = false;
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
            resultado = controlOC.agregarOrden(oc);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para obtener el siguiente numero de orden de compra
     * @return int el siguiente numero
     */
    public int obtenerSiguienteNumeroOrden() {
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        }
        return controlOC.obtenerSiguienteNumeroOrden();
    }

    /**
     * Operacion para actualizar una orden de compra
     * @param oc orden de compra a actualizar
     * @return booleano de la operacion
     */
    public boolean actualizarOrdenCompra(OrdenCompra oc) {
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        }
        return controlOC.actualizarOrdenCompra(oc);
    }

    /**
     * Operacion para consultar todas las ordenes de compra del sistema
     * @return Coleccion de objetos OrdenCompra
     */
    public Collection<OrdenCompra> traerTodasLasOrdenesDeCompra() {
        Collection<OrdenCompra> resultado = null;
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
            resultado = controlOC.traerTodasLasOrdenesDeCompra();
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        }
        return resultado;
    }

    /**
     * Operacion para buscar una orden de compra
     * @param numeroOrden int el numero de orden de la orden a buscar
     * @return Objeto Orden de Compra con la coleccion de Items
     */
    public OrdenCompra buscarOrdenCompra(int numeroOrden) {
        try {
            controlOC = new ControlOrdenCompra();
            bitacora.info("Registro OrdenCompra Iniciado correctamente");
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro OrdenCompra por " + ex.getMessage());
        }
        return controlOC.buscarOrdenCompra(numeroOrden);
    }

    /**
     * Operacion para procesar un pedido en el sitema
     * @param p Objeto pedido a procesar
     * @return boleano con el resultado de la operacion
     */
    public boolean procesarPedido(Pedido p) {
        try {
            this.controlPedido = new ControlPedido();
            bitacora.info("Registro Pedido Iniciado correctamente");
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el registro Pedido por " + ex.getMessage());
        } finally {
            return this.controlPedido.agregarUnPedido(p);
        }
    }

    /**
     * Operacion que retorna el invenario actual de un centro de distribucion
     * @param codigoCentro int codigo del centro a consultar su inventario
     * @return Coleccion de objetos Inventario
     */
    public Collection<Inventario> traerInventarioActualCentro(int codigoCentro) {
        try {
            this.controlPedido = new ControlPedido();
        } catch (IOException ex) {
        } finally {
            return this.controlPedido.traerInventarioActualCentro(codigoCentro);
        }
    }
}
