/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.Collection;
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
//    @Test
//    public void testAgregarEmpleado() {
//        System.out.println("agregarEmpleado");
//        Empleado emp = null;
//        Date a = new Date(0);
//        Date fe =new Date(1000);
//        emp = new Empleado(12345, "JOHN", "OLIVIERI",a, "22222", 0, "M", 0, "DIR", 0, 2, "L", fe, null, 1, "a");
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.agregarEmpleado(emp);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testAgregarEmpleadoTienda() {
//        System.out.println("agregarEmpleadoTienda");
//        Empleado emp = null;
//        ControlEmpleado instance = new ControlEmpleado();
//        boolean expResult = false;
//        boolean result = instance.agregarEmpleadoTienda(emp);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of editarEmpleadoTienda method, of class ControlEmpleado.
     */
    @Test
    public void testEditarEmpleadoTienda() {
        System.out.println("editarEmpleadoTienda");
        Date a = new Date(0);
        Empleado emp = new Empleado(123, "mary", "barcia", a, "telf", 0, "M", 0, "dir", 0, 2, "cv", a,null, 1, "pepa");
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.editarEmpleadoTienda(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEmpleado method, of class ControlEmpleado.
     */
   @Test
    public void testConsultarEmpleado() {
        System.out.println("consultarEmpleado");
        Integer cedula = 123;
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Empleado result = instance.consultarEmpleado(cedula);
        assertNotNull(result);
        System.out.println(result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**
//     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
//     */
    @Test
    public void testTraerTodosLosEmpleados() {
        System.out.println("traerTodosLosEmpleados");
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collection<Empleado> result = instance.traerTodosLosEmpleados();
        assertNotNull(result);
        for (Empleado empleado : result) {
            System.out.println(empleado.getNombre());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of traerTodosLosEmpleadosTienda method, of class ControlEmpleado.
//     */
    @Test
    public void testTraerTodosLosEmpleadosTienda() {
        System.out.println("traerTodosLosEmpleadosTienda");
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collection<Empleado> result = instance.traerTodosLosEmpleadosTienda();
        assertNotNull(result);
        for (Empleado empleado : result) {
            System.out.println(empleado.getCedula());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of consultarHistorialEmpleado method, of class ControlEmpleado.
//     */
    @Test
    public void testConsultarHistorialEmpleado() {
        System.out.println("consultarHistorialEmpleado");
        Integer cedula = 123;
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleado(cedula);
        assertNotNull(result);
        for (HistorialEmpleado historialEmpleado : result) {
            System.out.println(historialEmpleado.getNombreEmpleado());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}