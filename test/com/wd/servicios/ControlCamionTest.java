/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Camion;
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
public class ControlCamionTest {

    public ControlCamionTest() {
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
     * Test of agregarCamion method, of class ControlCamion.
     */
    @Test
    public void testAgregarCamion() {
        try {
            System.out.println("agregarCamion");
            Camion camion = new Camion(0, "ABC-000", "MODELO PRUEBA", "COLOR PRUEBA", "ESTADO PRUEBA", 999, null);
            ControlCamion instance = new ControlCamion();
            boolean expResult = true;
            boolean result = instance.agregarCamion(camion);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of modificarCamion method, of class ControlCamion.
     */
    @Test
    public void testModificarCamion() {
        try {
            System.out.println("modificarCamion");
            Camion camion = new Camion(6, "ABC-000", "MODELO PRUEBA", "COLOR PRUEBA", "ESTADO PRUEBA", 999, 1);
            ControlCamion instance = new ControlCamion();
            boolean expResult = true;
            boolean result = instance.modificarCamion(camion);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }

//    /**
//     * Test of eliminarCamion method, of class ControlCamion.
//     */
//    @Test
//    public void testEliminarCamion() {
//        try {
//            System.out.println("eliminarCamion");
//            int id = 6;
//            ControlCamion instance = new ControlCamion();
//            boolean expResult = true;
//            boolean result = instance.eliminarCamion(id);
//            assertEquals(expResult, result);
//            // TODO review the generated test code and remove the default call to fail.
////            fail("The test case is a prototype.");
//        } catch (IOException ex) {
//           System.out.println(ex.getMessage());
//        }
//    }

    /**
     * Test of consultarCamiones method, of class ControlCamion.
     */
    @Test
    public void testConsultarCamiones() {
        try {
            System.out.println("consultarCamiones");
            ControlCamion instance = new ControlCamion();
//            Collection<Camion> expResult = null;
            Collection<Camion> result = instance.consultarCamiones();
            for (Camion camion : result) {
                System.out.println(camion.getId() + " " + camion.getPlaca() 
                        + " " + camion.getModelo() + " " + camion.getColor() 
                        + " " + camion.getEstado() + " " + camion.getCapacidad() 
                        + " " + camion.getCentroDistribucionCodigo());
            }
//            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}