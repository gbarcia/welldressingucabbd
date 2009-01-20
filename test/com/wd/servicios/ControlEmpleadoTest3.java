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
public class ControlEmpleadoTest3 {

    public ControlEmpleadoTest3() {
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
     * Test of traerEmpleadosPorTienda method, of class ControlEmpleado.
     */
    @Test
    public void testTraerEmpleadosPorTienda() {
        try {
            System.out.println("traerEmpleadosPorTienda");
            int codigo = 1;
            ControlEmpleado instance = new ControlEmpleado();
//            Collection<Empleado> expResult = null;
            Collection<Empleado> result = instance.traerEmpleadosPorTienda(codigo);
            for (Empleado empleado : result) {
                System.out.println(empleado.getApellido() + ", " + empleado.getNombre());
            }
//            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }

}