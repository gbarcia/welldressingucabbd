/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Empleado;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class ControlEmpleadoTest {

    public ControlEmpleadoTest() {
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
     * Test of agregarEmpleado method, of class ControlEmpleado.
     */
    @Test
    public void testAgregarEmpleado() {
        System.out.println("agregarEmpleado");
        Empleado emp = null;
        Date a = new Date(0);
        Date fe =new Date(1000);
        emp = new Empleado(1234, "JOHN", "OLIVIERI",a, "22222", 0, "M", 0, "DIR", 0, 2, "L", fe, null, "1", "a");
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.agregarEmpleado(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}