package com.wd.servicios;

import com.wd.dominio.Camion;
import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Departamento;
import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import com.wd.dominio.Horario;
import com.wd.dominio.Lugar;
import com.wd.dominio.Producto;
import com.wd.dominio.Proveedor;
import com.wd.dominio.Tienda;
import java.util.Collection;

/**
 * Interface para el Control general
 * @author Gerardo Barcia
 */
public interface IfaceControlGeneral {

    /**
     * Metodo para agregar un nuevo Horario
     * @param horario objeto horario a insertar
     * @return boolean resultado de la operacion
     */
    public boolean agregarNuevoHorario(Horario horario);

    /**
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public boolean agregarTienda(Tienda tienda);

    /**
     * Metodo para modificar una Tienda
     * @param tienda la tienda a modificar
     * @return resultado de la operacion
     */
    public boolean modificarTienda(Tienda tienda);

    /**
     * Metodo para eliminar una tienda
     * @param codigo el codigo de la tienda
     * @return resultado de la operacion
     */
    public boolean eliminarTienda(int codigo);

    /**
     * Metodo para consultar todas las tiendas
     * @return todas las Tiendas
     */
    public Collection traerTodasLasTienda();

    /**
     * Metodo para buscar todos los horarios del sistema
     * @return Collection todos los horarios registrados
     */
    public Collection traerTodosLosHorarios();

    /**
     * Metodo para agregar un nuevo Centro de Distribucion
     * @param centro objeto CentroDistribucion a insertar
     * @return boolean resultado de la operacion
     */
    public boolean agregarCentroDistribucion(CentroDistribucion centro);

    /**
     * Metodo para agregar un nuevo Departamento
     * @param departamento objeto Departamento a insertar
     * @return boolean resultado de la operacion
     */
    public boolean agregarDepartamento(Departamento departamento);

    /**
     * Metodo para buscar todos los departamentos del sistema
     * @return Collection todos los departamentos registrados
     */
    public Collection traerTodosLosDepartamentos();

    /**
     * Metodo para Eliminar un Departamento
     * @param departamento el departamento a eliminar
     * @return boolean resultado de la operación
     */
    public int eliminarDepartamento(Departamento departamento);

    /**
     * Metodo para modificar un Departamento
     * @param newDpto objeto Departamento a modificar
     * @return boolean resultado de la operacion
     */
    public boolean modificarDepartamento(Departamento newDpto);

    /**
     * Metodo para  traer todos los lugares. Tiene dos operaciones en una
     * la primera para traer todos los estados y la segunda todas las ciudades
     * con sus correspondientes estados
     * @param operacion int 1: trae todos los estados, 2: trae todas las ciudades
     * @return Collection coleccion de objetos Lugar
     */
    public Collection<Lugar> traerTodosLosLuagres(int operacion);

    /**
     * Metodo para Agregar un lugar Nuevo
     * @param newLugar el nuevo lugar a agregar
     * @return boolean resultado de la operación
     */
    public boolean agregarLugar(Lugar newLugar);

    /**
     * Operacion para agregar un proveedor al sistema
     * @param proveedor el proveedor a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarProveedor(Proveedor proveedor);

    /**
     * Metodo para consultar productos para un determinado proveedor
     * @param rif String con el rif del proveedor a consultar los productos
     * @return resultado coleccion de productos
     */
    public Collection<Producto> consultaProductosProveedor(String rif);

    /**
     * Operacion para editar un proveedor en el sistema
     * @param proveedor el proveedor a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarProveedor(Proveedor proveedor);

    /**
     * Operacion para consultar un proveedor en el sistema
     * @param rif String rif del proveedor a consultar
     * @return resultado Proveedor con los datos de la consulta
     */
    public Proveedor consultarProveedor(String rif);

    /**
     * Operacion para consultar todos los proveedores registrados en el sistema
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedores();

    /**
     * Operacion para borrar un proveedor del sistema
     * @param rif String rif del proveedor a eliminar
     * @return resultado boolean de exito o no de la operacion
     */
    public boolean eliminarProveedor(String rif);

    /**
     * Metodo para agragar un Producto
     * @param producto
     * @return resultado de la operacion
     */
    public boolean agregarProducto(Producto producto);

    /**
     * Metodo para eliminar un producto
     * @param producto
     * @return resultado de la operacion
     */
    public boolean modificarProducto(Producto producto);

    /**
     * Metodo para eliminar un producto
     * @param id
     * @return resultado de la operacion
     */
    public boolean eliminarProducto(int id);

    /**
     * Metodo para consultar todos los productos
     * @return coleccion de productos
     */
    public Collection traerTodosLosProductos();

    /**
     * Metodo para agregar un Camion
     * @param camion
     * @return resultado de la operacion
     */
    public boolean agregarCamion(Camion camion);

    /**
     * Metodo para modificar un camion
     * @param camion
     * @return resultado de la operacion
     */
    public boolean modificarCamion(Camion camion);

    /**
     * Metodo para eliminar un camion
     * @param id
     * @return resultado de la operacion
     */
    public boolean eliminarCamion(int id);

    /**
     * Metodo para consultar todos los camiones
     * @return coleccion de camiones
     */
    public Collection traerTodosLosCamiones();

    /**
     * Operacion para agregar un empleado al sistema junto con su historial
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean agregarEmpleadoTienda(Empleado emp);

    /**
     * Operacion para actualizar la informacion de un empleado en el sistema
     * @param emp el empleado a registrar
     * @return boolean resultado de la operacion
     */
    public boolean editarEmpleado(Empleado emp);

    /**
     * Operacion para consultar un empleado y su historial en el sistema
     * @param cedula Int numero de cedula del empleado a buscar
     * @return resultado Objeto empleado con la información inclutendo su historial
     * o null si no existe
     */
    public Empleado consultarEmpleadoTienda(Integer cedula);

    /**
     * Operacion para consultar todos los empleados del sistema
     * @return Coleccion de objetos Empleado
     */
    public Collection<Empleado> traerTodosLosEmpleados();

    /**
     * Operacion para consultar todos los empleados de las tiendas
     * @return Coleccion de objetos Empleado
     */
    public Collection<Empleado> traerTodosLosEmpleadosTienda();

    /**
     * Operacion para consultar el historial de un determinado empleado
     * @param cedula Int el numero de cedula del empleado
     * @return Coleccion de objetos HistorialEmpleado
     */
    public Collection<HistorialEmpleado> consultarHistorialEmpleadoTienda(Integer cedula);

    /**
     * Operacion para actualizar el historial de un empleado. Metodo usado para
     * el momento de promocion o de transferencia entre empleados
     * @param cedula int numero de cedula del empleado
     * @return boolean de exito o no de la operacion
     */
    public boolean actualizarHistorialEmpleadoTienda(int cedula);

    /**
     * Operacion para agregar un nuevo objeto historial a un empleado en el sistema
     * @param he Objeto de tipo historial Empleado que se quiere agregar
     * @return boolean de exito o no de la operacion
     */
    public boolean agregarObjetoHistorialEmpleadoTienda(HistorialEmpleado he);

    /**
     * Operacion para borrar un empleado en el sistema
     * @param cedula int el numero de cedula del empleado que se quiere borrar
     * @return boolean de exito o no de la operacion
     */
    public boolean borrarEmpleado(int cedula);
}
