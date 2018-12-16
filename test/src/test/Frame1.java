package test;
import java.awt.*;
import javax.swing.*;
public class Frame1 extends JFrame{
	public Frame1()
	  { super("button");
	    setBounds(1100,200,200,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container c = this.getContentPane();
	    JPanel panel = new JPanel();
	    JButton button1 = new JButton("1");
	    JButton button2 = new JButton("2");
	    JButton button3 = new JButton("3");
	    JButton button4 = new JButton("4");
	    JButton button5 = new JButton("5");
	    JButton button6 = new JButton("6");
	    JButton button7 = new JButton("7");
	    JButton button8 = new JButton("8");
	    JButton button9 = new JButton("9");			
	    JLabel timer = null;
	    timer = new JLabel("0");
	    panel.add(button1);
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(button4);
	    panel.add(button5);
	    panel.add(button6);
	    panel.add(button7);
	    panel.add(button8);
	    panel.add(button9);
	    panel.add(timer);
	    c.add(panel);
	    setVisible(true);
	    
    	timer.setFont(new Font("Serif",Font.PLAIN,50));
    	
    	int i=0;
    	int t=0;
    	while(true) {
    		timer.setText(""+t+":"+i);
    		try {
    			Thread.sleep(1000);
    		} catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    		i++;
    		if(i==60) {
    			t=t+1;
    			i=0;
    		}
    	}
    	
    	
	  }
}
