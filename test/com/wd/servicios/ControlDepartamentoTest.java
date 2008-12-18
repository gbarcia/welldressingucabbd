/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Departamento;
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
public class ControlDepartamentoTest {

    public ControlDepartamentoTest() {
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
     * Test of agregarDepartamento method, of class ControlDepartamento.
     
    @Test
    public void testAgregarDepartamento() throws IOException {
        System.out.println("agregarDepartamento");
        Departamento departamento = new Departamento (0,"nombre","descripcion",2,1);
        ControlDepartamento instance = new ControlDepartamento();
        instance.agregarDepartamento(departamento);
        boolean expResult = true;
        boolean result = instance.agregarDepartamento(departamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDepartamento method, of class ControlDepartamento.
     
    @Test
    public void testAgregarDepartamento_Departamento() throws IOException {
        System.out.println("agregarDepartamento");
        Departamento departamento = new Departamento(0,"dpto","desc",1,1);
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = true;
        boolean result = instance.agregarDepartamento(departamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosDepartamentos method, of class ControlDepartamento.
     
    @Test
    public void testTraerTodosLosDepartamentos() throws IOException {
        System.out.println("traerTodosLosDepartamentos");
        ControlDepartamento instance = new ControlDepartamento();        
        Collection<Departamento> result = instance.traerTodosLosDepartamentos();
        assertNotNull(result);
        for (Departamento dpto : result) {
                System.out.println(dpto.getNombre());
                System.out.println(dpto.getDepartamentoCodigo());
            }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDepartamento method, of class ControlDepartamento.
     
    @Test
    public void testAgregarDepartamento_Departamento_1args() throws IOException {
        System.out.println("agregarDepartamento");
        Departamento departamento = null;
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = false;
        boolean result = instance.agregarDepartamento(departamento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLosDepartamentos method, of class ControlDepartamento.
     
    @Test
    public void testTraerTodosLosDepartamentos1() throws IOException {
        System.out.println("traerTodosLosDepartamentos");
        ControlDepartamento instance = new ControlDepartamento();
        Collection<Departamento> expResult = null;
        Collection<Departamento> result = instance.traerTodosLosDepartamentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDepartamento method, of class ControlDepartamento.
     
    @Test
    public void testEliminarDepartamento() throws IOException {
        System.out.println("eliminarDepartamento");
        Departamento dpto = null;
        ControlDepartamento instance = new ControlDepartamento();
        int expResult = 0;
        int result = instance.eliminarDepartamento(dpto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDepartamento method, of class ControlDepartamento.
     
    @Test
    public void testModificarDepartamento() throws IOException {
        System.out.println("modificarDepartamento");
        Departamento newDpto = null;
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = false;
        boolean result = instance.modificarDepartamento(newDpto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of agregarSubClase method, of class ControlDepartamento.
     
    @Test
    public void testAgregarSubClase() throws IOException {
        System.out.println("agregarSubClase");
        Departamento newSubClase = new Departamento(0,"nombre","desc",0,3);
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = true;
        boolean result = instance.agregarSubClase(newSubClase);
        assertEquals(expResult, result);
        System.out.println(" result: "+result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodasLasSubClases method, of class ControlDepartamento.
     */
    @Test
    public void testTraerTodasLasSubClases() throws IOException {
        System.out.println("traerTodasLasSubClases");
        ControlDepartamento instance = new ControlDepartamento();
        //Collection<Departamento> expResult = null;
        Collection<Departamento> result = instance.traerTodasLasSubClases();
        assertNotNull(result);
        System.out.println("size sub: "+result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSubClase method, of class ControlDepartamento.
     
    @Test
    public void testEliminarSubClase() throws IOException {
        System.out.println("eliminarSubClase");
        Departamento subclase = null;
        ControlDepartamento instance = new ControlDepartamento();
        int expResult = 0;
        int result = instance.eliminarSubClase(subclase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarSubClase method, of class ControlDepartamento.
     
    @Test
    public void testModificarSubClase() throws IOException {
        System.out.println("modificarSubClase");
        Departamento newSubClase = null;
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = false;
        boolean result = instance.modificarSubClase(newSubClase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarClase method, of class ControlDepartamento.
     
    @Test
    public void testAgregarClase() throws IOException {
        System.out.println("agregarClase");
        Departamento newClase = null;
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = false;
        boolean result = instance.agregarClase(newClase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traerTodosLasClases method, of class ControlDepartamento.
     */
    @Test
    public void testTraerTodosLasClases() throws IOException {
        System.out.println("traerTodosLasClases");
        ControlDepartamento instance = new ControlDepartamento();
        //Collection<Departamento> expResult = null;
        Collection<Departamento> result = instance.traerTodosLasClases();
        assertNotNull(result);
        System.out.println("laslamf: "+ result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarClase method, of class ControlDepartamento.
     
    @Test
    public void testEliminarClase() throws IOException {
        System.out.println("eliminarClase");
        Departamento clase = null;
        ControlDepartamento instance = new ControlDepartamento();
        int expResult = 0;
        int result = instance.eliminarClase(clase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarClase method, of class ControlDepartamento.
     
    @Test
    public void testModificarClase() throws IOException {
        System.out.println("modificarClase");
        Departamento newClase = null;
        ControlDepartamento instance = new ControlDepartamento();
        boolean expResult = false;
        boolean result = instance.modificarClase(newClase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

}