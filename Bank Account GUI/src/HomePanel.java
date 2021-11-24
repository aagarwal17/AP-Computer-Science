import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class HomePanel extends JPanel
{
	public HomePanel()
	{
		setSize(700,400);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel home= new JLabel("WELCOME TO ARUN'S BANKING SOFTWARE");
		home.setForeground(Color.WHITE);
		Font big = new Font("SansSerif", Font.BOLD, 30);
		home.setFont(big);
		add(home,gbc);
		
		BufferedImage bankjpg = null;
		try
		{
			bankjpg= ImageIO.read(new File("moneyb.jpg"));
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel homejpg= new JLabel (new ImageIcon(bankjpg));
		add(homejpg, gbc);
		
	}
	
}
