import java.text.NumberFormat;
/**
 * Lab 6 Part 2, COMP 160
 * Grace Park 
 * 
 * BookShopApp
 * Object Practices
 */

public class BookShopApp{
  //class start
  public static void main (String [] args){
    
    Book b1 = new Book();
    b1.setTitle("Life of Pi");//title
    b1.setPages(348);        //pages
    b1.setPrice(28.90);     //price
    b1.displayBook();
    
    Book b2 = new Book();
    b2.setTitle("Mister pip");//title
    b2.setPages(240);         //pages
    b2.setPrice(22.70);       //price
    b2.displayBook();  
    
    Book b3 = new Book();
    b3.setTitle("Little Prince");//title
    b3.setPages(500);           //pages
    b3.setPrice(39.99);        //price
    b3.displayBook();
    
  }//main end
}//class end