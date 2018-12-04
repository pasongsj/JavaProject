package Sudo_ku;
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
     c.setLayout(null);
     button1.setBounds(30,20,50,20);
     button2.setBounds(110,20,50,20);
     button3.setBounds(30,50,50,20);
     button4.setBounds(110,50,50,20);
     button5.setBounds(30,80,50,20);
     button6.setBounds(110,80,50,20);
     button7.setBounds(30,110,50,20);
     button8.setBounds(110,110,50,20);
     button9.setBounds(30,140,50,20);
     label.setBounds(20,5,200,15);
     
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
     setSize(250, 220);         // pack();
     setVisible(true);
     }}
     