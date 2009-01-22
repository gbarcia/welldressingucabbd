package com.wd.gui;

import com.wd.dominio.Proveedor;
import com.wd.guiSolicitud.VentanaActualizarOrdenCompraSel;
import com.wd.guiSolicitud.VentanaActualizarTransSel;
import com.wd.guiSolicitud.VentanaProcesarOCseleccion;
import com.wd.guiSolicitud.VentanaProcesarTransSeleccion;
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
    /** variable de ventana de consulta de productos */
    private VentanaEliminarProducto ventanaEliminarProducto;
    /** variable de ventana de consulta de Estadisticas de Tienda */
    private VentanaEstadisticasTienda venEstadisticasTienda;
    /** variable de ventana de consulta de Estadisticas del Personal */
    private VentanaEstadisticasPersonal venEstadisticasPersonal;
    /** variable de ventana de PersonalCentro */
    private VentanaPersonalCentro ventanaPersonalCentro;
    /** variable de ventana de consultar proveedor por centro */
    private VentanaConsultarProveedoresCentro ventanaConsultarProveedoresCentro;
    /** variable de ventana de consultar inventario por tienda */
    private VentanaConsultaInventarioTienda ventanaConsultaInventarioTienda;
    /** variable de ventana de consultar inventario por centro */
    private VentanaConsultaInventarioCentro ventanaConsultaInventarioCentro;
    /** variable de ventana para realizar orden de compra */
    private VentanaProcesarOCseleccion venProOc;
    /** variable de ventana para transferir empleados entre tiendas */
    private VentanaTransferenciaEmpTiendas ventanaTransferenciaEmpTiendas;
    /** variable de ventana para transferir empleados entre tiendas */
    private VentanaConsultarPrecioProducto ventanaConsultarPrecioProducto;
    /** variable de ventana para transferir empleados entre tiendas */
    private VentanaActualizarOrdenCompraSel vActOrden;
    /** variable de ventana para consultar y editar empleados de centro */
    private VentanaConsultarEditarEmpleadoCentro1 ventanaConsultarEditarEmpleadoCentro;
    /** variable de ventana para eliminar empleados de centro */
    private VentanaEliminarEmpleadoCentro ventanaEliminarEmpleadoCentro;
    /** variable de ventana para registrar empleados de centro */
    private VentanaAgregarEmpleadoCentro ventanaAgregarEmpleadoCentro;
    /** variable de ventana para asignar proveedores a los centros */
    private VentanaAsignarProveedorCentro ventanaAsignarProveedorCentro;
    /** variable de ventana para agreagar camion */
    private VentanaAgregarCamion ventanaAgregarCamion;
    /** variable de ventana para eliminar camion */
    private VentanaEliminarCamion ventanaEliminarCamion;
    /** variable de ventana para consultar camion */
    private VentanaConsultarCamion ventanaConsultarCamion;
    /** variable de ventana para editar camion */
    private VentanaEditarCamion ventanaEditarCamion;
    /** variable de ventana de consulta de Estadisticas de los Servicios */
    private VentanaEstadisticasServicios ventanaEstadisticasServicios;
    /** variable de ventana de consulta de Estadisticas de los Servicios */
    private VentanaEstadisticasProducto ventanaEstadisticasProducto;
    /** variable de ventana de consulta de empleados por tienda */
    private VentanaConsultarEmpleadosPorTienda ventanaConsultarEmpleadosPorTienda;
    /** variable de ventana de realizar seleccion de tiendas en transferencia */
    private VentanaProcesarTransSeleccion ventanaProcesarTransSeleccion;
    /** variable de ventana para actializar o consultar transferencias */
    private VentanaActualizarTransSel ventanaActualizarTransSel;

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
     * metodo para ocultar o mostrar la ventana de asignar prove cen
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void ivenAsignarProveCen(boolean var) {
        this.ventanaAsignarProveedorCentro = new VentanaAsignarProveedorCentro();
        this.ventanaAsignarProveedorCentro.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de actualizar orden
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void ivenAoc(boolean var) {
        this.vActOrden = new VentanaActualizarOrdenCompraSel();
        this.vActOrden.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de orden compra
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void ivenOc(boolean var) {
        this.venProOc = new VentanaProcesarOCseleccion();
        this.venProOc.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de estadisticas Tienda
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniVenestadisticasTienda(boolean var) {
        this.venEstadisticasTienda = new VentanaEstadisticasTienda();
        this.venEstadisticasTienda.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de estadisticas Personal
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniVenestadisticasPersonal(boolean var) {
        this.venEstadisticasPersonal = new VentanaEstadisticasPersonal();
        this.venEstadisticasPersonal.setVisible(var);
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
     * Metodo para mostrar la ventana de editar productos
     * @param var visibilidad
     */
    public void iniciarVentanaEliminarProducto(boolean var) {
        this.ventanaEliminarProducto = new VentanaEliminarProducto();
        this.ventanaEliminarProducto.setVisible(true);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de personal centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaPersonalCentro(boolean var, Vector result) {
        ventanaPersonalCentro = new VentanaPersonalCentro(result);
        ventanaPersonalCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar proveedores por centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaProveedoresCentro(boolean var, Vector result) {
        ventanaConsultarProveedoresCentro = new VentanaConsultarProveedoresCentro(result);
        ventanaConsultarProveedoresCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar proveedores por centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultaInventarioTienda(boolean var, Vector result) {
        ventanaConsultaInventarioTienda = new VentanaConsultaInventarioTienda(result);
        ventanaConsultaInventarioTienda.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar inventario dentro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaTransferenciaEmpTiendas(boolean var, Vector result) {
        ventanaTransferenciaEmpTiendas = new VentanaTransferenciaEmpTiendas(result);
        ventanaTransferenciaEmpTiendas.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de tranferir empleados entre tiendas
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultaInventarioCentro(boolean var, Vector result) {
        ventanaConsultaInventarioCentro = new VentanaConsultaInventarioCentro(result);
        ventanaConsultaInventarioCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de precio por producto
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarPrecioProducto(boolean var, Vector result) {
        ventanaConsultarPrecioProducto = new VentanaConsultarPrecioProducto(result);
        ventanaConsultarPrecioProducto.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de registrar empleado centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaRegistrarEmpleadoCentro(boolean var) {
        this.ventanaAgregarEmpleadoCentro = new VentanaAgregarEmpleadoCentro();
        this.ventanaAgregarEmpleadoCentro.setVisible(true);
    }

    /**
     * metodo para ocultar o mostrar la ventana de consultar editar empleado centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarCerrarVentanaConsultaEmpleadoCentro(boolean var) {
        this.ventanaConsultarEditarEmpleadoCentro = new VentanaConsultarEditarEmpleadoCentro1();
        this.ventanaConsultarEditarEmpleadoCentro.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de eliminar empleado centro
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarEmpleadoCentro(boolean var) {
        this.ventanaEliminarEmpleadoCentro = new VentanaEliminarEmpleadoCentro();
        this.ventanaEliminarEmpleadoCentro.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar camion
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarCamion(boolean var) {
        this.ventanaAgregarCamion = new VentanaAgregarCamion();
        this.ventanaAgregarCamion.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar camion
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarCamion(boolean var) {
        this.ventanaEliminarCamion = new VentanaEliminarCamion();
        this.ventanaEliminarCamion.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar camion
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarCamion(boolean var) {
        this.ventanaConsultarCamion = new VentanaConsultarCamion();
        this.ventanaConsultarCamion.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de agregar camion
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEditarCamion(boolean var) {
        this.ventanaEditarCamion = new VentanaEditarCamion();
        this.ventanaEditarCamion.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de estadisticas servicios
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEstadisticasServicios(boolean var) {
        this.ventanaEstadisticasServicios = new VentanaEstadisticasServicios();
        this.ventanaEstadisticasServicios.setVisible(var);
    }

    /**
     * metodo para ocultar o mostrar la ventana de estadisticas productos
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEstadisticasProducto(boolean var) {
        this.ventanaEstadisticasProducto = new VentanaEstadisticasProducto();
        this.ventanaEstadisticasProducto.setVisible(var);
    }

    /**
     * Metodo para mostrar la ventana de consulta de empleados por tienda
     * @param var visivilidad
     */
    public void iniciarVentanaEmpleadosPorTienda(boolean var) {
        this.ventanaConsultarEmpleadosPorTienda = new VentanaConsultarEmpleadosPorTienda();
        this.ventanaConsultarEmpleadosPorTienda.setVisible(var);
    }

    /**
     * Metodo para mostrar la ventana para la seleccion de tiendas de una tranferencia
     * @param var visibilidad Vector result vector de tiendas
     */
    public void iniciarVentanaSeleccionTiendasTrans(boolean var,Vector result) {
        this.ventanaProcesarTransSeleccion = new VentanaProcesarTransSeleccion(result);
        this.ventanaProcesarTransSeleccion.setVisible(var);
    }

    /**
     * Metodo para mostrar la ventana para la seleccion de tiendas de una tranferencia
     * @param var visibilidad Vector result vector de tiendas
     */
    public void iniciarVentanaConsultarTransferencias(boolean var) {
        this.ventanaActualizarTransSel = new VentanaActualizarTransSel();
        this.ventanaActualizarTransSel.setVisible(var);
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
