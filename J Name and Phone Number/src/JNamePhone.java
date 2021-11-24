	import java.awt.Dimension;
	import java.awt.Point;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

/**
 * 	
 * @author Arun Agarwal
 *	Pd. 7 AP Computer Science Class Work
 */
	
public class JNamePhone 
{
	public static void main (String [] args)
		
		{
		JFrame myFrame = new JFrame("Frame");
		myFrame.setBounds(400,400,600,300);
		myFrame.setLayout(null);
		
		JLabel lbl1 = new JLabel("Name");
		lbl1.setBounds(30,45,150,30);
		myFrame.add(lbl1);
		
		JLabel lbl2 = new JLabel("Phone Number");
		lbl2.setBounds(30,95,150,30);
		myFrame.add(lbl2);
		
		JButton button1 = new JButton("Button");
		button1.setSize(new Dimension(100,50));
		button1.setLocation(new Point(220,80));
		
		JTextField txtName = new JTextField();
		txtName.setBounds(30,70,150,30);
		myFrame.add(txtName);
		
		JTextField txtName2 = new JTextField();
		txtName2.setBounds(30,120,150,30);
		myFrame.add(txtName2);
		
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						lbl1.setText("Your name is: " + txtName.getText());
						txtName.setText("");
						
						lbl2.setText("Your number is: " + txtName2.getText());
						txtName2.setText("");
					}
				}
		);
		myFrame.add(button1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
