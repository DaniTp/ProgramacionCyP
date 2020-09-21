package JDrones;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;


public class DibujaDrones extends JPanel{
    private MiX x;
    private MiY y;
    private NumDron n;
    private BufferedImage ima;
    DibujaDrones(MiX x, MiY y,NumDron n, BufferedImage ima){
          setBackground(Color.GRAY);
          this.ima=ima;
          this.x=x;
          this.y=y;
          this.n=n;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(ima,0,0,this);
        g2.setColor(Color.black);
        g2.fill(new Ellipse2D.Double(x.getX(),y.getY(),20,20));
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(n.getConta()),x.getX()+8, y.getY()+12);
        
       
       
        
    }
}
