/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.CentroDistribucion;
import java.io.IOException;
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

}