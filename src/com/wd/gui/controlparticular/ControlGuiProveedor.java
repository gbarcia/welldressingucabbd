package com.wd.gui.controlparticular;

import com.wd.dominio.Lugar;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.dominio.Servicio;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

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
    public Collection<Proveedor> traerTodosLosProveedores() {
        Collection<Proveedor> resultado = null;
        resultado = controlG.todosLosProveedores();
        return resultado;
    }

    /** operacion para traer todos los proveedores rcon mas ordenes de compra
     * @return resultado coleccion de todos los proveedores registrados en el sistema
     */
    public Vector<Proveedor> todosLosProveedoresMasOC() {
        Collection<Proveedor> resultado = null;
        Vector<Proveedor> result = new Vector();
        resultado = controlG.todosLosProveedoresMasOC();
        for (Proveedor prov : resultado) {
            result.addElement(prov);
        }
        return result;
    }

    /** operacion para consultar un proveedor en el sistema
     * @param rif String del rif del proveedor a consultar
     * @return resultado Proveedor Objeto proveedor con la informacion solicitada
     */
    private Proveedor consultarProveedor(String rif) {
        Proveedor resultado = null;
        resultado = controlG.consultarProveedor(rif);
        return resultado;
    }

    /** Operacion para iniciar la ventana de consulta, recibe un rif y crea
     * la nueva ventana que presenta la informacion pertinente de ese proveedor
     * @param rif String del rif del proveedor a consulta
     */
    public void iniciarVentanaConsulta(String rif) {
        Proveedor proveedorC = this.consultarProveedor(rif);
        if (proveedorC != null) {
            this.controlador.iniciarCerrarVentanaConsultaProve2(true, proveedorC);
        } else {
            controlador.mostrarMensaje("Error: El proveedor " + rif + "no existe", 1);
        }
    }

    /** Operacion para traer todas las ciudades
     * @return Collection con todas las ciudades
     */
    public Collection<Lugar> obtenerTodosLosLugares() {
        Collection<Lugar> resultado = null;
        resultado = controlG.traerTodosLosLuagres(2);
        return resultado;
    }

    /** Operacion para traer todos los productos de un determinado proveedor
     * @param rif el rif del proveedor a consultar sus productos
     * @return Collection con todos los productos para ese proveedor
     */
    public Collection<Producto> todosLosProductosProveedor(String rif) {
        Collection<Producto> resultado = null;
        resultado = controlG.consultaProductosProveedor(rif);
        return resultado;
    }

    /** operacion para editar un proveedor en el sistema
     * @param rif rif del proveedor
     * @param nombre nombre del proveedor
     * @param telefono telefono del proveedor
     * @param dir direccion del proveedor
     * @param nombreC nombre del contacto
     * @param apellidoC apellido del contacto
     * @param lugar indice de la ciudad donde se encuentra ubicado
     */
    public void editarProveedorEnElSistema(String rif, String nombre, String telefono,
            String dir, String nombreC, String apellidoC,
            Integer lugar) {
        boolean resultado = false;
        boolean datosValidos = true;
        datosValidos = this.validarDatosForm(rif, nombre, telefono, dir, nombreC, apellidoC);
        if (datosValidos) {
            proveedor = new Proveedor(rif, nombre, telefono, dir,
                    lugar, nombreC, apellidoC);
            resultado = controlG.editarProveedor(proveedor);
            if (resultado) {
                controlador.mostrarMensaje("Proveedor " + nombre + " actualizado con éxito", 0);
            } else {
                controlador.mostrarMensaje("Operacion fallida", 1);
            }
        } else {
            controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
        }
    }

    /**
     * Operacion para saber si existe o no un proveedor en el sistema
     * @param rif String rif del proveedor a eliminar
     * @return resultado boolean true si existe false no existe
     */
    private boolean esExistenteProveedor(String rif) {
        boolean resultado = false;
        Proveedor p = controlG.consultarProveedor(rif);
        if (p != null) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Operacion para borrar un proveedor del sistema
     * @param rif String rif del proveedor a eliminar
     */
    public void eliminarProveedorSistema(String rif) {
        boolean resultado = false;
        boolean existe = false;
        String mensajeRes = "Error: EL provedor " + rif + " que intenta borrar \n" +
                " esta en registros historiales importantes, por tanto no se\n" +
                " recomienda su eliminacion parcial, contacte a su administrador\n" +
                " para más informacion";
        existe = this.esExistenteProveedor(rif);
        if (existe) {
            resultado = controlG.eliminarProveedor(rif);
            if (resultado) {
                controlador.mostrarMensaje("Proveedor " + rif + " eliminado con éxito", 0);
            } else {
                controlador.mostrarMensaje(mensajeRes, 1);
            }
        } // en if existe
        else if (!existe) {
            controlador.mostrarMensaje("Error: EL proveedor " + rif + " no existe", 1);
        }
    }

     /**
     * Metodo para traer todos los proveedores de un centros de distribucion del
     * sistema
     * @param codigoCentro codigo del centro de distribucion al que
     * pertenecen los empleados
     * @return vectorResult Vector de proveedores
     */
    public Vector traerTodosLosProveedoresCentro(int codigoCentro) {
        Vector<Proveedor> vectorResult = null;
        Collection<Proveedor> coleccion = ControlGeneral.getInstance().traerTodosLosProveedoresCentro(codigoCentro);
        vectorResult = new Vector();
        for (Proveedor prove : coleccion) {
            vectorResult.add(prove);
        }
        return vectorResult;
    }
}
