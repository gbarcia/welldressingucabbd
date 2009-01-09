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
////        emp = new Empleado(12345, "JOHN", "OLIVIERI",a, "22222", 0, "M", 0, "DIR", 0, 2, "L", fe, null, 1, "a");
////        ControlEmpleado instance = null;
////        try {
////            instance = new ControlEmpleado();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        boolean expResult = true;
////        boolean result = instance.agregarEmpleado(emp);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of agregarEmpleadoTienda method, of class ControlEmpleado.
////     */
////    @Test
////    public void testAgregarEmpleadoTienda() {
////        System.out.println("agregarEmpleadoTienda");
////        Empleado emp = null;
////        ControlEmpleado instance = new ControlEmpleado();
////        boolean expResult = false;
////        boolean result = instance.agregarEmpleadoTienda(emp);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of editarEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testEditarEmpleadoTienda() {
//        System.out.println("editarEmpleadoTienda");
//        Date a = new Date(0);
//        Empleado emp = new Empleado(123, "mary", "barcia", a, "telf", 0, "M", 0, "dir", 0, 2, "cv", a,null, 1, "pepa");
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.editarEmpleado(emp);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarEmpleado method, of class ControlEmpleado.
//     */
//   @Test
//    public void testConsultarEmpleado() {
//        System.out.println("consultarEmpleado");
//        Integer cedula = 123;
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Empleado result = instance.consultarEmpleadoTienda(cedula);
//        assertNotNull(result);
//        System.out.println(result.getNombre());
//        for (HistorialEmpleado emp : result.getHistorial()) {
//           System.out.println(emp.getFechaInicio());
//       }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
////    /**
////     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
////     */
//    @Test
//    public void testTraerTodosLosEmpleados() {
//        System.out.println("traerTodosLosEmpleados");
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collection<Empleado> result = instance.traerTodosLosEmpleados();
//        assertNotNull(result);
//        for (Empleado empleado : result) {
//            System.out.println(empleado.getNombre());
//            Collection<HistorialEmpleado> histo = empleado.getHistorial();
//            for (HistorialEmpleado historialEmpleado : histo) {
//                System.out.println(historialEmpleado.getCargo());
//            }
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
////
////    /**
////     * Test of traerTodosLosEmpleadosTienda method, of class ControlEmpleado.
////     */
//    @Test
//    public void testTraerTodosLosEmpleadosTienda() {
//        System.out.println("traerTodosLosEmpleadosTienda");
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collection<Empleado> result = instance.traerTodosLosEmpleadosTienda();
//        assertNotNull(result);
//        for (Empleado empleado : result) {
//            System.out.println(empleado.getCedula());
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
////
////    /**
////     * Test of consultarHistorialEmpleado method, of class ControlEmpleado.
////     */
//    @Test
//    public void testConsultarHistorialEmpleado() {
//        System.out.println("consultarHistorialEmpleado");
//        Integer cedula = 123;
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleadoTienda(cedula);
//        assertNotNull(result);
//        for (HistorialEmpleado historialEmpleado : result) {
//            System.out.println(historialEmpleado.getNombreEmpleado());
//            System.out.println(historialEmpleado.getCedula());
//            System.out.println(historialEmpleado.getCodigo());
//            System.out.println(historialEmpleado.getNombreEmpresa());
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarEmpleadoTienda method, of class ControlEmpleado.
//     */
////    @Test
////    public void testAgregarEmpleadoTienda() {
////        System.out.println("agregarEmpleadoTienda");
////        Empleado emp = null;
////        ControlEmpleado instance = new ControlEmpleado();
////        boolean expResult = false;
////        boolean result = instance.agregarEmpleadoTienda(emp);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of editarEmpleadoTienda method, of class ControlEmpleado.
////     */
////    @Test
////    public void testEditarEmpleadoTienda_Empleado() {
////        System.out.println("editarEmpleadoTienda");
////        Empleado emp = null;
////        ControlEmpleado instance = new ControlEmpleado();
////        boolean expResult = false;
////        boolean result = instance.editarEmpleadoTienda(emp);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of consultarEmpleado method, of class ControlEmpleado.
////     */
//    @Test
//    public void testConsultarEmpleado_Integer() {
//        System.out.println("consultarEmpleado Prueba");
//        Integer cedula = 11111;
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Empleado result = instance.consultarEmpleadoTienda(cedula);
//        assertNotNull(result);
//        for (HistorialEmpleado h : result.getHistorial()) {
//            System.out.println(h.getCedula());
//        }
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
////
////    /**
////     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
////     */
////    @Test
////    public void testTraerTodosLosEmpleados1() {
////        System.out.println("traerTodosLosEmpleados");
////        ControlEmpleado instance = new ControlEmpleado();
////        Collection<Empleado> expResult = null;
////        Collection<Empleado> result = instance.traerTodosLosEmpleados();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerTodosLosEmpleadosTienda method, of class ControlEmpleado.
////     */
////    @Test
////    public void testTraerTodosLosEmpleadosTienda1() {
////        System.out.println("traerTodosLosEmpleadosTienda");
////        ControlEmpleado instance = new ControlEmpleado();
////        Collection<Empleado> expResult = null;
////        Collection<Empleado> result = instance.traerTodosLosEmpleadosTienda();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of consultarHistorialEmpleado method, of class ControlEmpleado.
////     */
////    @Test
////    public void testConsultarHistorialEmpleado_Integer() {
////        System.out.println("consultarHistorialEmpleado");
////        Integer cedula = null;
////        ControlEmpleado instance = new ControlEmpleado();
////        Collection<HistorialEmpleado> expResult = null;
////        Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleado(cedula);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of actualizarHistorialEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testActualizarHistorialEmpleadoTienda() {
//        System.out.println("actualizarHistorialEmpleadoTienda");
//        int cedula = 11111;
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.actualizarHistorialEmpleadoTienda(cedula);
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
//
//    /**
//     * Test of editarEmpleado method, of class ControlEmpleado.
//     */
//    @Test
//    public void testEditarEmpleado() {
//        System.out.println("editarEmpleado");
//        Empleado emp = null;
//        ControlEmpleado instance = new ControlEmpleado();
//        boolean expResult = false;
//        boolean result = instance.editarEmpleado(emp);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testConsultarEmpleadoTienda() {
//        System.out.println("consultarEmpleadoTienda");
//        Integer cedula = null;
//        ControlEmpleado instance = new ControlEmpleado();
//        Empleado expResult = null;
//        Empleado result = instance.consultarEmpleadoTienda(cedula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
//     */
//    @Test
//    public void testTraerTodosLosEmpleados1() {
//        System.out.println("traerTodosLosEmpleados");
//        ControlEmpleado instance = new ControlEmpleado();
//        Collection<Empleado> expResult = null;
//        Collection<Empleado> result = instance.traerTodosLosEmpleados();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosEmpleadosTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testTraerTodosLosEmpleadosTienda1() {
//        System.out.println("traerTodosLosEmpleadosTienda");
//        ControlEmpleado instance = new ControlEmpleado();
//        Collection<Empleado> expResult = null;
//        Collection<Empleado> result = instance.traerTodosLosEmpleadosTienda();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of consultarHistorialEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testConsultarHistorialEmpleadoTienda() {
//        System.out.println("consultarHistorialEmpleadoTienda");
//        Integer cedula = null;
//        ControlEmpleado instance = new ControlEmpleado();
//        Collection<HistorialEmpleado> expResult = null;
//        Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleadoTienda(cedula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarHistorialEmpleadoTienda method, of class ControlEmpleado.
//     */
//    @Test
//    public void testActualizarHistorialEmpleadoTienda_int() {
//        System.out.println("actualizarHistorialEmpleadoTienda");
//        int cedula = 0;
//        ControlEmpleado instance = new ControlEmpleado();
//        boolean expResult = false;
//        boolean result = instance.actualizarHistorialEmpleadoTienda(cedula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of agregarObjetoHistorialEmpleadoTienda method, of class ControlEmpleado.
     */
//    @Test
//    public void testAgregarObjetoHistorialEmpleadoTienda() {
//        System.out.println("agregarObjetoHistorialEmpleadoTienda");
//        HistorialEmpleado he = null;
//        ControlEmpleado instance = null;
//        try {
//            instance = new ControlEmpleado();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = false;
//        boolean result = instance.agregarObjetoHistorialEmpleadoTienda(he);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of borrarEmpleado method, of class ControlEmpleado.
     */
    @Test
    public void testBorrarEmpleado() {
        System.out.println("borrarEmpleado");
        int cedula = 123;
        ControlEmpleado instance = null;
        try {
            instance = new ControlEmpleado();
        } catch (IOException ex) {
            Logger.getLogger(ControlEmpleadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.borrarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}