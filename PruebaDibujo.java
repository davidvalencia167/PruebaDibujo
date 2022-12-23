package pruebadibujo;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class PruebaDibujo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoConDibujos mimarco = new MarcoConDibujos();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoConDibujos extends JFrame {
    
    public MarcoConDibujos() {
        
        setTitle("prueba de dibujo");
        
        setSize(400, 400);
        
        LaminaConFiguras milamina = new LaminaConFiguras();
        
        add(milamina); // AGREGAR LA LAMINA
        
        milamina.setBackground(SystemColor.window);
    }
}

class LaminaConFiguras extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g); //LLAMAR AL METODO DE LA CLASE PADRE
        
        Graphics2D g2 = (Graphics2D) g; // REFUNDICION
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        
        g2.setPaint(Color.blue);
        
        g2.draw(rectangulo);
        
        g2.setPaint(Color.RED);
        
        g2.fill(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        Color micolor = new Color(125, 189, 200);
        
        g2.setPaint(micolor);
        
        g2.fill(elipse);
        
   }
}