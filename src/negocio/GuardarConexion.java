package negocio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Esta clase se encarga de guardar los datos para realizar la conexión cliente-servidor
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class GuardarConexion {
    Map<String, String> datos;
    
    FileWriter fichero = null;
    PrintWriter printer = null;
        
    /**
     * Este método guarda los datos de la conexión
     * @param datos de tipo Map
     */
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

    /**
     * Este metodo guarda el fichero
     */
    public void guardar(){
        crearArchivo();
    }
}
