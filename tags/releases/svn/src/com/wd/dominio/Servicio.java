package com.wd.dominio;

/**
 * En esta clase se maneja la relacion entre empresas de servicio
 * bien sea o proveedor o empresa de vigilancia y centro de distribucion
 * @author Gabylis
 */
public class Servicio {
    /**Este atributo es el codigo del centro de distribucion al que una empresa
     de servicio le presta un servicio*/
    private int centroDistribucionCodigo;
    /**Codigo de la empresa de vigilancia o del proveedor que le presta un
     * servicio al centro de distribucion*/
    private String empresaServicioRif;

    /**Constructor por defecto*/
    public Servicio() {
    }

    /**
     * Constructor de la clase con todos sus atributos
     * @param centroDistribucionCodigo int codigo de un centro de distribucion
     * @param empresaServicioRif String codigo de la empresa de servicio
     */
    public Servicio(int centroDistribucionCodigo, String empresaServicioRif) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
        this.empresaServicioRif = empresaServicioRif;
    }

    /**Metodo para obtener el codigo del centro de distribucion*/
    public int getCentroDistribucionCodigo() {
        return centroDistribucionCodigo;
    }

    /**
     * Metodo para establecer el codigo del centro de distribucion
     * @param centroDistribucionCodigo int codigo del centro de distribucion al
     * que se le presta un servicio
     */
    public void setCentroDistribucionCodigo(int centroDistribucionCodigo) {
        this.centroDistribucionCodigo = centroDistribucionCodigo;
    }

    /** Metodo para establecer el codigo de la empresa de servicio*/
    public String getEmpresaServicioRif() {
        return empresaServicioRif;
    }

    /**
     * Metodo para establecer el codigo del centro de distribucion
     * @param empresaServicioRif int codigo de la empresa de servicio
     * que presta un servicio (proveedor o empresa de vigilancia)
     */
    public void setEmpresaServicioRif(String empresaServicioRif) {
        this.empresaServicioRif = empresaServicioRif;
    }
}
