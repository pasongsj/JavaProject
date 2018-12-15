package Sudoku;

import java.util.Random;

public class SudokuBoard  {
	public SudokuBoard() {
		// TODO Auto-generated method stub
		int array[][] = {{8,1,2,7,5,3,6,4,9},{9,4,3,6,8,2,1,7,5},{6,7,5,4,9,1,2,8,3},
	        	{1,5,4,2,3,7,8,9,6},{3,6,9,8,4,5,7,2,1},{2,8,7,1,6,9,5,3,4},
	        	{5,2,1,9,7,4,3,6,8},{4,3,8,5,2,6,9,1,7},{7,9,6,3,1,8,4,5,2}} ; // �迭 ����
		int i,j;
		for(i=0;i<5; i++)//�� ����
		{
			Random random = new Random();

			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
			int[][] tmp = new int[1][9];//���� ��ġ��ȯ �ӽ� �迭
			for(j=0;j<9;j++) {
				tmp[0][j] = array[rand1][j];
				array[rand1][j] = array[rand2][j];
				array[rand2][j] = tmp[0][j];	
			}	
		}
		for (i=0;i<5;i++) //�� ����
		{
			Random random = new Random();
			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
			int[][] tmp = new int[9][1];//���� ��ġ��ȯ �ӽ� �迭
			for(j=0;j<9;j++) {
				tmp[j][0] = array[j][rand1];
				array[j][rand1] = array[j][rand2];
				array[j][rand2] = tmp[j][0];	
			}
		}
		System.out.print(array[0][0]);
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				System.out.print(array[i][j]);
			}
				System.out.println("");
		}
	}
}
