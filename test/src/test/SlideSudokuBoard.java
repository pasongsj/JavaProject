package test;//cf SlidePuzzleBoard

import java.util.InputMismatchException;
import java.util.Random;

import javax.swing.event.MouseInputAdapter;
import javax.swing.*;

import java.awt.Button;
import java.awt.event.*;
import java.util.Scanner;


public class SlideSudokuBoard {
   private int size;
   private BoardPiece[][] board;
   private BoardPiece[][] answerboard;
   private BoardPiece re;

   
   
//   private int emp_r;//�� ��
//   private int emp_c;//�� ��
//    private int slotWidth;
//    private int slotHeight;

   
   public  SlideSudokuBoard(int s, int hole) {
      size = s;
      board = new BoardPiece[size][size];
      answerboard = new BoardPiece[size][size];
      int n = 0; // ��
      int m = 0;  //��
      int i,j,k;
      
      for( i=0;i<size;i++) {
         BoardPiece l = new BoardPiece(i+1);
         m = i;//��
         n = 0;//��
         for( j=0;j<size;j=j+3) {
            for(k=0;k<size;k=k+3) {
               while(m>8){
                  m=m-9;
               }
               while(n>8) {
                  n=n-8;
               }
               board[n][m] = l;
               m++;
               n=n+3;
            }//�ϴ� 9X9�� �����Ϸ�
            
         }
         
      }
      
      for(i=0;i<3; i++)//�� ����
      {
         Random random = new Random();
         BoardPiece [][] p = new BoardPiece[1][9];//���� ���� �ӽ�����tmp1�༯�� ����
         int rand1 = random.nextInt(3)+i*3;
         int rand2 = random.nextInt(3)+i*3;
         for(j=0;j<9;j++) {
            p[0][j] = board[rand1][j];
            board[rand1][j] = board[rand2][j];
            board[rand2][j] = p[0][j];//�༯��
            
         }   
      }
      for(i=0;i<3; i++)//��
      {
         Random random = new Random();
         BoardPiece[][] q = new BoardPiece[9][1];//���� ���� �ӽ�����tmp2������ ����
         int rand1 = random.nextInt(3)+i*3;
         int rand2 = random.nextInt(3)+i*3;
         int[][] tmp = new int[9][1];//���� ��ġ��ȯ �ӽ� �迭
         for(j=0;j<9;j++) {
            q[j][0] = board[j][rand1];
            board[j][rand1] = board[j][rand2];
            board[j][rand2] = q[j][0];//�� ����
            
         }   
      }
      // ��ĭ �ձ�
      for( i=0;i<size;i++) {
    	  for(j=0;j<size;j++) {
    		  answerboard[i][j]=board[i][j];
    	  }
      }
      
      
      while(hole>0) {
         Random random = new Random();
         BoardPiece mi = new BoardPiece(0);
          i = random.nextInt(9);
         j = random.nextInt(9);
         
         if(board[i][j].valueOf() != 0) {
            board[i][j] = mi;
            hole--;
         }
      }
      
      
   
    }
   
//   public void PrintSudoku(int board[][]) {//���� ����Ʈ_�ֹܼ���
//      int i=0;
//      int j=0;
//      for(i=0;i<9;i++) {
//         for(j=0;j<9;j++) {
//             System.out.print(board[i][j]);   
//             }
//          System.out.println("");
//       }
//      
//   }
//   public void enter(int i) {
//      BoardPiece j = new BoardPiece(i);
//      return j;
//      
//   }
   public BoardPiece[][] contents(){ 
      BoardPiece[][] answer = new BoardPiece[size][size];
       for ( int i = 0;  i != size;  i = i+1 )
           { for ( int j = 0;  j != size;  j = j+1 ){
              answer[j][i] = board[i][j];
                 }
           }
       return answer;
     }
   public boolean EnterNum(int x,int y) {
      int num = 0;
      boolean answer = false;
      if(board[x][y].valueOf() == 0) {
    	  
//         Scanner sc=new Scanner(System.in);
//         try {
//        	 num = sc.nextInt();
//         }
//         catch(InputMismatchException e ) {
//        	 System.out.println("Enter Integer");
//         }
        	 
      }
         
         
      
      re = new BoardPiece(num);
      if(answerboard[x][y].valueOf() == re.valueOf()) {
    	  board[x][y] = re;
    	  System.out.println(board[x][y].valueOf());
         answer = true;
      }
      else {
    	  System.out.println("Worng");
      }

      return answer;
      
   }
   public void actionPerformed(ActionEvent e) {
	   String a = (String) e.getSource();
	   int b = Integer.parseInt(a);

   }
//   private class SudokuPanelMouseAdapter extends MouseInputAdapter {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//           if(e.getButton() == MouseEvent.BUTTON1) {
//              //slotWidth = usedWidth/puzzle.getNumColumns();
//              //slotHeight = usedHeight/puzzle.getNumRows();
//              slotWidth = e.getY()/60;
//              slotHeight = e.getX()/60;
//              System.out.println(slotWidth);
//              System.out.println(slotHeight);
//              //currentlySelectedRow = e.getY() / slotHeight;
//              //currentlySelectedCol = e.getX() / slotWidth;
//              e.getComponent().repaint();
//           }
//        }
     }
   
   



   
