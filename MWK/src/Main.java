import javax.swing.JFrame;

public class Main extends JFrame
{
	public Main()
	{
		add(new AccountPanel());
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new Main();
		
	}

}
