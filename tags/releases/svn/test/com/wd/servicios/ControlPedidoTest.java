/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wd.servicios;

import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.dominio.Pedido;
import java.io.IOException;
import java.sql.Date;
import java.util.Collection;
import java.util.Vector;
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
 * @author Casa
 */
public class ControlPedidoTest {

    public ControlPedidoTest() {
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

//    /**
//     * Test of agregarUnPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testAgregarUnPedido() {
//        System.out.println("agregarUnPedido");
//        Pedido p = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.agregarUnPedido(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerSiguienteNumeroOrden method, of class ControlPedido.
//     */
//    @Test
//    public void testObtenerSiguienteNumeroOrden() {
//        System.out.println("obtenerSiguienteNumeroOrden");
//        ControlPedido instance = new ControlPedido();
//        int expResult = 0;
//        int result = instance.obtenerSiguienteNumeroOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarInventario method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventario() {
//        System.out.println("actualizarInventario");
//        Object aAct = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarInventario(aAct);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioActualCentro method, of class ControlPedido.
//     */
//    @Test
//    public void testTraerInventarioActualCentro() {
//        System.out.println("traerInventarioActualCentro");
//        int codigoCentro = 0;
//        ControlPedido instance = new ControlPedido();
//        Collection<Inventario> expResult = null;
//        Collection<Inventario> result = instance.traerInventarioActualCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ActualizarInventarioCentro method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventarioCentro() {
//        System.out.println("ActualizarInventarioCentro");
//        Collection<Inventario> col = null;
//        int operacion = 0;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.ActualizarInventarioCentro(col, operacion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of obtenerCantidadActualProductoyExistenciaTienda method, of class ControlPedido.
     */
//    @Test
//    public void testObtenerCantidadActualProductoyExistenciaTienda() {
//        System.out.println("obtenerCantidadActualProductoyExistenciaTienda");
//        int idProducto = 1;
//        int idTienda = 1;
//        ControlPedido instance = null;
//        try {
//            instance = new ControlPedido();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Integer expResult = null;
//        Integer result = instance.obtenerCantidadActualProductoyExistenciaTienda(idProducto, idTienda);
//        System.out.println(result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of ActualizarInventarioTienda method, of class ControlPedido.
     */
//    @Test
//    public void testActualizarInventarioTienda() {
//        System.out.println("ActualizarInventarioTienda");
//        Collection<Inventario> col = new Vector<Inventario>();
//        int operacion = 0;
//        Inventario inv = new Inventario();
//        inv.setProductoId(1);
//        inv.setTiendaCodigo(1);
//        inv.setCantidad(100);
//        col.add(inv);
//        ControlPedido instance = null;
//        try {
//            instance = new ControlPedido();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.ActualizarInventarioTienda(col, operacion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosPedidos method, of class ControlPedido.
//     */
//    @Test
//    public void testTraerTodosLosPedidos() {
//        System.out.println("traerTodosLosPedidos");
//        ControlPedido instance = new ControlPedido();
//        Collection<Pedido> expResult = null;
//        Collection<Pedido> result = instance.traerTodosLosPedidos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testBuscarPedido() {
//        System.out.println("buscarPedido");
//        int numeroPedido = 0;
//        ControlPedido instance = new ControlPedido();
//        Pedido expResult = null;
//        Pedido result = instance.buscarPedido(numeroPedido);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cambiarEstadoPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testCambiarEstadoPedido() {
//        System.out.println("cambiarEstadoPedido");
//        Pedido p = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.cambiarEstadoPedido(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarPedido() {
//        System.out.println("actualizarPedido");
//        Pedido p = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarPedido(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarListaItems method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarListaItems() {
//        System.out.println("actualizarListaItems");
//        Collection<Item> items = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarListaItems(items);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
////    /**
////     * Test of agregarUnPedido method, of class ControlPedido.
////     */
////    @Test
////    public void testAgregarUnPedido() {
////        System.out.println("agregarUnPedido");
////        Date a = new Date(00000000);
////        Pedido p = new Pedido(null, 1, 19237339, 1, a, a, 0);
////        p.agregarItem(2, 11, 1000, 15);
////        ControlPedido instance = null;
////        try {
////            instance = new ControlPedido();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        boolean expResult = true;
////        boolean result = instance.agregarUnPedido(p);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of obtenerSiguienteNumeroOrden method, of class ControlPedido.
////     */
////    @Test
////    public void testObtenerSiguienteNumeroOrden() {
////        System.out.println("obtenerSiguienteNumeroOrden");
////        ControlPedido instance = null;
////        try {
////            instance = new ControlPedido();
////        } catch (IOException ex) {
////            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        int result = instance.obtenerSiguienteNumeroOrden();
////        System.out.println(result);
////        // TODO review the generated test code and remove the default call to fail.
////        //fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of agregarUnPedido method, of class ControlPedido.
////     */
////    @Test
////    public void testAgregarUnPedido_Pedido() {
//////        System.out.println("agregarUnPedido");
//////        Pedido p = null;
//////        ControlPedido instance = new ControlPedido();
//////        boolean expResult = false;
//////        boolean result = instance.agregarUnPedido(p);
//////        assertEquals(expResult, result);
//////        // TODO review the generated test code and remove the default call to fail.
//////        fail("The test case is a prototype.");
//////    }
//////
//////    /**
//////     * Test of obtenerSiguienteNumeroOrden method, of class ControlPedido.
////     */
////    @Test
////    public void testObtenerSiguienteNumeroOrden1() {
////        System.out.println("obtenerSiguienteNumeroOrden");
////        ControlPedido instance = new ControlPedido();
////        int expResult = 0;
////        int result = instance.obtenerSiguienteNumeroOrden();
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of actualizarInventario method, of class ControlPedido.
////     */
////    @Test
////    public void testActualizarInventario() {
////        System.out.println("actualizarInventario");
////        Object aAct = null;
////        ControlPedido instance = new ControlPedido();
////        boolean expResult = false;
////        boolean result = instance.actualizarInventario(aAct);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of traerInventarioActualCentro method, of class ControlPedido.
////     */
////    @Test
////    public void testTraerInventarioActualCentro() {
////        System.out.println("traerInventarioActualCentro");
////        int codigoCentro = 0;
////        ControlPedido instance = new ControlPedido();
////        Collection<Inventario> expResult = null;
////        Collection<Inventario> result = instance.traerInventarioActualCentro(codigoCentro);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
////
////    /**
////     * Test of ActualizarInventarioCentro method, of class ControlPedido.
////     */
////    @Test
////    public void testActualizarInventarioCentro() {
////        System.out.println("ActualizarInventarioCentro");
////        Collection<Inventario> col = null;
////        int operacion = 0;
////        ControlPedido instance = new ControlPedido();
////        boolean expResult = false;
////        boolean result = instance.ActualizarInventarioCentro(col, operacion);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
////    }
//
//    /**
//     * Test of ActualizarInventarioTienda method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventarioTienda() {
//        System.out.println("ActualizarInventarioTienda");
//        Collection<Inventario> col = new Vector<Inventario>();
//        int operacion = 1;
//        Inventario i = new Inventario();
//        i.setTiendaCodigo(1);
//        i.setProductoId(5);
//        i.setCantidad(10);
//        col.add(i);
//        ControlPedido instance = null;
//        try {
//            instance = new ControlPedido();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        boolean expResult = true;
//        boolean result = instance.ActualizarInventarioTienda(col, operacion);
//        assertEquals(expResult, result);
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarUnPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testAgregarUnPedido() {
//        System.out.println("agregarUnPedido");
//        Pedido p = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.agregarUnPedido(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerSiguienteNumeroOrden method, of class ControlPedido.
//     */
//    @Test
//    public void testObtenerSiguienteNumeroOrden() {
//        System.out.println("obtenerSiguienteNumeroOrden");
//        ControlPedido instance = new ControlPedido();
//        int expResult = 0;
//        int result = instance.obtenerSiguienteNumeroOrden();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarInventario method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventario() {
//        System.out.println("actualizarInventario");
//        Object aAct = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarInventario(aAct);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerInventarioActualCentro method, of class ControlPedido.
//     */
//    @Test
//    public void testTraerInventarioActualCentro() {
//        System.out.println("traerInventarioActualCentro");
//        int codigoCentro = 0;
//        ControlPedido instance = new ControlPedido();
//        Collection<Inventario> expResult = null;
//        Collection<Inventario> result = instance.traerInventarioActualCentro(codigoCentro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ActualizarInventarioCentro method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventarioCentro() {
//        System.out.println("ActualizarInventarioCentro");
//        Collection<Inventario> col = null;
//        int operacion = 0;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.ActualizarInventarioCentro(col, operacion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ActualizarInventarioTienda method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventarioTienda_Collection_int() {
//        System.out.println("ActualizarInventarioTienda");
//        Collection<Inventario> col = null;
//        int operacion = 0;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.ActualizarInventarioTienda(col, operacion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of traerTodosLosPedidos method, of class ControlPedido.
//     */
//    @Test
//    public void testTraerTodosLosPedidos() {
//        System.out.println("traerTodosLosPedidos");
//        ControlPedido instance = new ControlPedido();
//        Collection<Pedido> expResult = null;
//        Collection<Pedido> result = instance.traerTodosLosPedidos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of buscarPedido method, of class ControlPedido.
     */
//    @Test
//    public void testBuscarPedido() {
//        System.out.println("buscarPedido");
//        int numeroPedido = 12;
//        ControlPedido instance = null;
//        try {
//            instance = new ControlPedido();
//        } catch (IOException ex) {
//            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Pedido result = instance.buscarPedido(numeroPedido);
//        assertNotNull(result);
//        System.out.println(result.getId());
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cambiarEstadoPedido method, of class ControlPedido.
//     */
//    @Test
//    public void testCambiarEstadoPedido() {
//        System.out.println("cambiarEstadoPedido");
//        Pedido p = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.cambiarEstadoPedido(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of actualizarPedido method, of class ControlPedido.
     */
    @Test
    public void testActualizarPedido() {
        System.out.println("actualizarPedido");
        ControlPedido instance = null;
        Pedido p = null;
        try {
            instance = new ControlPedido();
            p = instance.buscarPedido(12);
            p.setStatus(3);
            //p.setColeccionProductos(col);
        } catch (IOException ex) {
            Logger.getLogger(ControlPedidoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean expResult = true;
        boolean result = instance.actualizarPedido(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
//     * Test of actualizarListaItems method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarListaItems() {
//        System.out.println("actualizarListaItems");
//        Collection<Item> items = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarListaItems(items);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }

    /**
//     * Test of actualizarInventario method, of class ControlPedido.
//     */
//    @Test
//    public void testActualizarInventario() {
//        System.out.println("actualizarInventario");
//        Object aAct = null;
//        ControlPedido instance = new ControlPedido();
//        boolean expResult = false;
//        boolean result = instance.actualizarInventario(aAct);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}