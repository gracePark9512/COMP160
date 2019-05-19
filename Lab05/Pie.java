/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2016 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /** creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
    }
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        final int MID = 150;
        final int TOP = 40;
        final int RAD = 160;
        final int ANG = 45;
        setTitle("Pie Chart");
        page.setColor(Color.white);
        page.fillRect(0,0,300,220);//Background
        
        page.setColor(Color.darkGray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 45, ANG);//1st Arc
        
        page.setColor(Color.lightGray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 90, ANG);//2nd Arc
        
        page.setColor(Color.gray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 135, ANG);//3nd Arc        
       
        page.setColor(Color.darkGray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 180, ANG);//4nd Arc
        
        page.setColor(Color.lightGray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 225, ANG);//5nd Arc
        
        page.setColor(Color.black);
        page.fillArc(MID - 80, TOP, RAD, RAD, 270, ANG);//6nd Arc
        
        page.setColor(Color.lightGray);
        page.fillArc(MID - 80, TOP, RAD, RAD, 315, ANG);//7nd Arc
        
        page.setColor(Color.black);
        page.fillArc(MID -77, TOP-8, RAD + 10, RAD + 10, 0, ANG);//8nd Arc
        
    }
}
