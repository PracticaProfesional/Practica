package negocio;
import datos.OperacionesAntecedentesFamiliares;
import entidad.AntecedenteFamiliar;
import java.sql.SQLException;
/**
 * Esta clase relaciona la clase OperacionesAntecedentesFamiliares con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioAntecedenteFamiliar {

    /**
     * Este método llama al método que inserta un antecedentes familiares 
     * @param antecedenteFamiliar
     * @throws SQLException
     */
    public void insertarAntecedenteFamiliar(AntecedenteFamiliar antecedenteFamiliar) throws SQLException{
       OperacionesAntecedentesFamiliares operacionesAntecedentes = new OperacionesAntecedentesFamiliares();
       operacionesAntecedentes.insertarAntecedentesFamiliares(antecedenteFamiliar);
   }
}
