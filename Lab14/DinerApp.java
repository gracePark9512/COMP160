/**DinerApp.java
  * 
  * Grace Park 
  * 
  * COMP 160 2016 Lab 14
  * 
  * creates panel that shows seating plan
  */
import javax.swing.*;

public class DinerApp{
  
  public static void main(String[]args){
    JFrame frame = new JFrame ("Table Setting");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.getContentPane().add (new TablePanel ());
    frame.pack();
      
      
      
  }//main end
  
}//class end 