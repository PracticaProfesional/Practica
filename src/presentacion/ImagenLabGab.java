package presentacion;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;


/**
 *
 * @author cooper15
 */
public class ImagenLabGab extends javax.swing.JPanel{
    int ancho;
    int largo;
    String ruta;
    public ImagenLabGab (javax.swing.JPanel panel, String ruta){
        this.ruta = ruta;
        this.ancho = panel.getWidth();
        this.largo = panel.getHeight();
        this.setSize(10000, 10000);
    }
    @Override
    public void paint(Graphics g){
        System.out.println(ruta);
        if(ruta != null){
            Image imagen = new ImageIcon(ruta).getImage();
            
            g.drawImage(imagen, 0, 0, imagen.getWidth(this), imagen.getHeight(this), null);

        }
        else
            System.err.println("Error al cargar la imagen");
            
    }
}
