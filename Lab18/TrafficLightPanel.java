/**TrafficLightPanel.java
  * 
  * Grace Park Lab18 2016
  * 
  * change the color of traffic light when button is being clicked 
  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel{
  private JButton red;
  private JButton green;
  private JButton amber;
  private JLabel buttonLabel;
  private JLabel lastPressed;
  private JPanel buttonPanel;
  
  /** sets the value of the datafield 
    *@param args String
    */
  public static void main (String [] args){
    JFrame frame = new JFrame("Traffic Lights");
    JPanel panel = new JPanel();
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new TrafficLightPanel ());
    
    frame.pack();
    frame.setVisible(true);
  }//main end 
  
  /**sets the prameter of the value of trafficLightPanel
    */
  public TrafficLightPanel(){
    setPreferredSize (new Dimension (200, 300));
    setBackground(Color.blue);
    
    red = new JButton("Red");
    amber = new JButton("Amber");
    green = new JButton("Green");
    buttonLabel = new JLabel("Button Panel");
    lastPressed = new JLabel("last pressed");
    
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension (80, 290));
    buttonPanel.setBackground(Color.white);
    
    buttonPanel.add(buttonLabel);
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);
    add(buttonPanel);
    
    
    ButtonListener listener = new ButtonListener();
    red.addActionListener(listener);
    amber.addActionListener(listener);
    green.addActionListener(listener);
    
    
    LightPanel light = new LightPanel();
    light.setPreferredSize(new Dimension(80, 290));
    light.setBackground(Color.cyan);
    add(light);
    
  }//end TraafficLightPanel
  
  private class ButtonListener implements ActionListener{
    /**draws the value of the datafield 
      *@param a ActionEvent 
      */
    public void actionPerformed(ActionEvent a){
      if (a.getSource()== red){
        lastPressed.setText("red");
      }
      else if (a.getSource()==amber){
        lastPressed.setText("amber");
      }
      else if (a.getSource() ==green){
        lastPressed.setText("green");
      }
      repaint();
    }//actionPerformed end
  }//ButtonListner end
  
  
  private class LightPanel extends JPanel{
    /**draws the value of the datafield
      *@param page Graphics
      */
    public void paintComponent(Graphics page){
      super.paintComponent(page);
      
      page.setColor(Color.black);
      page.fillOval(20,40,40,40);
      page.fillOval(20,100,40,40);
      page.fillOval(20,160,40,40);
      
      String text = lastPressed.getText();
      if(text.equals("red")){
        page.setColor(Color.red);
        page.fillOval(20,40,40,40);
      }//if end
      else if (text.equals("amber")){
        page.setColor(Color.orange);
        page.fillOval(20,100,40,40);
      }//else if end
      else if (text.equals("green")){
        page.setColor(Color.green);
        page.fillOval(20,160,40,40);
      }//else if end 2
      
      
    }//paintComponent end
  }//LightPanel end 
}//end class