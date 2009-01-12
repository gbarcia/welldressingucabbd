/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Producto;
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
 * @author Johnny
 */
public class ControlProductoTest2 {

    public ControlProductoTest2() {
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
     * Test of agregarProductoDepartamento method, of class ControlProducto.
     */
    @Test
    public void testAgregarProductoDepartamento() {
        try {
            System.out.println("agregarProductoDeparatamento");
            Producto producto = new Producto(1, 1);
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.agregarProductoDepartamento(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of eliminarProductoDepartamento method, of class ControlProducto.
     */
    @Test
    public void testEliminarProductoDepartamento() {
        try {
            System.out.println("eliminarProductoDepartamento");
            Producto producto = new Producto(1, 1);
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.eliminarProductoDepartamento(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of consultarProductosDepartamento method, of class ControlProducto.
     */
    @Test
    public void testConsultarProductosDepartamento() {
        try {
            System.out.println("consultarProductosDepartamento");
            ControlProducto instance = new ControlProducto();
//        Collection<Producto> expResult = null;
            Collection<Producto> result = instance.consultarProductoDepartamento();
            for (Producto producto : result) {
                System.out.println(producto.getId() + " " + producto.getDepartamentoId());
            }
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}