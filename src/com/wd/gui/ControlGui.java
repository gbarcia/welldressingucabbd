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
* metodo para ocultar o mostrar la ventana de editarConsultar proveedor 2
* @param var booleano que indica si mostrar o no la ventana
* @param prove Objeto proveedor con la informacion a mostrar
*/
    public void iniciarCerrarVentanaConsultaProve2(boolean var, Proveedor prove) {
        this.ventanaConsulEdipro2 = new VentanaConsultaEdicionProveedor2(prove);
        this.ventanaConsulEdipro2.setVisible(var);
    }

/**
* metodo para ocultar o mostrar la ventana de agregar nuevo horario
 * @param var booleano que indica si mostrar o no la ventana
*/
    public void iniciarVentanaNuevoHorario (boolean var) {
        ventanaNuevoHorario = new VentanaNuevoHorario();
        ventanaNuevoHorario.setVisible(var);      
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar centro
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaAgregarCentro (boolean var,Vector result) {
        ventanaAgregarCentro = new VentanaAgregarCentro(result);
        ventanaAgregarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar centros
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarCentro (boolean var, Vector result){
        ventanaConsultarCentro = new VentanaConsultarCentro(result);
        ventanaConsultarCentro.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de ver horarios
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarHorario (boolean var, Vector result) {
        ventanaConsultaHorarios = new VentanaConsultaHorarios(result);
        ventanaConsultaHorarios.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consultar departamentos
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarDepartamentos (boolean var, Vector result) {
        ventanaConsultarDepartamentos = new VentanaConsultarDepartamentos(result);
        ventanaConsultarDepartamentos.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de elimianar departamentos
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarDepartamento (boolean var, Vector result) {
        ventanaEliminarDepartamento = new VentanaEliminarDepartamento(result);
        ventanaEliminarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de consulta de lugares
     * @param var booleano que indica si mostrar o no la ventana
     * @param result1 Vector con los resultados de los estados
     * @param result2 Vector con los resultados de las ciudades
     */
    public void iniciarVentanaConsultaLugares (boolean var, Vector result1,
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
    public void iniciarVentanaAgregarDepartamento (boolean var) {
        ventanaAgregarDepartamento = new VentanaAgregarDepartamento();
        ventanaAgregarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar departamento
     * @param var booleano que indica si mostrar o no la ventana

     */
    public void iniciarVentanaModificarDepartamento (boolean var, Vector result) {
        ventanaModificarDepartamento = new VentanaModificarDepartamento(result);
        ventanaModificarDepartamento.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarClase (boolean var, Vector result) {
        ventanaAgregarClase = new VentanaAgregarClase(result);
        ventanaAgregarClase.setVisible(var);
    }
    
    /**
     * Metodo para ocultar o mostrar la ventana de consultar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaConsultarClase (boolean var, Vector result){
        ventanaConsultarClase = new VentanaConsultarClase(result);
        ventanaConsultarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de eliminar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarClase (boolean var, Vector result){
        ventanaEliminarClase = new VentanaEliminarClase(result);
        ventanaEliminarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar clases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarClase (boolean var, Vector result){
        ventanaModificarClase = new VentanaModificarClase(result);
        ventanaModificarClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaAgregarSubClase (boolean var, Vector result){
        ventanaAgregarSubClase = new VentanaAgregarSubClase(result);
        ventanaAgregarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de agregar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEliminarSubClase (boolean var, Vector result){
        ventanaEliminarSubClase = new VentanaEliminarSubClase(result);
        ventanaEliminarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana de modificar subclases
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaModificarSubClase (boolean var, Vector result){
        ventanaModificarSubClase = new VentanaModificarSubClase(result);
        ventanaModificarSubClase.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para agregar un Lugar
     * @param var booleano que indica si mostrar o no la ventana
     * @param result Coleccion con todos los estados
     */
    public void iniciarVentanaAgregarLugar (boolean var, Collection result){
        ventanaAgregarLugar = new VentanaAgregarLugar(result);
        ventanaAgregarLugar.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para agregar un proveedor
     * @param var booleano que indica si mostrar o no la ventana
     * @param result Coleccion con todos las ciudades
     */
    public void iniciarVentanaAgregarProveedor (boolean var, Collection result){
        ventanaAgregarproveedor = new VentanaAgregarProveedor(result);
        ventanaAgregarproveedor.setVisible(var);
    }

    /**
     * Metodo para ocultar o mostrar la ventana para editar o mostrar proveedor
     * @param var booleano que indica si mostrar o no la ventana
     */
    public void iniciarVentanaEdiConProveedor1 (boolean var){
        ventanaConsulEdipro = new VentanaConsultaEdicionProveedor1();
        ventanaConsulEdipro.setVisible(var);
    }

    /**
    * Operacion para realizar una confirmacion. Despliega en la pantalla una ventana
    * de confirmacion donde aparece una opcion de "aceptar" o "cancelar"
    * @param mensaje mensaje a mostrar
    * @return int 0 si se apreto aceptar y 2 si se apreto cancelar
    */
    public int dialogoConfirmacion (String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje, "CONFIRMACION",
                    JOptionPane.OK_CANCEL_OPTION);
    }
}
