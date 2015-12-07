// @author QUINCHO

package datos;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase realiza las operaciones correspondientes para formar un bean(objeto dentro de listas) 
 * en la base de datos.
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesReporteMedicamentosBean 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Obtiene la información requerida de la tabla Consulta-Inventario
     * @param fechaDesde de tipo String que representa la fecha desde
     * @param fechaHasta de tipo String que representa la fecha hasta
     * @return un objeto ResultSet que contiene los registros retornados por la consulta
     * @throws SQLException
     */
    public ResultSet obtenerDatosConsultaInventario(String fechaDesde, String fechaHasta) throws SQLException
    {
        ResultSet rs;
        String datos = "'" + fechaDesde + "'" + "," +
                       "'" + fechaHasta + "'";
        objetoDeConexion = new Conexion();
        
        estado = objetoDeConexion.conectar().createStatement();
        rs = estado.executeQuery("Call ReporteDeMedicamentos(" + datos + ")");
        return rs;
    }// fin del metodo obtenerDatosConsulaInventario
    
    
}// fin de la clase OperacionesReporteMedicamentosBean
