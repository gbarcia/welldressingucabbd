/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.EmpresaVigilancia;
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
    @Test
    public void testAgregarEmpresaVigilancia() throws IOException {
        System.out.println("agregarEmpresaVigilancia");
        EmpresaVigilancia emp = new EmpresaVigilancia("pepe","nombre","telefono",
    "dir",2,"nombreCont","apellidoContacto");
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        boolean expResult = true;
        boolean result = instance.agregarEmpresaVigilancia(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

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
     * Test of eliminarEmpresa method, of class ControlEmpresaVigilancia.
     */
    @Test
    public void testEliminarEmpresa() throws IOException {
        System.out.println("eliminarEmpresa");
        String rif = "pepe";
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        int expResult = 1;
        int result = instance.eliminarEmpresa(rif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEmpresaVigilancia method, of class ControlEmpresaVigilancia.
     */
    @Test
    public void testModificarEmpresaVigilancia() throws IOException {
        System.out.println("modificarEmpresaVigilancia");
        EmpresaVigilancia emp = new EmpresaVigilancia("J-174-836-7","nombre","telefono",
    "dir",2,"nombreCont","apellidoContacto");
        ControlEmpresaVigilancia instance = new ControlEmpresaVigilancia();
        boolean expResult = true;
        boolean result = instance.modificarEmpresaVigilancia(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}