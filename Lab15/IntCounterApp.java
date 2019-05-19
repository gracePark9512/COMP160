/** IntCounterApp.java
  * 
  * Grace Park
  * 
  * COMP160 Lab15 2016
  * 
  * input for IntCounter.java
  */
import java.util.Scanner;
import java.util.Random;
public class IntCounterApp{
  
  public static void main (String [] args){
    for ( int times =0; times<3; times++){
    Scanner scan = new Scanner(System.in);
    System.out.println("Which number do you wish to find?");
    int input = scan.nextInt();
    
    IntCounter counter = new IntCounter(makeArray());
    counter.showTarget(input);
    }//for end 
    
  }//main end 
  
  public static int [] makeArray(){
    Random rand = new Random();
    int size = rand.nextInt(6)+5;
    int [] numbers = new int [size];
    for (int index=0; index<size; index++){
      int n = rand.nextInt(5);
      numbers[index]=n;
    }
    return numbers;
    
  }//makeArray end 
  
}//class end