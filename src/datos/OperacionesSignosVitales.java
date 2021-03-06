
package datos;

import entidad.SignosVitales;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza las operaciones correspondientes a Signos Vitales en la base de datos
 * @author QUINCHO 
 * @version 1.0, 06/12/2015
 */
public class OperacionesSignosVitales
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Este metodo es el encargado de insertar los campos correspondientes a Signos Vitales en la base de datos
     * @param objetoSignosVitales de tipo SignosVitales que representa los datos de signos vitales
     */
    public void insertarSignosVitales(SignosVitales objetoSignosVitales) 
    {
        objetoDeConexion = new Conexion();
       try{
            String datosSignosVitales = "'" + objetoSignosVitales.getPeso() + "'" + "," + 
                                    "'" + objetoSignosVitales.getFrecuenciaCardiaca() + "'" + "," + 
                                    "'" + objetoSignosVitales.getPresionArterial() + "'" + "," +
                                    "'" + objetoSignosVitales.getIndiceMasaCorporal() + "'" + "," +
                                    "'" + objetoSignosVitales.getIndiceMetabolicoBasal() + "'" + "," +
                                    "'" + objetoSignosVitales.getAguaCorporal() + "'" + "," +
                                    "'" + objetoSignosVitales.getMasaCorporal() + "'" + "," +
                                    "'" + objetoSignosVitales.getGrasaCorporal() + "'" + "," +
                                    "'" + objetoSignosVitales.getAlimentacionSaludable() + "'" + "," +
                                    "'" + objetoSignosVitales.getActividadFisica() + "'" + "," +
                                    "'" + objetoSignosVitales.getSaludSexual() + "'" + "," +
                                    "'" + objetoSignosVitales.getPapanicolaou() + "'" + "," +
                                    "'" + objetoSignosVitales.getTratamientoIntramuscular() + "'" + "," +
                                    "'" + objetoSignosVitales.getTratamientoIntravenoso() + "'" + "," +
                                    "'" + objetoSignosVitales.getTratamientoSubcutaneo() + "'" + "," +
                                    "'" + objetoSignosVitales.getGlicemiaMicroMetodo() + "'" + "," +
                                    "'" + objetoSignosVitales.getCuidadoPrenatal() + "'" + "," +
                                    "'" + objetoSignosVitales.getEntornoSaludable() + "'" + "," +
                                    "'" + objetoSignosVitales.getPrevencionAdicciones() + "'" + "," +
                                    "'" + objetoSignosVitales.getExamenMama() + "'" + "," +
                                    "'" + objetoSignosVitales.getCuraciones() + "'" + "," +
                                    "'" + objetoSignosVitales.getTemperatura() + "'" + "," +
                                    "'" + objetoSignosVitales.getTalla() + "'";
       
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarSignosVitales("+datosSignosVitales+")");
            estado.close(); 
       }
       catch(java.sql.SQLException e){
           System.out.println(e.getErrorCode() + e.getMessage());
       }
       
    }// fin del metodo insertarCita
}// fin de la clase OperacionesSignosVitales
