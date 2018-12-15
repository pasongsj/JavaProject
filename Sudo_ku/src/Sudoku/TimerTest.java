package Sudoku;
import java.awt.*;
import javax.swing.*;
public class TimerTest extends JFrame {
    JLabel timer = null;
   
    public TimerTest() {
    	this.setTitle("Timer");
    	Container c = this.getContentPane();
    	c.setLayout(new FlowLayout());
    	timer = new JLabel("0");
    	timer.setFont(new Font("Gothic",Font.ITALIC,50));
    	c.add(timer);
    	
    	this.setSize(150, 120);
    	this.setVisible(true);
    	int i=0;
    	
    	while(true) {
    		timer.setText(""+i);
    		try {
    			Thread.sleep(1000);
    		} catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    		i++;
    	}
    }
}
