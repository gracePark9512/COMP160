import java.util.Scanner; 
/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1); 
    confirmBooking(customer2); 
    confirmBooking(customer3); 
    confirmBooking(customer4); 
    confirmBooking(customer5); 
    confirmBooking(customer6); 
    confirmBooking(customer7); 
    confirmBooking(customer8);
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8); 
  }//end method 
  
  /* calculate ticket and meal prices and display confirmation of bookin
   */
  public static void confirmBooking(Customer customer){
    double ticket = 56.0;
    double meal = 30.0;
    if (customer.isChild() || customer.isStudent()){
      ticket /= 2;
    }
    else{
      ticket *= 0.8;
    }
    
    if (customer.isChild()){
      meal/=2;
    }
    else{
      meal*=0.9;
    }
    System.out.println(customer.getName() + "\nTicket price: " + ticket*100/100 + "\nMeal price: " + meal*100/100 + "\nTotal price: " + (ticket*100/100+meal*100/100));
    Scanner scan = new Scanner(System.in);
    System.out.println("Confirm booking for "+ customer.getName() +" (Y/N)");
    String input = scan.nextLine();
    if (input.equals("y") || input.equals("Y")){
      System.out.println("Booked");
      customer.setBooked();
    }
  }//end method 
  
  public static void showBooked(Customer customer){
    if (customer.isBooked()){
      System.out.println(customer.getName()+" is booked");
    }
  }//end method 
}//end class 