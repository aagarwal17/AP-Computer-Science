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

public class AccountPanel extends JPanel
{
	String [] accts = {"Checking" , "Savings"};
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
	public AccountPanel()
	{
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		JLabel name = new JLabel("Name: ");
		add(name, gbc);
		
		gbc.gridx++;
		JTextField nameText = new JTextField();
		nameText.setPreferredSize(new Dimension (120,30));
		add(nameText,gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		JLabel deposit = new JLabel("Initial  Deposit: ");
		add (deposit, gbc);
		
		gbc.gridx++;
		JTextField depositText = new JTextField();
		depositText.setPreferredSize(new Dimension (120,30));
		add(depositText, gbc);
		
		gbc.gridx=0;
		gbc.gridy++;
		JLabel type = new JLabel("Account Type: ");
		add(type, gbc);
		
		gbc.gridx++;
		JList typeScroll = new JList(accts);
		JScrollPane panel = new JScrollPane(typeScroll);
		panel.setPreferredSize(new Dimension (120,50));

		add(panel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy ++;
		
		JButton getName = new JButton("Submit");
		getName.addActionListener(new ActionListener ()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						String n = nameText.getText();
						double b = Double.parseDouble(depositText.getText());
						double odf = 10;
						double tf = 1;
						int freeTrans = 15;
						double r = 0.02;
						double mb = 100;
						double mbf = 10;
						
						if(typeScroll.getSelectedValue().equals("Savings"))
						{
							BankAccount sbank = new SavingsAccount(n, b, r, mb, mbf);
							accounts.add(sbank);
							
						}
						
						else if (typeScroll.getSelectedValue().equals("Checking"))
						{
							BankAccount cbank = new CheckingAccount(n, b, odf, tf, freeTrans);
							accounts.add(cbank);
							
						}
					}
			
				});
		
		add(getName, gbc);
		
		
	}
}
