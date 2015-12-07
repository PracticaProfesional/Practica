package datos;

import entidad.AntecedentesFamPad;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta clase realiza operaciones correspondientes a la asociación de Antecedentes Familiares con Padecimientos
 * @author QUINCHO
 */
public class OperacionesAntecedentesFamPad 
{
    private Conexion objetoDeConexion;
    private Statement estado;
    
    /**
     * Inserta campos correspondientes a la asociación de Antecedente Familiares con Padecimientos, en la base de datos
     * @param nuevoAntecedenteFamiliar de tipo AntecedentesFamPad que representa los  datos de Antecedentes Familiares del Paciente
     */
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
            System.out.println(e.getErrorCode() + e.getMessage());
        }// fin de catch
    }// fin del metodo insertarAntecedentePersPad
}// fin de la clase OperacionesAntecedentesFamPad
