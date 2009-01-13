package com.wd.gui;

import com.wd.dominio.Proveedor;
import java.util.Collection;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *Clase para el manejo de las ventanas de la aplicacion y otras funcionalidades
 * @author Gerardo Barcia
 */
public class ControlGui {

    /** variable de la ventana de inicio*/
    private VentanaInicio ventanaInicio = new VentanaInicio();
    /** variable de la ventana agregar nuevo horario*/
    private VentanaNuevoHorario ventanaNuevoHorario;
    /** Variable de la ventana agregar centro*/
    private VentanaAgregarCentro ventanaAgregarCentro;
    /** Variable de la ventana consultar centro*/
    private VentanaConsultarCentro ventanaConsultarCentro;
    /** Variable de la ventana eliminar centro*/
    private VentanaEliminarCentro ventanaEliminarCentro;
    /** Variable de la ventana modificar centro*/
    private VentanaModificarCentro ventanaModificarCentro;
    /** Variable de la ventana agregar departamento*/
    private VentanaAgregarDepartamento ventanaAgregarDepartamento;
    /** Variable de la ventana consultar departamentos*/
    private VentanaConsultarDepartamentos ventanaConsultarDepartamentos;
    /** Variable de la ventana eliminar departamentos*/
    private VentanaEliminarDepartamento ventanaEliminarDepartamento;
    /** Variable de la ventana modificar departamentos*/
    private VentanaModificarDepartamento ventanaModificarDepartamento;
    /** Variable de la ventana ver horarios*/
    private VentanaConsultaHorarios ventanaConsultaHorarios;
    /** Variable de la ventana ver los lugares*/
    private VentanaConsultarLugares ventanaConsultaLugares;
    /** Variable de la ventana agregar Clase*/
    private VentanaAgregarClase ventanaAgregarClase;
    /** Variable de la ventana consultar Clase*/
    private VentanaConsultarClase ventanaConsultarClase;
    /** Variable de la ventana eliminar Clase*/
    private VentanaEliminarClase ventanaEliminarClase;
    /** Variable de la ventana modificar Clase*/
    private VentanaModificarClase ventanaModificarClase;
    /** Variable de la ventana agregar SubClase*/
    private VentanaAgregarSubClase ventanaAgregarSubClase;
    /** Variable de la ventana eliminar SubClase*/
    private VentanaEliminarSubClase ventanaEliminarSubClase;
    /** Variable de la ventana modificar SubClase*/
    private VentanaModificarSubClase ventanaModificarSubClase;
    /** Variable de la ventana para agregar un lugar*/
    private VentanaAgregarLugar ventanaAgregarLugar;
    /** Variable de la ventana para agregar un provedor*/
    private VentanaAgregarProveedor ventanaAgregarproveedor;
    /** Variable de la ventana para editar o consultar proveedor 1*/
    private VentanaConsultaEdicionProveedor1 ventanaConsulEdipro;
    /** Variable de la ventana para editar o consultar proveedor 2*/
    private VentanaConsultaEdicionProveedor2 ventanaConsulEdipro2;
    /** Variable de la ventana para eliminar un proveedor*/
    private VentanaEliminarProveedor ventanaEliminarProve;
    /** Variable de la ventana para agregar una Tienda*/
    private VentanaAgregarTienda ventanaAgregarTienda;
    /** Variable de la ventana para agregar un Empleado*/
    private VentanaAgregarEmpleadoTienda ventanaAgregarEmpTienda;
    /** Variable de la ventana para agregar un producto*/
    private VentanaAgregarProducto ventanaAgregarProducto;
    /** Variable de la ventana para agregar una empresa de vigilancia*/
    private VentanaAgregarEmpresaVigilancia ventanaAgregarEmpresaVigilancia;
    /** Variable de la ventana para editar o consultar un empleado tienda*/
    private VentanaConsultarEditarEmpleadoTIenda1 ventanaConsEdiEmpTienda;
    /** Variable de la ventana para consiltar una empresa de vigilancia*/
    private VentanaConsultarEmpresaVigilancia ventanaConsultarEmpresaVigilancia;
    /** Variable de la ventana para eliminar un empleado*/
    private VentanaEliminarEmpleado venEliminarEmp;
    /** Variable de la ventana para eliminar una empresa de vigilancia*/
    private VentanaEliminarEmpresaVigilancia ventanaEliminarEmpresaVigilancia;
    /** Variable de la ventana para asignar vigilancia a un centro*/
    private VentanaAgregarEmpVIgilanciaCentro ventanaAgRenoVicen;
    /** Variable para la ventana para consultar tienda*/
    private VentanaConsultarTienda ventanaConsultarTienda;
    private VentanaModificarEmpresaVigilancia ventanaModificarEmpresaVigilancia;
    /** variable de ventana de modificar tiendas */
    private VentanaModificarTienda ventanaModificarTienda;
    /** variable de ventana de elimianr tiendas */
    private VentanaEliminarTienda ventanaEliminarTienda;
    /** variable de ventana de consulta de productos */
    private VentanaConsultarProducto ventanaConsultarProducto;
     /** variable de ventana de consulta de productos */
    private VentanaEditarProducto ventanaEditarProducto;

