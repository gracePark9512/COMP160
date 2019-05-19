//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
  private JLabel saying;
  private JCheckBox bold, italic;
  private int style = Font.PLAIN;
  private String typeFace = "Helvetica";
  private JRadioButton courier, timesNewRoman, helvetica;
  
  //-----------------------------------------------------------------
  //  Sets up a panel with a label and some check boxes that
  //  control the style of the label's font.
  //-----------------------------------------------------------------
  public StyleOptionsPanel()
  {
    
    saying = new JLabel ("Say it with style!");
    saying.setFont (new Font (typeFace, style, 20));
    setLayout(new GridLayout(6,1));
    
    bold = new JCheckBox ("Bold");
    bold.setBackground (Color.cyan);
    
    italic = new JCheckBox ("Italic");
    italic.setBackground (Color.cyan);
    
    courier = new JRadioButton ("Courier");
    courier.setBackground (Color.cyan);
    //courier.setFont(new Font ("Courier", style, 20));
    
    timesNewRoman = new JRadioButton("Times New Roman");
    timesNewRoman.setBackground (Color.cyan);
//timesNewRoman.setFont(new Font ("Times New Roman", style, 20));
    
    helvetica = new JRadioButton("Helvetica");
    helvetica.setBackground (Color.cyan);
    //helvetica.setFont(new Font ("Helvetica", style, 20));
    
    StyleListener listener = new StyleListener();
    bold.addItemListener (listener);
    italic.addItemListener (listener);
    courier.addItemListener(listener);
    timesNewRoman.addItemListener(listener);
    helvetica.addItemListener(listener);
    
    add (saying);
    add (bold);
    add (italic);
    add(courier);
    add(timesNewRoman);
    add(helvetica);
    
    ButtonGroup group = new ButtonGroup();
    group.add(courier);
    group.add(timesNewRoman);
    group.add(helvetica);
    
    setBackground (Color.cyan);
    setPreferredSize (new Dimension(300, 200));
  }
  
  
  
  //*****************************************************************
  //  Represents the listener for both check boxes.
  //*****************************************************************
  private class StyleListener implements ItemListener
  {
    //--------------------------------------------------------------
    //  Updates the style of the label font style.
    //--------------------------------------------------------------
    public void itemStateChanged (ItemEvent event)
    {
      style = Font.PLAIN;
      
      if (bold.isSelected())
        style = Font.BOLD;
      
      if (italic.isSelected())
        style += Font.ITALIC;
      
      if (courier.isSelected())
        typeFace = "Courier";
      
      if(timesNewRoman.isSelected())
        typeFace = "Times New Roman";
      
      if(helvetica.isSelected())
        typeFace = "Helvetica";
      
      saying.setFont (new Font (typeFace, style, 20));
    }
  }
}
