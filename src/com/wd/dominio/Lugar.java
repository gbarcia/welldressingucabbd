
package com.wd.dominio;

/**
 * En esta entidad se almacenan los lugares que maneja el sistema, para hacer
 * referencia a direcciones, ya sea de empleados, tiendas, empresas, centros
 * de distribución, etc. Se almacena un identificador único para cada lugar,
 * su nombre, el tipo (pudiendo ser ciudad o estado). Opcionalmente, siendo
 * esta una entidad recursiva, exista una clave de referencia de LUGAR, de
 * forma tal que se siga la jerarquía.
 * @author Gerardo Barcia
 */
public class Lugar {

    /** variable de identificador*/
    private int id;

    /** variable del nombre del lugar*/
    private String nombrePropio;

    /** tipo de lugar 0 Estado, 1 Ciudad*/
    private int tipo;

    /** Identificador del lugar a que pertenece*/
    private int lugarID;

    /** Nombre del lugar al que pertenece a nivel jerarquico (Edo)*/
    private String nombrePertenece;

    /**Constructor por defecto*/
    public Lugar() {
    }

    /**Constructor sin jerarquia
     * @param id int el identificador del lugar
     * @param nombrePropio String nombre del lugar
     * @param tipo int tipo de lugar 0 Estado, 1 Ciudad
     */
    public Lugar(int id, String nombrePropio, int tipo) {
        this.id = id;
        this.nombrePropio = nombrePropio;
        this.tipo = tipo;
    }
    
     /**Constructor con jerarquia
     * @param id int el identificador del lugar
     * @param nombrePropio String nombre del lugar
     * @param tipo int tipo de lugar 0 Estado, 1 Ciudad
      *@param lugarID int el lugar de referencia de su Jerarquia (EDO)
      *@param nombrePertenece String nombre del lugar de jerarquia (EDO) 
     */
    public Lugar(int id, String nombrePropio, int tipo, int lugarID,
            String nombrePertenece) {
        this.id = id;
        this.nombrePropio = nombrePropio;
        this.tipo = tipo;
        this.lugarID = lugarID;
        this.nombrePertenece = nombrePertenece;
    }

    /**metodo para obtener el id*/
    public int getId() {
        return id;
    }

    /**metodo para establecer el id
     * @param id int el identificador
     */
    public void setId(int id) {
        this.id = id;
    }

    /**metodo para obtener el id de referencia jerarquico de un lugar*/
    public int getLugarID() {
        return lugarID;
    }

    /**metodo para establecer el id de referencia jerarquico de un lugar
     * @param lugarID int el id del lugar de referencia jerarquico
     */
    public void setLugarID(int lugarID) {
        this.lugarID = lugarID;
    }

    /**metodo para obtener el nombre de un lugar jerarquico*/
    public String getNombrePertenece() {
        return nombrePertenece;
    }

    /**metodo para establecer el nombre de un lugar jerarquico
     *@param nombrePertenece String nombre del lugar jerarquico
     */
    public void setNombrePertenece(String nombrePertenece) {
        this.nombrePertenece = nombrePertenece.toUpperCase();
    }

    /**metodo para obtener el nombre del lugar*/
    public String getNombrePropio() {
        return nombrePropio;
    }

    /**metodo para establecer el nombre del lugar
     * @param nombrePropio String nombre del lugar
     */
    public void setNombrePropio(String nombrePropio) {
        this.nombrePropio = nombrePropio.toUpperCase();
    }

    /**metodo para obtener el tipo de lugar*/
    public int getTipo() {
        return tipo;
    }

    /**metodo para establecer el tipo de lugar
     *@param tipo int tipo de lugar 0 Estado, 1 Ciudad
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
