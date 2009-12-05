package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Horario;
import com.wd.dominio.Lugar;
import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 * Manejador de la interfaz gráfica para Tienda
 * @author Jonathan Trujillo
 */
public class ControlGuiTienda {

    /** variable para el manejo de la entidad Tienda */
    private Tienda tienda;

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlGeneral = ControlGeneral.getInstance();

    /**
     * Contructor de la clase
     */
    public ControlGuiTienda() {
        this.controlador = new ControlGui();
    }

    /**
     * Metodo para agregar una Tienda
     * @param nombre el nombre de la tienda
     * @param tamano el tamano de la tienda
     * @param horario_id el identificador del horario de operacion de la tienda
     * @param telefono el telefono de la tienda
     * @param correo el correo de la tienda
     * @param ciudad_id el identificador de la ciudad de la tienda
     * @param direccion la direccion de la tinda
     * @param empresa_id la empresa de vigilancia de la tienda
     */
    public void agregarTienda(String nombre, int tamano, int horario_id,
            String telefono , String correo, int ciudad_id, String direccion,
            String empresa_id){
        boolean resultado = false;
        this.tienda = new Tienda(0, nombre, tamano, telefono, correo, direccion,
                ciudad_id, horario_id, empresa_id);
        resultado = this.controlGeneral.agregarTienda(tienda);
        System.out.println(resultado);
        if (resultado) {
            controlador.mostrarMensaje("Tienda agregada con éxito",0);
        } else if (!resultado) {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }

    /**
     * Metodo para modificar una tienda
     * @param codigo el codigo de la tienda
     * @param nombre el nombre de la tienda
     * @param tamano el tamano de la tienda
     * @param horario_id el identificador del horario de operacion de la tienda
     * @param telefono el telefono de la tienda
     * @param correo el correo de la tienda
     * @param ciudad_id el identificador de la ciudad de la tienda
     * @param direccion la direccion de la tinda
     * @param empresa_id la empresa de vigilancia de la tienda
     */
    public void modificarTienda(int codigo, String nombre, int tamano,
            int horario_id, String telefono , String correo, int ciudad_id,
            String direccion, String empresa_id){
        this.tienda = new Tienda(codigo, nombre, tamano, telefono, correo,
                direccion, ciudad_id, horario_id, empresa_id);
        boolean resultado = this.controlGeneral.modificarTienda(tienda);
        if (resultado) {
            controlador.mostrarMensaje("Tienda modificada con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }

    /**
     * Metodo para eliminar una Tienda
     * @param codigo el codigo de la tienda
     */
    public void eliminarTienda(int codigo){
        boolean resultado = this.controlGeneral.eliminarTienda(codigo);
        if (resultado) {
            controlador.mostrarMensaje("Tienda eliminada con éxito",0);
        } else {
            controlador.mostrarMensaje("Operacion fallida", 1);
        }
    }
    
    /**
     * Metodo para consultar las Tiendas del sistema
     * @return todas las Tiendas del sistemas
     */
    public Vector consultarTiendas(){
        Vector<Tienda> vectorTiendas = null;
        Collection<Tienda> coleccionTiendas = this.controlGeneral.traerTodasLasTienda();
        vectorTiendas = new Vector();
        for (Tienda tiendas : coleccionTiendas) {
            vectorTiendas.add(tiendas);
        }
        return vectorTiendas;
    }

    /**
     * Metodo para crear el modelo que llena en jComboBox de Horarios
     * @return el modelo de horarios        at com.wd.servicios.ControlGeneral.traerTiendasOrdenTamano(ControlGeneral.java:1181)
     */
    public Object[] modeloHorarios(Vector<Horario> horarios){
        Vector<String> modeloComboBox = new Vector<String>();
        for (Horario horario : horarios){
            modeloComboBox.add(horario.getDiaIni() + " - " + horario.getDiaFin()
                    + " : " + horario.getHoraIni() + " - " + horario.getHoraFin());
        }
        return modeloComboBox.toArray();
    }

    /**
     * Metodo para crear el modelo que llena en jComboBox de Ciudades,
     * dependiendo del Estado.
     * @param ciudades collecion de ciudades
     * @return retorna el modelo de ciudades
     */
    public Object[] modeloCiudades(Vector<Lugar> ciudades){
        Vector<String> modeloComboBox = new Vector<String>();
        for (Lugar ciudad : ciudades){
            modeloComboBox.add(ciudad.getNombrePropio());
        }
        return modeloComboBox.toArray();
    }

    /**
     * Metodo para crear el modelo que llena en jComboBox de Estados
     * @return el modelos de empresas
     */
    public Object[] modeloEmpresas(Vector<EmpresaVigilancia> empresas){
        Vector<String> modeloComboBox = new Vector<String>();
        modeloComboBox.add("NINGUNO");
        for (EmpresaVigilancia empresa : empresas){
            modeloComboBox.add(empresa.getRif() + ": " + empresa.getNombre());
        }
        return modeloComboBox.toArray();
    }

    /**
     * Metodo que verifica que un String contenga un numero entero
     * @param string el string a verificar
     * @return si el string es entero o no
     */
    public boolean esEntero(String string){
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Metodo que verifica que un String contenga solo digitos
     * @param string
     * @return si el string es numerico
     */
    public boolean esNumerico(String string){
    for (int i = 0; i < string.length(); i++) {
        if (!Character.isDigit(string.charAt(i)))
            return false;
        }
        return true;
    }

    /**
     * Metodo para traer las tiendas ordenadas por tamaño de mayor a menor
     * @return Coleccion de objetos Tienda
     */
    public Collection<Tienda> traerTiendasMayorTamano (){
        Collection<Tienda> resultado = this.controlGeneral.traerTiendasOrdenTamano(1);
        return resultado;
    }

    /**
     * Metodo para traer las tiendas ordenadas por tamaño de menor a mayor
     * @return Coleccion de objetos Tienda
     */
    public Collection<Tienda> traerTiendasMenorTamano (){
        Collection<Tienda> resultado = this.controlGeneral.traerTiendasOrdenTamano(2);
        return resultado;
    }

    /**
     * Metodo para traer todos los empleados de una tienda
     * @param codigo
     * @return Vector
     */
    public Vector<Empleado> traerEmpleadosPorTienda(Integer codigo) {
        return new Vector<Empleado>(controlGeneral.traerEmpleadosPorTienda(codigo));
    }

    public Vector<Tienda> consultarTiendasVariedadDesc() {
        return new Vector<Tienda>(controlGeneral.consultarTiendasVariedadDesc());
    }

    public Vector<Tienda> consultarTiendasVariedadAsc() {
        return new Vector<Tienda>(controlGeneral.consultarTiendasVariedadAsc());
    }

}
