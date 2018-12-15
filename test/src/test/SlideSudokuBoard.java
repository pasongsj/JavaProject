package test;//cf SlidePuzzleBoard

import java.util.Random;

public class SlideSudokuBoard {
	private int size;
	private BoardPiece[][] board;
	private BoardPiece[][] answerboard;
	
	
	private int emp_r;//�� ��
	private int emp_c;//�� ��
	
	public  SlideSudokuBoard(int s) {
		size = s;
		board = new BoardPiece[size][size];
		answerboard = new BoardPiece[size][size];
		int n = 0; // ��
		int m = 0;  //��
		int i,j,k;
		
		for( i=0;i<size;i++) {
			BoardPiece l = new BoardPiece(i);
			m = i;//��
			n = 0;//��
			for( j=0;j<size;j=j+3) {
				for(k=0;k<size;k=k+3) {
					if(m>8)    m=m-8;
					if(n>8)    n=n-8;
					board[n][m] = l;
					m++;
					n=n+3;
				}//�ϴ� 9X9�� �����Ϸ�
				
			}
			
		}
		
		for(i=0;i<5; i++)//�� ����
		{
			Random random = new Random();
			BoardPiece p = new BoardPiece(0);//���� ���� �ӽ�����tmp1�༯�� ����
			BoardPiece q = new BoardPiece(0);//���� ���� �ӽ�����tmp2������ ����
			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
			int[][] tmp = new int[1][9];//���� ��ġ��ȯ �ӽ� �迭
			for(j=0;j<9;j++) {
				p = board[rand1][j];
				board[rand1][j] = board[rand2][j];
				board[rand2][j] = p;//�༯��
				q = board[j][rand1];
				board[j][rand1] = board[j][rand2];
				board[j][rand2] = q;//�� ����
				
			}	
		}
		for(i=0;i<size;i++) {//���亸�� �����
			for(j=0;j<size;j++) {
				answerboard[i][j]=board[i][j];
			}
		}
		// ��ĭ �ձ�
		BoardPiece r = new BoardPiece(0);
        int hole = 50 ;
		
		while(hole>0) {
			Random random = new Random();
		    i = random.nextInt(9);
			j = random.nextInt(9);
			
			if(board[i][j] != r) {
				board[i][j] = r;
				hole--;
			}
		}
		
		
	
    }

	
//	public void PrintSudoku(int board[][]) {//���� ����Ʈ_�ֹܼ���
//		int i=0;
//		int j=0;
//		for(i=0;i<9;i++) {
//			for(j=0;j<9;j++) {
//			    System.out.print(board[i][j]);	
//			    }
//		    System.out.println("");
//	    }
//		
//	}
	public BoardPiece[][] contents(){ 
		BoardPiece[][] answer = new BoardPiece[size][size];
	    for ( int i = 0;  i != size;  i = i+1 )
	        { for ( int j = 0;  j != size;  j = j+1 )
	              { answer[i][j] = board[i][j]; }
	        }
	    return answer;
	  }
	private boolean found(int v, int row, int col){ 
		boolean answer = false;
	    if ( row >= 0  &&  row < size  &&  col >= 0  &&  col < size )
	       { answer = ( board[row][col].valueOf() == v ); }
	    return answer;
	  }
	

}

	

