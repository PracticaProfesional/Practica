/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mysql.jdbc.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            ps = conect.conectar().prepareStatement("Insert into ExamenMedico(null, ?, ?)");
            ps.setString(1, archivo.getName());
            ps.setBlob(2, entraDatos);
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
