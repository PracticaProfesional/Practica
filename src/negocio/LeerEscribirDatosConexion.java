package negocio;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author cooper15
 */
public class LeerEscribirDatosConexion {
    Map<String, String> datos;
    
    FileWriter fichero = null;
    PrintWriter printer = null;
    
    File archivo = null;
    FileReader lector = null;
    BufferedReader bLector = null;
    
    public LeerEscribirDatosConexion(){
    }
    
    public LeerEscribirDatosConexion(Map<String, String> datos){
       this.datos = datos;
    }
    
    private void crearArchivo(){
        try{
            fichero = new FileWriter("configuracion/conf.txt");
            printer = new PrintWriter(fichero);
            printer.println(datos.get("ip"));
            printer.println(datos.get("user"));
            printer.println(datos.get("pass"));
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{
            if(null != fichero)
                try {
                    fichero.close();
            } catch (IOException ex) {
                    System.err.println(ex.getMessage());
            }
        }
    }
    public void guardar(){
        crearArchivo();
    }
    
    private Map<String, String> obtieneDatosCon(){
        Map<String, String> datosRec = new HashMap<>();
        
        try{
           
           Path p = Paths.get("conf.txt");
           archivo = new File(p.toAbsolutePath().toUri());
           lector = new FileReader(archivo);
           bLector = new BufferedReader(lector);
           String linea;
           int contador = 0;
           while((linea = bLector.readLine()) != null){
               switch(contador){
                   case 0: 
                       datosRec.put("ip", linea);
                       break;
                   case 1: 
                       datosRec.put("user", linea);
                       break;
                   case 2: 
                       datosRec.put("pass", linea);
                       break;
               }
               contador ++;
           }
        }
        catch(HeadlessException | IOException e){
            System.err.println(e.getMessage());
        }
        finally{
            try{
                if(null != lector)
                    lector.close();
            }
            catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
        return datosRec;
    }
    
    public Map<String, String> recuperarDatos(){
        return obtieneDatosCon();
    }
    
}
