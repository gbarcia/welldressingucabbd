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
import java.sql.Date;

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
     * Test of consultaProductoProveedor method, of class ControlProducto.
     */
    @Test
    public void testConsultaProductoProveedor() {
        try {
            System.out.println("consultaProductoProveedor");
            Producto producto = new Producto(1, "J-759-645-1");
            ControlProducto instance = new ControlProducto();
            Collection<Producto> result = instance.consultaProductoProveedor(producto);
            for (Producto p : result) {
                System.out.println(p.getId() + " " + p.getEmpresaServicioRif() + " " + p.getPrecio() + " " + p.getFecha_creacion() + " " + p.getFecha_ultima_modificacion());
            }
        } catch (IOException ex) {
            Logger.getLogger(ControlProductoTest2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of agregarProductoProveedor method, of class ControlProducto.
     */
    @Test
    public void testAgregarProductoProveedor() {
        try {
            System.out.println("agregarProductoProveedor");
            Date f = new Date(2000, 10, 10);
            Date f1 = new Date(2001, 10, 10);
            Producto producto = new Producto(2, 100, f, f1, "J-759-645-1");
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.agregarProductoProveedor(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    /**
     * Test of modificarProductoProveedor method, of class ControlProducto.
     */
    @Test
    public void testModificarProductoProveedor() {
        try {
            System.out.println("modificarProductoProveedor");
            Producto producto = new Producto(2, 10000000, new Date(2000, 01, 01), new Date(2009, 10, 10), "J-759-645-1");
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.modificarProductoProveedor(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    /**
     * Test of eliminarProductoProveedor method, of class ControlProducto.
     */
    @Test
    public void testEliminarProductoProveedor() {
        try {
            System.out.println("eliminarProductoProveedor");
            Producto producto = new Producto(2, "J-759-645-1");
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.eliminarProductoProveedor(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

}