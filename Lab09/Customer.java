import java.util.Scanner;
/** COMP160 Lab 9
  * 
  * Customer.java
  * 
  * Grace Park
  * 
  * Get customer's identification
  */

public class Customer{
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;
  
  /** sets the value of datafield to String, integent and boolean
    *@param nameIn String
    *@param age integent
    *@param studentIn boolean
    */
  public Customer(String nameIn, int age, boolean studentIn){
    this.name = nameIn;
    this.child = (age>=5 && age<=16);
    this.student = studentIn;
  }//method end
  
  
  /**get the values of datafield to String
    *@return nameIn
    */ 
  public String getName(){
    return name;
  }//method end
  
  
  /**get the values of datafield to boolean 
    *if object is child 
    *@return true
    */
  public boolean isChild(){
    return child;
  }//method end 
  
  
  /**get the values of datafield to boolean
    *if object is student 
    *@return true
    */
  public boolean isStudent(){
    return student;
  }//method end
  
  
  /**get the values of datafield to boolean
    *if object is booked 
    *@return Booked
    */
  public boolean isBooked(){
    return booked;
  }//method end 
  
  
  /**set the values of dataafield to void
    *if object is booked 
    *@return true
    */
  public void setBooked(){
    booked=true;
  }//method end 
  
  
}//class end 