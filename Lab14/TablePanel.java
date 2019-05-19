/** TablePanel.java
  * 
  * Grace Park
  * 
  * COMP 160 2016 Lab 14
  * 
  * show tabel plan
  */
import javax.swing.*;
import java.awt.*;

public class TablePanel extends  JPanel{

   private Diner diner1, diner2, diner3, diner4, diner5, diner6;
     
    public TablePanel(){
      diner1 = new Diner (125, 50, "David", 1, Color.cyan);
      diner2 = new Diner (185, 110, "Clare", 2, Color.pink);
      diner3 = new Diner (185, 170, "Michael", 3, Color.cyan);
      diner4 = new Diner (125, 230, "Metiria", 4, Color.pink);
      diner5 = new Diner (65, 170, "Todd", 5, Color.cyan);
      diner6 = new Diner (65, 110, "Jacqui", 6, Color.pink);
      setPreferredSize (new Dimension (300, 300));
      setBackground (Color.white);
    }//TablePanel end 
    
    public void paintComponent(Graphics g){
      super.paintComponent (g);
      diner1.draw(g);
      diner2.draw(g);
      diner3.draw(g);
      diner4.draw(g);
      diner5.draw(g);
      diner6.draw(g);
      
      g.setColor (Color.black);
      g.fillRect (125,95,50,110); //table
      
    }//paintComponent end 
   
}//class end 