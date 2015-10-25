package datos;

import java.sql.Statement;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author cooper15
 */
public class OperacionesReportes {
    private Conexion objetoDeConexion;
    private Statement estado;
    private LinkedList<String> evento;
    private LinkedList<String> sexo;
    private LinkedList<String> fechaNac;

    public LinkedList<String> getEvento(){
        return evento;
    }

    public LinkedList<String> getSexo() {
        return sexo;
    }

    public LinkedList<String> getFechaNac() {
        return fechaNac;
    }
            
    public void reporteMS(String dateDesde, String dateHasta){
        evento = new LinkedList<>();
        sexo = new LinkedList<>();
        fechaNac = new LinkedList();
        String datos = "'"+dateDesde+"'"+","+"'"+dateHasta+"'";
        objetoDeConexion = new Conexion();
        java.sql.ResultSet rs = null;
        try{
            estado = objetoDeConexion.conectar().createStatement();
            rs = estado.executeQuery("Call ReporteMS("+datos+")");
            while(rs.next()){
                evento.add(rs.getString("diagnostico"));
                sexo.add(rs.getString("sexo"));
                fechaNac.add(rs.getString("fechaNacimientoPaciente"));
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        }  
    }
}
