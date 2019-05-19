import java.text.NumberFormat;
/**
 * Lab 10 2016 
 * Grace Park 
 * 
 * LeapYear.java
 * decide whether it is leap year or not 
 */

public class LeapYear{
  private int year;
  
  public LeapYear(int year){
    this.year=(year);
  }//end method 
  
  private boolean isLeapYear(){
    return isLeapYear();
  }//end method
  
  public static void main (String [] args){
    //main start 
    LeapYear year1 = new LeapYear(2014);
    LeapYear year2 = new LeapYear(2016);
    LeapYear year3 = new LeapYear(1900);
    LeapYear year4 = new LeapYear(2000);
    LeapYear year5 = new LeapYear(1565);
    confirmLeapYear(year1);
    confirmLeapYear(year2);
    confirmLeapYear(year3);
    confirmLeapYear(year4);
    confirmLeapYear(year5);
    }//end main 
    
    public static void confirmLeapYear(LeapYear leapYear){
      int startYear = 1582;
      if (year< startYear){
        System.out.println(year+": "+"predates the gregorian calender");
      }
      else if (year%100==0 && year%400==0){
        System.out.println(year+": "+"is a leap year");
      }
      else if (year%4==0 && year%100!=0){
        System.out.println(year+": "+ "is a leap year");
      }
      else{
        System.out.println(year+": "+"is not a leap year");
      }
      
      
      
      
    }
  
  
}//end class 
