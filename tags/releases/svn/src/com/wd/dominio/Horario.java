package com.wd.dominio;

import java.io.Serializable;

/**
 * En esta entidad se almacenara el control de horarios tanto en horas como en 
 * días de trabajo. Para ello existirá un día inicial de semana y un día final 
 * además del horario que cumplirán en horas, usando una hora inicial y una 
 * hora final de trabajo.
 * @author Gerardo Barcia
 */
public class Horario implements Serializable{

    /** variable de identificador*/
    private int id;
    /** variable para la hora inicial*/
    private int horaIni;
    /** variable para la hora final*/
    private int horaFin;
    /** variable para el dia inicial*/
    private String diaIni;
    /** variable para el dia final*/
    private String diaFin;
    /** variable para el dia libre*/
    private String diaLibre;

    /**
     * Constructor de la clase con todos los atributos
     * @param id identificador clave primaria
     * @param horaIni hora inicial
     * @param horaFin hora final
     * @param diaIni el dia inicial {lunes, martes, miercoles,jueves,viernes,
     * sabado,domingo}
     * @param diaFin el dia final {lunes, martes, miercoles,jueves,viernes,
     * sabado,domingo}
     * @param diaLibre el dia que la tienda tenga libre {dias de la semana: lun,
     * mar,etc}
     */
    public Horario(int id, int horaIni, int horaFin, String diaIni, String diaFin,
            String diaLibre) {
        this.id = id;
        this.horaIni = horaIni;
        this.setHoraFin(horaFin);
        this.setDiaIni(diaIni);
        this.setDiaFin(diaFin);
        this.setDiaLibre(diaLibre);
    }
    /** constructor por defecto*/
    public Horario () {
        
    }

    /** Metodo para obtener el dia de fin*/
    public String getDiaFin() {
        return diaFin;
    }

    /** Metodo para establecer el dia de fin
     *  @param diaFin debe ser {lunes,martes,miercoles,jueves,viernes,sabado
     * domingo}
     */
    public void setDiaFin(String diaFin) {
        if (diaFin.equals("LUNES") || diaFin.equals("MARTES") ||
                diaFin.equals("MIERCOLES") || diaFin.equals("JUEVES") ||
                diaFin.equals("VIERNES") || diaFin.equals("SABADO") ||
                diaFin.equals("DOMINGO")) {
            this.diaFin = diaFin;
        } else {
            this.diaFin = null;
        }
    }

    /** Metodo para obtener el dia inicial*/
    public String getDiaIni() {
        return diaIni;
    }

    /** Metodo para establecer el dia inicial
     *  @param diaIni debe ser {lunes,martes,miercoles,jueves,viernes,sabado
     * domingo}
     */
    public void setDiaIni(String diaIni) {
        if (diaIni.equals("LUNES") || diaIni.equals("MARTES") ||
                diaIni.equals("MIERCOLES") || diaIni.equals("JUEVES") ||
                diaIni.equals("VIERNES") || diaIni.equals("SABADO") ||
                diaIni.equals("DOMINGO")) {
            this.diaIni = diaIni;
        } else {
            this.diaIni = null;
        }
    }

    /** Metodo para obtener la hora de fin*/
    public int getHoraFin() {
        return horaFin;
    }

    /** Metodo para establecer el dia inicial
     *  @param horaFin la hora de fin
     */
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    /** Metodo para obtener la hora de inicio*/
    public int getHoraIni() {
        return horaIni;
    }

    /** Metodo para establecer la hora de inicio
     *  @param horaIni la hora de inicio
     */
    public void setHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    /** Metodo para obtener el id*/
    public int getId() {
        return id;
    }

    /** Metodo para establecer el id
     *  @param id establecer el identificador
     */
    public void setId(int id) {
        this.id = id;
    }

    /** Metodo para obtener el dia libre
     */
    public String getDiaLibre() {
        return diaLibre;
    }

    /** Metodo para establecer el id
     *  @param diaLibre String dia libre a establecer
     */
    public void setDiaLibre(String diaLibre) {
            this.diaLibre = diaLibre;
        }
}
