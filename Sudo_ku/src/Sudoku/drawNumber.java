package Sudoku;
import java.awt.Graphics;

public class drawNumber {
	public void drawNumber(Graphics g) {
	int [][] Data;
	int WIDTH_COUNT = 9;
	int HEIGHT_COUNT = 9;
	Data= new int[WIDTH_COUNT][HEIGHT_COUNT];//9*9숫자 담을 변수
	
	
		
    int xpos;
    int ypos;
    for(int y=0;y<HEIGHT_COUNT;y++) {
    	for(int x=0; y<WIDTH_COUNT;x++) {
    		Data[y][x]=//여기에 섞은 거 넣고  
    	}
    }
    for(int y=0;y<HEIGHT_COUNT;y++) {
    	for(int x=0;x<WIDTH_COUNT;x++) {
    		xpos = x*100 +40;
    		ypos = y*100+40;
    		String st = ""+Data[y][x];
    		g.setFont(g.getFont().deriveFont(30.0f));//폰트크기 
    		g.drawString(st, xpos, ypos);// 문자열 출력  
    		
    	}
    }
}
}