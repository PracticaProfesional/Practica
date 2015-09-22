package datos;

import entidad.AntecedentesPersonales; // cambiar al paquete de negocios.
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesAntecedentesPersonales {
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarAntecedentesPersonales(AntecedentesPersonales antecPersonales) throws SQLException{
        objetoDeConexion = new Conexion();
        String idVacuna;
        String idPadecimiento;
        String idAlergia;
        ObtenerUltimoId obtenerId = new ObtenerUltimoId();
        idVacuna = obtenerId.obtenerUltimoId("Vacunas");
        idPadecimiento = obtenerId.obtenerUltimoId("Padecimientos");
        idAlergia = obtenerId.obtenerUltimoId("Alergias");
        
        String datosAntecPersonales = "'" + idAlergia + "'"+ "," + 
                                      "'" + antecPersonales.getTratamiento() + "'" + "," +
                                      "'" + idVacuna + "'" + "," +
                                      "'" + antecPersonales.getMedicamento() + "'";
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarAntecedentesPersonales("+datosAntecPersonales+")");
        estado.close();
    }
}
