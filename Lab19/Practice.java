import java.util.Scanner; 
public class Practice{
  public static void main (String [] args){
  public static int readInt(){
    int input = 0;
    boolean success;
    do{
      success = true;
      System.out.println("Please enter an integer");
      try{
        Scanner scan = new Scanner (System.in);
        input = scan.nextInt();
      }catch (java.util.InputMismatchException e){
        System.out.println("Unexpected input try again");
        success = false;
      }
    }while (!success);
    return input;
  }
  }
}