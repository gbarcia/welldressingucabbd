/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.OrdenCompra;
import java.io.IOException;
import java.sql.Date;
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
     */
    @Test
    public void testAgregarOrden() {
        System.out.println("agregarOrden");
        Date a = new Date(00000000);
        OrdenCompra orden = new OrdenCompra(1, "J-759-645-1", "", null, a,a , 0);
        System.out.println(orden.getFechaEstimada());
        ControlOrdenCompra instance = null;
        try {
            instance = new ControlOrdenCompra();
        } catch (IOException ex) {
            Logger.getLogger(ControlOrdenCompraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.agregarOrden(orden);
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

}