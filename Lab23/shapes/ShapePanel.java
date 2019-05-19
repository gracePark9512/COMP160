/**Lab 23 COMP 160 2016
  * 
  * Grace Park
  * 
  * ShapePanel.java
  * Creating fomula for dots to move
  */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** generates a window where shapes can be generated and made to bounce around*/
public class ShapePanel extends JPanel{
  private Shape[] shapes = new Shape[20];
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel;
  private int count = 0;
  Timer timer;
  Timer timerChange;
  private int CHANGEDELAY = 20;
  private final int DELAY = 10;
  private JButton[] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop")};
  
  /*sets the value of the main
   *@param arrays of Strings
   */
  public static void main (String[] args){
    JFrame shapeFrame = new JFrame();
    shapeFrame.getContentPane().add(new ShapePanel());
    shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    shapeFrame.pack();
    shapeFrame.setVisible(true);
  }
  
  /**sets the value of ShapePanel
    */
  public ShapePanel(){
    
    controlPanel = new JPanel();
    showNum = new JTextField(2);
    countLabel = new JLabel("Count");
    
    ButtonListener listener = new ButtonListener();
    for (JButton b : buttons){
      b.addActionListener(listener);
      controlPanel.add(b);
    }
    
    timer = new Timer(DELAY, listener);
    timerChange = new Timer(CHANGEDELAY, listener);
    
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    drawPanel = new DrawingPanel();
    
    add(controlPanel);
    add(drawPanel);
  }
  
  
  private class DrawingPanel extends JPanel{
    /**sets the background colour and the size of the drawing panel*/
    public DrawingPanel(){      
      setBackground(Color.pink);
      setPreferredSize(new Dimension(400,400));
    }
    
    /**sets the value of the paintCompomnent
      *@param g Graphics
      */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0; i < count; i++){
        shapes[i].display(g);
      }
    }
  }
  
  /**determines if a button is pressed and performs the appropriate action*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (event.getSource() == timer){
        for(int i = 0; i < count; i++){
          shapes[i].move();
        }
      }
      else{
        JButton button = (JButton) event.getSource();
        
        if (button.getText().equals("Circle")){
          if (count < shapes.length){
            shapes[count] = new Circle();
            count++;
          }
        }
        if (button.getText().equals("Square")){
          if (count < shapes.length){
            shapes[count] = new Square();
            count++;
          }
        }
        if (button.getText().equals("Oval")){
          if (count < shapes.length){
            shapes[count] = new Oval();
            count++;
          }
        }
        if (button.getText().equals("Smiley")){
          if (count < shapes.length){
            shapes[count] = new Smiley();
            count++;
          }
        }
        if (button.getText().equals("Swirl")){
          if (count < shapes.length){
            shapes[count] = new Swirl();
            count++;
          }
        }
        if (button.getText().equals("Start")){
          timer.start();
        }
        if (button.getText().equals("Stop")){
          timer.stop();
        }
        
        showNum.setText(""+count);
      }
      
      repaint();
      
    }
  }
}