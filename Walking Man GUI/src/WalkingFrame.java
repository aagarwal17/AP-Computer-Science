import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * 
 * @author Arun Agarwal Pd. 7
 * Walking Man Frame
 */
public class WalkingFrame extends JFrame
{
	private Man man;

	public WalkingFrame()
	{
		setBounds(100,100,600,400);
		setLayout(null);
		man = new Man(0, 0);
		add(man);
		
		
		this.addKeyListener (new KeyListener()
				{

			public void keyPressed(KeyEvent e) 
			{
				if (e.getKeyCode()==e.VK_W)
				{
					man.setLocation(man.getX(),man.getY()-2);
				}
				
				if (e.getKeyCode()==e.VK_S)
				{
					man.setLocation(man.getX(),man.getY()+2);
				}
				
				if (e.getKeyCode()==e.VK_A)
				{
					man.setLocation(man.getX()-2,man.getY());
				}
				
				if (e.getKeyCode()==e.VK_D)
				{
					man.setLocation(man.getX()+2,man.getY());
				}
				
			}

			public void keyReleased(KeyEvent e) 
			{
				
			}

			public void keyTyped(KeyEvent e) 
			{
				
			}
	
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new WalkingFrame();
	}
	
	
}