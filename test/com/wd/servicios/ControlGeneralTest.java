/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Horario;
import com.wd.dominio.Tienda;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerardo Barcia
 */
public class ControlGeneralTest {

    public ControlGeneralTest() {
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
     * Test of getInstance method, of class ControlGeneral.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ControlGeneral result = ControlGeneral.getInstance();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class ControlGeneral.
     */
    @Test
    public void testGetInstance1() {
        System.out.println("getInstance");
        ControlGeneral expResult = null;
        ControlGeneral result = ControlGeneral.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarNuevoHorario method, of class ControlGeneral.
     */
    @Test
    public void testAgregarNuevoHorario() {
        System.out.println("agregarNuevoHorario");
        Horario horario = null;
        ControlGeneral instance = null;
        boolean expResult = false;
        boolean result = instance.agregarNuevoHorario(horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosHorarios method, of class ControlGeneral.
     */
    @Test
    public void testTraerTodosLosHorarios() {
        System.out.println("traerTodosLosHorarios");
        ControlGeneral instance = null;
        Collection expResult = null;
        Collection result = instance.traerTodosLosHorarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarNuevaTienda method, of class ControlGeneral.
     */
    @Test
    public void testAgregarNuevaTienda() {
        System.out.println("agregarNuevaTienda");
        Tienda tienda = null;
        ControlGeneral instance = null;
        boolean expResult = false;
        boolean result = instance.agregarNuevaTienda(tienda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}