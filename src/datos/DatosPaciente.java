package datos;

import java.sql.SQLException;
import java.sql.Statement;

public class DatosPaciente {
    
    private Conexion objetoDeConexion;
    Statement estado;
    
    public void insertarPaciente()
    {
        try{
            estado = objetoDeConexion.conectar().createStatement();
            estado.executeQuery(null);
            estado.close();
        }// fin de try
        catch (SQLException e)
        {
            
        }// fin de catch
    }// fin del metodo insertarPaciente
    
}// fin de la clase DatosPaciente
