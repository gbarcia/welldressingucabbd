package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Departamento;
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
    public boolean agregarNuevoHorario (Horario horario);

    /**
     * Metodo para agregar una nueva Tienda
     * @param tienda la tienda a agregar
     * @return valor boolean de resultado de la operacion
     */
    public  boolean agregarTienda(Tienda tienda);

     /**
      * Metodo para buscar todos los horarios del sistema
      * @return Collection todos los horarios registrados
      */
     public Collection traerTodosLosHorarios ();
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
    public boolean  agregarLugar (Lugar newLugar);

     /**
    * Operacion para agregar un proveedor al sistema
    * @param proveedor el proveedor a registrar
    * @return boolean resultado de la operacion
    */
    public boolean agregarProveedor (Proveedor proveedor);

     /**
     * Metodo para consultar productos para un determinado proveedor
     * @param rif String con el rif del proveedor a consultar los productos
     * @return resultado coleccion de productos
     */
    public Collection<Producto> consultaProductosProveedor (String rif);

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
    public Proveedor consultarProveedor (String rif);

    /**
     * Operacion para consultar todos los proveedores registrados en el sistema
     * @return resultado Coleccion de objetos Proveedor
     */
    public Collection<Proveedor> todosLosProveedores();
}
