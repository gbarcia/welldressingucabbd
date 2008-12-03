package com.wd.servicios;

import com.wd.dominio.Tienda;
import java.io.IOException;
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
public class ControlTiendaTest {

    public ControlTiendaTest() {
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
     * Test of agregarNuevaTienda method, of class ControlTienda.
     */
    @Test
    public void testAgregarNuevaTienda() {
        System.out.println("agregarNuevaTienda");
        Tienda tienda = new Tienda(10,"Sambil Prueba", 300,"872487", "sp@wd.com.ve", "Calle Pajarito", 2, 1, "J-759-645-1");
        ControlTienda instance = null;
        try {
            instance = new ControlTienda();
        } catch (IOException ex) {
            Logger.getLogger(ControlTiendaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instance = new ControlTienda();
        } catch (IOException ex) {
            Logger.getLogger(ControlTiendaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.agregarNuevaTienda(tienda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}