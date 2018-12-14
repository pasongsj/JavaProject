package Sudoku;

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
<<<<<<< Updated upstream

	  JLabel label = new JLabel("³­ÀÌµµ¸¦ ¼±ÅÃÇÏ¼¼¿ä    ");
	  JButton button1 = new JButton("»ó");
	  JButton button2 = new JButton("Áß");
	  JButton button3 = new JButton("ÇÏ");
=======
	  JLabel label = new JLabel("ë‚œì´ë„ë¥¼ ì„ íƒí•˜ì„¸ìš”    ");
	  JButton button1 = new JButton("ìƒ");
	  JButton button2 = new JButton("ì¤‘");
	  JButton button3 = new JButton("í•˜");
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
              button1.setText("OK »ó clicked.");
              //int size = 12;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(9); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(9, board);
=======
              button1.setText("OK ìƒ clicked.");
>>>>>>> Stashed changes
          }
      });

	  button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
<<<<<<< Updated upstream
              button2.setText("Ok Áß clicked.");
              //int size = 9;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(9); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(9, board);
=======
              button2.setText("Ok ì¤‘ clicked.");
>>>>>>> Stashed changes
          }
      });

	  button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
<<<<<<< Updated upstream
              button3.setText("OK ÇÏ clicked.");
             // int size = 6;  // a  9 x 9  slide puzzle
    	      SlidePuzzleBoard board = new SlidePuzzleBoard(9); // see Fig. 10, Ch. 8
    	      PuzzleFrame frame = new PuzzleFrame(9, board);
=======
              button3.setText("OK í•˜ clicked.");
>>>>>>> Stashed changes
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