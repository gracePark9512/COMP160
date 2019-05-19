/**Fruit.java
  * 
  * Grace Park 
  * COMP 160 Lab 16 2016
  * 
  * array of String object filled by the user via a Scanner object
  */
import java.util.Scanner;

public class Fruit{
  public static void main (String [] args){
    String [] fruits = new String [3];
    
    for (int count = 0; count<3; count++){
      Scanner scan = new Scanner(System.in);
      System.out.println("Give a name of any kind of fruit.");
      String input = scan.nextLine();
      fruits [count] = input;
    }//for end 
    for (String elements: fruits){
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Guess what fruit I am?   " + elements.substring(0,2) +"     "+(elements.length()-1) +" letters" );
      String input = scan.nextLine();
     
      if (input.equals(elements)){
        System.out.println ("Correct");
      }//if end
      
      else{
        while (!input.equalsIgnoreCase(elements)){
        System.out.println("Try Again");
        input = scan.nextLine();
      }//while end
        System.out.println("Correct");
      }//else end
    }//for each end
  }//main end 
}//class end 