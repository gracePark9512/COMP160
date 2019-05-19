/** IntCounter.java
  * 
  * Grace Park 
  * 
  * COMP160 2016 Lab 15
  * 
  * display the array position if every occurence of a target integer
  * that is stored in an array of int
  */

public class IntCounter{
  private int [] numArray;
  
  /**sets the value of array to the parameter 
    *@numArray integer
    */
  public IntCounter (int [] numArray){
    this.numArray = numArray;
    for (int showArray: numArray){
      System.out.print (showArray + " ");
    }//foreach end 
    System.out.println (" Array is of length " + numArray.length);
  }//IntCounter end 
  
  /**sets the value of the parameter 
    *@target integer
    */
  public void showTarget (int target){
    for (int i=0; i<numArray.length; i++){
      if (numArray[i] == target){
        System.out.println("There is a " + target + " in position " + i);
      }
    }//for end 

  }//showTarget end 
  
  
}//end class 