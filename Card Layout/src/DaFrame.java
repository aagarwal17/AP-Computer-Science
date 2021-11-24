import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Arun Agarwal Period 7
 *
 */
public class DaFrame extends JFrame
{

	public DaFrame()
	{
		
	JPanel overall = new JPanel();
	CardLayout cl = new CardLayout();
	overall.setLayout(cl);
	
	JPanel panel1 = new JPanel();
	panel1.add(new JLabel("This is Jawn One"));
	JButton button1 = new JButton("Button1");
	panel1.add(button1);
	
	JPanel panel2 = new JPanel();
	panel2.add(new JLabel("This is Jawn Two"));
	JButton button2 = new JButton("Button2");
	panel2.add(button2);
	
	JPanel panel3 = new JPanel();
	panel3.add(new JLabel("This is Jawn Three"));
	JButton button3 = new JButton("Button3");
	panel3.add(button3);
	
	overall.add(panel1, "panel1");
	overall.add(panel2,"panel2");
	overall.add(panel3, "panel3");
	
	cl.show(overall, "panel1");
	
	add(overall);
	setBounds(100,100,600,500);
	setVisible(true);
	setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	
	button1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			cl.show(overall, "panel2");
		}
	});
	
	button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			cl.show(overall, "panel3");
		}
	});

	button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			cl.show(overall, "panel1");
		}
	});
	
	}


	public static void main (String[] args)
	{
		new DaFrame();
	}
	
	
}
