 // @author QUINCHO

package datos;

import entidad.AntecedentesFamPad;
import java.sql.SQLException;
import java.sql.Statement;


public class OperacionesAntecedentesFamPad 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    public void insertarAntecedenteFamiliarPadecimiento(AntecedentesFamPad nuevoAntecedenteFamiliar)
    {
        objetoDeConexion = new Conexion();
        String datosAntecedentes = "'"+nuevoAntecedenteFamiliar.getIdPadecimiento()+"'"+","
                                   +"'"+nuevoAntecedenteFamiliar.getIdAntecedenteFamiliar()+"'";
        
        try
        {
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery("Call InsertarAntecedentesFamiliaresPadecimientos("+datosAntecedentes+")");
            estado.close();
        }
        catch(SQLException e)
        {
        }// fin de catch
    }// fin del metodo insertarAntecedentePersPad
}// fin de la clase OperacionesAntecedentesFamPad
