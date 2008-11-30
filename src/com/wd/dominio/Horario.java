package com.wd.dominio;

/**
 * En esta entidad se almacenara el control de horarios tanto en horas como en 
 * días de trabajo. Para ello existirá un día inicial de semana y un día final 
 * además del horario que cumplirán en horas, usando una hora inicial y una 
 * hora final de trabajo.
 * @author Gerardo Barcia
 */
public class Horario {

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

    /**
     * Constructor de la clase con todos los atributos
     * @param id identificador clave primaria
     * @param horaIni hora inicial
     * @param horaFin hora final
     * @param diaIni el dia inicial {lunes, martes, miercoles,jueves,viernes,
     * sabado,domingo}
     * @param diaFin el dia final {lunes, martes, miercoles,jueves,viernes,
     * sabado,domingo}
     */
    public Horario(int id, int horaIni, int horaFin, String diaIni, String diaFin) {
        this.id = id;
        this.horaIni = horaIni;
        this.setHoraFin(horaFin);
        this.setDiaIni(diaIni);
        this.setDiaFin(diaFin);
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
}
