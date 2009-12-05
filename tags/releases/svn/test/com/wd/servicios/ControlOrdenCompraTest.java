/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import java.sql.Date;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ControlOrdenCompraTest {

    public ControlOrdenCompraTest() {
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

    /**
     * Test of agregarOrden method, of class ControlOrdenCompra.
//     */
////    @Test
////    public void testAgregarOrden() {
////        System.out.println("agregarOrden");
////        Date a = new Date(00000000);
////        OrdenCompra orden = new OrdenCompra(1, "J-759-645-1", "", null, a,a , 0);
////        System.out.println(orden.getFechaEstimada());
////        ControlOrdenCompra instance = null;
////        try {
////            instance = new ControlOrdenCompra();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        boolean expResult = true;
////        boolean result = instance.agregarOrden(orden);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of agregarOrden method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testAgregarOrden_OrdenCompra() {
////        System.out.println("agregarOrden");
////        Item i = new Item(3, 11, 20, 5);
////        Date a = new Date(00000000);
////        OrdenCompra orden = new OrdenCompra(1, "J-759-645-1", "", null, a,a , 0);
////        orden.agregarItem(3, 0, 20, 5);
////        ControlOrdenCompra instance = null;
////        try {
////            instance = new ControlOrdenCompra();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        boolean expResult = true;
////        boolean result = instance.agregarOrden(orden);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
//
//    /**
////     * Test of agregarOrden method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testAgregarOrden() {
////        System.out.println("agregarOrden");
////        OrdenCompra orden = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.agregarOrden(orden);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of obtenerSiguienteNumeroOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testObtenerSiguienteNumeroOrden() {
//        System.out.println("obtenerSiguienteNumeroOrden");
//        ControlOrdenCompra instance = null;
//        try {
//            instance = new ControlOrdenCompra();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        int expResult = 0;
//        int result = instance.obtenerSiguienteNumeroOrden();
//        System.out.println(result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testAgregarOrden() {
//        System.out.println("agregarOrden");
//        OrdenCompra orden = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.agregarOrden(orden);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
////
////    /**
////     * Test of obtenerSiguienteNumeroOrden method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testObtenerSiguienteNumeroOrden1() {
////        System.out.println("obtenerSiguienteNumeroOrden");
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        int expResult = 0;
////        int result = instance.obtenerSiguienteNumeroOrden();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of traerTodasLasOrdenesDeCompra method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testTraerTodasLasOrdenesDeCompra() {
//        System.out.println("traerTodasLasOrdenesDeCompra");
//        ControlOrdenCompra instance = null;
//        try {
//            instance = new ControlOrdenCompra();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collection<OrdenCompra> result = instance.traerTodasLasOrdenesDeCompra();
//        assertNotNull(result);
//        for (OrdenCompra ordenCompra : result) {
//            System.out.println(ordenCompra.getId());
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testAgregarOrden() {
//        System.out.println("agregarOrden");
//        OrdenCompra orden = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.agregarOrden(orden);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerSiguienteNumeroOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testObtenerSiguienteNumeroOrden() {
//        System.out.println("obtenerSiguienteNumeroOrden");
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        int expResult = 0;
//        int result = instance.obtenerSiguienteNumeroOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodasLasOrdenesDeCompra method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testTraerTodasLasOrdenesDeCompra1() {
////        System.out.println("traerTodasLasOrdenesDeCompra");
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        Collection<OrdenCompra> expResult = null;
////        Collection<OrdenCompra> result = instance.traerTodasLasOrdenesDeCompra();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
    /**
     * Test of buscarOrdenCompra method, of class ControlOrdenCompra.
     */
//    @Test
//    public void testBuscarOrdenCompra() {
//        System.out.println("buscarOrdenCompra");
//        int numeroOrden = 11;
//        ControlOrdenCompra instance = null;
//        try {
//            instance = new ControlOrdenCompra();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        OrdenCompra result = instance.buscarOrdenCompra(numeroOrden);
//        assertNotNull(result);
//        for (Item i : result.getColeccionProductos()) {
//            System.out.println(i.getIdProducto());
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testAgregarOrden() {
//        System.out.println("agregarOrden");
//        OrdenCompra orden = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.agregarOrden(orden);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerSiguienteNumeroOrden method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testObtenerSiguienteNumeroOrden() {
//        System.out.println("obtenerSiguienteNumeroOrden");
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        int expResult = 0;
//        int result = instance.obtenerSiguienteNumeroOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodasLasOrdenesDeCompra method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testTraerTodasLasOrdenesDeCompra() {
//        System.out.println("traerTodasLasOrdenesDeCompra");
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        Collection<OrdenCompra> expResult = null;
//        Collection<OrdenCompra> result = instance.traerTodasLasOrdenesDeCompra();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarOrdenCompra method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testBuscarOrdenCompra_int() {
//        System.out.println("buscarOrdenCompra");
//        int numeroOrden = 0;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        OrdenCompra expResult = null;
//        OrdenCompra result = instance.buscarOrdenCompra(numeroOrden);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cambiarEstadoOrdenCompra method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testCambiarEstadoOrdenCompra() {
//        System.out.println("cambiarEstadoOrdenCompra");
//        OrdenCompra oc = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.cambiarEstadoOrdenCompra(oc);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of actualizarOrdenCompra method, of class ControlOrdenCompra.
     */
    @Test
    public void testActualizarOrdenCompra() {
        System.out.println("actualizarOrdenCompra");
        ControlOrdenCompra instance = null;
        OrdenCompra orden = null;
        try {
            instance = new ControlOrdenCompra();
             orden = instance.buscarOrdenCompra(7);
             Collection<Item> cole = orden.getColeccionProductos();
             for (Item item : cole) {
                item.setCantidad(item.getCantidad() + 100);
            }
             orden.setStatus(2);
             orden.setColeccionProductos(cole);
        } catch (IOException ex) {
            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.actualizarOrdenCompra(orden);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of actualizarInventario method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testActualizarInventario() {
//        System.out.println("actualizarInventario");
//        Object aAct = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.actualizarInventario(aAct);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerCantidadProductoActual method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testObtenerCantidadProductoActual() {
//        System.out.println("obtenerCantidadProductoActual");
//        Inventario i = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        Integer expResult = null;
//        Integer result = instance.obtenerCantidadProductoActual(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarObjetoInventario method, of class ControlOrdenCompra.
//     */
//    @Test
//    public void testAgregarObjetoInventario() {
//        System.out.println("agregarObjetoInventario");
//        Inventario inv = null;
//        ControlOrdenCompra instance = new ControlOrdenCompra();
//        boolean expResult = false;
//        boolean result = instance.agregarObjetoInventario(inv);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarInventario method, of class ControlOrdenCompra.
//     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of actualizarInventario method, of class ControlOrdenCompra.
//     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
//////    /**
////     * Test of actualizarInventario method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
//////    /**
////     * Test of actualizarInventario method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
////    /**
////     * Test of actualizarInventario method, of class ControlOrdenCompra.
////     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlOrdenCompra instance = new ControlOrdenCompra();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}