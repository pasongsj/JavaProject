package test;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;

public class SudokuFrame extends JFrame {
	private JPanel buttonSelectionPanel;
    private SlideSudokuBoard board;
    private SlideSudokuBoard answerboard;
    private int size;
    private int kan_size = 60; //칸사이즈
    private SudokuButton[][] kan;
    
   
    public SudokuFrame(int boardsize, SlideSudokuBoard b) {
        size = boardsize;
        board = b;
        kan = new SudokuButton[size][size];
        JPanel c = new JPanel();
        
        c.setLayout(null);
        c.setPreferredSize(new Dimension(800,600));
        buttonSelectionPanel = new JPanel();
        buttonSelectionPanel.setPreferredSize(new Dimension(90,500));
        c.add(buttonSelectionPanel);
        this.add(c);
      //칸 컨드롤러 생성
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                kan[i][j]= new SudokuButton(board,this,kan[i][j]);
                kan[i][j].setBounds(i*kan_size,j*kan_size,kan_size,kan_size);
                c.add(kan[i][j]);
            
            }
        }
     update();
     addWindowListener(new ExitController());
     setTitle("Sudoku");
     setSize(size * kan_size + 200,  size * kan_size + 400);
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
     


}