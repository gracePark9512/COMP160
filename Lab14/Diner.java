/** Diner.java
  * Grace Park COMP160 2016
  * 
  * Lab 14
  * 
  * make a table plan
  */

import java.awt.*;

public class Diner{
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color color;
  private static final int diameter = 50;
  
  public Diner (int x, int y, String name, int seatNum, Color color){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    this.color = color;
  }//diner end 
  
  public void draw (Graphics g){
    g.setColor (color); //gender color 
    g.fillOval (x,y,diameter,diameter); //diner
    
    g.setColor(Color.black); //text color
    g.drawString(name ,x+10,y+25); //diner name
    g.setFont(new Font("Courier",Font.PLAIN,14));//font
    
    String s =Integer.toString(seatNum);
    g.drawString(s,x+5,y+5); //seat number
    g.setFont(new Font("Courier",Font.PLAIN,12));//font
    
    
    
    
  }//draw end 
  
  
}//class end 