package com.wd.dominio;

/**
 * Entidad encargada de almacenar la informacion de un camion. Refiere al la
 * informacion y el centro de distribucion al cual pertenece.
 * @author Jonathan Trujillo
 */
public class Camion {
    
    /** variable de identificador*/
    private int id;

    /** variable de placa*/
    private String placa;

    /** variable de modelo*/
    private String modelo;

    /** variable de color*/
    private String color;

    /** variable de estado*/
    private String estado;

    /** variable de capacidad*/
    private int capacidad;

    /** variable de Centro de Distribucion*/
    private Integer centroDistribucionCodigo;

    /**
     * Contructor de la clase
     */
    public Camion() {
    }

    /**
     * Contructor de la clase
     * @param id el identificador del camion
     * @param placa la placa del camion
     * @param modelo el modelo del camion
     * @param color el color del camion
     * @param estado el estado del camion
     * @param capacidad la capacidad del camion
     * @param CENTRO_DISTRIBUCION_id el centro de distribucion al cula pertenece
     * el camion
     */
    public Camion(int id, String placa, String modelo, String color, String estado,
            int capacidad, Integer CENTRO_DISTRIBUCION_id) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;
        this.capacidad = capacidad;
        this.centroDistribucionCodigo = CENTRO_DISTRIBUCION_id;
    }

    /**
     * @return el identificador del camion
     */
    public int getId() {
        return id;
    }

    /**
     * @param id el identificador del camion
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return la placa del camion
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa la placa del camion
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return el modelo del camion
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo el modelo del camion
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return el color del camion
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color el color del camion
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return el estado del camion
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado el estado del camion
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return la capacidad del camion
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad la capacidad del camion
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return el Centro de Distribucion del camion
     */
    public Integer getCentroDistribucionCodigo() {
        return centroDistribucionCodigo;
    }

    /**
     * @param CENTRO_DISTRIBUCION_id el Centro de Distribucion del camion
     */
    public void setCentroDistribucionCodigo(Integer CENTRO_DISTRIBUCION_id) {
        this.centroDistribucionCodigo = CENTRO_DISTRIBUCION_id;
    }
    
}
