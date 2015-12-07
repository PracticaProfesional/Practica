/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import entidad.Telefono;
import datos.OperacionesTelefono;
/**
 * Esta clase relaciona la clase OperacionesTelefono con la capa de presentación
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class NegocioTelefono {

    /**
     * Este método llama al método en la capa de datos  que inserta un número de teléfono 
     * de un paciente en la base de datos.
     * @param nuevoTelefono de tipo Telefono que representa los datos a insertar de telefono
     */
    public void insertarTelefono (Telefono nuevoTelefono){
        OperacionesTelefono opTelefono = new OperacionesTelefono();
        opTelefono.insertarTelefono(nuevoTelefono);
    }
}
