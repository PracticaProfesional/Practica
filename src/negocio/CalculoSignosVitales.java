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
            case 1: imb = 66 + (13.75 * peso) + (5.08 * talla) - (6.78 * edad);
                break;
            case 2: imb = 655 + (9.56 * peso) + (1.85 * talla) - (4.68 * edad);
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
