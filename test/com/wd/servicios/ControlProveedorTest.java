/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Proveedor;
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
 * @author gerardo
 */
public class ControlProveedorTest {

    public ControlProveedorTest() {
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
     * Test of agregarProveedor method, of class ControlProveedor.
     */
//    @Test
//    public void testAgregarProveedor() {
//        try {
//            System.out.println("agregarProveedor");
//            Proveedor proveedor = null;
//            Integer n = new Integer (2);
//            proveedor = new Proveedor("J-546", "PROVEMED", "0212", "DIR", n, "GERARDO", "barcia");
//            ControlProveedor instance = new ControlProveedor();
//            boolean expResult = true;
//            boolean result = instance.agregarProveedor(proveedor);
//            assertEquals(expResult, result);
//            // TODO review the generated test code and remove the default call to fail.
//            //fail("The test case is a prototype.");
//        } catch (IOException ex) {
//            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of agregarProveedor method, of class ControlProveedor.
     */
//    @Test
//    public void testAgregarProveedor_Proveedor() {
//        System.out.println("agregarProveedor");
//        Proveedor proveedor = null;
//        ControlProveedor instance = new ControlProveedor();
//        boolean expResult = false;
//        boolean result = instance.agregarProveedor(proveedor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of editarProveedor method, of class ControlProveedor.
     */
//    @Test
//    public void testEditarProveedor() {
//        System.out.println("editarProveedor");
//        Proveedor proveedor = new Proveedor("J-1","POR", "TELF", "DIR", 2, "GER", "BAR");
//        ControlProveedor instance = null;
//        try {
//            instance = new ControlProveedor();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.editarProveedor(proveedor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarProveedor method, of class ControlProveedor.
//     */
//    @Test
//    public void testConsultarProveedor() {
//        System.out.println("consultarProveedor");
//        String rif = "J-1";
//        ControlProveedor instance = null;
//        try {
//            instance = new ControlProveedor();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Proveedor result = instance.consultarProveedor(rif);
//        assertNotNull(result);
//        System.out.println(result.getRif());
//        System.out.println(result.getNombre());
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of todosLosProveedores method, of class ControlProveedor.
//     */
    @Test
    public void testTodosLosProveedores() {
        System.out.println("todosLosProveedores");
        ControlProveedor instance = null;
        try {
            instance = new ControlProveedor();
        } catch (IOException ex) {
            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collection<Proveedor> result = instance.todosLosProveedores();
        System.out.println("sizw"+result.size());
        assertNotNull(result);
        for (Proveedor proveedor : result) {
            System.out.println(proveedor.getNombre());
        }
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of agregarProveedor method, of class ControlProveedor.
//     */
//    @Test
////    public void testAgregarProveedor() {
////        System.out.println("agregarProveedor");
//        Proveedor proveedor = null;
//        ControlProveedor instance = new ControlProveedor();
//        boolean expResult = false;
//        boolean result = instance.agregarProveedor(proveedor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editarProveedor method, of class ControlProveedor.
//     */
//    @Test
//    public void testEditarProveedor_Proveedor() {
//        System.out.println("editarProveedor");
//        Proveedor proveedor = null;
//        ControlProveedor instance = new ControlProveedor();
//        boolean expResult = false;
//        boolean result = instance.editarProveedor(proveedor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarProveedor method, of class ControlProveedor.
//     */
//    @Test
//    public void testConsultarProveedor_String() {
//        System.out.println("consultarProveedor");
//        String rif = "";
//        ControlProveedor instance = new ControlProveedor();
//        Proveedor expResult = null;
//        Proveedor result = instance.consultarProveedor(rif);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of todosLosProveedores method, of class ControlProveedor.
//     */
//    @Test
//    public void testTodosLosProveedores1() {
//        System.out.println("todosLosProveedores");
//        ControlProveedor instance = new ControlProveedor();
//        Collection<Proveedor> expResult = null;
//        Collection<Proveedor> result = instance.todosLosProveedores();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of eliminarProveedor method, of class ControlProveedor.
//     */
//    @Test
//    public void testEliminarProveedor() {
//        System.out.println("eliminarProveedor");
//        String rif = "J-745-645-3";
//        ControlProveedor instance = null;
//        try {
//            instance = new ControlProveedor();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.eliminarProveedor(rif);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

}