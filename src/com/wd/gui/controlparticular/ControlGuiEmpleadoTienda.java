package com.wd.gui.controlparticular;

import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import com.wd.dominio.Lugar;
import com.wd.dominio.Tienda;
import com.wd.gui.ControlGui;
import com.wd.gui.VentanaConsultarEditarEmpleadoTienda2;
import com.wd.servicios.ControlGeneral;
import com.wd.servicios.IfaceControlGeneral;
import java.util.Date;
import java.util.Collection;

/**
 * Manejador de la interfaz gráfica para Empleado Tienda
 * @author gerardo
 */
public class ControlGuiEmpleadoTienda {

    /* variable para el manejo de la entidad empleado  */
    private Empleado empleado;
    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;
    /** variable de la interface responsable del control de las entidades */
    private IfaceControlGeneral controlG = ControlGeneral.getInstance();

    /** constructor que inicia el control general GUI */
    public ControlGuiEmpleadoTienda() {
        this.controlador = new ControlGui();
    }

    /** Operacion para conocer si un string es número
     * @return resultado boolean si es numero o no
     */
    private boolean isNumber(String arg) {
        boolean resultado = false;
        try {
            Integer number = Integer.parseInt(arg);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**Operacion para validar el formulario de registro
     * @param cedula int numero de cedula
     * @param nombre String nombre del empleado
     * @param apellido String apellido del empleado
     * @param telefono String telefono del empleado
     * @param direccion String direccion del empleado
     * @return resultado boolean si es valido o no
     */
    private boolean validarForm(String cedula, String nombre, String apellido,
            String telefono, String direccion) {
        boolean resultado = true;
        if (cedula.equals("") ||
                nombre.equals("") ||
                apellido.equals("") ||
                telefono.equals("") ||
                direccion.equals("")) {
            resultado = false;
        }
        return resultado;
    }

    /**Operacion para registrar un Empleado en el sistema
     * operacion para registrar un nuevo empleado en el sistema
     * @param cedula int numero de cedula
     * @param nombre String nombre del empleado
     * @param apellido String apellido del empleado
     * @param fechaNacimiento java.sql.Date la fecha de nacimiento del empleado
     * @param telefono String telefono del empleado
     * @param estadoCivil int estado civil del empleado
     * @param sexo String sexo del empleado
     * @param nivelEstudios int nivel de estudios del empleado
     * @param direccion String direccion del empleado
     * @param tipo int tipo de cargo del empleado
     * @param lugarId int el indice de la ciudad donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive el empleado
     * @param codigo int codigo de la tienda donde trabajara el empleado
     * @param nombreEmpresa String nombre de la empresa o tienda donde trabajara
     * el empleado
     */
    public void registrarNuevoEmpleado(String cedula, String nombre, String apellido,
            java.sql.Date fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId, String ciudadVive,
            int codigo, String nombreEmpresa) {
        boolean resultado = false;
        boolean datosValidos = false;
        boolean esNumero = false;
        esNumero = this.isNumber(cedula);
        if (esNumero) {
            datosValidos = this.validarForm(sexo, nombre, apellido, telefono, direccion);
            int ci = Integer.parseInt(cedula); // conviertiendo la cedula en numero entero
            if (datosValidos) {
                Date fecha = new Date();
                java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
                empleado = new Empleado(ci, nombre, apellido, fechaNacimiento, telefono,
                        estadoCivil, sexo, nivelEstudios, direccion, tipo, lugarId,
                        ciudadVive, fechaSQL, null, codigo, nombreEmpresa);
                resultado = controlG.agregarEmpleadoTienda(empleado);
                if (resultado) {
                    controlador.mostrarMensaje("Empleado " + nombre + " agregado con éxito", 0);
                } else if (!resultado) {
                    controlador.mostrarMensaje("Operacion fallida", 1);
                }
            } else if (!datosValidos) {
                controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
            }
        } else if (!esNumero) {
            controlador.mostrarMensaje("Error: el campo cedula debe ser número", 1);
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

    /** Operacion para traer todas las tiendas
     * @return Collection con todas las tiendas
     */
    public Collection<Tienda> obtenerTodasLasTiendas() {
        Collection<Tienda> resultado = null;
        resultado = controlG.traerTodasLasTienda();
        return resultado;
    }

    /** Operacion para traer todos los empleados que trabajan en las tiendas
     * @return Collection con todas los Empleados de Tiendas
     */
    public Collection<Empleado> traerTodosEmpTiendas() {
        Collection<Empleado> resultado = null;
        resultado = controlG.traerTodosLosEmpleadosTienda();
        return resultado;
    }

    /** Operacion para consultar un empleado
     * @return resultado Objeto Empleado con su historial
     */
    public Empleado consultarEmpleado(int cedula) {
        Empleado resultado = null;
        resultado = controlG.consultarEmpleadoTienda(cedula);
        return resultado;
    }

    /** Operacion para iniciar la ventana de consulta, recibe una cedula y crea
     * la nueva ventana que presenta la informacion pertinente de ese empleado
     * @param cedula String de la cedula del empleado a consultar
     */
    public void iniciarVentanaConsulta(String cedula) {
        boolean esNumero = false;
        esNumero = this.isNumber(cedula);
        if (esNumero) {
            int cedulap = Integer.parseInt(cedula);
            Empleado emp = this.consultarEmpleado(cedulap);
            if (emp != null) {
                VentanaConsultarEditarEmpleadoTienda2 ven = new VentanaConsultarEditarEmpleadoTienda2(cedulap);
                ven.setVisible(true);
            } else if (emp == null) {
                controlador.mostrarMensaje("Error: el empleado con la cedula: " + cedulap + " no existe", 1);
            }
        } else if (!esNumero) {
            controlador.mostrarMensaje("Error: el campo cedula debe ser número", 1);
        }
    }

    /** Operacion para actualizar un empleado en el sistema
     * @param flag parametro donde se indica si se va a cambiar de cargo un empleado
     * @param cedula int numero de cedula del empleado
     * @param nombre String nombre del empleado
     * @param apellido String apellido del empleado
     * @param fechaNacimiento java.sql.Date la fecha de nacimiento del empleado
     * @param telefono String telefono del empleado
     * @param estadoCivil int estado civil del empleado
     * @param sexo String sexo del empleado
     * @param nivelEstudios int nivel de estudios del empleado
     * @param direccion String direccion del empleado
     * @param tipo int tipo de cargo del empleado
     * @param lugarId int el indice de la ciudad donde vive el empleado
     * @param ciudadVive String nombre de la ciudad donde vive el empleado
     * @param codigo int codigo de la tienda donde trabajara el empleado
     * @param nombreEmpresa String nombre de la empresa o tienda donde trabajara
     */
    public void actualizarEmpleado(boolean flag, int cedula, String nombre, String apellido,
            java.sql.Date fechaNacimiento, String telefono, int estadoCivil, String sexo,
            int nivelEstudios, String direccion, int tipo, int lugarId, String ciudadVive,
            int codigo, String nombreEmpresa) {
        boolean resultado = false;
        boolean resultadoAct = false;
        boolean datosValidos = false;
        if (flag) {
            int confirmacion = controlador.dialogoConfirmacion("¿Está seguro que desea modificar el cargo del empleado?");
            if (confirmacion == 0) {
                datosValidos = this.validarForm(sexo, nombre, apellido, telefono, direccion);
                if (datosValidos) {
                    Date fecha = new Date();
                    java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
                    empleado = new Empleado(cedula, nombre, apellido, fechaNacimiento, telefono,
                            estadoCivil, sexo, nivelEstudios, direccion, tipo, lugarId,
                            ciudadVive, fechaSQL, null, codigo, nombreEmpresa);
                    resultado = controlG.actualizarHistorialEmpleadoTienda(cedula);
                    if (resultado) {
                        resultadoAct = controlG.editarEmpleado(empleado);
                        for (HistorialEmpleado he : empleado.getHistorial()) {
                            controlG.agregarObjetoHistorialEmpleadoTienda(he);
                        }
                        if (resultadoAct) {
                            controlador.mostrarMensaje("Empleado " + nombre + " actualizado con éxito", 0);
                        }
                    } else {
                        controlador.mostrarMensaje("Operacion fallida", 1);
                    }
                } else if (!datosValidos) {
                    controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
                }
            }
        } else if (!flag) {
            datosValidos = this.validarForm(sexo, nombre, apellido, telefono, direccion);
            if (datosValidos) {
                Date fecha = new Date();
                java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime()); //Obteniendo la fecha actual
                empleado = new Empleado(cedula, nombre, apellido, fechaNacimiento, telefono,
                        estadoCivil, sexo, nivelEstudios, direccion, tipo, lugarId,
                        ciudadVive, fechaSQL, null, codigo, nombreEmpresa);
                resultado = controlG.editarEmpleado(empleado);
                if (resultado) {
                    controlador.mostrarMensaje("Empleado " + nombre + " actualizado con éxito", 0);
                }
            } else {
                controlador.mostrarMensaje("Operacion fallida", 1);
            }
        } else if (!datosValidos) {
            controlador.mostrarMensaje("Error: Todos los campos son requeridos", 1);
        }
    }

    public void eliminarEmpleadoDelSistema(String cedula) {
        boolean esNumero = false;
        boolean resultado = false;
        String mensaje = "¿Está seguro que desea borrar el empleado " + cedula +
                " ?. Este procedimiento borrara todos sus registros de historial";
        esNumero = this.isNumber(cedula);
        if (esNumero) {
            Integer ced = Integer.parseInt(cedula);
            int confirmacion = controlador.dialogoConfirmacion(mensaje);
            if (confirmacion == 0) {
                resultado = controlG.borrarEmpleado(ced);
                if (resultado) {
                    controlador.mostrarMensaje("Empleado " + cedula + "borrado con éxito", 0);
                } else if (!resultado) {
                    controlador.mostrarMensaje("Operacion fallida", 1);
                }
            }
        } else if (!esNumero) {
            controlador.mostrarMensaje("Error: el campo cedula debe ser número", 1);
        }
    }
}
