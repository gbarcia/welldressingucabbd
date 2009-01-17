/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Empleado;
import com.wd.dominio.HistorialEmpleado;
import com.wd.dominio.NominaCentro;
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
     * Test of agregarEmpleadoTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testAgregarEmpleadoTienda() {
        System.out.println("agregarEmpleadoTienda");
        Empleado emp = null;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.agregarEmpleadoTienda(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarEmpleadoCentro method, of class ControlEmpleado.
     */
    /*@Test
    public void testAgregarEmpleadoCentro() {
        System.out.println("agregarEmpleadoCentro");
        Empleado emp = null;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.agregarEmpleadoCentro(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarEmpleado method, of class ControlEmpleado.
     */
    /*@Test
    public void testEditarEmpleado() {
        System.out.println("editarEmpleado");
        Empleado emp = null;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.editarEmpleado(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarEmpleadoTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testConsultarEmpleadoTienda() {
        System.out.println("consultarEmpleadoTienda");
        Integer cedula = null;
        ControlEmpleado instance = new ControlEmpleado();
        Empleado expResult = null;
        Empleado result = instance.consultarEmpleadoTienda(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleados method, of class ControlEmpleado.
     */
    /*@Test
    public void testTraerTodosLosEmpleados() {
        System.out.println("traerTodosLosEmpleados");
        ControlEmpleado instance = new ControlEmpleado();
        Collection<Empleado> expResult = null;
        Collection<Empleado> result = instance.traerTodosLosEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleadosTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testTraerTodosLosEmpleadosTienda() {
        System.out.println("traerTodosLosEmpleadosTienda");
        ControlEmpleado instance = new ControlEmpleado();
        Collection<Empleado> expResult = null;
        Collection<Empleado> result = instance.traerTodosLosEmpleadosTienda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarHistorialEmpleadoTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testConsultarHistorialEmpleadoTienda() {
        System.out.println("consultarHistorialEmpleadoTienda");
        Integer cedula = null;
        ControlEmpleado instance = new ControlEmpleado();
        Collection<HistorialEmpleado> expResult = null;
        Collection<HistorialEmpleado> result = instance.consultarHistorialEmpleadoTienda(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarHistorialEmpleadoTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testActualizarHistorialEmpleadoTienda() {
        System.out.println("actualizarHistorialEmpleadoTienda");
        int cedula = 0;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.actualizarHistorialEmpleadoTienda(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObjetoHistorialEmpleadoTienda method, of class ControlEmpleado.
     */
    /*@Test
    public void testAgregarObjetoHistorialEmpleadoTienda() {
        System.out.println("agregarObjetoHistorialEmpleadoTienda");
        HistorialEmpleado he = null;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.agregarObjetoHistorialEmpleadoTienda(he);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObjetoHistorialEmpleadoCentro method, of class ControlEmpleado.
     */
    /*@Test
    public void testAgregarObjetoHistorialEmpleadoCentro() {
        System.out.println("agregarObjetoHistorialEmpleadoCentro");
        HistorialEmpleado he = null;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.agregarObjetoHistorialEmpleadoCentro(he);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarEmpleado method, of class ControlEmpleado.
     */
    /*@Test
    public void testBorrarEmpleado() {
        System.out.println("borrarEmpleado");
        int cedula = 0;
        ControlEmpleado instance = new ControlEmpleado();
        boolean expResult = false;
        boolean result = instance.borrarEmpleado(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of coductoresMasEntregas method, of class ControlEmpleado.
     */
    /*@Test
    public void testCoductoresMasEntregas() throws IOException {
        System.out.println("coductoresMasEntregas");
        ControlEmpleado instance = new ControlEmpleado();
        Collection<Empleado> expResult = null;
        Collection<Empleado> result = instance.coductoresMasEntregas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosEmpleadosCentro method, of class ControlEmpleado.
     */
    @Test
    public void testTraerTodosLosEmpleadosCentro() throws IOException {
        System.out.println("traerTodosLosEmpleadosCentro");
        int codigoCentro = 1;
        ControlEmpleado instance = new ControlEmpleado();
        //Collection<Empleado> expResult = null;
        Collection<Empleado> result = instance.traerTodosLosEmpleadosCentro(codigoCentro);
        System.out.println("EMPS: "+result.size());
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traerNominaCentro method, of class ControlEmpleado.
     */
    @Test
    public void testTraerNominaCentro() throws IOException {
        System.out.println("traerNominaCentro");
        int codigoCentro = 1;
        ControlEmpleado instance = new ControlEmpleado();
        //Collection<NominaCentro> expResult = null;
        Collection<NominaCentro> result = instance.traerNominaCentro(codigoCentro);
        System.out.println("nomina: "+result.size());
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}