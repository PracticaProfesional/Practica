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
    
    public void insertarAntecedentesPersonales(AntecedentesPersonales antecPersonales){
        objetoDeConexion = new Conexion();
        String idVacuna;
        String idPadecimiento;
        String idAlergia;
        ObtenerUltimoId obtenerId = new ObtenerUltimoId();
        try{
            idVacuna = obtenerId.obtenerUltimoId("Vacunas");
            idPadecimiento = obtenerId.obtenerUltimoId("Padecimientos");
            idAlergia = obtenerId.obtenerUltimoId("Alergias");

            String datosAntecPersonales = "'" + antecPersonales.getTratamiento() + "'"+ "," + 
                                          "'" + antecPersonales.getMedicamento() + "'" + "," +
                                          "'" + antecPersonales.getAlergias() + "'" + "," +
                                          "'" + antecPersonales.getVacunas() + "'";
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarAntecedentesPersonales("+datosAntecPersonales+")");
            estado.close();
        }
        catch(java.sql.SQLException e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
        
    }
}
