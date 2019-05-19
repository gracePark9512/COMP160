import java.util.*;
import java.awt.*;

public class Shape{
  private int x;
  private int y;
  private int width;
  private int height;
  private Color color;
  
  public Shape(){
    Random generator = new Random();
    width = generator.nextInt(31)+10;
    height = width;
    x = generator.nextInt(401-width);
    y = generator.nextInt(401-height);
    color = (new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256)));
  }//shape end
  
  public int randomRange(int lo, int hi){
    Random random = new Random();
    return random.nextInt(hi+1) + lo;
    
  }//randomRange end
  
  public void display(Graphics g){
    g.setColor(color);
    g.fillOval(x,y,width,height);
  }//display end
}//class end