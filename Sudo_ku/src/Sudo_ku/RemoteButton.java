package Sudoku;
import java.awt.*;
import javax.swing.*;

/** Frame1 is a frame with a label and a button */
public class RemoteButton extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
  public RemoteButton(){ 
     JLabel label = new JLabel("             what number?        ");
     
     JButton button1 = new JButton("1");
     JButton button2 = new JButton("2");
     JButton button3 = new JButton("3");
     JButton button4 = new JButton("4");
     JButton button5 = new JButton("5");
     JButton button6 = new JButton("6");
     JButton button7 = new JButton("7");
     JButton button8 = new JButton("8");
     JButton button9 = new JButton("9");
     
     Container c = getContentPane();
     c.setLayout(new FlowLayout());
     c.add(label);
     c.add(button1);
     c.add(button2);
     c.add(button3);
     c.add(button4);
     c.add(button5);
     c.add(button6);
     c.add(button7);
     c.add(button8);
     c.add(button9);
     setTitle("Sudoku!");
     setSize(250, 200);         // pack();
     setVisible(true);
     }}
     