/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import java.io.IOException;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabylis
 */
public class ControlCentroDistribucionTest {

    public ControlCentroDistribucionTest() {
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
     * Test of agregarCentroDistribucion method, of class ControlCentroDistribucion.
     */
    /*@Test
    public void testAgregarCentroDistribucion() throws IOException {
        System.out.println("agregarCentroDistribucion");
        CentroDistribucion centro = null;
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        boolean expResult = false;
        boolean result = instance.agregarCentroDistribucion(centro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of traerTodosLosCentros method, of class ControlCentroDistribucion.
     */
    /*@Test
    public void testTraerTodosLosCentros() throws IOException {
        System.out.println("traerTodosLosCentros");
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        Collection<CentroDistribucion> expResult = null;
        Collection<CentroDistribucion> result = instance.traerTodosLosCentros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of eliminarCentro method, of class ControlCentroDistribucion.
     */
    @Test
    public void testEliminarCentro() throws IOException {
        System.out.println("eliminarCentro");
        CentroDistribucion centro = new CentroDistribucion(3,"pepe","telefono","direccion",1);
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        int expResult = 1;
        int result = instance.eliminarCentro(centro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCentro method, of class ControlCentroDistribucion.
     */
    @Test
    public void testModificarCentro() throws IOException {
        System.out.println("modificarCentro");
        CentroDistribucion centro = new CentroDistribucion(2,"nomb","tlf","dir",2);
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        boolean expResult = true;
        boolean result = instance.modificarCentro(centro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}