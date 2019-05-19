import java.text.NumberFormat;
/**
 * Box.java
 * 
 * Lab 7 COMP 160 2016
 * Grace Park
 * 
 * claculate the volme and surface area of a box
 */

public class Box{

  private int height;  //height of box
  private int length;  //length of box
  private int width;  //width of box
  
  /** sets the value of the data field height, length, and width to input parameter value 
    *@param height integent 
    *@param length integent
    *@param width integent*/
  public Box(int height, int length, int width){
    setHeight(height);
    setLength(length);
    setWidth(width);
  }//end method 
  
  public Box(){
  }
  
  /**sets the value of the data field side to inpup parameter vlaue 
    *@param height,Length and Widht side*/
  public Box(int side){
    setHeight(side);
    setLength(side);
    setWidth(side);
  }//end method 
  
  
  /** sets the value of the data field height input parameter value
    * @param h height of box*/
  public void setHeight(int h){
    height = h;
  }//end method
  
  /**sets the value of the data field length input parameter value 
    * @param l length of box*/
  public void setLength(int l){
    length = l;
  }//end method
  
  /**sets the value of the data field length input parameter value 
    * @param w width of box*/
  public void setWidth(int w){
    width = w;
  }//end method
  
  /**returns the data field SurfaceArea 
    * @return the surface area of box*/
  public int getSurfaceArea(){
    return 2*((width*length)+(width*height)+(height*length));
  }//end method
  
  /**returns the data field Volume 
    * @return the volume of box*/
  public int getVolume(){
    return width*length*height;
  }//end method
  
  
  
  /**returns the data field string 
    * @return the height, length, width, surface area, and voulme of box*/
  public String toString(){
    return "Height is: " + height+"," + " Length is: " + length+"," +
      " Width is: " + width+"," + " Surface area is: " +
      getSurfaceArea()+","+ " Volume is: " +getVolume();
  }//end method
 
}//end class 
  
  