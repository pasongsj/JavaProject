package Sudo_ku;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/** Frame1 is a frame with a label and a button */
public class StartPage extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
  public StartPage(){ 
	  JLabel label = new JLabel("난이도를 선택하세요    ");
	  JButton button1 = new JButton("상");
	  JButton button2 = new JButton("중");
	  JButton button3 = new JButton("하");
	  JButton Exit = new JButton("Exit");
	  Container c = getContentPane();
	  c.setLayout(new FlowLayout());
	  c.add(label);
	  c.add(button1);
	  c.add(button2);
	  c.add(button3);
	  c.add(Exit);
	  
	  button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button1.setText("OK 상 clicked.");
          }
      });

	  button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button2.setText("Ok 중 clicked.");
          }
      });

	  button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              button3.setText("OK 하 clicked.");
          }
      });
	  Exit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              Exit.setText("Cancel Button clicked.");
              System.exit(0);
          }
      });

	  setTitle("Sudoku!");
	  setSize(200, 200);			// pack();
	  setVisible(true);
	  }
  

    public static void main(String[] args) {
		// TODO Auto-generated method stub

		new StartPage();
		

	}
  
}