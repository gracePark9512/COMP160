/**Lab 24 COMP 160 2016
  * 
  * Grace Park
  * 
  * ShapePanel.java
  * Creating equation various objects to move 
  */
package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/** generates a window where shapes can be generated and removed, and then made to bounce around*/
public class ShapePanel extends JPanel{
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel removeLabel;
  Timer timer;
  Timer timerChange;
  private int CHANGEDELAY = 20;
  private final int DELAY = 10;
  private JButton[] buttons = {new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")};
  
  /**sets the value of the main
    *@param array of String 
    */
  public static void main (String[] args){
    JFrame shapeFrame = new JFrame();
    shapeFrame.getContentPane().add(new ShapePanel());
    shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    shapeFrame.pack();
    shapeFrame.setVisible(true);
  }
  
  /**sets the value of shapePanel*/
  public ShapePanel(){
    
    controlPanel = new JPanel();
    showNum = new JTextField(2);
    removeLabel = new JLabel("Remove which?");
    
    
    ButtonListener listener = new ButtonListener();
    for (JButton b : buttons){
      b.addActionListener(listener);
      controlPanel.add(b);
    }
    
    timer = new Timer(DELAY, listener);
    timerChange = new Timer(CHANGEDELAY, listener);
    
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add(removeLabel);
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
    
    /**draws all the shapes in the array*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(Shape s: shapes){
        s.display(g);
        s.showIndex(g,shapes.indexOf(s));
      }
    }
  }
  
  /**determines if a button is pressed and performs the appropriate action*/
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (event.getSource() == timer){
        for(Shape s: shapes){
          s.move();
        }
      }
      else{
        JButton button = (JButton) event.getSource();
        
        if (button.getText().equals("Circle")){
          shapes.add(new Circle());
        }
        else if (button.getText().equals("Square")){
          shapes.add(new Square());
        }
        else if (button.getText().equals("Oval")){
          shapes.add(new Oval());
        }
        else if (button.getText().equals("Smiley")){
          shapes.add(new Smiley());
        }
        else if (button.getText().equals("Swirl")){
          shapes.add(new Swirl());
        }
        else if (button.getText().equals("Start")){
          timer.start();
        }
        else if (button.getText().equals("Stop")){
          timer.stop();
        }
        else if (button.getText().equals("Remove")){
          try{
          int removeNum = Integer.parseInt(showNum.getText());
          shapes.remove(removeNum);
          }
          catch(NumberFormatException e){
            System.err.println("Not a proper integent");
          }
          catch(IndexOutOfBoundsException e){
            System.err.println("Out of scale");
          }
        }
        showNum.setText(""+(shapes.size() - 1));
      }
      if (shapes.isEmpty())
          showNum.setText("");
      
      repaint();
      
    }
  }
}