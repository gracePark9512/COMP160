import javax.swing.*;
import java.awt.*;
/**  
 * Lab 6, Part 1, COMP160
 * MyFrame.java
 * Make our own version of a JFrame class
 */
public class MyFrame extends JFrame {
  /** draws the value of the data field rectanglr, square, oval, line and strings
    * @param g graphics*/
  public void paint(Graphics g) {
    g.drawRect(50,50,40,40);       // square
    g.drawRect(60, 80, 225, 30);   // rectangle       
    g.drawOval(75, 65, 20, 20);    // circle
    g.drawLine(35, 60, 100, 120);  // line
    g.drawString("Out of clutter, find simplicity", 110, 70);
    g.drawString("-- Albert Einstein", 130, 100);
  }//end paint
  
  /**sets the value of the data field Background, title and location to input parameter value 
    * @param shade Color 
    * @param title String 
    * @param yOffset integent*/
  public void decorate (Color shade, String title, int yOffset){
    setBackground(shade);
    setTitle(title);
    setLocation(0,yOffset);
  }//end decorate 
}//end class
