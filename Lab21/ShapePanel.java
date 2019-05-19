import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ShapePanel extends JPanel{
  private Shape [] shapes = new Shape[20];
  private DrawingPanel drawPanel;
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField shownum;
  private JLabel countLabel;
  private int count;
  
  public ShapePanel(){
    addShape = new JButton("add Shape");
    shownum = new JTextField("    ");
    countLabel = new JLabel("Count");
    
    controlPanel = new JPanel();
    controlPanel.setPreferredSize (new Dimension (100, 400));
    
    controlPanel.add(addShape);
    controlPanel.add(shownum);
    controlPanel.add(countLabel);
    add(controlPanel);
    
    
    drawPanel = new DrawingPanel();
   add(drawPanel); 
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
  }//ShapePanel end
  
  public static void main(String [] args){
    JFrame frame = new JFrame();
    frame.add(new ShapePanel());
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }//main end
  
  private class DrawingPanel extends JPanel{
    public DrawingPanel(){
      setPreferredSize (new Dimension (400, 400));
      setBackground(Color.pink);
    }//Drawing Panel
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
          for(int i = 0; i < count; i++){
      shapes[i].display(g);
    } 
    }//paintComponent end
  }//DrawingPanel class end 
  
  private class ButtonListener implements ActionListener{
    public void actionPerformed (ActionEvent e){
      JButton jb = (JButton) e.getSource();
      if (jb.getText().equals("add Shape") && count < shapes.length){
        shapes[count] = new Shape();
        count++;
        shownum.setText(Integer.toString(count));
        repaint();
      }//if end
      
    }//actionPerformed end 
  }//end ButtonListener
  
}//class end
