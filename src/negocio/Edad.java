package negocio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase utilitaria para calcular la edad de los pacientes.
 * @author cooper15
 */
public class Edad {
    private int birthYear;
    private int birthMonth;
    private int currentYear;
    private int currentMonth;

    
    /**
     * Metodo recibe los parametros correspondientes y retorna la edad, según se 
     * cumplan una serie de criterios. 
     * @param birthYear
     * @param birthMonth
     * @param birthDay
     * @return edad retorna la edad calculada previamente
     */
    public String getAge(int birthYear, int birthMonth, int birthDay){
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        getCurrentDate();
        int aniosTranscurridos;
        aniosTranscurridos = currentYear - this.birthYear;
        switch(difMeses()){
            case 0: return Integer.toString(aniosTranscurridos);
            case 1: return Integer.toString(aniosTranscurridos);
            case 2: return Integer.toString(aniosTranscurridos - 1);
            default: return "Invalid";
        }
    }
    
    private int difMeses(){
        if (currentMonth > birthMonth)
            return 0;
        if (currentMonth == birthMonth)
            return 1;
        if (currentMonth < birthMonth)
            return 2;
        return -1;
    }
    
    private void getCurrentDate(){
        Calendar fechaActual = new GregorianCalendar();
        currentYear = fechaActual.get(Calendar.YEAR);
        currentMonth = fechaActual.get(Calendar.MONTH) + 1;
        currentDay = fechaActual.get(Calendar.DAY_OF_MONTH);
    }
}