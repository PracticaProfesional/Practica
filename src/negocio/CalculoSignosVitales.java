package negocio;

import java.text.DecimalFormat;

/**
 * Esta clase realiza los cálculo de algunos campos de signos vitales.
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class CalculoSignosVitales {

    /**
     * El IMC es una medida de relacion entre la masa y la talla.
     * La talla ha de ser expresada en centimetros.
     * @param peso representa el peso del paciente en el momento de la consulta
     * @param talla representa la talla del paciente en el momento de la consulta
     * @return un double que representa el indice de masa corporal del paciente
     */
    public double getIndiceMasaCorporal(double peso, double talla){
        double imc;
        imc = peso / Math.pow(talla, 2);
        imc = format(imc);
        return imc;
    }

    /**
     * Cálcula el indice metabólico basal del paciente
     * @param sexo de tipo SexoEnum representa el sexo del paciente
     * @param peso de tipo double que representa el peso del paciente
     * @param talla de tipo double que representa la talla del paciente
     * @param edad de tipo entero represena la edad del paciente
     * @return un double que representa el indice metabólico basal de paciente
     */
    public double getIndiceMetabolicoBasal(entidad.enums.SexoEnum sexo, 
                                           double peso, double talla, int edad){
        double imb = 0.0;
        switch(sexo.getSexo()){
            case 1: imb = (10 * peso) + (6.25 * talla) - (5 * edad) + 5;
                break;
            case 2: imb = (10 * peso) + (6.25 * talla) - (5 * edad) - 161;
                break;
        }
        imb = format(imb);        
        return imb;
    }
    
    private double format(double value) throws NumberFormatException {
        DecimalFormat formateador = new DecimalFormat("####.#");
        value = Double.parseDouble(formateador.format(value));
        return value;
    }
}
