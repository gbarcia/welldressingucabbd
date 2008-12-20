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
public class ControlProductoTest {

    public ControlProductoTest() {
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
     * Test of agregarProducto method, of class ControlProducto.
     */
    @Test
    public void testAgregarProducto() {
        try {
            System.out.println("agregarProducto");
            Producto producto = new Producto(0, "PRUEBA", "DESCRIPCION PRUEBA");
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.agregarProducto(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of modificarProducto method, of class ControlProducto.
     */
    @Test
    public void testModificarProducto() {
        try {
            System.out.println("modificarProducto");
            Producto producto = new Producto(6, "PRUEBA MODIFICAR", "DESCRIPCION " +
                    "PRUEBA MODIFICAR");
            ControlProducto instance = new ControlProducto();
            boolean expResult = true;
            boolean result = instance.modificarProducto(producto);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of eliminarProducto method, of class ControlProducto.
     */
//    @Test
//    public void testEliminarProducto() {
//        try {
//            System.out.println("eliminarProducto");
//            int id = 6;
//            ControlProducto instance = new ControlProducto();
//            boolean expResult = true;
//            boolean result = instance.eliminarProducto(id);
//            assertEquals(expResult, result);
//            // TODO review the generated test code and remove the default call to fail.
////            fail("The test case is a prototype.");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    /**
     * Test of consultarProductos method, of class ControlProducto.
     */
    @Test
    public void testConsultarProductos() {
        try {
            System.out.println("consultarProductos");
            ControlProducto instance = new ControlProducto();
//            Collection<Producto> expResult = null;
            Collection<Producto> result = instance.consultarProductos();
            for (Producto producto : result) {
                System.out.println(producto.getId() + " " +
                        producto.getNombre() + " " +
                        producto.getDescripcion() + " ");
            }
//            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}