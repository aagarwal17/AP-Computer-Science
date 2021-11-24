import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Arun Agarwal
 * Pd. 7 AP COMPUTER SCIENCE
 */
public class MainClass
{
	
	/**
	 * 
	 * @param str initializes to a string that could be numeric
	 * @return true if string is numeric and false if string is not numeric
	 */
	private static boolean isNumeric (String str)
	{
		try
		{
			Double.parseDouble(str);
			return true;
		}
		catch (IllegalArgumentException e)
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		/**
		 * Creates a new ArrayList called list
		 */
		ArrayList <BankAccount> list = new ArrayList<BankAccount>();
		Scanner in = new Scanner(System.in);
		
		/**
		 * sets value of overdraft fee, rate, transaction, minimum balance, minimum balance fee, and free transactions
		 */
		final double OVER_DRAFT_FEE = 15;
		final double RATE = .0025;
		final double TRANSACTION_FEE= 1.5;
		final double MIN_BAL = 300;
		final double MIN_BAL_FEE = 10;
		final int FREE_TRANS = 10;
		
		// extra instance variables
		
		String answer = "n";
		double balance=0;
		String initialBalance="";
		
		while(answer.equals("n"))
		{
			System.out.println("Would you like to add an account (y/n): ");
			String response = in.nextLine();
			
			if(response.equals("y"))
			{
				String go = "yes";
				while(go.equals("yes"))
				{
					String choice="";
					while (!choice.equals("c") && !choice.equals("s")) 	
					{
					System.out.print("Would you like a SavingsAccount or CheckingAccount (s/c): ");
					choice = in.nextLine();
					
					switch (choice)
					{
					
					case "s":
					{
						System.out.println("What would you like to name your account: ");
						String name = in.nextLine();
						System.out.println("Would you like to make an initial deposit (y/n): ");
						String initialBalanceChoice = in.nextLine();
						
						if(initialBalanceChoice.equals("y"))
						{
							System.out.println("What would you like to deposit: ");
							initialBalance = in.nextLine();
							while(!isNumeric(initialBalance))
							{
								System.out.println("Transaction is not authorized.  Please enter again: ");
								initialBalance = in.nextLine();
							}
						}
						
						else if (initialBalanceChoice.equals("n"))
						{
							initialBalance="0";
							
						}
						balance = Double.parseDouble(initialBalance);
						
						SavingsAccount save = new SavingsAccount(name, balance, RATE, MIN_BAL, MIN_BAL_FEE);
						list.add(save);
						go="no";
						
						for (int i=0; i<list.size(); i++)
						{
								BankAccount account=list.get(i);
								System.out.println(account.toString());
								if (account instanceof CheckingAccount)
								{
									System.out.println("It is a checking account");
								}
								else
								{
									System.out.println("It is a savings account");
								}
						}
						
						break;
					}
					
					case "c":
					{
						System.out.println("What would you like to name your account: ");
						String name = in.nextLine();
						System.out.println("Would you like to make an initial deposit (y/n): ");
						String initialBalanceChoice = in.nextLine();
						
						if(initialBalanceChoice.equals("y"))
						{
							System.out.println("What would you like to deposit: ");
							initialBalance = in.nextLine();
							isNumeric(initialBalance);
							while(!isNumeric(initialBalance))
							{
								System.out.println("Transaction is not authorized.  Please enter again: ");
								initialBalance = in.nextLine();
							}
							balance=Double.parseDouble(initialBalance);
						}
						
						else if (initialBalanceChoice.equals("n"))
						{
						balance=0;
						}
												

						CheckingAccount check = new CheckingAccount(name, balance, OVER_DRAFT_FEE, TRANSACTION_FEE, FREE_TRANS);
						list.add(check);
						go="no";
						
						for (int i=0; i<list.size(); i++)
						{
								BankAccount account=list.get(i);
								System.out.println(account.toString());
								if (account instanceof CheckingAccount)
								{
									System.out.println("It is a checking account");
								}
								else
								{
									System.out.println("It is a savings account");
								}
						}
						
						break;
					}
					
					default:
					{
						go="yes";
						break;
					}
				}
				}
			}
			}	
			
			while (!response.equals("y") && !response.equals("n")) 
			{
				System.out.println("Would you like to add an account (y/n): ");
				response=in.nextLine();
			}
			
			
			System.out.print("Would you like to make a transaction (y/n): ");
			response = in.nextLine();
			
			if(response.equals("y"))
			{
				System.out.println("Would you like to make a withdraw, deposit, transfer, or get account numbers (w/d/t/n): ");
				String reply = in.nextLine();
				
				switch (reply)
				{
				
				case "w":
				{
					System.out.println("What is your bank account number: ");
					String number = in.nextLine();
					isNumeric(number);
					
					while(!isNumeric(number))
					{
						System.out.println("Transaction is not authorized.  Please enter again: ");
						number = in.nextLine();
					}
					double num = Double.parseDouble(number);
					System.out.print("How much would you like to withdraw: ");
					String amt= in.nextLine();
					isNumeric(amt);
					
					while(!isNumeric(amt))
					{
						System.out.println("Transaction is not authorized.  Please enter again: ");
						amt = in.nextLine();
					}
					double amount = Double.parseDouble(amt);
					in.nextLine();
					
					for (int i=0; i<list.size(); i++)
					{
						if (num==(list.get(i).getAccountNumber()))
						{
							BankAccount account = list.get(i);
							try
							{
								account.withdraw(amount);
							}
							catch (IllegalArgumentException e)
							{
								System.out.println("Transaction not authorized");
							}
						}
					}
					break;
				}
				
				case "d":
				{
						System.out.println("What is your bank account number: ");
						String number = in.nextLine();
						isNumeric(number);
						
						while(!isNumeric(number))
						{
							System.out.println("Transaction is not authorized.  Please enter again: ");
							number = in.nextLine();
						}
						double num = Double.parseDouble(number);
						System.out.print("How much would you like to deposit: ");
						String amt= in.nextLine();
						isNumeric(amt);
						
						while(!isNumeric(amt))
						{
							System.out.println("Transaction is not authorized.  Please enter again: ");
							amt = in.nextLine();
						}
						double amount = Double.parseDouble(amt);
						in.nextLine();
						
						for (int i=0; i<list.size(); i++)
						{
							if (num==(list.get(i).getAccountNumber()))
							{
								BankAccount account = list.get(i);
								try
								{
									account.deposit(amount);
								}
								catch (IllegalArgumentException e)
								{
									System.out.println("Transaction not authorized");
								}
							}
						}
					break;
				}
				
				case "t":
				{
					System.out.println("What is your bank account number: ");
					String number = in.nextLine();
					isNumeric(number);
					
					while(!isNumeric(number))
					{
						System.out.println("Transaction is not authorized.  Please enter again: ");
						number = in.nextLine();
					}
					double num = Double.parseDouble(number);
					
					System.out.println("What is the other bank account number: ");
					String other = in.nextLine();
					isNumeric(other);
					
					while(!isNumeric(other))
					{
						System.out.println("Transaction is not authorized.  Please enter again: ");
						other = in.nextLine();
					}
					double oth = Double.parseDouble(number);
					
					System.out.println("How much would you like to transfer: ");
					String amt= in.nextLine();
					isNumeric(amt);
					
					while(!isNumeric(amt))
					{
						System.out.println("Transaction is not authorized.  Please enter again: ");
						amt = in.nextLine();
					}
					
					double amount = Double.parseDouble(amt);
					
					BankAccount accountOth= null;
					
					for (int i=0; i<list.size(); i++)
					{
						if (oth==(list.get(i).getAccountNumber()))
						{
							BankAccount account = list.get(i);
							accountOth= list.get(i);
						}
					}
					BankAccount originalAcc = null;
					
					for (int j=0; j<list.size(); j++)
					{
						if (num==(list.get(j).getAccountNumber()))
						{
							BankAccount account = list.get(j);
							originalAcc = list.get(j);
						}						
					}
					
					try
					{
						originalAcc.transfer(accountOth, amount);
					}
					catch (IllegalArgumentException e)
					{
						System.out.println("Transaction not aruthorized.");
					}
					
					break;
			}
				
				case "n":
				{
					String play = "go";
					
					while(play.equals("go"))
					{
						System.out.println("What is your name: ");
						String name = in.nextLine();
						System.out.println("The account numbers in your name are: ");
						
						for (int i=0; i<list.size(); i++)
						{
							if (name.equals(list.get(i).getName()))
							{
								BankAccount account=list.get(i);
								System.out.println(account.toString());
								if (account instanceof CheckingAccount)
								{
									System.out.println("It is a checking account");
								}
								else
								{
									System.out.println("It is a savings account");
								}
								play="no";
							}
							else
							{
								System.out.println("That is not a valid name.");
								play="go";
							}
						}
					}
					break;
				}
				default:
				{
					while((!reply.equals("w"))&&(!reply.equals("d"))&&(!reply.equals("t"))&&(!reply.equals("n"))) 	
					{
						System.out.println("Would you like to make a withdraw, deposit, transfer, or get account numbers (w/d/t/n): ");
						reply = in.nextLine();
					}
				}
				
			while (!response.equals("y")&& !response.equals("n"))	
			{
				System.out.print("Would you like to make a transaction (y/n): ");
				response = in.nextLine();
			}
			}
			
			answer = "";
			System.out.print("Would you like to terminate the program (y/n): ");
			answer = in.nextLine();
			while (!answer.equals("y") && !answer.equals("n"))
			{
				System.out.print("Would you like to terminate the program (y/n): ");
				answer = in.nextLine();
			}
			
			
		}
	}
	}
}