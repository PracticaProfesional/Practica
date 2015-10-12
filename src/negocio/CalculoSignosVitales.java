package negocio;

import java.text.DecimalFormat;

/**
 *
 * @author cooper15
 */
public class CalculoSignosVitales {

    /**
     * El IMC es una medida de relacion entre la masa y la talla.
     * La talla ha de ser expresada en centimetros.
     * @param peso 
     * @param talla
     * @return imc
     */
    public double getIndiceMasaCorporal(double peso, double talla){
        double imc;
        imc = peso / Math.pow(talla, 2);
        imc = format(imc);
        return imc;
    }

    public double getIndiceMetabolicoBasal(entidad.enums.SexoEnum sexo, 
                                           double peso, double talla, int edad){
        double imb = 0.0;
        switch(sexo.getSexo()){
            case 1: imb = (10 * peso) + (6.25 * talla) + (5 * edad) + 5;
                break;
            case 2: imb = (10 * peso) + (6.25 * talla) - (5 * edad) - 161;
                break;
        }
        imb = format(imb);        
        return imb;
    }
    
    private double format(double value) throws NumberFormatException {
        DecimalFormat formateador = new DecimalFormat("####.###");
        value = Double.parseDouble(formateador.format(value));
        return value;
    }
}
