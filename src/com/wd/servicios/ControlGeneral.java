package com.wd.servicios;

import com.wd.dominio.Camion;
import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Departamento;
import com.wd.dominio.Empleado;
import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.HistorialEmpleado;
import com.wd.dominio.Horario;
import com.wd.dominio.Lugar;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.dominio.Servicio;
import com.wd.dominio.Tienda;
import java.io.IOException;
import java.util.Collection;
import org.apache.log4j.Logger;

/**
 * Clase que reunira todos los controles particulares integrados en uno
 * para ello implementa la interfaz control General
 * @author Gerardo Barcia
 */
public class ControlGeneral implements IfaceControlGeneral {

    /** Variable para trabajar con el controlador de los horario*/
    private ControlHorario controlHorario;
    /** Variable para trabajar con el controlador de las tiendas*/
    private ControlTienda controlTienda;
    /** Variable para trabajar con el controlador de los centros de distribucion*/
    private ControlCentroDistribucion controlCentroDistribucion;
    /** Variable para trabajar con el controlador de los departamentos*/
    private ControlDepartamento controlDepartamento;
    /** Variable para trabajar con el controlador de los lugares*/
    private ControlLugar controlLugar;
    /** Variable para trabajar con el controlador de los proveedores*/
    private ControlProveedor controlProveedor;
    /** Variable para trabajar con el controlador de los productos*/
    private ControlProducto controlProducto;
    /** Variable para trabajar con el controlador de los camiones*/
    private ControlCamion controlCamion;
    /** Variable para trabajar con el controlador de las empresas de vigilancia*/
    private ControlEmpresaVigilancia controlEmpresaVigilancia;
    /** Variable para trabajar con el controlador de los empleados*/
    private ControlEmpleado controlEmpleado;
    /** Variable para obtener una instancia de esta clase (patron singleton)*/
    private static ControlGeneral INSTANCIA = null;
    /** Variable para trabajar con la bitacora*/
    private Logger bitacora = Logger.getLogger(getClass());

    /** constructor de la clase privado (patron singleton)*/
    private ControlGeneral() {
    }

