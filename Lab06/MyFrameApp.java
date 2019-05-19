import javax.swing.*;
import java.awt.*;
import java.awt.Color.*;
/** 
 * Lab 6 Part 1, COMP 160
 * MyFrameApp
 * object practices
 */
public class MyFrameApp{
  //Start main 
  public static void main(String [] args){ 
    MyFrame m1 = new MyFrame();
    m1.setSize(300, 150);
    m1.setVisible(true);
    m1.decorate(Color.pink,"Pink Einstein", 180);
    MyFrame m2 = new MyFrame();
    m2.setSize(300, 150);
    m2.setVisible(true);
    m2.decorate(Color.darkGray, "Gray Einstein", 0);
  }//main end
}//class end