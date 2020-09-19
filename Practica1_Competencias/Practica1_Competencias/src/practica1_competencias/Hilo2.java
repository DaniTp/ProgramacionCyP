
package practica1_competencias;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;


public class Hilo2 extends Thread{
    private JTextArea area;
    private boolean pause=true;
    Hilo2(JTextArea area){
        this.area=area;
    }
        public void setPause(boolean pause) {
        this.pause = pause;
    }
      public void detenerHilo(){
      if(pause==true){
      pause=false;}
      else if(pause==false){
          pause=true;}
  }
    public void run(){
        int i=0;
        while(pause==true){
            area.append(i+"\n");
                     try {
              sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
          }
            i++;
        }
    }
}
