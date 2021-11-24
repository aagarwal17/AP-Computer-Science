import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class DeleteAccountPanel extends JPanel // The one I just made
{
	ArrayList<BankAccount> bankaccounts;
	public DeleteAccountPanel(ArrayList<BankAccount> total)
	{
		bankaccounts= total;
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name= new JLabel("Please Enter The Name of the Account You Would Like to Delete");
		add(name, gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		JTextField entername= new JTextField();
		entername.setPreferredSize(new Dimension(500,30));
		add(entername, gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		JLabel balance= new JLabel ("Please Enter the Current Balance of This Account");
		add(balance, gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		JTextField enterbalance= new JTextField();
		enterbalance.setPreferredSize(new Dimension(500,30));
		add(enterbalance, gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		JButton submit= new JButton("Submit");
		add(submit, gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel invalid= new JLabel("Please Enter all Fields");
		add(invalid, gbc);
		invalid.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel success= new JLabel("Success!");
		add(success,gbc);
		success.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel failure= new JLabel("No Match Found! Try Again");
		add(failure, gbc);
		failure.setVisible(false);
		
		submit.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				if(entername.getText().equals("")||enterbalance.getText().equals(""))
				{
					invalid.setVisible(true);
					success.setVisible(false);
					failure.setVisible(false);
				}
				else
				{
					String nme= entername.getText();
					double bal = 0;
				try
				{bal= Double.parseDouble(enterbalance.getText());}
				catch(NumberFormatException e)
				{System.out.print("Please Enter a Number");}
				
					int i=0;
					int yes=0;
					while(i<bankaccounts.size())
					{
						if(nme.equals(bankaccounts.get(i).getName())&& bal==bankaccounts.get(i).getBalance())
						{
							bankaccounts.remove(i);
							i--;
							yes++;
							success.setVisible(true);
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
						success.setVisible(false);
					}
			
				
				}
				
			}
			
		});
	}
}

