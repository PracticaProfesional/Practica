package datos;

import java.sql.Statement;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * Esta clase representa las operaciones correspondientes a reportes en la base de datos (No existe entidad reportes)
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class OperacionesReportes {
    private Conexion objetoDeConexion;
    private Statement estado;
    private LinkedList<String> evento;
    private LinkedList<String> sexo;
    private LinkedList<String> fechaNac;

    /**
     * Obtiene el evento
     * @return un LinkedList que representa el evento
     */
    public LinkedList<String> getEvento(){
        return evento;
    }

    /**
     * Obtiene el sexo
     * @return un LinkedList que representa el sexo
     */
    public LinkedList<String> getSexo() {
        return sexo;
    }

    /**
     * Obtiene la fecha de nacimiento
     * @return un LinkedList que representa la fecha de nacimiento
     */
    public LinkedList<String> getFechaNac() {
        return fechaNac;
    }
            
    /**
     * Construye un reporte dirigido al ministerio de salud a partir de información de la base de datos 
     * @param dateDesde de tipo String que representa la fecha desde
     * @param dateHasta de tipo String que representa la fecha hasta
     */
    public void reporteMS(String dateDesde, String dateHasta){
        evento = new LinkedList<>();
        sexo = new LinkedList<>();
        fechaNac = new LinkedList<>();
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
