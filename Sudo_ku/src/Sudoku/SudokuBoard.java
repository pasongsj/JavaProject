package Sudoku;

import java.util.Random;

<<<<<<< HEAD
public class SudokuBoard  {
	public SudokuBoard() {
		// TODO Auto-generated method stub
		int array[][] = {{8,1,2,7,5,3,6,4,9},{9,4,3,6,8,2,1,7,5},{6,7,5,4,9,1,2,8,3},
	        	{1,5,4,2,3,7,8,9,6},{3,6,9,8,4,5,7,2,1},{2,8,7,1,6,9,5,3,4},
	        	{5,2,1,9,7,4,3,6,8},{4,3,8,5,2,6,9,1,7},{7,9,6,3,1,8,4,5,2}} ; // ï¿½è¿­ ï¿½ï¿½ï¿½ï¿½
		int i,j;
		for(i=0;i<5; i++)//ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
=======
public class SudokuBoard {
    private SudokuBoard[][] array = {{8,1,2,7,5,3,6,4,9},{9,4,3,6,8,2,1,7,5},
                                     {6,7,5,4,9,1,2,8,3},{1,5,4,2,3,7,8,9,6},
                                     {3,6,9,8,4,5,7,2,1},{2,8,7,1,6,9,5,3,4},
                                     {5,2,1,9,7,4,3,6,8},{4,3,8,5,2,6,9,1,7},
                                     {7,9,6,3,1,8,4,5,2}} ; // ¹è¿­;
    
	public  SudokuBoard() {
		// TODO Auto-generated method stub
		array = new SudokuBoard[9][9];
		int i,j;
		for(i=0;i<5; i++)//Çà ¼¯±â
>>>>>>> master
		{
			Random random = new Random();

			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
<<<<<<< HEAD
			int[][] tmp = new int[1][9];//ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½Ä¡ï¿½ï¿½È¯ ï¿½Ó½ï¿½ ï¿½è¿­
=======
			SudokuBoard[][] tmp = new SudokuBoard[1][9];//º¯¼ö À§Ä¡º¯È¯ ÀÓ½Ã ¹è¿­
>>>>>>> master
			for(j=0;j<9;j++) {
				tmp[0][j] = array[rand1][j];
				array[rand1][j] = array[rand2][j];
				array[rand2][j] = tmp[0][j];	
			}	
		}
<<<<<<< HEAD
		for (i=0;i<5;i++) //ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
=======
		for (i=0;i<5;i++) //¿­ ¼¯±â
>>>>>>> master
		{
			Random random = new Random();
			int rand1 = random.nextInt(9);
			int rand2 = random.nextInt(9);
<<<<<<< HEAD
			int[][] tmp = new int[9][1];//ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½Ä¡ï¿½ï¿½È¯ ï¿½Ó½ï¿½ ï¿½è¿­
=======
			int[][] tmp = new int[9][1];//º¯¼ö À§Ä¡º¯È¯ ÀÓ½Ã ¹è¿­
>>>>>>> master
			for(j=0;j<9;j++) {
				tmp[j][0] = array[j][rand1];
				array[j][rand1] = array[j][rand2];
				array[j][rand2] = tmp[j][0];	
			}
		}
<<<<<<< HEAD
		System.out.print(array[0][0]);
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				System.out.print(array[i][j]);
			}
				System.out.println("");
		}
	}
}
=======
		PrintSudoku();
		SudokuMakeHole();
		System.out.println("-------------");
		PrintSudoku();
	
    }
	public SudokuBoard[][] SudokuMakeHole () {
		int i,j;
		int hole = 50 ;
		while(hole>0) {
			Random random = new Random();
		    i = random.nextInt(9);
			j = random.nextInt(9);
			
			if(array[i][j]!=null) {
				array[i][j] = null;
				hole--;
            }
        return array;
		
	}
	public void PrintSudoku() {
		int i=0;
		int j=0;
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
			    System.out.print(array[i][j]);	
			    }
		    System.out.println("");
	    }
		
	}

}
	

>>>>>>> master
