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
	String [] accts= {"Checkings", "Savings"};
	ArrayList<BankAccount> bankaccounts;
	
	public AccountPanel(ArrayList<BankAccount> total)
	{
		bankaccounts= total;
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name= new JLabel("Name: ");
		add(name, gbc);
		gbc.gridx++;
		gbc.gridy=0;
		JTextField namebox= new JTextField();
		namebox.setPreferredSize(new Dimension(500,30));
		add(namebox,gbc);
		gbc.gridx=0;
		gbc.gridy++;
		JLabel deposit= new JLabel("Initial Deposit: ");
		add(deposit, gbc);
		gbc.gridx++;
		gbc.gridy=1;
		JTextField depositbox= new JTextField();
		depositbox.setPreferredSize(new Dimension(500,30));
		add(depositbox,gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		JLabel accountype= new JLabel("Account Type: ");
		add(accountype, gbc);
		gbc.gridx++; 
		gbc.gridy=2; 
		JList type= new JList(accts);
		add(type, gbc);
		JScrollPane thetypes= new JScrollPane(type);
		thetypes.setPreferredSize(new Dimension (500,60));
		add(thetypes, gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		JButton submit= new JButton("Submit");
		add(submit, gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel invalid= new JLabel("Please Enter All Fields");
		add(invalid, gbc);
		invalid.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel success= new JLabel("Success!");
		add(success, gbc);
		success.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel failure= new JLabel("Please Check If All Fields are Entered Correctly");
		add(failure, gbc);
		failure.setVisible(false);
		
		submit.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						if(namebox.getText().equals("")||depositbox.getText().equals(""))
						{
							invalid.setVisible(true);
							success.setVisible(false);
							failure.setVisible(false);
						}
						else
						{	
							String nme= namebox.getText();
							double balance= Double.parseDouble(depositbox.getText());
							double intRate= 0.01;
							double MIN_BAL= 10.0;
							double MIN_BAL_FEE= 2.0;
							double OVER_DRAFT_FEE=1.0;
							double TRANSACTION_FEE=.5;
							int FREE_TRANS=5;
							try
							{balance= Double.parseDouble(depositbox.getText());}
							catch(NumberFormatException y)
							{
								failure.setVisible(true);
								invalid.setVisible(false);
								success.setVisible(false);
							}
						if(type.getSelectedValue().equals("Savings"))
						{
							BankAccount sacct= new SavingsAccount(nme, balance, intRate,MIN_BAL, MIN_BAL_FEE);
							bankaccounts.add(sacct);
							success.setVisible(true);
							invalid.setVisible(false);
							failure.setVisible(false);
							namebox.setText("");
							depositbox.setText("");
						}
						else if(type.getSelectedValue().equals("Checkings"))
						{
							BankAccount cacct= new CheckingAccount(nme, balance, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANS);
							bankaccounts.add(cacct);
							success.setVisible(true);
							invalid.setVisible(false);
							failure.setVisible(false);
							namebox.setText("");
							depositbox.setText("");
						}
						else
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
