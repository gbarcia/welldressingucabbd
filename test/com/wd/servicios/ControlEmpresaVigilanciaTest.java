/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.EmpresaVigilancia;
import com.wd.dominio.Servicio;
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
public class ControlEmpresaVigilanciaTest {

    public ControlEmpresaVigilanciaTest() {
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
     * Test of agregarEmpresaVigilancia method, of class ControlEmpresaVigilancia.
     */
    /*@Test
    public void testAgregarEmpresaVigilancia() {
        System.out.println("agregarEmpresaVigilancia");
        EmpresaVigilancia emp = null;
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        boolean expResult = false;
        boolean result = instance.agregarEmpresaVigilancia(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarServicio method, of class ControlEmpresaVigilancia.
     */
    /*@Test
    public void testAgregarServicio() {
        System.out.println("agregarServicio");
        Servicio serv = null;
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        boolean expResult = false;
        boolean result = instance.agregarServicio(serv);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of traerTodasLasEmpresas method, of class ControlEmpresaVigilancia.
     */
    @Test
    public void testTraerTodasLasEmpresas() throws IOException {
        System.out.println("traerTodasLasEmpresas");
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        //Collection<EmpresaVigilancia> expResult = null;
        Collection<EmpresaVigilancia> result = instance.traerTodasLasEmpresas();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traerLosServicios method, of class ControlEmpresaVigilancia.
     */
    @Test
    public void testTraerLosServicios() throws IOException {
        System.out.println("traerLosServicios");
        String rif = "J-34356";
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        //Collection<Servicio> expResult = null;
        Collection<Servicio> result = instance.traerLosServicios(rif);
        System.out.println("si.v.v"+result.size());
        //assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpresa method, of class ControlEmpresaVigilancia.
     */
    /*@Test
    public void testEliminarEmpresa() {
        System.out.println("eliminarEmpresa");
        String rif = "";
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        int expResult = 0;
        int result = instance.eliminarEmpresa(rif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEmpresaVigilancia method, of class ControlEmpresaVigilancia.
     */
    /*@Test
    public void testModificarEmpresaVigilancia() {
        System.out.println("modificarEmpresaVigilancia");
        EmpresaVigilancia emp = null;
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        boolean expResult = false;
        boolean result = instance.modificarEmpresaVigilancia(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

}