/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import entidad.Telefono;
import datos.OperacionesTelefono;
/**
 *
 * @author cooper15
 */
public class NegocioTelefono {
    public void insertarTelefono (Telefono nuevoTelefono){
        OperacionesTelefono opTelefono = new OperacionesTelefono();
        opTelefono.insertarTelefono(nuevoTelefono);
    }
}
