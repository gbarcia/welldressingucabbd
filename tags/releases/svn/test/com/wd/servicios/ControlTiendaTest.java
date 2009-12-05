/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Tienda;
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
 * @author Jonathan Trujillo
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
     * Test of agregarTienda method, of class ControlTienda.
     */
    @Test
    public void testAgregarTienda() {
        try {
            System.out.println("agregarTienda");
            Tienda tienda = new Tienda(0, "PRUEBA", 50, "02129629999",
                    "CORREOPRUEBA@WD.COM.VE", "DIRECCION PRUEBA", 4,
                    1, null);
            ControlTienda instance = new ControlTienda();
            boolean expResult = true;
            boolean result = instance.agregarTienda(tienda);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of modificarTienda method, of class ControlTienda.
     */
    @Test
    public void testModificarTienda() {
        try {
            System.out.println("modificarTienda");
            Tienda tienda = new Tienda(6, "PRUEBA", 100, "02129620000",
                    "CORREOPRUEBA@WD.COM.VE", "DIRECCION PRUEBA", 4,
                    1, "J-658-374-1");
            ControlTienda instance = new ControlTienda();
            boolean expResult = true;
            boolean result = instance.modificarTienda(tienda);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of consultarTiendas method, of class ControlTienda.
     */
    @Test
    public void testConsultarTiendas() {
        try {
            System.out.println("consultarTiendas");
            ControlTienda instance = new ControlTienda();
//            Collection<Tienda> expResult = null;
            Collection<Tienda> result = instance.consultarTiendas();
            for (Tienda tienda : result) {
                System.out.println(tienda.getCodigo() + " " +
                        tienda.getNombre() + " " +
                        tienda.getTamano() + " " +
                        tienda.getTelefono() + " " +
                        tienda.getCorreo() + " " +
                        tienda.getDireccion() + " " +
                        tienda.getLUGAR_id() + " " +
                        tienda.getHORARIO_id() + " " +
                        tienda.getEMPRESA_SERVICIO_rif());
            }
//            assertEquals(expResult, result);
            assertNotNull(result);
            // TODO review the generated test code and remove the default call to fail.
//            fail("The test case is a prototype.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}