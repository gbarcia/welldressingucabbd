/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;


import java.io.IOException;
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
public class ControlItemTest {

    public ControlItemTest() {
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
     * Test of agregarItem method, of class ControlItem.
     */
//    @Test
//    public void testAgregarItem() {
//        System.out.println("agregarItem");
//        Item i = new Item(2, 10, 5, 50);
//        ControlItem instance = null;
//        try {
//            instance = new ControlItem();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.agregarItem(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarItem method, of class ControlItem.
////     */
//////    @Test
//////    public void testAgregarItem_Item() {
//////        System.out.println("agregarItem");
//////        Item i = null;
//////        ControlItem instance = new ControlItem();
//////        boolean expResult = false;
//////        boolean result = instance.agregarItem(i);
//////        assertEquals(expResult, result);
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of actualizatItem method, of class ControlItem.
//////     */
////    @Test
////    public void testActualizatItem() {
////        System.out.println("actualizatItem");
////        Item i = new Item(2, 10, 5, 1);
////        ControlItem instance = null;
////        try {
////            instance = new ControlItem();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        boolean expResult = true;
////        boolean result = instance.actualizatItem(i);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
//////
//////    /**
//////     * Test of agregarItem method, of class ControlItem.
//////     */
//////    @Test
//////    public void testAgregarItem() {
//////        System.out.println("agregarItem");
//////        Item i = null;
//////        ControlItem instance = new ControlItem();
//////        boolean expResult = false;
//////        boolean result = instance.agregarItem(i);
//////        assertEquals(expResult, result);
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of actualizatItem method, of class ControlItem.
//////     */
//////    @Test
//////    public void testActualizatItem_Item() {
//////        System.out.println("actualizatItem");
//////        Item i = null;
//////        ControlItem instance = new ControlItem();
//////        boolean expResult = false;
//////        boolean result = instance.actualizatItem(i);
//////        assertEquals(expResult, result);
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
////
////    /**
////     * Test of traerTodosItems method, of class ControlItem.
////     */
////    @Test
////    public void testTraerTodosItems() {
////        System.out.println("traerTodosItems");
////        Integer idSolicitud = 10;
////        ControlItem instance = null;
////        try {
////            instance = new ControlItem();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        Collection<Item> result = instance.traerTodosItems(idSolicitud);
////        assertNotNull(result);
////        for (Item item : result) {
////            System.out.println(item.getIdProducto());
////        }
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of agregarItem method, of class ControlItem.
////     */
////    @Test
////    public void testAgregarItem_Item() {
////        System.out.println("agregarItem");
////        Item i = null;
////        ControlItem instance = new ControlItem();
////        boolean expResult = false;
////        boolean result = instance.agregarItem(i);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of actualizatItem method, of class ControlItem.
////     */
////    @Test
////    public void testActualizatItem_Item() {
////        System.out.println("actualizatItem");
////        Item i = null;
////        ControlItem instance = new ControlItem();
////        boolean expResult = false;
////        boolean result = instance.actualizatItem(i);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerTodosItems method, of class ControlItem.
////     */
////    @Test
////    public void testTraerTodosItems_Integer() {
////        System.out.println("traerTodosItems");
////        Integer idSolicitud = null;
////        ControlItem instance = new ControlItem();
////        Collection<Item> expResult = null;
////        Collection<Item> result = instance.traerTodosItems(idSolicitud);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of buscarItem method, of class ControlItem.
////     */
//    @Test
//    public void testBuscarItem() {
//        System.out.println("buscarItem");
//        Integer idSolicitud = 10;
//        Integer idProducto = 2;
//        ControlItem instance = null;
//        try {
//            instance = new ControlItem();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Item result = instance.buscarItem(idSolicitud, idProducto);
//        assertNotNull(result);
//        System.out.println(result.getCantidad());
//        System.out.println("r:" + result.getCosto());
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarItem method, of class ControlItem.
//     */
//    @Test
//    public void testAgregarItem() {
//        System.out.println("agregarItem");
//        Item i = null;
//        ControlItem instance = new ControlItem();
//        boolean expResult = false;
//        boolean result = instance.agregarItem(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizatItem method, of class ControlItem.
//     */
//    @Test
//    public void testActualizatItem() {
//        System.out.println("actualizatItem");
//        Item i = null;
//        ControlItem instance = new ControlItem();
//        boolean expResult = false;
//        boolean result = instance.actualizatItem(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosItems method, of class ControlItem.
//     */
//    @Test
//    public void testTraerTodosItems() {
//        System.out.println("traerTodosItems");
//        Integer idSolicitud = null;
//        ControlItem instance = new ControlItem();
//        Collection<Item> expResult = null;
//        Collection<Item> result = instance.traerTodosItems(idSolicitud);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarItem method, of class ControlItem.
//     */
//    @Test
//    public void testBuscarItem_Integer_Integer() {
//        System.out.println("buscarItem");
//        Integer idSolicitud = null;
//        Integer idProducto = null;
//        ControlItem instance = new ControlItem();
//        Item expResult = null;
//        Item result = instance.buscarItem(idSolicitud, idProducto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of borrarItem method, of class ControlItem.
     */
//    @Test
//    public void testBorrarItem() {
//        System.out.println("borrarItem");
//        Item i = new Item(4, 9, 0, 0);
//        ControlItem instance = null;
//        try {
//            instance = new ControlItem();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.borrarItem(i);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       //fail("The test case is a prototype.");
//    }

    /**
     * Test of borrarTodosItem method, of class ControlItem.
     */
    @Test
    public void testBorrarTodosItem() {
        System.out.println("borrarTodosItem");
        Integer idSolicitud = 7;
        ControlItem instance = null;
        try {
            instance = new ControlItem();
        } catch (IOException ex) {
            Logger.getLogger(ControlItemTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.borrarTodosItem(idSolicitud);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}