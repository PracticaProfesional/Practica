package presentacion.reportes;

import java.util.LinkedList;

/**
 *
 * @author cooper15
 */
public class ReporteMinisterioSalud {
    private LinkedList<String> listEvento;
    private LinkedList<String> listSexo;
    private LinkedList<String> listEdad;
    private LinkedList<String> listaMasc;
    private LinkedList<String> listFem;

    public void generarReporteMS(String dateDesde, String dateHasta){
        negocio.NegocioReportes reporte  = new negocio.NegocioReportes();
        reporte.reporteMs(dateDesde, dateHasta);
        listEvento = reporte.getEvento();
        listSexo = reporte.getSexo();
        listEdad = reporte.getEdad();
    }
    
    private void mapeoCalc(){
        listaMasc = new LinkedList<>();
        listFem = new LinkedList<>();
        clasifica();
    }

    private void clasifica() {
        for(String evento:listEvento){
            switch(evento){
                case "Accidentes ofídicos":
                    clasificaEdad("14");
                    break;
                case "Filariasis":
                    clasificaEdad("15");
                    break;
                case "Leishmaniasis":
                    clasificaEdad("16");
                    break;
                case "Conjuntivitis hemorrágicas":
                    clasificaEdad("17");
                    break;
                case "Enfermedades diarreicas agudas (EDAS)":
                    clasificaEdad("18");
                    break;
                case "Infecciones respiratoriasagudas (IRAS)":
                    clasificaEdad("19");
                    break;
                case "Enfermedad tipo influenza (ETI)":
                    clasificaEdad("20");
                    break;
                case "Pediculosis":
                    clasificaEdad("21");
                    break;
                case "Anquilostomiasis":
                    clasificaEdad("22");
                    break;
                case "Necatoriasis":
                    clasificaEdad("23");
                    break;
                case "Ascariasis":
                    clasificaEdad("24");
                    break;
                case "Depresión":
                    clasificaEdad("25");
                    break;
                case "Trichuriasis":
                    clasificaEdad("26");
                    break;
                case "Enterobiasis":
                    clasificaEdad("27");
                    break;
                case "Otras Helmintiasis Intestinales":
                    clasificaEdad("28");
                    break;
                case "Parasitosis intestinal sin especificar":
                    clasificaEdad("29");
                    break;
//                case "Otros padecimientos importantes":
//                    clasificaEdad("30");
//                    break;        
            }
        }
    }
    
    private void clasificaEdad(String fila){
        for(String edad: listEdad){
            if(Integer.parseInt(edad) < 1){
                clasificaSexo(fila, "B", "C");
            }
            if(Integer.parseInt(edad) > 1 & Integer.parseInt(edad) <= 4){
                clasificaSexo(fila, "D", "E");
            }
            if(Integer.parseInt(edad) > 4 & Integer.parseInt(edad) <= 9){
                clasificaSexo(fila, "F", "G");
            }
            if(Integer.parseInt(edad) > 9 & Integer.parseInt(edad) <= 14){
                clasificaSexo(fila, "H", "I");
            }
            if(Integer.parseInt(edad) > 14 & Integer.parseInt(edad) <= 19){
                clasificaSexo(fila, "J", "K");
            }
            if(Integer.parseInt(edad) > 19 & Integer.parseInt(edad) <= 24){
                clasificaSexo(fila, "J", "M");
            }
            if(Integer.parseInt(edad) > 24 & Integer.parseInt(edad) <= 29){
                clasificaSexo(fila, "N", "O");
            }
            if(Integer.parseInt(edad) > 29 & Integer.parseInt(edad) <= 34){
                clasificaSexo(fila, "P", "Q");
            }
            if(Integer.parseInt(edad) > 34 & Integer.parseInt(edad) <= 39){
                clasificaSexo(fila, "R", "S");
            }
            if(Integer.parseInt(edad) > 39 & Integer.parseInt(edad) <= 44){
                clasificaSexo(fila, "T", "U");
            }
            if(Integer.parseInt(edad) > 44 & Integer.parseInt(edad) <= 49){
                clasificaSexo(fila, "V", "W");
            }
            if(Integer.parseInt(edad) > 49 & Integer.parseInt(edad) <= 54){
                clasificaSexo(fila, "X", "Y");
            }
            if(Integer.parseInt(edad) > 54 & Integer.parseInt(edad) <= 59){
                clasificaSexo(fila, "Z", "AA");
            }
            if(Integer.parseInt(edad) > 59 & Integer.parseInt(edad) <= 64){
                clasificaSexo(fila, "AB", "AC");
            }
            if(Integer.parseInt(edad) > 64){
                clasificaSexo(fila, "AD", "AE");
            }
        }
    }
    private void clasificaSexo(String fila, String col1, String col2){
        for(String sexo: listSexo){
            switch(sexo){
                case "1":
                    break;
                case "2":
                    break;
            }
        }
    }
    
}
