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
import javax.swing.JOptionPane;

/**
 * Esta clase realiza todas las operaciones correspondientes a los Examenes de Laboratorio y Gabinete (Scanneo)
 * @author cooper15
 * @version 1.0, 06/12/2015
 */
public class OperacionesLaboratorioGabinete {
    private Conexion conect;
    private Statement estado;
    
    /**
     * Inserta los campos correspondientes a examenes de laboratorio y gabinete en la base de datos
     * @param archivo de tipo File que representa el archivo
     * @param idExPaciente de tipo entero que representa id(indentificador)
     */
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
            JOptionPane.showMessageDialog(null, "Imagen guardad con éxito"
                                        ,"Atención", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex ) {
            System.out.println(ex.getMessage());
        } catch(java.sql.SQLException sqle){
            System.out.println(sqle.getErrorCode() + sqle.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
