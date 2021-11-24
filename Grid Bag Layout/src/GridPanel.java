import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridPanel extends JPanel
{

	public GridPanel()
	{
		
		setLayout( new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel myLabel = new JLabel("This is Cool :) ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(myLabel, gbc);
		
		
		JTextField enter = new JTextField();
		gbc.gridx = 1;
		enter.setPreferredSize(new Dimension(200,30));
		add(enter,gbc);
		
		JButton whatever = new JButton("Whatever");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		add(whatever,gbc);
	}
}
