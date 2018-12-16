package test;//cf PuzzleButton
import javax.swing.*;
import java.awt.event.*;




public class SudokuButton extends JButton implements ActionListener{
   private SlideSudokuBoard num;
   private SudokuFrame view;
   
   public SudokuButton(SlideSudokuBoard my_number,SudokuFrame my_view) {
        super("");
      view = my_view;
      num = my_number;
      addActionListener(this);
   }
   @Override
public void actionPerformed(ActionEvent e) {//입력받고 바꾸기
	   SudokuButton bt = (SudokuButton)e.getSource();
	   BoardPiece[][] m = num.contents();
	   int col = bt.getX() / 60;
	   int row = bt.getY() / 60;
	   System.out.print(row);
	   System.out.println(col);
	   //System.out.println(m[row][col]);
	   boolean ok = num.EnterNum(row,col);
	   if(ok)    view.update();
	   


//      String s = getText();  // get the number on the face of this button
//       if ( !s.equals("") ){
//    	   view.MouseEventDemo;
//       }
       }
}



   