    /** metodo para crear una instancia de esta clase (patron singleton)*/
    private synchronized static void crearInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new ControlGeneral();
        }
    }

    /** metodo para obtener una instancia de esta clase(patron singleton)*/
    public static ControlGeneral getInstance() {
        if (INSTANCIA == null) {
            crearInstancia();
        }
        return INSTANCIA;
    }

    /**
     * Metodo para agregar un nuevo Horario
     * @param horario objeto horario a insertar
     * @return boolean resultado de la operacion
     */
    public boolean agregarNuevoHorario(Horario horario) {
        boolean resultado = false;
        try {
            this.controlHorario = new ControlHorario();
            bitacora.info("Control Horario Iniciado correctamente");
            controlHorario.agregarNuevoHorario(horario);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el control horario por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar un Departamento
     * @param newDpto objeto Departamento a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarDepartamento(Departamento newDpto) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarDepartamento(newDpto);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el control horario por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los horarios del sistema
     * @return Collection todos los horarios registrados
     */
    public Collection traerTodosLosHorarios() {
        Collection<Horario> horarios = null;
        try {
            this.controlHorario = new ControlHorario();
            bitacora.info("Control Horario Iniciado correctamente");
            horarios = controlHorario.traerTodosLosHorarios();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control horario por " + ex.getMessage());
        } finally {
            return horarios;
        }
    }

    /**
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public boolean agregarTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.controlTienda = new ControlTienda();
            this.bitacora.info("ControlTienda iniciado correctamente");
            resultado = this.controlTienda.agregarTienda(tienda);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlTienda por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una Tienda
     * @param tienda la tienda a modificar
     * @return resultado de la operacion
     */
    public boolean modificarTienda(Tienda tienda) {
        boolean resultado = false;
        try {
            this.controlTienda = new ControlTienda();
            this.bitacora.info("ControlTienda iniciado correctamente");
            resultado = this.controlTienda.modificarTienda(tienda);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlTienda por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar una tienda
     * @param codigo el codigo de la tienda
     * @return resultado de la operacion
     */
    public boolean eliminarTienda(int codigo) {
        boolean resultado = false;
        try {
            this.controlTienda = new ControlTienda();
            this.bitacora.info("ControlTienda iniciado correctamente");
            resultado = this.controlTienda.eliminarTienda(codigo);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlTienda por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar todas las tiendas
     * @return todas las Tiendas
     */
    public Collection traerTodasLasTienda() {
        Collection<Tienda> tiendas = null;
        try {
            this.controlTienda = new ControlTienda();
            bitacora.info("ControlTienda iniciado correctamente");
            tiendas = controlTienda.consultarTiendas();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el ControlTienda por " + ex.getMessage());
        } finally {
            return tiendas;
        }
    }

    /**
     * Metodo para Agregar un nuevo Centro de Distribución
     * @param centro el nuevo centro a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarCentroDistribucion(CentroDistribucion centro) {
        boolean resultado = false;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control CentroDistribucion Iniciado correctamente");
            controlCentroDistribucion.agregarCentroDistribucion(centro);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control centroDistribucion por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los Centros Distribucion del sistema
     * @return Collection todos los Centros Distribucion registrados
     */
    public Collection traerTodosLosCentros() {
        Collection<CentroDistribucion> centros = null;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control Centro Distribucion Iniciado correctamente");
            centros = controlCentroDistribucion.traerTodosLosCentros();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control horario por " + ex.getMessage());
        } finally {
            return centros;
        }
    }

    /**
     * Metodo para  eliminar un centro de distribucion
     * @param centro objeto centroDistribucion a eliminar
     * @return int resultado de la operación
     */
    public int eliminarCentro(CentroDistribucion centro) {
        int resultado = 0;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control Centro de Distribucion" +
                    " Iniciado correctamente");
            resultado = controlCentroDistribucion.eliminarCentro(centro);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar un Centro de Distribucion
     * @param centro objeto CentroDistribucion a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarCentro(CentroDistribucion centro) {
        boolean resultado = false;
        try {
            this.controlCentroDistribucion = new ControlCentroDistribucion();
            bitacora.info("Control CentroDistribucion iniciado correctamente");
            controlCentroDistribucion.modificarCentro(centro);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nuevo Departamento
     * @param departamento el nuevo departamento a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarDepartamento(Departamento departamento) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarDepartamento(departamento);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos los departamentos del sistema
     * @return Collection todos los departamentos registrados
     */
    public Collection traerTodosLosDepartamentos() {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodosLosDepartamentos();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar un Departamento
     * @param departamento el nuevo departamento a agregar
     * @return int resultado de la operación
     */
    public int eliminarDepartamento(Departamento departamento) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            resultado = controlDepartamento.eliminarDepartamento(departamento);

        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para  traer todos los lugares. Tiene dos operaciones en una
     * la primera para traer todos los estados y la segunda todas las ciudades
     * con sus correspondientes estados
     * @param operacion int 1: trae todos los estados, 2: trae todas las ciudades
     * @return Collection coleccion de objetos Lugar
     */
    public Collection<Lugar> traerTodosLosLuagres(int operacion) {
        Collection<Lugar> resultado = null;
        try {
            this.controlLugar = new ControlLugar();
            bitacora.info("Control Lugar Iniciado correctamente");
            switch (operacion) {
                case 1: {
                    bitacora.info("Iniciando traer todos los estados");
                    resultado = this.controlLugar.traerTodosLosEstados();
                    break;
                }
                case 2: {
                    bitacora.info("Iniciando traer todos los lugares");
                    resultado = this.controlLugar.traerTodosLosLugares();
                    break;
                }
                default: {
                    bitacora.error("Parametro introducido erroneo, num " + operacion);
                    break;
                }
            }
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un lugar Nuevo
     * @param newLugar el nuevo lugar a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarLugar(Lugar newLugar) {
        boolean resultado = false;
        try {
            this.controlLugar = new ControlLugar();
            bitacora.info("Control Lugar Iniciado correctamente");
            this.controlLugar.agregarLugar(newLugar);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control lugar por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nueva Clase
     * @param newClase la nueva clase a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarClase(Departamento newClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarClase(newClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una Clase
     * @param newClase objeto Departamento a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarClase(Departamento newClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarClase(newClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las clases del sistema
     * @return Collection todos las clases registradas
     */
    /*public Collection traerTodasLasClases(){
    Collection<Departamento> departamentos = null;
    try {
    this.controlDepartamento = new ControlDepartamento();
    bitacora.info("Control Departamento Iniciado correctamente");
    departamentos = controlDepartamento.traerTodosLasClases();
    } catch (IOException ex) {
    bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
    } finally {
    return departamentos;
    }
    }*/
    /**
     * Metodo para buscar todos las clases del sistema
     * @return Collection todos las clases registradas
     */
    public Collection traerTodasLasClases(Departamento dueño) {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodosLasClases(dueño);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar una clase
     * @param clase la clase a eliminar
     * @return int resultado de la operación
     */
    public int eliminarClase(Departamento clase) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            resultado = controlDepartamento.eliminarClase(clase);
        //resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
        //resultado = 0;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para Agregar un nueva SubClase
     * @param newSubClase la nueva Subclase a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.agregarSubClase(newSubClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar una SubClase
     * @param newSubClase objeto Departamento de tipo subclase a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarSubClase(Departamento newSubClase) {
        boolean resultado = false;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento iniciado correctamente");
            controlDepartamento.modificarSubClase(newSubClase);
            resultado = true;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el control departamento por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las Subclases del sistema
     * @return Collection todos las Subclases registradas
     */
    public Collection traerTodasLasSubClases(Departamento dueño) {
        Collection<Departamento> departamentos = null;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            departamentos = controlDepartamento.traerTodasLasSubClases(dueño);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control departamento por " + ex.getMessage());
        } finally {
            return departamentos;
        }
    }

    /**
     * Metodo para  eliminar una Subclase
     * @param Subclase objeto Departamento de tipo subclase a eliminar
     * @return int resultado de la operación
     */
    public int eliminarSubClase(Departamento Subclase) {
        int resultado = 0;
        try {
            this.controlDepartamento = new ControlDepartamento();
            bitacora.info("Control Departamento Iniciado correctamente");
            controlDepartamento.eliminarSubClase(Subclase);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar control departamento por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para agregar un proveedor al sistema
     * @param proveedor el proveedor a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarProveedor(Proveedor proveedor) {
        boolean resultado = false;
        try {
            this.controlProveedor = new ControlProveedor();
            bitacora.info("Control Proveedor Iniciado correctamente");
            resultado = controlProveedor.agregarProveedor(proveedor);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control proveedor por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para editar un proveedor en el sistema
     * @param proveedor el proveedor a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarProveedor(Proveedor proveedor) {
        boolean resultado = false;
        try {
            this.controlProveedor = new ControlProveedor();
            bitacora.info("Control Proveedor Iniciado correctamente");
            resultado = controlProveedor.editarProveedor(proveedor);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control proveedor por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para buscar todos las Productos para un determinado proveedor
     * @param rif String del rif del proveedor a buscar sus productos
     * @return Collection todos los productos para el proveedor
     */
    public Collection<Producto> consultaProductosProveedor(String rif) {
        Collection<Producto> resultado = null;
        try {
            this.controlProducto = new ControlProducto();
            bitacora.info("Control Producto Iniciado correctamente");
            resultado = controlProducto.consultaProductosProveedor(rif);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control producto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar un proveedor en el sistema
     * @param rif String rif del proveedor a consultar
     * @return resultado Proveedor con los datos de la consulta
     */
    public Proveedor consultarProveedor(String rif) {
        Proveedor resultado = null;
        try {
            this.controlProveedor = new ControlProveedor();
            bitacora.info("Control Proveedor Iniciado correctamente");
            resultado = this.controlProveedor.consultarProveedor(rif);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control proveedor por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los proveedores registrados en el sistema
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedores() {
        Collection<Proveedor> resultado = null;
        try {
            this.controlProveedor = new ControlProveedor();
            bitacora.info("Control Proveedor Iniciado correctamente");
            resultado = controlProveedor.todosLosProveedores();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el control proveedor por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar un proveedor del sistema
     * @param rif String rif del proveedor a eliminar
     * @return resultado boolean de exito o no de la operacion
     */
    public boolean eliminarProveedor(String rif) {
        boolean resultado = false;
        resultado = controlProveedor.eliminarProveedor(rif);
        return resultado;
    }

    /**
     * Operacion para agregar una empresa de vigilancia al sistema
     * @param emp la Empresa de Vigilancia a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarEmpresaVigilancia(EmpresaVigilancia emp) {
        boolean resultado = false;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control EmpresaVigilancia Iniciado correctamente");
            resultado = controlEmpresaVigilancia.agregarEmpresaVigilancia(emp);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control empresa de vigilancia" +
                    " por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para asociar una empresa de vigilancia a un centro de distribucion
     * @param serv Servicio a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarServicio(Servicio serv) {
        boolean resultado = false;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control EmpresaVigilancia Iniciado correctamente");
            resultado = controlEmpresaVigilancia.agregarServicio(serv);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control empresa de vigilancia" +
                    " por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los servicios de una empresa de vigilancia
     * registrados en el sistema
     * @param rif String RIF de la empresa de vigilancia que presta el servicio
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Servicio> todosLosServicios(String rif) {
        Collection<Servicio> resultado = null;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control Empresa Vigilancia Iniciado correctamente");
            resultado = controlEmpresaVigilancia.traerLosServicios(rif);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el controlEmpresa de Vigilancia" +
                    " por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para editar una empresa vigilancia en el sistema
     * @param emp la Empresa Vigilancia a registrar
     * @return boolean resultado de la operacion
     */
    public boolean modificarEmpresaVigilancia(EmpresaVigilancia emp) {
        boolean resultado = false;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control Empresa Vigilancia Iniciado correctamente");
            resultado = controlEmpresaVigilancia.modificarEmpresaVigilancia(emp);
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar control Empresa Vigilancia" +
                    " por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para eliminar una empresa de vigilancia del sistema
     * @param rif String rif de la empresa de vigilancia a eliminar
     * @return resultado int 1 de exito o  0 no de la operacion
     */
    public int eliminarEmpresaVigilancia(String rif) {
        int resultado = 0;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control EmpresaVigilancia Iniciado correctamente");
            controlEmpresaVigilancia.eliminarEmpresa(rif);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar controlEmpresa de Vigilancia" +
                    " por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para eliminar un servicio de empresa de vigilancia del sistema
     * @param serv Objeto servicio a eliminar
     * @return resultado int 1 de exito o  0 no de la operacion
     */
    public int eliminarServicio(Servicio serv) {
        int resultado = 0;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control EmpresaVigilancia Iniciado correctamente");
            controlEmpresaVigilancia.eliminarServicio(serv);
            resultado = 1;
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar controlEmpresa de Vigilancia" +
                    " por " + ex.getMessage());
            resultado = 0;
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los empresas de vigilancia registrados
     * en el sistema
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<EmpresaVigilancia> todasLasEmpresas() {
        Collection<EmpresaVigilancia> resultado = null;
        try {
            this.controlEmpresaVigilancia = new ControlEmpresaVigilancia();
            bitacora.info("Control Empresa Vigilancia Iniciado correctamente");
            resultado = controlEmpresaVigilancia.traerTodasLasEmpresas();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el controlEmpresa de Vigilancia" +
                    " por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para agragar un Producto
     * @param producto
     * @return resultado de la operacion
     */
    public boolean agregarProducto(Producto producto) {
        boolean resultado = false;
        try {
            this.controlProducto = new ControlProducto();
            this.bitacora.info("ControlProducto iniciado correctamente");
            resultado = this.controlProducto.agregarProducto(producto);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un producto
     * @param producto
     * @return resultado de la operacion
     */
    public boolean modificarProducto(Producto producto) {
        boolean resultado = false;
        try {
            this.controlProducto = new ControlProducto();
            this.bitacora.info("ControlProducto iniciado correctamente");
            resultado = this.controlProducto.agregarProducto(producto);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un producto
     * @param id
     * @return resultado de la operacion
     */
    public boolean eliminarProducto(int id) {
        boolean resultado = false;
        try {
            this.controlProducto = new ControlProducto();
            this.bitacora.info("ControlProducto iniciado correctamente");
            resultado = this.controlProducto.eliminarProducto(id);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar todos los productos
     * @return coleccion de productos
     */
    public Collection traerTodosLosProductos() {
        Collection<Producto> productos = null;
        try {
            this.controlProducto = new ControlProducto();
            bitacora.info("ControlProducto iniciado correctamente");
            productos = this.controlProducto.consultarProductos();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return productos;
        }
    }

    /**
     * Metodo para agregar un Camion
     * @param camion
     * @return resultado de la operacion
     */
    public boolean agregarCamion(Camion camion) {
        boolean resultado = false;
        try {
            this.controlCamion = new ControlCamion();
            this.bitacora.info("ControlCamion iniciado correctamente");
            resultado = this.controlCamion.agregarCamion(camion);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlCamion por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para modificar un camion
     * @param camion
     * @return resultado de la operacion
     */
    public boolean modificarCamion(Camion camion) {
        boolean resultado = false;
        try {
            this.controlCamion = new ControlCamion();
            this.bitacora.info("ControlCamion iniciado correctamente");
            resultado = this.controlCamion.modificarCamion(camion);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlCamion por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un camion
     * @param id
     * @return resultado de la operacion
     */
    public boolean eliminarCamion(int id) {
        boolean resultado = false;
        try {
            this.controlCamion = new ControlCamion();
            this.bitacora.info("ControlCamion iniciado correctamente");
            resultado = this.controlCamion.eliminarCamion(id);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlCamion por " + ex.getMessage());
            resultado = false;
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar todos los camiones
     * @return coleccion de camiones
     */
    public Collection traerTodosLosCamiones() {
        Collection<Camion> camiones = null;
        try {
            this.controlCamion = new ControlCamion();
            bitacora.info("ControlCamion iniciado correctamente");
            camiones = this.controlCamion.consultarCamiones();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el ControlCamion por " + ex.getMessage());
        } finally {
            return camiones;
        }
    }

    /**
     * Operacion para agregar un empleado al sistema junto con su historial
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarEmpleadoTienda(Empleado emp) {
        boolean resultado = false;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.agregarEmpleadoTienda(emp);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para actualizar la informacion de un empleado en el sistema
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarEmpleado(Empleado emp) {
        boolean resultado = false;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.editarEmpleado(emp);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar un empleado y su historial en el sistema
     * @param cedula Int numero de cedula del empleado a buscar
     * @return resultado Objeto empleado con la información inclutendo su historial
     * o null si no existe
     */
    public Empleado consultarEmpleadoTienda(Integer cedula) {
        Empleado resultado = null;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.consultarEmpleadoTienda(cedula);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los empleados del sistema
     * @return Coleccion de objetos Empleado (sin historial)
     */
    public Collection<Empleado> traerTodosLosEmpleados() {
        Collection<Empleado> resultado = null;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.traerTodosLosEmpleados();
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar todos los empleados de las tiendas
     * @return Coleccion de objetos Empleado (con historial)
     */
    public Collection<Empleado> traerTodosLosEmpleadosTienda() {
        Collection<Empleado> resultado = null;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.traerTodosLosEmpleadosTienda();
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para consultar el historial de un determinado empleado
     * @param cedula Int el numero de cedula del empleado
     * @return Coleccion de objetos HistorialEmpleado solo de tiendas
     */
    public Collection<HistorialEmpleado> consultarHistorialEmpleadoTienda(Integer cedula) {
        Collection<HistorialEmpleado> resultado = null;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.consultarHistorialEmpleadoTienda(cedula);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para actualizar el historial de un empleado. Metodo usado para
     * el momento de promocion o de transferencia entre empleados
     * @param cedula int numero de cedula del empleado
     * @return boolean de exito o no de la operacion
     */
    public boolean actualizarHistorialEmpleadoTienda(int cedula) {
        boolean resultado = false;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.actualizarHistorialEmpleadoTienda(cedula);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para agregar un nuevo objeto historial a un empleado en el sistema
     * @param he Objeto de tipo historial Empleado que se quiere agregar
     * @return boolean de exito o no de la operacion
     */
    public boolean agregarObjetoHistorialEmpleadoTienda(HistorialEmpleado he) {
        boolean resultado = false;
        try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.agregarObjetoHistorialEmpleadoTienda(he);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Operacion para borrar un empleado en el sistema
     * @param cedula int el numero de cedula del empleado que se quiere borrar
     * @return boolean de exito o no de la operacion
     */
    public boolean borrarEmpleado(int cedula) {
        boolean resultado = false;
         try {
            this.controlEmpleado = new ControlEmpleado();
            bitacora.info("Control empleado iniciado correctamente");
            resultado = controlEmpleado.borrarEmpleado(cedula);
        } catch (IOException ex) {
            bitacora.error("No se pudo iniciar el ControlEmpleado por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para agregar un registro Producto-Departamento
     * @param producto el producto a agregar
     * @return resultado de la operacion
     */
    public boolean agregarProductoDepartamento(Producto producto){
        boolean resultado = false;
        try {
            this.controlProducto = new ControlProducto();
            this.bitacora.info("ControlProducto iniciado correctamente");
            resultado = this.controlProducto.agregarProductoDepartamento(producto);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para eliminar un registro Producto-Departamento
     * @param producto el producto a eliminar
     * @return resultado de la operacion
     */
    public boolean eliminarProducto(Producto producto) {
        boolean resultado = false;
        try {
            this.controlProducto = new ControlProducto();
            this.bitacora.info("ControlProducto iniciado correctamente");
            resultado = this.controlProducto.eliminarProductoDepartamento(producto);
        } catch (IOException ex) {
            this.bitacora.error("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return resultado;
        }
    }

    /**
     * Metodo para consultar los registros Producto-Departamento
     * @return todos los registros
     */
    public Collection traerTodosLosProductoDepartamento() {
        Collection<Producto> productos = null;
        try {
            this.controlProducto = new ControlProducto();
            bitacora.info("ControlProducto iniciado correctamente");
            productos = this.controlProducto.consultarProductoDepartamento();
        } catch (IOException ex) {
            bitacora.info("No se pudo iniciar el ControlProducto por " + ex.getMessage());
        } finally {
            return productos;
        }
    }

}
