import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindAccountPanel extends JPanel
{
	ArrayList<BankAccount> bankaccounts;
	String success;
	public FindAccountPanel(ArrayList<BankAccount> total)
	{
		bankaccounts= total;
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name= new JLabel ("Write the Name Under The Account You Would Like To Find");
		add(name, gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		JTextField entername= new JTextField();
		entername.setPreferredSize(new Dimension(500,30));
		add(entername, gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		JLabel balance= new JLabel ("Select the Current Balance of the Account You are Looking For");
		add(balance, gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		JTextField enterbalance= new JTextField();
		enterbalance.setPreferredSize(new Dimension(500,30));
		add(enterbalance, gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		JButton find= new JButton("Find");
		add(find, gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel invalid= new JLabel("Please Enter all Fields");
		add(invalid, gbc);
		invalid.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel found= new JLabel(" "+ success);
		add(found,gbc);
		found.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel failure= new JLabel("No Match Found! Try Again");
		add(failure, gbc);
		failure.setVisible(false);
		
		find.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(entername.getText().equals("")||enterbalance.getText().equals(""))
				{
					invalid.setVisible(true);
					found.setVisible(false);
					failure.setVisible(false);
				}
				else
				{	
					String nme= entername.getText();
					double bal = 0;
					try
					{bal= Double.parseDouble(enterbalance.getText());}
					catch(NumberFormatException f)
					{
						invalid.setVisible(true);
						found.setVisible(false);
						failure.setVisible(false);
					}
					
						int i=0;
						int yes=0;
						while(i<bankaccounts.size())
						{
							if(nme.equals(bankaccounts.get(i).getName())&& bal==bankaccounts.get(i).getBalance())
							{
								success= bankaccounts.get(i).toString();
								yes++;
								found.setVisible(true);
								invalid.setVisible(false);
								failure.setVisible(false);
								entername.setText("");
								enterbalance.setText("");
							}
							i++;
						}
						if(yes==0)
						{
							failure.setVisible(true);
							invalid.setVisible(false);
							found.setVisible(false);
							
						}
				
					
					}
					
				}
				
			});
		
	}
}
