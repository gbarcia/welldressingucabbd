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
    @Test
    public void testAgregarCentroDistribucion() throws IOException {
        System.out.println("agregarCentroDistribucion");
        CentroDistribucion centro = new CentroDistribucion(0,"dianas center","04160104011","calle guetto",4);
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        boolean expResult = true;
        boolean result = instance.agregarCentroDistribucion(centro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCentroDistribucion method, of class ControlCentroDistribucion.
     */
    /*@Test
    public void testAgregarCentroDistribucion_CentroDistribucion() {
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
    @Test
    public void testTraerTodosLosCentros() throws IOException {
        System.out.println("traerTodosLosCentros");
        ControlCentroDistribucion instance = new ControlCentroDistribucion();
        Collection<CentroDistribucion> result = instance.traerTodosLosCentros();
        assertNotNull(result);

        for (CentroDistribucion centroDistribucion : result) {
            System.out.println("nombre"+centroDistribucion.getNombre());

        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}