package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.AntecedenteFamiliar;
/**
 *
 * @author cooper15
 */
public class OperacionesAntecedentesFamiliares 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    
    public void insertarAntecedentesFamiliares(AntecedenteFamiliar antecedenteFamiliar) throws SQLException
    {
        objetoDeConexion = new Conexion();
        
        String datosAntecedentesFamiliares = "'" + antecedenteFamiliar.getParentezco() +"'" + "," +
                                             "'" + antecedenteFamiliar.getDescripcion()+"'";
        
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarAntecedentesFamiliares ("+datosAntecedentesFamiliares+")");
    }// fin del metodo insertarAntecedentesFamiliares     
    
}// fin de la clase OperacionesAntecedentesFamiliares
