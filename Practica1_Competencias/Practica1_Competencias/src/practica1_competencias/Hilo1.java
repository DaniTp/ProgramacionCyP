
package practica1_competencias;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
public class Hilo1 extends Thread{
    private JTextArea area;
    private boolean pause=true;
    private int n;
    private int i=0;
   Hilo1(JTextArea area){
        this.area=area;
       
        
    }
   
      Hilo1(int n){
        this.n=n;
       
        
    }
     public void setn(int n){
         this.n=n;
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
