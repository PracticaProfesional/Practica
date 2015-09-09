package negocio;
import datos.OperacionesAntecedentesFamiliares;
import entidad.AntecedenteFamiliar;
import java.sql.SQLException;
/**
 *
 * @author cooper15
 */
public class NegocioAntecedenteFamiliar {
   public void insertarAntecedenteFamiliar(AntecedenteFamiliar antecedenteFamiliar) throws SQLException{
       OperacionesAntecedentesFamiliares operacionesAntecedentes = new OperacionesAntecedentesFamiliares();
       operacionesAntecedentes.insertarAntecedentesFamiliares(antecedenteFamiliar);
   }
}
