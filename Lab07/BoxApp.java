import java.text.NumberFormat;
/**
 * BoxApp.java
 * 
 * Lab 7 COMP 160 2016
 * Grace Park
 * 
 * put values into box.java
 */

public class BoxApp{
  //class start
  public static void main (String [] args){
    
    Box b1 = new Box();
    b1.setHeight(4);//height
    b1.setLength(4);//length
    b1.setWidth(6);//width
    System.out.println(b1.toString());
    
    Box b2 = new Box(3,4,5);
    System.out.println(b2.toString());
    
    Box b3 = new Box(5);

    System.out.println(b3.toString());
    
  }//main end
}//class end