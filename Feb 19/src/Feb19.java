import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Feb19 extends JFrame
{

	public Feb19()
	{
		setTitle("my test constructor");
		setBounds (100,100,600,400);
		setLayout(null);
		
		JLabel labelOne = new JLabel("type whatever: ");
		labelOne.setBounds(20,20,100,30);
		add(labelOne);
		
		JTextField text = new JTextField("");
		text.setBounds(120,20,100,30);
		add(text);
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		new Feb19();
	}
}
