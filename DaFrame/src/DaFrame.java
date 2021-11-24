import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * 
 * @author Arun Agarwal Period. 7 AP Computer Science
 *
 */
public class DaFrame extends JFrame implements ActionListener 
{
	private JButton daButton;
	private int h = 0, w = 0;
	
	public DaFrame()
	{
		setBounds(100,100,800,600);
		setLayout(null);
		
		daButton = new JButton("Dis Button");
		daButton.setSize(100,50);
		daButton.setLocation(getWidth()/2 - daButton.getWidth()/2, getHeight()/2 - daButton.getHeight()/2);
		
		add(daButton);
		
		addKeyListener(new KeyListener()
				{
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode() == e.VK_UP)
						{
							h = 10;
						}
						else if (e.getKeyCode()==e.VK_DOWN)
						{
							h = -10;
						}
						else if (e.getKeyCode()==e.VK_RIGHT)
						{
							w = 10;
						}
						else if(e.getKeyCode()==e.VK_LEFT)
						{
							w = -10;
						}
					}
					public void keyReleased (KeyEvent e)
					{
						if(e.getKeyCode() == e.VK_UP)
						{
							h = 0;
						}
						else if (e.getKeyCode()==e.VK_DOWN)
						{
							h = 0;
						}
						else if (e.getKeyCode()==e.VK_RIGHT)
						{
							w = 0;
						}
						else if(e.getKeyCode()==e.VK_LEFT)
						{
							w = 0;
						}
					}
					
					public void keyTyped (KeyEvent e)
					{}
					
				});
		//Timers are a way for us to loop code or for it to continuously run; you could also use an infinite loop and putting the thread to sleep, but we will not be doing this.
		Timer t1 = new Timer(100,this);
		t1.start();
		
		daButton.setFocusable(false);
		setFocusable(true);
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		daButton.setSize(daButton.getWidth() + w, daButton.getHeight() + h);
		daButton.setLocation(getWidth()/2 - daButton.getWidth()/2, getHeight()/2 - daButton.getHeight()/2);
		repaint();
	}
	
	public static void main(String[] args)
	{
		new DaFrame();
	}
	
}
