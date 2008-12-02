/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Horario;
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
 * @author Gerardo Barcia
 */
public class ControlHorarioTest2 {

    public ControlHorarioTest2() {
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
     * Test of agregarNuevoHorario method, of class ControlHorario.
     */
    //@Test
//    public void testAgregarNuevoHorario() throws IOException {
//        System.out.println("agregarNuevoHorario");
//        Horario horario = new Horario(1,4,6,"LUNES","MIERCOLES");
//        ControlHorario instance = new ControlHorario();
//        boolean expResult = true;
//        boolean result = instance.agregarNuevoHorario(horario);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of agregarNuevoHorario method, of class ControlHorario.
     */
//    @Test
//    public void testAgregarNuevoHorario_Horario() {
//        try {
//            System.out.println("agregarNuevoHorario");
//            Horario horario = null;
//            ControlHorario instance = new ControlHorario();
//            boolean expResult = false;
//            boolean result = instance.agregarNuevoHorario(horario);
//            assertEquals(expResult, result);
//            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
//        } catch (IOException ex) {
//            Logger.getLogger(ControlHorarioTest2.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    /**
     * Test of traerTodosLosHorarios method, of class ControlHorario.
     */
    @Test
    public void testTraerTodosLosHorarios() {
        try {
            System.out.println("traerTodosLosHorarios");
            ControlHorario instance = new ControlHorario();
            Collection<Horario> result = instance.traerTodosLosHorarios();
            assertNotNull(result);
            //for (Horario horario : result) {
              //  System.out.println(horario.getId());
            //}
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}