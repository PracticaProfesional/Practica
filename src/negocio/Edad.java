package negocio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author cooper15
 */
public class Edad {
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int currentYear;
    private int currentMonth;
    private int currentDay;
    
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