package presentacion.reportes;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jopendocument.dom.OOUtils;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;
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
    private File outputFile;
    private int contador = 0;
    private Sheet hoja;

    public void generarReporteMS(String dateDesde, String dateHasta){
        negocio.NegocioReportes reporte  = new negocio.NegocioReportes();
        reporte.reporteMs(dateDesde, dateHasta);
        listEvento = reporte.getEvento();
        listSexo = reporte.getSexo();
        listEdad = reporte.getEdad();
        mapeoCalc();
    }
    
    private void mapeoCalc(){
        listaMasc = new LinkedList<>();
        listFem = new LinkedList<>();
        clasifica();
//        for(String elemento: listEvento)
//            System.out.println(elemento);
//
//        for(String elemento: listSexo)
//            System.out.print(elemento);
//        System.out.print("\n");
//        for(String elemento: listEdad)
//            System.out.print(elemento+"-");
        
        
    }

    private void clasifica() {
        for(int i = 0; i < listEvento.size(); i++){
            switch(listEvento.getFirst()){
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
                default:
                    listSexo.removeFirst();
                    listEdad.removeFirst();
                    break;
//                case "Otros padecimientos importantes":
//                    clasificaEdad("30");
//                    break;        
            }
            listEvento.removeFirst();
        }
        try {
                outputFile = new File ("src/presentacion/reportes/plantillas/Reporte_Generado.ods");
                hoja.getSpreadSheet().saveAs(outputFile);
                OOUtils.open(outputFile);
            } catch (IOException ex) {
                Logger.getLogger(ReporteMinisterioSalud.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void clasificaEdad(String fila){
        for(int i = 0; i < listEdad.size(); i++){
            if(Integer.parseInt(listEdad.getFirst()) < 1){
                clasificaSexo(fila, "B", "C");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 1 & Integer.parseInt(listEdad.getFirst()) <= 4){
                clasificaSexo(fila, "D", "E");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 4 & Integer.parseInt(listEdad.getFirst()) <= 9){
                clasificaSexo(fila, "F", "G");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 9 & Integer.parseInt(listEdad.getFirst()) <= 14){
                clasificaSexo(fila, "H", "I");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 14 & Integer.parseInt(listEdad.getFirst()) <= 19){
                clasificaSexo(fila, "J", "K");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 19 & Integer.parseInt(listEdad.getFirst()) <= 24){
                clasificaSexo(fila, "J", "M");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 24 & Integer.parseInt(listEdad.getFirst()) <= 29){
                clasificaSexo(fila, "N", "O");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 29 & Integer.parseInt(listEdad.getFirst()) <= 34){
                clasificaSexo(fila, "P", "Q");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 34 & Integer.parseInt(listEdad.getFirst()) <= 39){
                clasificaSexo(fila, "R", "S");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 39 & Integer.parseInt(listEdad.getFirst()) <= 44){
                clasificaSexo(fila, "T", "U");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 44 & Integer.parseInt(listEdad.getFirst()) <= 49){
                clasificaSexo(fila, "V", "W");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 49 & Integer.parseInt(listEdad.getFirst()) <= 54){
                clasificaSexo(fila, "X", "Y");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 54 & Integer.parseInt(listEdad.getFirst()) <= 59){
                clasificaSexo(fila, "Z", "AA");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 59 & Integer.parseInt(listEdad.getFirst()) <= 64){
                clasificaSexo(fila, "AB", "AC");
                listEdad.removeFirst();
                return;
            }
            if(Integer.parseInt(listEdad.getFirst()) > 64){
                clasificaSexo(fila, "AD", "AE");
                listEdad.removeFirst();
                return;
            }
        }
    }
    private void clasificaSexo(String fila, String col1, String col2){
        String url = "src/presentacion/reportes/plantillas/templateMinisterioSalud.ods";
        java.io.File archivo = new java.io.File(url);
        if(contador == 0){
            try{  
                hoja = SpreadSheet.createFromFile(archivo).getSheet(0);
            }
            catch(java.io.IOException ioe){
                System.err.println(ioe.getMessage());
            }
        }
        
        for(int i = 0; i < listSexo.size();i++){
            if(listSexo.getFirst().equals("1")){
                Object obj = "1";
                hoja.getCellAt(col1+fila).setValue(obj);
                listSexo.removeFirst();
                contador++;
                    return;
            }
            else
                if(listSexo.getFirst().equals("2")){
                    Object obj = "2";
                    hoja.getCellAt(col2+fila).setValue(obj);    
                    listSexo.removeFirst();
                    contador++;
                        return;
                }
        }
        
    }
    
}
