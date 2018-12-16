package test;//cf PuzzleButton
import javax.swing.*;
import java.awt.event.*;




public class SudokuButton extends JButton implements ActionListener{
   private SlideSudokuBoard num;
   private SudokuFrame view;
   private SudokuButton k;
   
   public SudokuButton(SlideSudokuBoard my_number,SudokuFrame my_view, SudokuButton kan) {
        super("");
      view = my_view;
      num = my_number;
      k = kan;
      
      addActionListener(this);
   }
   @Override
public void actionPerformed(ActionEvent event) {//입력받고 바꾸기
	   
	   String s = getText();
	    if ( !s.equals("") ){
	    	//num.setText(Integer.parseInt(s)); // try to move
	        view.update();
	       }
	  }
   }