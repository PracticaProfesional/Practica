package negocio;

import datos.OperacionesReportes;
import java.util.LinkedList;

/**
 *
 * @author cooper15
 */
public class NegocioReportes {
    
    private LinkedList<String> evento;
    private LinkedList<String> sexo;
    private LinkedList<String> fechaNac;
    private LinkedList<String> edad;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public LinkedList<String> getEvento() {
        return evento;
    }

    public LinkedList<String> getSexo() {
        return sexo;
    }

    public LinkedList<String> getFechaNac() {
        return fechaNac;
    }

    public LinkedList<String> getEdad() {
        return edad;
    }
    
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