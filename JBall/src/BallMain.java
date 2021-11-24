import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class BallMain {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setLayout(null);
		myFrame.setBounds(100,100,600,600);
		
		JBall myBall = new JBall();
		myBall.setLocation(250,50);
		myFrame.add(myBall);
		
		Timer t1 = new Timer(100,new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						myBall.setLocation((int)(Math.random() * 550), (int)(Math.random()*550));
						myFrame.repaint();
					}
				});
						
				t1.start();		
	
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
