import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * 
 * @author Arun Agarwal Pd. 7
 * Walking Man
 */

public class WalkingMan extends JComponent implements Update
{
	private Ellipse2D.Double head;
	private Rectangle leftArm, rightArm, leftLeg, rightLeg, body;
	private int dx = 0, dy = 0;
	
	public WalkingMan(int x, int y)
	{
		this.setLocation(x,y);
		this.setSize(20,40);
		
		head = new Ellipse2D.Double(4,0,10,10);
		
		leftArm = new Rectangle (0,13,8,3);
		
		rightArm = new Rectangle (10,13,8,3);
		
		body = new Rectangle (8,10,3,20);
		
		rightLeg = new Rectangle (11,25,3,15);
		
		leftLeg = new Rectangle (5,25,3,15);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		
		g2.fill(head);
		
		g2.fill(leftArm);
		
		g2.fill(rightArm);
		
		g2.fill(body);
		
		g2.fill(leftLeg);
		
		g2.fill(rightLeg);
	}
	
	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	
	public int getDx()
	{
		return dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
}
