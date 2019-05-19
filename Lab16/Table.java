/** Table.java
  * 
  * Grace Park COMP160 2016
  * 
  * display a multiplication table up to 12X12
  */

public class Table{
  public static void main (String [] args){
    int cols = 12;
    int rows = 12;
    int [] [] table = new int [rows] [cols];
    for (int [] row: table){
      for (int col : row){
        row [col*row];
      }//nested for end
    }//for end 
    
    for (int row = 1; row<rows; row++){
      for (int col = 1; col<cols; col++)
        System.out.print(table [row][col] + "\t");
     System.out.println(); 
    }
    
  }//main end 
}//class end 