
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
                                    "'" + objetoSignosVitales.isAlimentacionSaludable()+ "'" + "," +
                                    "'" + objetoSignosVitales.isActividadFisica() + "'" + "," +
                                    "'" + objetoSignosVitales.isSaludSexual() + "'" + "," +
                                    "'" + objetoSignosVitales.isPapanicolaou() + "'" + "," +
                                    "'" + objetoSignosVitales.isTratamientoIntramuscular() + "'" + "," +
                                    "'" + objetoSignosVitales.isTratamientoIntravenoso() + "'" + "," +
                                    "'" + objetoSignosVitales.isTratamientoSubcutaneo() + "'" + "," +
                                    "'" + objetoSignosVitales.isGlicemiaMicroMetodo() + "'" + "," +
                                    "'" + objetoSignosVitales.isCuidadoPrenatal() + "'" + "," +
                                    "'" + objetoSignosVitales.isEntornoSaludable() + "'" + "," +
                                    "'" + objetoSignosVitales.isPrevencionAdicciones() + "'" + "," +
                                    "'" + objetoSignosVitales.isExamenMama() + "'" + "," +
                                    "'" + objetoSignosVitales.isCuraciones() + "'" + "," +
                                    "'" + objetoSignosVitales.getTemperatura() + "'" + "," +
                                    "'" + objetoSignosVitales.getTalla() + "'";
       
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarCita("+datosSignosVitales+")");
        estado.close();
    }// fin del metodo insertarCita
}// fin de la clase OperacionesSignosVitales
