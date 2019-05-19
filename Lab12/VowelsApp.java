/**reads a sentence and prints how many vowels and consonants are in it
  *
  * Grace Park
  * COMP 160 Lab 12 2016
  */
import java.util.Scanner;
public class VowelsApp{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String input = scan.nextLine();
    System.out.println("Sentence is : " + input);
    input = input.toLowerCase();
    int vowelCount = 0, consonantCount = 0, length = input.length(), count = 0;
    while (count < length){
      char c = input.charAt(count);
      switch(c){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
         vowelCount++;
          count++;
          break;
        default:
          if (c > 'a' && c < 'z'){
          consonantCount++;
          count++;
          break;
        }//if end 
          else
            count++;
      }//switch end 
      }//while end 
    System.out.println("VowelCount : " + vowelCount);
    System.out.println("ConsonantCount : " + consonantCount);
  }//main end
}//app end
