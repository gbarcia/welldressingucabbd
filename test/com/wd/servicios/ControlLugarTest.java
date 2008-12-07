/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Lugar;
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
public class ControlLugarTest {

    public ControlLugarTest() {
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
     * Test of traerTodosLosLugares method, of class ControlLugar.
     */
    @Test
    public void testTraerTodosLosLugares() {
        System.out.println("traerTodosLosLugares");
        ControlLugar instance = null;
        try {
            instance = new ControlLugar();
        } catch (IOException ex) {
            Logger.getLogger(ControlLugarTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collection<Lugar> result = instance.traerTodosLosLugares();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}