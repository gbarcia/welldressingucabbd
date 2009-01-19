/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import java.io.IOException;
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
public class ControlInventarioTest {

    public ControlInventarioTest() {
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
//     * Test of traerInventarioTeoCentro method, of class ControlInventario.
//     */
//    @Test
//    public void testTraerInventarioTeoCentro() {
//        System.out.println("traerInventarioTeoCentro");
////        int codigoCentro = 0;
////        ControlInventario instance = new ControlInventario();
////        Collection<Inventario> expResult = null;
////        Collection<Inventario> result = instance.traerInventarioTeoCentro(codigoCentro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioCaminoCentro method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioCaminoCentro() {
////        System.out.println("traerInventarioCaminoCentro");
////        int codigoCentro = 0;
////        ControlInventario instance = new ControlInventario();
////        Collection<Item> expResult = null;
////        Collection<Item> result = instance.traerInventarioCaminoCentro(codigoCentro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioTeoTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioTeoTienda() {
////        System.out.println("traerInventarioTeoTienda");
////        Integer codigoTienda = null;
////        ControlInventario instance = new ControlInventario();
////        Collection<Inventario> expResult = null;
////        Collection<Inventario> result = instance.traerInventarioTeoTienda(codigoTienda);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioCaminoTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioCaminoTienda() {
////        System.out.println("traerInventarioCaminoTienda");
////        Integer codigoTienda = null;
////        ControlInventario instance = new ControlInventario();
////        Collection<Item> expResult = null;
////        Collection<Item> result = instance.traerInventarioCaminoTienda(codigoTienda);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of modificarInventarioTeoCentro method, of class ControlInventario.
////     */
////    @Test
////    public void testModificarInventarioTeoCentro() {
////        System.out.println("modificarInventarioTeoCentro");
////        Inventario inv = null;
////        ControlInventario instance = new ControlInventario();
////        boolean expResult = false;
////        boolean result = instance.modificarInventarioTeoCentro(inv);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of modificarInventarioTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testModificarInventarioTienda() {
////        System.out.println("modificarInventarioTienda");
////        Inventario inv = null;
////        ControlInventario instance = new ControlInventario();
////        boolean expResult = false;
////        boolean result = instance.modificarInventarioTienda(inv);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
    /**
     * Test of verificarSiExisteProductoYcantidad method, of class ControlInventario.
     */
    @Test
    public void testVerificarSiExisteProductoYcantidad() {
        System.out.println("verificarSiExisteProductoYcantidad");
        ControlInventario instance = null;
        Inventario inventario = new Inventario(1, 1, 50);
        try {
            instance = new ControlInventario();
        } catch (IOException ex) {
            Logger.getLogger(ControlInventarioTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer result = instance.verificarSiExisteProductoYcantidad(inventario);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
////
////    /**
////     * Test of traerInventarioTeoCentro method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioTeoCentro() {
////        System.out.println("traerInventarioTeoCentro");
////        int codigoCentro = 0;
////        ControlInventario instance = new ControlInventario();
////        Collection<Inventario> expResult = null;
////        Collection<Inventario> result = instance.traerInventarioTeoCentro(codigoCentro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioCaminoCentro method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioCaminoCentro() {
////        System.out.println("traerInventarioCaminoCentro");
////        int codigoCentro = 0;
////        ControlInventario instance = new ControlInventario();
////        Collection<Item> expResult = null;
////        Collection<Item> result = instance.traerInventarioCaminoCentro(codigoCentro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioTeoTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioTeoTienda() {
////        System.out.println("traerInventarioTeoTienda");
////        Integer codigoTienda = null;
////        ControlInventario instance = new ControlInventario();
////        Collection<Inventario> expResult = null;
////        Collection<Inventario> result = instance.traerInventarioTeoTienda(codigoTienda);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioCaminoTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testTraerInventarioCaminoTienda() {
////        System.out.println("traerInventarioCaminoTienda");
////        Integer codigoTienda = null;
////        ControlInventario instance = new ControlInventario();
////        Collection<Item> expResult = null;
////        Collection<Item> result = instance.traerInventarioCaminoTienda(codigoTienda);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of modificarInventarioTeoCentro method, of class ControlInventario.
////     */
////    @Test
////    public void testModificarInventarioTeoCentro() {
////        System.out.println("modificarInventarioTeoCentro");
////        Inventario inv = null;
////        ControlInventario instance = new ControlInventario();
////        boolean expResult = false;
////        boolean result = instance.modificarInventarioTeoCentro(inv);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of modificarInventarioTienda method, of class ControlInventario.
////     */
////    @Test
////    public void testModificarInventarioTienda() {
////        System.out.println("modificarInventarioTienda");
////        Inventario inv = null;
////        ControlInventario instance = new ControlInventario();
////        boolean expResult = false;
////        boolean result = instance.modificarInventarioTienda(inv);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of verificarSiExisteProductoYcantidad method, of class ControlInventario.
//     */
//    @Test
//    public void testVerificarSiExisteProductoYcantidad_Inventario() {
//        System.out.println("verificarSiExisteProductoYcantidad");
//        Inventario inv = new Inventario(1, 6, 0);
//        ControlInventario instance = null;
//        try {
//            instance = new ControlInventario();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlInventarioTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Integer result = instance.verificarSiExisteProductoYcantidad(inv);
//        System.out.println(result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioTeoCentro method, of class ControlInventario.
//     */
//    @Test
//    public void testTraerInventarioTeoCentro() {
//        System.out.println("traerInventarioTeoCentro");
//        int codigoCentro = 0;
//        ControlInventario instance = new ControlInventario();
//        Collection<Inventario> expResult = null;
//        Collection<Inventario> result = instance.traerInventarioTeoCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioCaminoCentro method, of class ControlInventario.
//     */
//    @Test
//    public void testTraerInventarioCaminoCentro() {
//        System.out.println("traerInventarioCaminoCentro");
//        int codigoCentro = 0;
//        ControlInventario instance = new ControlInventario();
//        Collection<Item> expResult = null;
//        Collection<Item> result = instance.traerInventarioCaminoCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioTeoTienda method, of class ControlInventario.
//     */
//    @Test
//    public void testTraerInventarioTeoTienda() {
//        System.out.println("traerInventarioTeoTienda");
//        Integer codigoTienda = null;
//        ControlInventario instance = new ControlInventario();
//        Collection<Inventario> expResult = null;
//        Collection<Inventario> result = instance.traerInventarioTeoTienda(codigoTienda);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioCaminoTienda method, of class ControlInventario.
//     */
//    @Test
//    public void testTraerInventarioCaminoTienda() {
//        System.out.println("traerInventarioCaminoTienda");
//        Integer codigoTienda = null;
//        ControlInventario instance = new ControlInventario();
//        Collection<Item> expResult = null;
//        Collection<Item> result = instance.traerInventarioCaminoTienda(codigoTienda);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarInventarioTeoCentro method, of class ControlInventario.
//     */
//    @Test
//    public void testModificarInventarioTeoCentro() {
//        System.out.println("modificarInventarioTeoCentro");
//        Inventario inv = null;
//        ControlInventario instance = new ControlInventario();
//        boolean expResult = false;
//        boolean result = instance.modificarInventarioTeoCentro(inv);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarInventarioTienda method, of class ControlInventario.
//     */
//    @Test
//    public void testModificarInventarioTienda() {
//        System.out.println("modificarInventarioTienda");
//        Inventario inv = null;
//        ControlInventario instance = new ControlInventario();
//        boolean expResult = false;
//        boolean result = instance.modificarInventarioTienda(inv);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of verificarSiExisteProductoYcantidad method, of class ControlInventario.
//     */
//    @Test
//    public void testVerificarSiExisteProductoYcantidad() {
//        System.out.println("verificarSiExisteProductoYcantidad");
//        Inventario inv = null;
//        ControlInventario instance = new ControlInventario();
//        Integer expResult = null;
//        Integer result = instance.verificarSiExisteProductoYcantidad(inv);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of agregarRegistroInventario method, of class ControlInventario.
     */
//    @Test
//    public void testAgregarRegistroInventario() {
//        System.out.println("agregarRegistroInventario");
//        Inventario inv = new Inventario(1, 5, 100);
//        ControlInventario instance = null;
//        try {
//            instance = new ControlInventario();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlInventarioTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.agregarRegistroInventario(inv);
//        assertEquals(expResult, result);
////         TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of borrarRegistroInventario method, of class ControlInventario.
     */
//    @Test
//    public void testBorrarRegistroInventario() {
//        System.out.println("borrarRegistroInventario");
//        Inventario inv = new Inventario(1, 5, 100);
//        ControlInventario instance = null;
//        try {
//            instance = new ControlInventario();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlInventarioTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.borrarRegistroInventario(inv);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

}