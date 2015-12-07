package negocio;

import datos.OperacionesReportes;
import java.util.LinkedList;

/**
 * Esta clase relaciona la clase OperacionesReportes con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioReportes {
    
    private LinkedList<String> evento;
    private LinkedList<String> sexo;
    private LinkedList<String> fechaNac;
    private LinkedList<String> edad;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    /**
     * Obtiene el evento
     * @return un LinkedList que representa el evento
     */
    public LinkedList<String> getEvento() {
        return evento;
    }

    /**
     * Obtiene el sexo
     * @return un LinkedList que representa el sexo
     */
    public LinkedList<String> getSexo() {
        return sexo;
    }

    /**
     * Obtiene la fecha de nacimiento
     * @return un LinkedList que representa la fecha de nacimiento
     */
    public LinkedList<String> getFechaNac() {
        return fechaNac;
    }

    /**
     * Obtiene la edad
     * @return un LinkedList que representa la edad
     */
    public LinkedList<String> getEdad() {
        return edad;
    }
    
    /**
     * Construye un reporte dirigido al ministerio de salud a partir de información de la base de datos 
     * @param dateDesde de tipo String que representa la fecha desde
     * @param dateHasta de tipo String que representa la fecha hasta
     */
    public void reporteMs(String dateDesde, String dateHasta){
        OperacionesReportes reporte = new OperacionesReportes();
        reporte.reporteMS(dateDesde, dateHasta);
        evento = reporte.getEvento();
        sexo = reporte.getSexo();
        fechaNac = reporte.getFechaNac();
        obtenerEdades();
    }
    
    private void obtenerEdades(){
        edad = new LinkedList<>();
        Edad getEdad = new Edad();
        for(String fecha: fechaNac){
            splitFechaNac(fecha);
            edad.add(getEdad.getAge(yearBirth, monthBirth, dayBirth));
        }
    }
    private void splitFechaNac(String fecha){
        String year = "";
        String month = "";
        String day = "";
        int [] indexY = {0, 1, 2, 3};
        int [] indexM = {5, 6};
        int [] indexD = {8, 9};
        for(int i:indexY)
            year += fecha.charAt(i);
        this.yearBirth = Integer.parseInt(year);
        for(int m:indexM)
            month += fecha.charAt(m);
        this.monthBirth = Integer.parseInt(month);
        for(int d:indexD)
            day += fecha.charAt(d);
        this.dayBirth = Integer.parseInt(day);
    }
}