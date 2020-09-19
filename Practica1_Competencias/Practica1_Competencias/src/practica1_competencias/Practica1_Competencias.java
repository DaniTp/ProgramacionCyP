package practica1_competencias;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Practica1_Competencias extends JFrame {
    private JButton bRun, bPause,bDetener;
    private JLabel etiHilo1, etiHilo2;
    private JTextArea areaHilo1, areaHilo2;
    private JScrollPane jspHilo1, jspHilo2;
    private boolean pause=false,estado=false,corrido=false;
    
    public Practica1_Competencias(){
    setSize(400,400);
    setTitle("Condiciones de competencia");
    MisComponentes();
   
    }
    private void MisComponentes(){
         bRun= new JButton("Run");
    bPause= new JButton("Pause");
    bDetener = new JButton("Detener");
    etiHilo1 = new JLabel("Hilo 1");
    etiHilo2 = new JLabel("Hilo 2");
    areaHilo1 = new JTextArea();
    areaHilo1.setEditable(false);
    areaHilo2 = new JTextArea();
    areaHilo2.setEditable(false);
    jspHilo1 = new JScrollPane(areaHilo1);
    jspHilo2 = new JScrollPane(areaHilo2);
    
    setLayout(null);
    bRun.setBounds(10,100,100,25);
    
    bPause.setBounds(10, 150, 100,25);
    bDetener.setBounds(10, 200, 100, 25);
    etiHilo1.setBounds(150, 10, 100, 25);
    etiHilo2.setBounds(250, 10, 100, 25);
    jspHilo1.setBounds(150, 50, 100, 300);
    jspHilo2.setBounds(250, 50, 100, 300);
    
     add(bRun);
    add(bPause);
    add(bDetener);
    add(etiHilo1);
    add(etiHilo2);
    add(jspHilo1);
    add(jspHilo2);
    
     Hilo1 t1 = new Hilo1(areaHilo1);
     Hilo2 t2 = new Hilo2(areaHilo2);

    bRun.addActionListener((ActionEvent e) -> {
 t1.start();
 t2.start();
         });
    
    bPause.addActionListener((ActionEvent e) -> {
        t2.detenerHilo();
t1.detenerHilo();



        });
    }
   public static void main(String[] args) {
       Practica1_Competencias fr = new Practica1_Competencias();
       fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
