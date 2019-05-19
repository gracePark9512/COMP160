/** Circle.java
  * 
  * Lab 24 COMP160
  * 
  * Grace Park
  * 
  * drawing circle
  */

package shapes;
import java.awt.*;
//draws circle on the panel
public class Circle extends Shape{
      /**sets the value of display
        *@param g Graphics*/
  public void display(Graphics g){
    g.setColor(shapeColor);
    g.fillOval(x,y,width,height);
  }
}
  