/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Proveedor;
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
    @Test
    public void testAgregarProveedor() {
        try {
            System.out.println("agregarProveedor");
            Proveedor proveedor = null;
            Integer n = new Integer (2);
            proveedor = new Proveedor("J-546", "PROVEMED", "0212", "DIR", n, "GERARDO", "barcia");
            ControlProveedor instance = new ControlProveedor();
            boolean expResult = true;
            boolean result = instance.agregarProveedor(proveedor);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(ControlProveedorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}