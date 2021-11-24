import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

	/**
	 * 
	 * @author Arun Agarwal
	 * AP Computer Science Period 7
	 * Small Bank Account Project With GUI
	 */

public class JBankAccount extends JFrame
{
ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();

		public JBankAccount()
		{
			
			//sets Title to Bank Account
			setTitle("Bank Account");
			setBounds(300,200,475,235);
			setLayout(null);
			
			
			//creates and adds a JLabel for Name
			JLabel name = new JLabel("Name: ");
			name.setBounds(25,25,125,25);
			add(name);
			
			//creates and adds a text field for user to enter their name
			JTextField nameText = new JTextField();
			nameText.setBounds(115,25,125,25);
			add(nameText);

			
			//creates and adds a label for the account type 
			JLabel accountType = new JLabel("Account Type: ");
			accountType.setBounds(25,65,125,25);
			add(accountType);
			
			//creates a string called accounts for the drop down menu choices
			//creates and adds a drop down menu for either a Checking or Savings Account
			String [] accounts = {" ", "Checking", "Savings"};
			JComboBox accountDropMenu = new JComboBox(accounts);
			accountDropMenu.setBounds(115,65,125,25);
			add(accountDropMenu);
			
			
			//creates and adds a label for the Initial Balance
			JLabel initialBalance = new JLabel("Initial Balance: ");
			initialBalance.setBounds(25,95,125,25);
			add(initialBalance);
			
			//creates and adds a text field for the uder to enter their initial balance
			JTextField initialBalanceText = new JTextField();
			initialBalanceText.setBounds(115,95,125,25);
			add(initialBalanceText);
			
			
			//creates and adds a button to create the account with the previous arguments
			//actionPerformed method will add the account to the array list and clear the items after button is clicked
			JButton createAccount = new JButton("Create Account");
			createAccount.setBounds(25,125,140,25);
			createAccount.addActionListener(new ActionListener ()
			{

				public void actionPerformed(ActionEvent e) 
				{
					String name = nameText.getText();
					double balance = Double.parseDouble(initialBalanceText.getText());
					final double OVER_DRAFT_FEE = 15;
					final double RATE = .0025;
					final double TRANSACTION_FEE= 1.5;
					final double MIN_BAL = 300;
					final double MIN_BAL_FEE = 10;
					final int FREE_TRANS = 10;
					System.out.print(accountDropMenu.getSelectedObjects());
					if(accountDropMenu.getSelectedItem().equals("Savings"))
					{
						BankAccount sbank = new SavingsAccount(name, balance, RATE, MIN_BAL, MIN_BAL_FEE);
						accountList.add(sbank);
						
					}
					
					else if (accountDropMenu.getSelectedItem().equals("Checking"))
					{
						BankAccount cbank = new CheckingAccount(name, balance, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANS);
						accountList.add(cbank);
						
					}
					System.out.println(accountList.size());
					
					nameText.setText("");
					initialBalanceText.setText("");
					accountDropMenu.setSelectedItem(" ");
				}
		
			});
			add(createAccount);
			
			
			//creates and adds a button to Display all Accounts
			//when clicked, actionPerformed method will retrieve and print all Bank Accounts in the array list into the console
			JButton displayAccounts = new JButton("Display All Accounts");
			displayAccounts.setBounds(200,125,180,25);
			displayAccounts.addActionListener(new ActionListener ()
			{
				public void actionPerformed(ActionEvent e) 
				{
					for (int i=0; i<accountList.size(); i++)
					{
							System.out.println(accountList.get(i).toString());
					}
				}
			});
			add(displayAccounts);

							
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		//main method
		public static void main(String[] args)
		{
			new JBankAccount();
		}
	}
