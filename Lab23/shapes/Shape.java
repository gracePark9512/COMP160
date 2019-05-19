/** Shape.java
  * 
  * Lab 23 COMP160
  * 
  * Grace Park
  */
package shapes;

import java.util.*;
import java.awt.*;

public abstract class Shape{
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color shapeColor;
  protected int moveX = 1;
  protected int moveY = 1;
  protected int growWidth = 1;
  
  /**sets the size, location and color of the circle randomly*/
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, (400-width));
    y = randomRange(0, (400-height));
    shapeColor = new Color(randomRange(0, 255),randomRange(0, 255),randomRange(0, 255));
  }
  
  /**sets the value of randomRange 
    *@param int lo
    *@param int hi
    */
  public int randomRange(int lo, int hi){
    Random generator = new Random();
    return generator.nextInt(hi-lo) + lo;
  }
  
  public abstract void display(Graphics g);
  
  /**makes the circle move around the window and bounce*/
  public void move(){
    x += moveX;
    y += moveY;
    if (x <= 0)
      moveX = 1;
    if (x >= 400-width)
      moveX = -1;
    if (y <= 0)
      moveY = 1;
    if (y >= 400-height)
      moveY = -1;
  }
}


