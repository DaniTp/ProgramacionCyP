
package condicionescompetencias;

import javax.swing.JTextArea;
public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private boolean pause=true;
    Hilo(JTextArea area, RCompartido rc){
        this.area=area;
        this.rc=rc;
    }
      public void detenerHilo(){
      if(pause==true){
      pause=false;}
      else if(pause==false){
          pause=true;}
  }
    public void run(){
        while(pause==true){
            try{
              rc.setRc(this.getName());
              area.append(rc.getRc()+" Eats"+"\n");
              Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    void sleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
