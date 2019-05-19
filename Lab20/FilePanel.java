import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
/** FilePanel.java
  * Lab 20, COMP160,  2016
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */
public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){
    String fileName = "Lab20data.txt";
    try{
      Scanner fileScan = new Scanner (new File(fileName));
      while (fileScan.hasNext()){
        fileScan.readInt()=0;
        System.out.print(fileScan.nextInt()+" ");
        int fill = fileScan.nextInt();
        }
      
    }catch (FileNotFoundException e){
      System.out.println("File not found. check file name and location");
      System.exit(1);
    }
    //drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30);
    //count++;
    //drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30);
    //count++;
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
