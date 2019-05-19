/**reads an integer value and prints sum of all even integers between
  * 2 and the input value, inclusive
  *
  * Grace Park 
  * COMP 160 Lab 12 2016
  */

import java.util.Scanner;
public class IntegerApp{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer greater than 1");
    int input = scan.nextInt();
    int count = 2;  int sum = 0;
    
    if ( input <2){
      System.out.println ("Input value must not be less than 2");
    }
    else{
      while (count<=input){
        if (count % 2 ==0){
      sum = count+sum;
          
        }//if end 
        
        count ++;
        
      }//while end
      System.out.println("Sum of even number between 2 to " + input + " inclusive " + "is: " + sum);
    }
  }//main end
}//app end