/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import java.io.IOException;
import java.util.Collection;
import java.sql.Date;
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
public class ControlEmpleadoTest2 {

    public ControlEmpleadoTest2() {
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
     * Test of agregarEmpleadoCentro method, of class ControlEmpleado.
     */
    @Test
    public void testAgregarEmpleadoCentro() {
        try {
            System.out.println("agregarEmpleadoCentro");
            Date fecha = new Date(2000, 01, 01);
            Empleado emp = new Empleado(1, "NOMBRE PRUEBA", "APELLIDO PRUEBA", fecha,
                    "999000000", 0, "M", 0, "DIRECCION", 1, 4);
            ControlEmpleado instance = new ControlEmpleado();
            boolean expResult = true;
            boolean result = instance.agregarEmpleadoCentro(emp);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("agregarEmpleadoCentro Error");
        }
    }

    /**
     * Test of editarEmpleado method, of class ControlEmpleado.
     */
    @Test
    public void testEditarEmpleado() {
        try {
            System.out.println("editarEmpleado");
            Date fecha = new Date(2000, 01, 01);
            Empleado emp = new Empleado(1, "NOMBRE PRUEBA 2", "APELLIDO PRUEBA 2", fecha, "999000000", 0, "M", 0, "DIRECCION 2", 1, 4);
            ControlEmpleado instance = new ControlEmpleado();
            boolean expResult = true;
            boolean result = instance.editarEmpleado(emp);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("editarEmpleado Error");
        }
    }

    /**
     * Test of consultarEmpleadoCentro method, of class ControlEmpleado.
     */
    @Test
    public void testConsultarEmpleadoCentro() {
        try {
            System.out.println("consultarEmpleadoCentro");
            Integer cedula = 14673456;
            ControlEmpleado instance = new ControlEmpleado();
            Empleado result = instance.consultarEmpleadoCentro(cedula);
            System.out.println(result.getNombre() + " " + result.getApellido());
            System.out.println("");
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("consultarEmpleadoCentro Error");
        }
    }

    /**
     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
     */
    @Test
    public void testTraerTodosLosEmpleados() {
        try {
            System.out.println("traerTodosLosEmpleados");
            ControlEmpleado instance = new ControlEmpleado();
//        Collection<Empleado> expResult = null;
            Collection<Empleado> result = instance.traerTodosLosEmpleados();
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
            for (Empleado empleado : result) {
                System.out.println(empleado.getNombre() + " " + empleado.getApellido());
            }
        } catch (IOException ex) {
            System.out.println("traerTodosLosEmpleados Error");
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleadosCentro method, of class ControlEmpleado.
     */
    @Test
    public void testTraerTodosLosEmpleadosCentro_0args() {
        try {
            System.out.println("traerTodosLosEmpleadosCentro");
            ControlEmpleado instance = new ControlEmpleado();
//        Collection<Empleado> expResult = null;
            Collection<Empleado> result = instance.traerTodosLosEmpleadosCentro();
            for (Empleado empleado : result) {
                System.out.println(empleado.getNombre() + " " + empleado.getApellido());
            }
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("traerTodosLosEmpleadosCentro Error");
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleadosCentro method, of class ControlEmpleado.
     */
    @Test
    public void testTraerTodosLosEmpleadosCentro_Integer() {
        try {
            System.out.println("traerTodosLosEmpleadosCentro");
            Integer codigo = 1;
            ControlEmpleado instance = new ControlEmpleado();
//        Collection<Empleado> expResult = null;
            Collection<Empleado> result = instance.traerTodosLosEmpleadosCentro(codigo);
            for (Empleado empleado : result) {
                System.out.println(empleado.getNombre() + " " + empleado.getApellido());
            }
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("traerTodosLosEmpleadosCentro Error");
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarHistorialEmpleadoCentro method, of class ControlEmpleado.
     */
    @Test
    public void testConsultarHistorialEmpleadoCentro() {
        try {
            System.out.println("consultarHistorialEmpleadoCentro");
            Integer cedula = 14673456;
            ControlEmpleado instance = new ControlEmpleado();
//            Collection<HistorialEmpleado> expResult = null;
            Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleadoCentro(cedula);
            System.out.println("");
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    /**
     * Test of actualizarHistorialEmpleadoCentro method, of class ControlEmpleado.
     */
    @Test
    public void testActualizarHistorialEmpleadoCentro() {
        try {
            System.out.println("actualizarHistorialEmpleadoCentro");
            int cedula = 14673456;
            ControlEmpleado instance = new ControlEmpleado();
            boolean expResult = true;
            boolean result = instance.actualizarHistorialEmpleadoCentro(cedula);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    /**
     * Test of agregarObjetoHistorialEmpleadoCentro method, of class ControlEmpleado.
     */
    @Test
    public void testAgregarObjetoHistorialEmpleadoCentro() {
        try {
            System.out.println("agregarObjetoHistorialEmpleadoCentro");
            Date fecha1 = new Date(2009, 1, 1);
            Date fecha2 = new Date(2009, 2, 31);
            HistorialEmpleado he = new HistorialEmpleado(14673456, 1, fecha1, fecha2, 1, "NOMBRE");
            ControlEmpleado instance = new ControlEmpleado();
            boolean expResult = true;
            boolean result = instance.agregarObjetoHistorialEmpleadoCentro(he);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleadosCentro method, of class ControlEmpleado.
     */
    @Test
    public void testTraerTodosLosEmpleadosCentro_int() {
        try {
            System.out.println("traerTodosLosEmpleadosCentro");
            int codigoCentro = 1;
            ControlEmpleado instance = new ControlEmpleado();
//            Collection<Empleado> expResult = null;
            Collection<Empleado> result = instance.traerTodosLosEmpleadosCentro(codigoCentro);
            for (Empleado empleado : result) {
                System.out.println(empleado.getNombre() + " " + empleado.getApellido());
            }
            //            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}