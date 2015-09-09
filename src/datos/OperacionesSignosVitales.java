
package datos;

import entidad.SignosVitales;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesSignosVitales
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarSignosVitales(SignosVitales objetoSignosVitales) throws SQLException
    {
        objetoDeConexion = new Conexion();
       
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
        estado.executeQuery("Call InsertarCita("+datosSignosVitales+")");
        estado.close();
    }// fin del metodo insertarCita
}// fin de la clase OperacionesSignosVitales
