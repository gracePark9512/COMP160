/** Circle.java
  * 
  * Lab 23 COMP160 2016
  * 
  * Grace Park
  * 
  * drawing circle
  */

package shapes;
import java.awt.*;

/**draw Circles on the panel
  */
public class Circle extends Shape{
  
    /**sets the value of disply 
      *@param g Graphics */
  public void display(Graphics g){
    g.setColor(shapeColor);
    g.fillOval(x,y,width,height);
  }
}
  