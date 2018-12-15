package test;//cf SlidePuzzleBoard

import java.util.Random;

public class SudokuBoard {
	public  SudokuBoard() {
		// TODO Auto-generated method stub
		int array[][] = {{8,1,2,7,5,3,6,4,9},{9,4,3,6,8,2,1,7,5},{6,7,5,4,9,1,2,8,3},
	        	{1,5,4,2,3,7,8,9,6},{3,6,9,8,4,5,7,2,1},{2,8,7,1,6,9,5,3,4},
	        	{5,2,1,9,7,4,3,6,8},{4,3,8,5,2,6,9,1,7},{7,9,6,3,1,8,4,5,2}} ; // 배열 만듦
		int i,j;
		for(i=0;i<5; i++)//행 섞기
		{
			Random random = new Random();

			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
			int[][] tmp = new int[1][9];//변수 위치변환 임시 배열
			for(j=0;j<9;j++) {
				tmp[0][j] = array[rand1][j];
				array[rand1][j] = array[rand2][j];
				array[rand2][j] = tmp[0][j];	
			}	
		}
		for (i=0;i<5;i++) //열 섞기
		{
			Random random = new Random();
			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
			int[][] tmp = new int[9][1];//변수 위치변환 임시 배열
			for(j=0;j<9;j++) {
				tmp[j][0] = array[j][rand1];
				array[j][rand1] = array[j][rand2];
				array[j][rand2] = tmp[j][0];	
			}
		}
		PrintSudoku(array);
		SudokuMakeHole(array);
		System.out.println("-------------");
		PrintSudoku(array);
	
    }
	public SudokuBoard[][] MakeHole (SudokuBoard[][] board) {
		int i,j;
		int hole = 50 ;
		while(hole>0) {
			Random random = new Random();
		    i = random.nextInt(9);
			j = random.nextInt(9);
			
			if(board[i][j]!=0) {
				board[i][j] = 0;
				hole--;
			}
		}
		return board;
		
	}
	public void PrintSudoku(int board[][]) {
		int i=0;
		int j=0;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
			    System.out.print(board[i][j]);	
			    }
		    System.out.println("");
	    }
		
	}

}

	

