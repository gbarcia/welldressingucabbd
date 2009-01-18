package com.wd.gui.controlparticular;

import com.wd.dominio.Inventario;
import com.wd.dominio.Item;
import com.wd.gui.ControlGui;
import com.wd.servicios.ControlGeneral;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Gabylis
 */
public class ControlGuiInventario {

    /** variable para el manejo de la instancia del controlador GUI */
    private ControlGui controlador;

    public ControlGuiInventario() {
        this.controlador = new ControlGui();
    }

    /**
    * Metodo para buscar el inventario teorico de una tienda
    * @param codigoTienda int codigo de la tienda a la que pertence el inv.
    * @return Vector vector con todos los objetos EmpresaVigilancia del sistema
    */
    public Vector traerInventarioTeoTienda (Integer codigoTienda) {
        Vector<Inventario> vectorResult = null;
        Collection<Inventario> coleccion = ControlGeneral.getInstance().traerInventarioTeoTienda(codigoTienda);
        vectorResult = new Vector();
        for (Inventario it : coleccion) {
            vectorResult.add(it);
        }
        return vectorResult;
    }
    /**
    * Metodo para buscar el inventario en camino de una tienda
     * @param codigoTienda Integer codigo de la tienda al que pertenece el inv.
    * @return Vector vector con el inventario de la tienda
    */
    public Vector traerInventarioCaminoTienda (Integer codigoTienda) {
        Vector<Item> vectorResult = null;
        Collection<Item> coleccion = ControlGeneral.getInstance().traerInventarioTeoTienda(codigoTienda);
        vectorResult = new Vector();
        for (Item it : coleccion) {
            vectorResult.add(it);
        }
        return vectorResult;
    }

}
