package negocio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 *
 * @author cooper15
 */
public class GuardarConexion {
    Map<String, String> datos;
    
    FileWriter fichero = null;
    PrintWriter printer = null;
        
    public GuardarConexion(Map<String, String> datos){
       this.datos = datos;
    }
    
    private void crearArchivo(){
        try{
            fichero = new FileWriter("src/configuracion/conf.txt");
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
}
