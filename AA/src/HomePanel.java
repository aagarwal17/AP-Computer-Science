import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel
{
	public HomePanel()
	{
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel home= new JLabel("WELCOME");
		add(home,gbc);
		BufferedImage bankjpg= null;
		try
		{
			bankjpg= ImageIO.read(new File("bankfigure.jpg"));
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		gbc.gridx=0;
		gbc.gridy=1;
		JLabel homejpg= new JLabel (new ImageIcon(bankjpg));
		add(homejpg, gbc);
	}
}
