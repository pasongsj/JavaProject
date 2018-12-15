package test;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

public class SudokuFrame extends JFrame {
	private SlideSudokuBoard board;
	private SlideSudokuBoard answerboard;
	private int size;
	private int kan_size = 60; //칸사이즈
	private SudokuButton[][] kan;
	
	public SudokuFrame(int boardsize, SlideSudokuBoard b) {
		size = boardsize;
		board = b;
		kan = new SudokuButton[size][size];
		Container c = getContentPane();
		c.setLayout(new GridLayout(size, size));
		//칸 컨드롤러 생성
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				kan[i][j]= new SudokuButton(board,this);
				c.add(kan[i][j]);
				
			}
		}
		update();
		addWindowListener(new ExitController());
		setTitle("Sudoku");
	    setSize(size * kan_size + 10,  size * kan_size + 20);
	    //c.setVisible(true);
	    setVisible(true);
		
		
	}
	public void update() {
		BoardPiece[][] m = board.contents();
		
		for(int i =0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((i>2&&i<=5)&&(j<3||j>5)) {
                	kan[i][j].setBackground(Color.gray);
                }
                else if((i<3||i>5)&&(j>2&&j<=5)) {
                	kan[i][j].setBackground(Color.gray);
                }
                else {
                	kan[i][j].setBackground(Color.white);
                }
				if(m[i][j] != null) {
					kan[i][j].setText(""+m[i][j].valueOf());
				}
				else {
					kan[i][j].setText("");
				}
				
			}
		}
		
	}
	public void enter(int i) {
		
		
	}


}
