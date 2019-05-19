/** Shape.java
  * Lab 24 COMP160
  * 
  * Grace Park
  * 
  * 
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
  
  /**generates a random number with a range*/
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
  
  /**draws the index of the shape*/
  public void showIndex(Graphics g, int index){
    g.setColor(Color.black);
    g.drawString(Integer.toString(index), x, y);
  }
    
}


