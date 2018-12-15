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
	public void actionPerformed(ActionEvent event) {//입력받고 바꾸기
		
		String s = getText();  // get the number on the face of this button
	    if ( !s.equals("") ){
//	    	Enter(new Integer(s).intValue());
//	    	num.setText(""+new Integer(s).intValue());
	    	view.update();
	    	
	    	//boolean ok = board.move(new Integer(s).intValue()); // try to move
	         //if ( ok ) { view.update(); }
	       }
	}
	


}