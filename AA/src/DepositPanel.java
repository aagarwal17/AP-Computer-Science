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

public class DepositPanel extends JPanel
{
	ArrayList<BankAccount> bankaccounts;
	public DepositPanel(ArrayList<BankAccount> total)
	{
		bankaccounts= total;
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name= new JLabel ("Write the Name Under The Account You Would Like To Deposit Money Into");
		add(name, gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		JTextField entername= new JTextField();
		entername.setPreferredSize(new Dimension(500,30));
		add(entername, gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		JLabel balance= new JLabel ("Select the Current Balance of the Desired Account");
		add(balance, gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		JTextField enterbalance= new JTextField();
		enterbalance.setPreferredSize(new Dimension(500,30));
		add(enterbalance, gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		JLabel deposit= new JLabel("Please Enter the Amount of Money You Would Like to Deposit");
		add(deposit, gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		JTextField enterdeposit= new JTextField();
		enterdeposit.setPreferredSize(new Dimension(500,30));
		add(enterdeposit, gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		JButton submit= new JButton("Submit");
		add(submit, gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel invalid= new JLabel("Please Enter all Fields");
		add(invalid, gbc);
		invalid.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel success= new JLabel("Success");
		add(success,gbc);
		success.setVisible(false);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel failure= new JLabel("No Match Found! Try Again");
		add(failure, gbc);
		failure.setVisible(false);
		
		submit.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e)
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
					double amt=0;
					try
					{bal= Double.parseDouble(enterbalance.getText());}
					catch(NumberFormatException f)
					{System.out.print("Please Enter a Number");}
					try
					{amt= Double.parseDouble(enterdeposit.getText());}
					catch(NumberFormatException z)
					{System.out.print("Please Enter a Number");}
				
					
						int i=0;
						int yes=0;
						while(i<bankaccounts.size())
						{
							if(nme.equals(bankaccounts.get(i).getName())&& bal==bankaccounts.get(i).getBalance())
							{
								bankaccounts.get(i).deposit(amt);
								yes++;
								success.setVisible(true);
								invalid.setVisible(false);
								failure.setVisible(false);
								entername.setText("");
								enterbalance.setText("");
								enterdeposit.setText("");
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