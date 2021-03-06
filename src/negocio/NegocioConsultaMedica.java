 // @author QUINCHO

package negocio;

import entidad.ConsultaMedica;
import datos.OperacionesConsultaMedica;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Esta clase relaciona la clase OperacionesConsultaMedica con la capa de presentación
 * @author QUINCHO
 * @version 1.0, 06/12/2015
 */
public class NegocioConsultaMedica 
{

    /**
     * Este método llama al método en la capa de datos que inserta una consulta médica
     * @param nuevaConsultaMedica
     */
    public void insertarConsultaMedica(ConsultaMedica nuevaConsultaMedica)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarConsultaMedica(nuevaConsultaMedica);
    }// fin del metodo insertarConsultaMedica

    /**
     * Este método llama al método en la capa de datos que actuliza una consulta médica
     * @param idExpediente de tipo String que representa el id(identificador) de un registro de expediente médico
     * @param actConsulta de tipo ConsultaMedica que representa los datos a actualizar
     * @param fecha de tipo String que representa la fecha
     */
    public void actualizarConsultaMedica(String idExpediente, entidad.ConsultaMedica actConsulta, String fecha){
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.actualizarConsultaMedica(idExpediente, actConsulta, fecha);
    }
    
    /**
     * Este método llama al método en la capa de datos que inserta una receta en la consulta médica
     * @param idExpediente de tipo String que representa el id(identificador) de un registro de expediente médico
     * @param fecha de tipo String que representa la fecha
     * @param idReceta de tipo String que representa el id(identificador) de la receta
     */
    public void insertarRecetaEnConsulta(String idExpediente, String fecha, String idReceta)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarRecetaEnConsulta(idExpediente, fecha, idReceta);
    }// fin del metodo insertarRecetaEnConsulta
    
    /**
     * Este método llama al método en la capa de datos que inserta la relación de receta física con consulta médica
     * Receta: representa la lista de medicamentos que se le entrega al paciente
     * Receta Física: representa los medicamentos que se le entregan en físico al paciente y se descuentan del inventario
     * @param nombreMedicamento de tipo String que representa el medicamento a relacionar la consulta médica
     * @param cantidad de tipo String que representa la cantidad del medicamento que se entrega al paciente
     */
    public void insertarRecetaFisica(String nombreMedicamento, String cantidad)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.insertarRecetaFisica(nombreMedicamento, cantidad);
    }// fin del metodo insertarRecetaFisica
    
    public ResultSet listarConsultasPorPaciente(String idExpediente) throws SQLException
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        return operacionesConsultaMedica.listarConsultasPorPaciente(idExpediente);
    }// fin del metodo listarConsultasPorPaciente
    
    public ResultSet obtenerDatosConsulta(String idConsultaMedica) throws SQLException
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        return operacionesConsultaMedica.obtenerDatosConsulta(idConsultaMedica);
    }// fin del metodo listarConsultasPorPaciente
    
    public void actualizarConsultaMedica(String idConsultaMedica, entidad.ConsultaMedica actConsulta){
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.actualizarConsultaMedica(idConsultaMedica, actConsulta);
    }
    
    public void eliminarConsultaMedica(String idConsultaMedica)
    {
        OperacionesConsultaMedica operacionesConsultaMedica = new OperacionesConsultaMedica();
        operacionesConsultaMedica.eliminarConsultaMedica(idConsultaMedica);
    }// fin del metodo eliminarConsultaMedica
    
}// fin de la clase NegocioConsultaMedica
