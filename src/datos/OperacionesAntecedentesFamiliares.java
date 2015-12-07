package datos;

import java.sql.SQLException;
import java.sql.Statement;
import entidad.AntecedenteFamiliar;
/**
 * Esta clase realiza las operaciones correspondientes a Antecedentes Familiares
 * @author cooper15
 * @version 1.0 05/12/2015
 */
public class OperacionesAntecedentesFamiliares 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondiente a Antecedentes Familiares en la base de datos
     * @param antecedenteFamiliar de tipo AntecedenteFamiliar que representa los datos de un Antecedente Familiar
     * @throws SQLException
     */
    public void insertarAntecedentesFamiliares(AntecedenteFamiliar antecedenteFamiliar) throws SQLException
    {
        objetoDeConexion = new Conexion();
        
        String datosAntecedentesFamiliares = "'" + antecedenteFamiliar.getParentezco() +"'" + "," +
                                             "'" + antecedenteFamiliar.getDescripcion()+"'";
        
        estado = objetoDeConexion.conectar().createStatement();
        estado.executeQuery("Call InsertarAntecedentesFamiliares ("+datosAntecedentesFamiliares+")");
    }// fin del metodo insertarAntecedentesFamiliares     
    
}// fin de la clase OperacionesAntecedentesFamiliares
