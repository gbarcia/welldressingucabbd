/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.guiSolicitud.particular;

import com.wd.dominio.Camion;
import com.wd.dominio.CentroDistribucion;
import com.wd.dominio.Empleado;
import com.wd.dominio.Inventario;
import com.wd.dominio.Producto;
import com.wd.dominio.Tienda;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casa
 */
public class ControlGuiPedidoTest {

    public ControlGuiPedidoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    /**
//     * Test of traerTodasLasTiendas method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodasLasTiendas() {
//        System.out.println("traerTodasLasTiendas");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Tienda> expResult = null;
//        Collection<Tienda> result = instance.traerTodasLasTiendas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCentros method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCentros() {
//        System.out.println("traerTodosLosCentros");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<CentroDistribucion> expResult = null;
//        Collection<CentroDistribucion> result = instance.traerTodosLosCentros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerNumeroDeOrden method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testObtenerNumeroDeOrden() {
//        System.out.println("obtenerNumeroDeOrden");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        int expResult = 0;
//        int result = instance.obtenerNumeroDeOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioActualCentro method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerInventarioActualCentro() {
//        System.out.println("traerInventarioActualCentro");
//        int codigoCentro = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.traerInventarioActualCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of InventarioToProducto method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testInventarioToProducto() {
//        System.out.println("InventarioToProducto");
//        Collection<Inventario> col = null;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.InventarioToProducto(col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosConductores method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosConductores() {
//        System.out.println("traerTodosLosConductores");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Empleado> expResult = null;
//        Collection<Empleado> result = instance.traerTodosLosConductores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCamiones method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCamiones() {
//        System.out.println("traerTodosLosCamiones");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Camion> expResult = null;
//        Collection<Camion> result = instance.traerTodosLosCamiones();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of registrarPedido method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testRegistrarPedido() {
//        System.out.println("registrarPedido");
//        int tiendaCodigo = 0;
//        int centroCodigo = 0;
//        int ciConductor = 0;
//        int placaCamion = 0;
//        Date FechaGen = null;
//        Date FechaEst = null;
//        ArrayList<Producto> productos = null;
//        int idSolicitud = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        instance.registrarPedido(tiendaCodigo, centroCodigo, ciConductor, placaCamion, FechaGen, FechaEst, productos, idSolicitud);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodasLasTiendas method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodasLasTiendas1() {
//        System.out.println("traerTodasLasTiendas");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Tienda> expResult = null;
//        Collection<Tienda> result = instance.traerTodasLasTiendas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCentros method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCentros1() {
//        System.out.println("traerTodosLosCentros");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<CentroDistribucion> expResult = null;
//        Collection<CentroDistribucion> result = instance.traerTodosLosCentros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerNumeroDeOrden method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testObtenerNumeroDeOrden1() {
//        System.out.println("obtenerNumeroDeOrden");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        int expResult = 0;
//        int result = instance.obtenerNumeroDeOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioActualCentro method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerInventarioActualCentro_int() {
//        System.out.println("traerInventarioActualCentro");
//        int codigoCentro = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.traerInventarioActualCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of InventarioToProducto method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testInventarioToProducto_Collection() {
//        System.out.println("InventarioToProducto");
//        Collection<Inventario> col = null;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.InventarioToProducto(col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosConductores method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosConductores1() {
//        System.out.println("traerTodosLosConductores");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Empleado> expResult = null;
//        Collection<Empleado> result = instance.traerTodosLosConductores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCamiones method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCamiones1() {
//        System.out.println("traerTodosLosCamiones");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Camion> expResult = null;
//        Collection<Camion> result = instance.traerTodosLosCamiones();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of registrarPedido method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testRegistrarPedido_8args() {
//        System.out.println("registrarPedido");
//        int tiendaCodigo = 0;
//        int centroCodigo = 0;
//        int ciConductor = 0;
//        int placaCamion = 0;
//        Date FechaGen = null;
//        Date FechaEst = null;
//        ArrayList<Producto> productos = null;
//        int idSolicitud = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        instance.registrarPedido(tiendaCodigo, centroCodigo, ciConductor, placaCamion, FechaGen, FechaEst, productos, idSolicitud);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodasLasTiendas method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodasLasTiendas2() {
//        System.out.println("traerTodasLasTiendas");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Tienda> expResult = null;
//        Collection<Tienda> result = instance.traerTodasLasTiendas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCentros method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCentros2() {
//        System.out.println("traerTodosLosCentros");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<CentroDistribucion> expResult = null;
//        Collection<CentroDistribucion> result = instance.traerTodosLosCentros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerNumeroDeOrden method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testObtenerNumeroDeOrden2() {
//        System.out.println("obtenerNumeroDeOrden");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        int expResult = 0;
//        int result = instance.obtenerNumeroDeOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioActualCentro method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerInventarioActualCentro_int_1args() {
//        System.out.println("traerInventarioActualCentro");
//        int codigoCentro = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.traerInventarioActualCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of InventarioToProducto method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testInventarioToProducto_Collection_1args() {
//        System.out.println("InventarioToProducto");
//        Collection<Inventario> col = null;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Producto> expResult = null;
//        Collection<Producto> result = instance.InventarioToProducto(col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosConductores method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosConductores2() {
//        System.out.println("traerTodosLosConductores");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Empleado> expResult = null;
//        Collection<Empleado> result = instance.traerTodosLosConductores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosCamiones method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testTraerTodosLosCamiones2() {
//        System.out.println("traerTodosLosCamiones");
//        ControlGuiPedido instance = new ControlGuiPedido();
//        Collection<Camion> expResult = null;
//        Collection<Camion> result = instance.traerTodosLosCamiones();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of registrarPedido method, of class ControlGuiPedido.
//     */
//    @Test
//    public void testRegistrarPedido_8args_1() {
//        System.out.println("registrarPedido");
//        int tiendaCodigo = 0;
//        int centroCodigo = 0;
//        int ciConductor = 0;
//        int placaCamion = 0;
//        Date FechaGen = null;
//        Date FechaEst = null;
//        ArrayList<Producto> productos = null;
//        int idSolicitud = 0;
//        ControlGuiPedido instance = new ControlGuiPedido();
//        instance.registrarPedido(tiendaCodigo, centroCodigo, ciConductor, placaCamion, FechaGen, FechaEst, productos, idSolicitud);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ActualizarInventarioCentro method, of class ControlGuiPedido.
//     */
    @Test
    public void testActualizarInventarioCentro() {
        System.out.println("ActualizarInventarioCentro");
        Inventario i1 = new Inventario();
        i1.setCantidad(10);
        i1.setProductoId(5);
        i1.setCentroDistribucionCodigo(1);
        Collection<Inventario> col = new Vector<Inventario>();
        col.add(i1);
        int operacion = 1;
        ControlGuiPedido instance = new ControlGuiPedido();
        boolean expResult = true;
        boolean result = instance.ActualizarInventarioCentro(col, operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}