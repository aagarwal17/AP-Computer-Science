	import java.awt.Dimension;
	import java.awt.Point;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
/**
 * 	
 * @author Arun Agarwal
 *	Pd. 7 AP Computer Science Class Work
 */
public class JFrameIntroduction 

{
	public static void main (String [] args)
	
	{
	JFrame myFrame = new JFrame();
	myFrame.setBounds(300,300,500,250);
	myFrame.setLayout(null);

	myFrame.setVisible(true);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JLabel lbl1 = new JLabel("Welcome to GUI");
	lbl1.setBounds(35,55,300,30);
	myFrame.add(lbl1);
	
	JButton button1 = new JButton("button");
	button1.setSize(new Dimension(100,30));
	button1.setLocation(new Point(275,55));
	
	button1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					lbl1.setText("Not gonna lie Mr. Ellis, this is pretty cool.");
					button1.setLocation((int)(Math.random()*500+100), (int)(Math.random()*200+100));
				}
			}
	);
	
	myFrame.add(button1);
	}
	
}
