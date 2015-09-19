/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.ObtenerUltimoId;
/**
 *
 * @author cooper15
 */
public class NegocioObtenerUltimoId {
    public String obtenerUltimoId(String nombreTabla){
        String id = "";
        ObtenerUltimoId ultimoId = new ObtenerUltimoId();
       
        try{
           id = ultimoId.obtenerUltimoId(nombreTabla);
        }
        catch(java.sql.SQLException e){
        }
        return id;
    }
}
