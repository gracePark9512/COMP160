/* Oval.java
 * 
 * Lab 23 COMP160 2016
 * 
 * Grace Park
 * 
 * drawing oval
 */

package shapes;
import java.awt.*;

/**draws oval on the panel
  */
public class Oval extends Shape{
  public Oval(){
    height = 4*width;
    y = randomRange(0, (400-height));
  }
  
    /**sets the value of display
      *@param g Graphics*/
  public void display(Graphics g){
    g.setColor(shapeColor);
    g.fillOval(x,y,width,height);
  }
}
  