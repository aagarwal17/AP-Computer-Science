import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TransferPanel extends JPanel
{
	ArrayList <BankAccount> bankaccounts;
	BankAccount temp1;
	BankAccount temp2;
	String success1;
	String success2;
	public TransferPanel(ArrayList<BankAccount> total)
	{
		bankaccounts= total;
		setSize(500,500);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		JLabel name1= new JLabel("Enter the Name Under the Account You Would Like to Transfer Money From");
		add(name1, gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		JTextField entername1= new JTextField();
		entername1.setPreferredSize(new Dimension(500,30));
		add(entername1, gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		JLabel balance1= new JLabel ("Enter the Current Balance of the Account You Would Like to Transfer Money From");
		add(balance1, gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		JTextField enterbalance1= new JTextField();
		enterbalance1.setPreferredSize(new Dimension(500,30));
		add(enterbalance1, gbc);
		gbc.gridx=2;
		gbc.gridy=1;
		JButton find1= new JButton("Find Account");
		add(find1, gbc);
		gbc.gridx=0;
		gbc.gridy=2;
		JCheckBox correct1= new JCheckBox ("Is This Correct?");
		correct1.setBounds(10, 90, 100, 20);
		add(correct1,gbc);
		gbc.gridx=0;
		gbc.gridy=3;
		JLabel name2= new JLabel("Please Enter the Name Under the Account You Would Like to Transfer Money Into");
		add(name2, gbc);
		gbc.gridx=1;
		gbc.gridy=3;
		JTextField entername2= new JTextField();
		entername2.setPreferredSize(new Dimension(500,30));
		add(entername2, gbc);
		gbc.gridx=0;
		gbc.gridy=4;
		JLabel balance2= new JLabel ("Enter the Current Balance of the Account You Would Like to Transfer Money To");
		add(balance2, gbc);
		gbc.gridx=1;
		gbc.gridy=4;
		JTextField enterbalance2= new JTextField();
		enterbalance2.setPreferredSize(new Dimension(500,30));
		add(enterbalance2, gbc);
		gbc.gridx=2;
		gbc.gridy=4;
		JButton find2= new JButton("Find Account");
		add(find2, gbc);
		gbc.gridx=0;
		gbc.gridy=5;
		JCheckBox correct2= new JCheckBox ("Is This Correct?");
		correct2.setBounds(10, 90, 100, 20);
		add(correct2,gbc);
		gbc.gridx=0;
		gbc.gridy=6;
		JLabel amount= new JLabel("Please Enter the Amount You Would Like To Deposit");
		add(amount, gbc);
		gbc.gridx=1;
		gbc.gridy=6;
		JTextField enteramount= new JTextField();
		enteramount.setPreferredSize(new Dimension(500,30));
		add(enteramount,gbc);
		gbc.gridx=0;
		gbc.gridy=7;
		JButton submit= new JButton("Submit");
		add(submit, gbc);
		gbc.gridx=3;
		gbc.gridy=1;
		JLabel invalid= new JLabel("Please Enter all Fields");
		add(invalid, gbc);
		invalid.setVisible(false);
		gbc.gridx=3;
		gbc.gridy=1;
		JLabel found= new JLabel(""+success1);
		add(found,gbc);
		found.setVisible(false);
		gbc.gridx=3;
		gbc.gridy=1;
		JLabel failure= new JLabel("No Match Found! Try Again");
		add(failure, gbc);
		failure.setVisible(false);
		gbc.gridx=1;
		gbc.gridy=2;
		JLabel proceed= new JLabel ("Proceed to Enter Information For Other Account");
		add(proceed, gbc);
		proceed.setVisible(false);
		gbc.gridx=1;
		gbc.gridy=2;
		JLabel fail= new JLabel ("Please Check Information and Try Again");
		add(fail, gbc);
		fail.setVisible(false);
		gbc.gridx=3;
		gbc.gridy=4;
		JLabel invalid2= new JLabel("Please Enter all Fields");
		add(invalid2, gbc);
		invalid2.setVisible(false);
		gbc.gridx=3;
		gbc.gridy=4;
		JLabel found2= new JLabel(""+success2);
		add(found2,gbc);
		found2.setVisible(false);
		gbc.gridx=3;
		gbc.gridy=4;
		JLabel failure2= new JLabel("No Match Found! Try Again");
		add(failure2, gbc);
		failure2.setVisible(false);
		gbc.gridx=1;
		gbc.gridy=5;
		JLabel proceedmore= new JLabel ("Proceed to Enter Amount");
		add(proceedmore, gbc);
		proceedmore.setVisible(false);
		gbc.gridx=1;
		gbc.gridy=5;
		JLabel morefailure= new JLabel ("Please Check Information and Try Again");
		add(morefailure, gbc);
		morefailure.setVisible(false);
		gbc.gridx= 1;
		gbc.gridx=7;
		JLabel toomuch = new JLabel("Amount Chosen is Greater Than Balance");
		add(toomuch, gbc);
		toomuch.setVisible(false);
		gbc.gridx=1;
		gbc.gridy=7;
		JLabel done= new JLabel("Success!");
		add(done,gbc);
		done.setVisible(false);
		
		
		
		find1.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if(entername1.getText().equals("")||enterbalance1.getText().equals(""))
				{
					invalid.setVisible(true);
					found.setVisible(false);
					failure.setVisible(false);
				}
				else
				{	
					String nme= entername1.getText();
					double bal = 0;
					try
					{bal= Double.parseDouble(enterbalance1.getText());}
					catch(NumberFormatException o)
					{System.out.print("Please Enter a Number");}
					
						int i=0;
						int yes=0;
						while(i<bankaccounts.size())
						{
							if(nme.equals(bankaccounts.get(i).getName())&& bal==bankaccounts.get(i).getBalance())
							{
								temp1= bankaccounts.get(i);
								success1= bankaccounts.get(i).toString();
								yes++;
								found.setVisible(true);
								invalid.setVisible(false);
								failure.setVisible(false);
							}
							i++;
						}
						if(yes==0)
						{
							failure.setVisible(true);
							invalid.setVisible(false);
							found.setVisible(false);
						}
						if(correct1.isSelected())
						{
							proceed.setVisible(true);
							fail.setVisible(false);
						}
						else if(!correct1.isSelected())
						{
							fail.setVisible(true);
							proceed.setVisible(false);
						}
				
				}
			}
			
		});
				
				
				
				find2.addActionListener(new ActionListener() 
				{

					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						if(entername2.getText().equals("")||enterbalance2.getText().equals(""))
						{
							invalid2.setVisible(true);
							found2.setVisible(false);
							failure2.setVisible(false);
						}
						else
						{	
							String nme= entername2.getText();
							double bal = 0;
							try
							{bal= Double.parseDouble(enterbalance2.getText());}
							catch(NumberFormatException p)
							{System.out.print("Please Enter a Number");}
							
								int i=0;
								int yes=0;
								while(i<bankaccounts.size())
								{
									if(nme.equals(bankaccounts.get(i).getName())&& bal==bankaccounts.get(i).getBalance())
									{
										temp2= bankaccounts.get(i);
										success2= bankaccounts.get(i).toString();
										yes++;
										found2.setVisible(true);
										invalid2.setVisible(false);
										failure2.setVisible(false);
									}
									i++;
								}
								if(yes==0)
								{
									failure2.setVisible(true);
									invalid2.setVisible(false);
									found2.setVisible(false);
								}
								if(correct2.isSelected())
								{
									proceedmore.setVisible(true);
									morefailure.setVisible(false);
								}
								else if(!correct2.isSelected())
								{
									morefailure.setVisible(true);
									proceedmore.setVisible(false);
								}
						
						}
					}
					
				});
				
				submit.addActionListener(new ActionListener() 
				{

					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						double amt=0;
						try
						{amt= Double.parseDouble(enteramount.getText());}
						catch(NumberFormatException m)
						{System.out.print("Please Enter a Number");}
						if(temp1.getBalance()<amt)
						{
							toomuch.setVisible(true);
							done.setVisible(false);
						}
						else
						{
							temp1.withdraw(amt);
							temp2.deposit(amt);
							done.setVisible(true);
							toomuch.setVisible(false);
							entername1.setText("");
							enterbalance1.setText("");
							entername2.setText("");
							enterbalance2.setText("");
						}
						
					}
					
				});
				
				
	}
}
