import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * 
 * @author Arun Agarwal Pd. 7
 * Walking Man Frame
 */
public class WalkingFrame extends JFrame implements ActionListener
{
	private WalkingMan man;
	private int x, y;
	private ArrayList<JBall> bunch;
	private JBall ball;

	public WalkingFrame(int x, int y)
	{
		this.x = x;
		this.y = y;
		setBounds(100,100,x,y);
		setLayout(null);
		man = new WalkingMan(0, 0);
		add(man);
		bunch = new ArrayList <JBall>();
		setName("Walking Man");
		
		
		this.addKeyListener (new KeyListener()
				{

			public void keyPressed(KeyEvent e) 
			{
				if (e.getKeyCode()==e.VK_W)
				{
					if(man.getY() <= 12)
					{
						man.setDy(0);
					}
					else
						man.setDy(-3);
				}
				
				else if (e.getKeyCode()==e.VK_S)
				{
					if(man.getY() >= getHeight() - man.getHeight() - 40 && man.getDy() >= 0)
					{
						man.setDy(0);
					}
					else
						man.setDy(3);
				}
				
				else if (e.getKeyCode()==e.VK_A)
				{
					if(man.getX() <= 8)
					{
						man.setDx(0);
					}
					else
						man.setDx(-3);
				}
				
				else if (e.getKeyCode()==e.VK_D)
				{
					if(man.getX() >= getWidth() - man.getWidth() - 14 && man.getDx() > 0)
					{
						man.setDx(0);
					}
					else
						man.setDx(3);
				}
				
				else if(e.getKeyCode()==e.VK_SPACE)
				{
					ball = new JBall(man.getX(),man.getY());
					bunch.add(ball);
					add(ball);
				}
				
			}

			public void keyReleased(KeyEvent e) 
			{
				if (e.getKeyCode()==e.VK_W)
				{
					man.setDy(0);
				}
				
				else if (e.getKeyCode()==e.VK_S)
				{
					man.setDy(0);
				}
				
				else if (e.getKeyCode()==e.VK_A)
				{
					man.setDx(0);
				}
				
				else if (e.getKeyCode()==e.VK_D)
				{
					man.setDx(0);
				}
				
				else if(e.getKeyCode()==e.VK_SPACE)
				{
					
				}
				
			}

			public void keyTyped(KeyEvent e) 
			{
				
			}
	
		});
		
		Timer t1 = new Timer(6, this);
		t1.start();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args)
	{
		new WalkingFrame(400,400);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
		if (man.getX() <= 0 && man.getDx() <= 0)
		{
			man.setDx(0);
		}
		else if (man.getX() >= getWidth() - man.getWidth() - 14 && man.getDx() > 0)
		{
			man.setDx(0);
		}
		if (man.getY() <= 0 && man.getDy() <= 0)
		{
			man.setDy(0);
		}
		else if (man.getY() >= getHeight() - man.getHeight() - 40 && man.getDy() >= 0)
		{
			man.setDy(0);
		}
		
		man.update();
		
		for(int i = bunch.size()-1; i>=0; i--)
		{
			if(bunch.get(i).getX()>this.getWidth())
			{
				bunch.get(i).remove(ball);
				remove(bunch.get(i));
			}
		}
		
		for(int i = bunch.size()-1; i>=0; i--)
		{
			bunch.get(i).update();
		}
		
		
		repaint();
	}
	
}