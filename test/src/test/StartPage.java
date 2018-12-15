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
	  JLabel label = new JLabel("?Çú?ù¥?èÑÎ•? ?Ñ†?Éù?ïò?Ñ∏?öî    ");
	  JButton button1 = new JButton("?ÉÅ");
	  JButton button2 = new JButton("Ï§?");
	  JButton button3 = new JButton("?ïò");
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
              button1.setText("OK ?ÉÅ clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(size); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(size, board);
    	      System.exit(0);

          }
      });

	  button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button2.setText("Ok Ï§? clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(size); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(size, board);
    	      System.exit(0);

          }
      });

	  button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button3.setText("OK ?ïò clicked.");
              int size = 9;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(size); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(size, board);
    	      System.exit(0);

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
	  }
  


}