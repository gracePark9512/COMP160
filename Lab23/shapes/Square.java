/* Square
 * Lab 23 COMP160
 *
 * Grace Park
 */

package shapes;
import java.awt.*;

//draws square on to the Panel
public class Square extends Shape{
  public Square(){
    height = width;
  }
  
      /**sets the value of display 
        *@param g Graphics
        */
  public void display(Graphics g){
    g.setColor(shapeColor);
    g.fillRect(x,y,width,height);
  }
}