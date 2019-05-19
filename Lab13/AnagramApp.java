/** read string and compare two input to find 
  * if it is an anagram
  *
  * comp 160 2016 Lab 13
  *
  * Grace PArk
  */

import java.util.Scanner;

public class AnagramApp{
  /**create a empty string and list them in alphabetical order
    *@scan user input
    *@print whether it is anagram
    */
  public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
    System.out.println ("Enter first phrase");
    String inputOne = scan.nextLine();
    System.out.println ("Enter second phrase");
    String inputTwo = scan.nextLine();
    
    String inpOne = inputOne.toLowerCase(); 
    String inpTwo = inputTwo.toLowerCase();
    String newOne = "";
    String newTwo ="";
    
    for (char c = 'a'; c <= 'z'; c ++){
      for (int index = 0; index < inpOne.length(); index ++){
        if (inpOne.charAt(index) == c){
          newOne += c;
        }//if end
      }//nested for end
    }//for end 
    
    for (char cha = 'a'; cha <= 'z'; cha ++){
      for (int indexTwo = 0; indexTwo < inpTwo.length(); indexTwo ++){
        if (inpTwo.charAt(indexTwo) == cha){
          newTwo += cha;
        }//if end
      }//nested for end
    }//for end 
    
    System.out.println(newOne + " are the letters of "+ inpOne+" in order");
    System.out.println(newTwo + " are the letters of "+ inpTwo+" in order");
    
    if(newOne.equals(newTwo)){
      System.out.println(inputOne + " is an anagram of "+ inputTwo);
    }//if end 
    else{
      System.out.println(inputOne + " is not an anagram of "+ inputTwo);
    }//else end 
    
  }//main end
}//app end