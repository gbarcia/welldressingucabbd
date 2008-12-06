/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Departamento;
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
     */
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

}