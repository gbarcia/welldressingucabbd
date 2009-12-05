/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Tienda;
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
public class ControlTiendaTest2 {

    public ControlTiendaTest2() {
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
     * Test of consultarTiendasVariedadDesc method, of class ControlTienda.
     */
    @Test
    public void testConsultarTiendasVariedadDesc() {
        try {
            System.out.println("consultarTiendasVariedadDesc");
            ControlTienda instance = new ControlTienda();
//        Collection<Tienda> expResult = null;
            Collection<Tienda> result = instance.consultarTiendasVariedadDesc();
            for (Tienda tienda : result) {
                System.out.println(tienda.getNombre() + tienda.getVariedad());
            }
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarTiendasVariedadAsc method, of class ControlTienda.
     */
    @Test
    public void testConsultarTiendasVariedadAsc() {
        try {
            System.out.println("consultarTiendasVariedadAsc");
            ControlTienda instance = new ControlTienda();
//        Collection<Tienda> expResult = null;
            Collection<Tienda> result = instance.consultarTiendasVariedadAsc();
            for (Tienda tienda : result) {
                System.out.println(tienda.getNombre() + tienda.getVariedad());
            }
//        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println("error");
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}