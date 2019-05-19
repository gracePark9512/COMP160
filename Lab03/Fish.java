/**
 * Lab 3, COMP160, 2016
 */

import java.util.Scanner;
public class Fish{
  public static void main(String [] args){
    System.out.println("Enter verse 4 text:");
    String verse4 ;
    Scanner scan = new Scanner (System.in);
    verse4 = scan.nextLine();
    System.out.println();
    printVerse1();
    printVerse2();
    String verse3 = "This one has a little star.\n";
    printVerse(verse3);
    printVerse(verse4);
    
  }//end main
  
  /** declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n";
    System.out.println(verse1);
  }//end printVerse1
  /** declares a String variable called verse2 and displays it on the screen*/
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish.\n";
    System.out.println(verse2);
  }//end printVerse2
  /** declares a String variable called verse and display verses according to parameter*/
  public static void printVerse(String verse){
    System.out.println(verse);
  }//end printVerse
}//end class
