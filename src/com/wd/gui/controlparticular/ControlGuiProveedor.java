package com.wd.gui.controlparticular;

import com.wd.dominio.Lugar;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;

/**
 * Manejador de la interfaz gráfica para Proveedor
 * @author gerardo
 */
public class ControlGuiProveedor {

    /** variable para el manejo de la entidad proveedor */
    private Proveedor proveedor;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiProveedor() {
        this.controlador = new ControlGui();
    }

    /** operacion para validar que todos los campos del form se hallan llenado
     * @return true o false dependiendo de si es valido o no
     */
    private boolean validarDatosForm(String rif, String nombre, String telefono,
            String dir, String nombreC, String apellidoC) {
        boolean resultado = true;
        if ((rif.equals("")) ||
                (nombre.equals("")) ||
                (telefono.equals("")) ||
                (dir.equals("")) ||
                (nombreC.equals("")) ||
                (apellidoC.equals(""))) {
            resultado = false;
        }
        return resultado;
    }

    /** operacion para agregar un proveedor en el sistema
     * @param rif rif del proveedor
     * @param nombre nombre del proveedor
     * @param telefono telefono del proveedor
     * @param dir direccion del proveedor
     * @param nombreC nombre del contacto
     * @param apellidoC apellido del contacto
     * @param lugar indice de la ciudad donde se encuentra ubicado
     */
    public void agregarProveedorAlSistema(String rif, String nombre, String telefono,
            String dir, String nombreC, String apellidoC,
            Integer lugar) {
        boolean resultado = false;
        boolean datosValidos = true;
        datosValidos = this.validarDatosForm(rif, nombre, telefono, dir, nombreC, apellidoC);
        if (datosValidos) {
            proveedor = new Proveedor(rif, nombre, telefono, dir,
                    lugar, nombreC, apellidoC);
            resultado = controlG.agregarProveedor(proveedor);
            if (resultado) {
                controlador.mostrarMensaje("Proveedor " + nombre + " agregado con éxito", 0);
            } else {
                controlador.mostrarMensaje("Operacion fallida", 1);
            }
        } else {
            controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
        }
    }

     /** operacion para traer todos los proveedores registrados en el sistema
     * @return resultado coleccion de todos los proveedores registrados en el sistema
     */
    public Collection<Proveedor> traerTodosLosProveedores () {
        Collection<Proveedor> resultado = null;
        resultado = controlG.todosLosProveedores();
        return resultado;
    }

    /** operacion para consultar un proveedor en el sistema
     * @param rif String del rif del proveedor a consultar
     * @return resultado Proveedor Objeto proveedor con la informacion solicitada
     */
    private Proveedor consultarProveedor (String rif) {
        Proveedor resultado = null;
        resultado = controlG.consultarProveedor(rif);
        return resultado;
    }

    /** Operacion para iniciar la ventana de consulta, recibe un rif y crea
     * la nueva ventana que presenta la informacion pertinente de ese proveedor
     * @param rif String del rif del proveedor a consulta
     */
    public void iniciarVentanaConsulta (String rif) {
        Proveedor proveedorC = this.consultarProveedor(rif);
        if (proveedorC != null) {
            this.controlador.iniciarCerrarVentanaConsultaProve2(true, proveedorC);
        }
        else {
            controlador.mostrarMensaje("Error: El proveedor " + rif + "no existe", 1);
        }
    }

    /** Operacion para traer todas las ciudades
     * @return Collection con todas las ciudades
     */
    public Collection<Lugar> obtenerTodosLosLugares () {
        Collection<Lugar> resultado = null;
        resultado = controlG.traerTodosLosLuagres(2);
        return resultado;
    }

    /** Operacion para traer todos los productos de un determinado proveedor
     * @param rif el rif del proveedor a consultar sus productos
     * @return Collection con todos los productos para ese proveedor
     */
    public Collection<Producto> todosLosProductosProveedor (String rif) {
        Collection<Producto> resultado = null;
        resultado = controlG.consultaProductosProveedor(rif);
        return resultado;
    }
}
