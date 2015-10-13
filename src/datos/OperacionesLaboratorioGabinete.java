/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Statement;

/**
 *
 * @author cooper15
 */
public class OperacionesLaboratorioGabinete {
    private Conexion conect;
    private Statement estado;
    public void insertarLaboratorio(java.io.File archivo, int idExPaciente){
        conect = new Conexion();
        
        try {
            FileInputStream entraDatos = new FileInputStream(archivo);
            java.sql.PreparedStatement ps;
            ps = conect.conectar().prepareStatement("Insert into ExamenMedico values(null, ?, ?)");
            ps.setBlob(1, entraDatos);
            ps.setInt(2, idExPaciente);
            ps.execute();
            entraDatos.close();
            ps.close();
            
        } catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        } catch(java.sql.SQLException sqle){
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
