/** Lab 22 COMP 160 2016
  * Grace Park 
  * 
  * Shape.java
  * 
  * adding timer and create bases for animation
  */

package shapes;
import java.util.*;
import java.awt.*;

public abstract class Shape{
  private int x;
  private int y;
  private int width;
  private int height;
  private Color color;
  private int moveX, moveY;
  
  /*sets the value of the Shape
   */
  public Shape(){
    Random generator = new Random();
    width = generator.nextInt(31)+10;
    height = width;
    
    x = generator.nextInt(401-width);
    y = generator.nextInt(401-height);
    moveX = moveY = 1;
    
    color = (new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256)));
  }//shape end
  
  /*sets the value of the move
   */
  public void move(){
    
    Random generator = new Random();
    width = generator.nextInt(31)+10;
    if (x >= 400 - width || x == 0){
      
      moveX = -moveX;
    }//if end
         height = generator.nextInt(31)+10;
    if (y >= 400 - height || y == 0){
 
      moveY = -moveY;
    }//else if end 
    
    y+= moveY;
    x+= moveX;
    
    
  }//move end 
  
  
  /*sets the value of the ramdomRange 
   *@param integent lo
   *@param integent hi
   */
  public int randomRange(int lo, int hi){
    Random random = new Random();
    return random.nextInt(hi+1) + lo;
  }//randomRange end
  
  /*sets the value of the display
   *@instance of Graphics
   */
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x,y,width,height);
  }//display end
  
}//class end