    /** Constructor del ControlGui */
    public ControlGui() {
    }

    /**
     * metodo para ocultar o mostrar la ventana de inicio
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaInicio(boolean var) {
        ventanaInicio.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar empleado tienda
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaAgEmpTienda(boolean var) {
        this.ventanaAgregarEmpTienda = new VentanaAgregarEmpleadoTienda();
        this.ventanaAgregarEmpTienda.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana para agregar vigilancia a un centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVenAgregarVigilanciaCentro(boolean var) {
        this.ventanaAgRenoVicen = new VentanaAgregarEmpVIgilanciaCentro();
        this.ventanaAgRenoVicen.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de eliminar empleado
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaEliminarEmp(boolean var) {
        this.venEliminarEmp = new VentanaEliminarEmpleado();
        this.venEliminarEmp.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de consultar editar empleado tienda
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaConsultaEmpTienda(boolean var) {
        this.ventanaConsEdiEmpTienda = new VentanaConsultarEditarEmpleadoTIenda1();
        this.ventanaConsEdiEmpTienda.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de editarConsultar proveedor 2
     * @param var booleano que indica si mostrar o no la ventana
     * @param prove Objeto proveedor con la informacion a mostrar
     */
    public void iniciarCerrarVentanaConsultaProve2(boolean var, Proveedor prove) {
        this.ventanaConsulEdipro2 = new VentanaConsultaEdicionProveedor2(prove);
        this.ventanaConsulEdipro2.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana para borrar un proveedor del sistema
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaEliminarProve(boolean var) {
        this.ventanaEliminarProve = new VentanaEliminarProveedor();
        this.ventanaEliminarProve.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar nuevo horario
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaNuevoHorario(boolean var) {
        ventanaNuevoHorario = new VentanaNuevoHorario();
        ventanaNuevoHorario.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar centro
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaAgregarCentro(boolean var, Vector result) {
        ventanaAgregarCentro = new VentanaAgregarCentro(result);
        ventanaAgregarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar centros
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarCentro(boolean var, Vector result) {
        ventanaConsultarCentro = new VentanaConsultarCentro(result);
        ventanaConsultarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de eliminar centros
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarCentro(boolean var, Vector result) {
        ventanaEliminarCentro = new VentanaEliminarCentro(result);
        ventanaEliminarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar centros
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarCentro(boolean var, Vector result) {
        ventanaModificarCentro = new VentanaModificarCentro(result);
        ventanaModificarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de ver horarios
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarHorario(boolean var, Vector result) {
        ventanaConsultaHorarios = new VentanaConsultaHorarios(result);
        ventanaConsultaHorarios.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar departamentos
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarDepartamentos(boolean var, Vector result) {
        ventanaConsultarDepartamentos = new VentanaConsultarDepartamentos(result);
        ventanaConsultarDepartamentos.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de elimianar departamentos
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarDepartamento(boolean var, Vector result) {
        ventanaEliminarDepartamento = new VentanaEliminarDepartamento(result);
        ventanaEliminarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consulta de lugares
     * @param var booleano que indica si mostrar o no la ventana
     * @param result1 Vector con los resultados de los estados
     * @param result2 Vector con los resultados de las ciudades
     */
    public void iniciarVentanaConsultaLugares(boolean var, Vector result1,
            Vector result2) {
        this.ventanaConsultaLugares = new VentanaConsultarLugares(result1, result2);
        this.ventanaConsultaLugares.setVisible(var);
    }

    /**
     * Operacion para mostrar un mensaje de salida en pantalla
     * @param mensaje mensaje a mostrar
     * @param tipo tipo de mensaje a mostrar. Si es "1" es un mensaje de error,
     * y "0" si el mensaje es de informacion
     */
    public void mostrarMensaje(String mensaje, int tipo) {
        if (tipo == 0) {
            JOptionPane.showMessageDialog(null, mensaje, "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo == 1) {
            JOptionPane.showMessageDialog(null, mensaje, "Resultado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar departamento
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaAgregarDepartamento(boolean var) {
        ventanaAgregarDepartamento = new VentanaAgregarDepartamento();
        ventanaAgregarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar departamento
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaModificarDepartamento(boolean var, Vector result) {
        ventanaModificarDepartamento = new VentanaModificarDepartamento(result);
        ventanaModificarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarClase(boolean var, Vector result) {
        ventanaAgregarClase = new VentanaAgregarClase(result);
        ventanaAgregarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarClase(boolean var, Vector result) {
        ventanaConsultarClase = new VentanaConsultarClase(result);
        ventanaConsultarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de eliminar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarClase(boolean var, Vector result) {
        ventanaEliminarClase = new VentanaEliminarClase(result);
        ventanaEliminarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarClase(boolean var, Vector result) {
        ventanaModificarClase = new VentanaModificarClase(result);
        ventanaModificarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarSubClase(boolean var, Vector result) {
        ventanaAgregarSubClase = new VentanaAgregarSubClase(result);
        ventanaAgregarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarSubClase(boolean var, Vector result) {
        ventanaEliminarSubClase = new VentanaEliminarSubClase(result);
        ventanaEliminarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarSubClase(boolean var, Vector result) {
        ventanaModificarSubClase = new VentanaModificarSubClase(result);
        ventanaModificarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para agregar un Lugar
     * @param var booleano que indica si mostrar o no la ventana
     * @param result Coleccion con todos los estados
     */
    public void iniciarVentanaAgregarLugar(boolean var, Collection result) {
        ventanaAgregarLugar = new VentanaAgregarLugar(result);
        ventanaAgregarLugar.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para agregar un proveedor
     * @param var booleano que indica si mostrar o no la ventana
     * @param result Coleccion con todos las ciudades
     */
    public void iniciarVentanaAgregarProveedor(boolean var, Collection result) {
        ventanaAgregarproveedor = new VentanaAgregarProveedor(result);
        ventanaAgregarproveedor.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para editar o mostrar proveedor
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEdiConProveedor1(boolean var) {
        ventanaConsulEdipro = new VentanaConsultaEdicionProveedor1();
        ventanaConsulEdipro.setVisible(var);
    }

    /**
     * Metodo para mostrar u ocultar la ventana para gregar una Tienda
     * @param var indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarTienda(boolean var) {
        this.ventanaAgregarTienda = new VentanaAgregarTienda();
        this.ventanaAgregarTienda.setVisible(var);
    }

    public void iniciarVentanaAgregarProducto(boolean var) {
        this.ventanaAgregarProducto = new VentanaAgregarProducto();
        this.ventanaAgregarProducto.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar empresa de vigilancia
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarEmpresaVigilancia(boolean var, Vector result) {
        ventanaAgregarEmpresaVigilancia = new VentanaAgregarEmpresaVigilancia(result);
        ventanaAgregarEmpresaVigilancia.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar empresa de vigilancia
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarEmpresaVigilancia(boolean var, Vector result) {
        ventanaConsultarEmpresaVigilancia = new VentanaConsultarEmpresaVigilancia(result);
        ventanaConsultarEmpresaVigilancia.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de eliminar empresa de vigilancia
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarEmpresaVigilancia(boolean var, Vector result) {
        ventanaEliminarEmpresaVigilancia = new VentanaEliminarEmpresaVigilancia(result);
        ventanaEliminarEmpresaVigilancia.setVisible(var);
    }
    /**
     * metodo para ocultar o mostrar la ventana de eliminar empresa d evigilancia
     * @param var indica si mostrar la ventana o no
     */
    public void iniciarVentanaConsultarTienda(boolean var) {
        this.ventanaConsultarTienda = new VentanaConsultarTienda();
        this.ventanaConsultarTienda.setVisible(true);
    }

    /**
     * Metodo para mostrar la ventana de modificar tiendas
     * @param var visibilidad
     */
    public void iniciarVentanaModificarTienda(boolean var) {
        this.ventanaModificarTienda = new VentanaModificarTienda();
        this.ventanaModificarTienda.setVisible(true);
    }

    /**
     * Metodo para mostrar la ventana de eliminar tiendas
     * @param var visibilidad
     */
    public void iniciarVentanaEliminarTienda(boolean var) {
        this.ventanaEliminarTienda = new VentanaEliminarTienda();
        this.ventanaEliminarTienda.setVisible(true);
    }

    /**
     * Metodo para mostrar la ventana de consultar productos
     * @param var visibilidad
     */
    public void iniciarVentanaConsultaProducto(boolean var) {
        this.ventanaConsultarProducto = new VentanaConsultarProducto();
        this.ventanaConsultarProducto.setVisible(true);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar empresa de vigilancia
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarEmpresaVigilancia(boolean var, Vector result) {
        ventanaModificarEmpresaVigilancia = new VentanaModificarEmpresaVigilancia(result);
        ventanaModificarEmpresaVigilancia.setVisible(var);
    }

    /**
     * Metodo para mostrar la ventana de editar productos
     * @param var visibilidad
     */
    public void iniciarVentanaEditarProducto(boolean var) {
        this.ventanaEditarProducto = new VentanaEditarProducto();
        this.ventanaEditarProducto.setVisible(true);
    }

    /**
     * Operacion para realizar una confirmacion. Despliega en la pantalla una ventana
     * de confirmacion donde aparece una opcion de "aceptar" o "cancelar"
     * @param mensaje mensaje a mostrar
     * @return int 0 si se apreto aceptar y 2 si se apreto cancelar
     */
    public int dialogoConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje, "CONFIRMACION",
                JOptionPane.OK_CANCEL_OPTION);
    }
}
