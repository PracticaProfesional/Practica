 // @author QUINCHO

package datos;

import entidad.AntecedentesPersPad;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesAntecedentesPersPad 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarAntecedentePersPad(AntecedentesPersPad nuevoAntecedente)
    {
        objetoDeConexion = new Conexion();
        String datosAntecedentes = "'"+nuevoAntecedente.getIdPadecimientos()+"'"+","
                                   +"'"+nuevoAntecedente.getIdAntecedentesPersonales()+"'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarAntecedentesPersonalesPadecimientos("+datosAntecedentes+")");
            estado.close();
        }
        catch(SQLException e)
        {
        }// fin de catch
    }// fin del metodo insertar
    
}// fin de la clase OperacionesAntecedentesPersPad
