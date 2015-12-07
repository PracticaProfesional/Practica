/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.ObtenerUltimoId;
/**
 * Esta clase relaciona la clase ObtenerUltimoId la capa de presentación
 * @author cooper15
 * @version 1.0, 07/12/2015
 */
public class NegocioObtenerUltimoId {

    /**
     * Este método llama al método en la capa de datos que obtiene el último id de aluguna tabla en la base de datos
     * @param nombreTabla de tipo String que representa el nombre de la tabla del cual se obtendrá el último id
     * @return de tipo String que representa el id(identificador) retorndo por el método llamado
     */
    public String obtenerUltimoId(String nombreTabla){
        String id = "";
        ObtenerUltimoId ultimoId = new ObtenerUltimoId();
       
        id = ultimoId.obtenerUltimoId(nombreTabla);
        return id;
    }
}
