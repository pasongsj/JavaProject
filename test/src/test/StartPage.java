package test;

import java.awt.*;
import java.awt.Font;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/** Frame1 is a frame with a label and a button */
public class StartPage extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
	
  public StartPage(){ 
	  JLabel label = new JLabel("난이도를 선택하세요");
	  JButton button1 = new JButton("상");
	  JButton button2 = new JButton("중");
	  JButton button3 = new JButton("");
	  JButton Exit = new JButton("Exit");
	  Container c = getContentPane();
	  c.setLayout(null);

	  label.setBounds(190,80,200,40);
	  button1.setBounds(190,160,100,40);
	  button2.setBounds(190,240,100,40);
	  button3.setBounds(190,320,100,40);
	  Exit.setBounds(480,1,60,40);
	  c.add(label);
	  c.add(button1);
	  c.add(button2);
	  c.add(button3);
	  c.add(Exit);
	  
	  button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button1.setText("OK ?ƒ clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlideSudokuBoard board = new SlideSudokuBoard(size,60); // see Fig. 10, Ch. 8
    	      SudokuFrame frame = new SudokuFrame(size, board);
    	      
          }
      });

	  button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button2.setText("Ok ì¤? clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlideSudokuBoard board = new SlideSudokuBoard(size,45); // see Fig. 10, Ch. 8
    	      SudokuFrame frame = new SudokuFrame(size, board);

          }
      });

	  button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button3.setText("OK ?•˜ clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlideSudokuBoard board = new SlideSudokuBoard(size,30); // see Fig. 10, Ch. 8
    	      SudokuFrame frame = new SudokuFrame(size, board);

          }
      });
	  Exit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              Exit.setText("Cancel Button clicked.");
              System.exit(0);
          }
      });

	  setTitle("Sudoku!");
	  setSize(560, 560);			// pack();
	  setVisible(true);
	  button1.setBackground (Color.yellow);
	  button2.setBackground (Color.yellow);
	  button3.setBackground (Color.yellow);
	  }
  


}
