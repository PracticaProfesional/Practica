package datos;

import entidad.AntecedentesPersPad;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza operaciones correspondientes  a la asociación de Antecedentes Personales con Padecimientos
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class OperacionesAntecedentesPersPad 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondientes a la asociación de Antecedente Personales con Padecimientos, en la base de datos
     * @param nuevoAntecedente de tipo AntecedentesPersPad que representa los datos Antecedentes Personales del Paciente
     */
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
    }// fin del metodo insertarAntecedentePersPad
    
}// fin de la clase OperacionesAntecedentesPersPad
