/**
 * 
 * @author Arun Agarwal Pd. 7
 * Bank Accounts and Polymorphism
 */
public abstract class BankAccount 
{
	//instance variables
	
	private static int nextAccNum;
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	
	/**
	 * initializes the constructor
	 * @param n initializes to name
	 */
		public BankAccount(String n)
			{
				name = n;
				accNum = nextAccNum;
				nextAccNum++;
				balance = 0;
			}
		
		/**
		 * initializes the constructor
		 * @param n initializes to name
		 * @param b initializes to balance
		 */
		public BankAccount(String n, double b)
			{
				name = n;
				accNum = nextAccNum;
				nextAccNum++;
				balance = b;
			}
		
		//methods
		
		/**
		 * adds the amount deposited to the balance 
		 * @param amt is the amount to add to the balance
		 */
		public void deposit(double amt)
		{
			balance = amt + balance;
		}
		
		/**
		 * removes the amount withdrawn from the account
		 * @param amt is the amount to remove from the account
		 */
		public void withdraw(double amt)
		{
			balance = balance - amt;
		}
		
		/**
		 * retrieves the name
		 * @return name
		 */
		public String getName()
		{
			return name;
		}
		
		/**
		 * retrieves balance
		 * @return balance
		 */
		public double getBalance()
		{
			return balance;
		}
		
		/**
		 * creates an abstract method that is manipulated in the subclasses
		 */
		public abstract void endOfMonthUpdate();
		
		/**
		 * withdraws the amount from the first account and deposits it into the second account
		 * @param other is the second account that gets the deposit
		 * @param amt is the amount to withdraw from the first account
		 */
		public void transfer(BankAccount other, double amt)
		{
			withdraw(amt);
			other.deposit(amt);
		}
		
		/**
		 * puts the String into the form account number, name, and balance
		 */
		public String toString()
		{
			return "Account Number: " + accNum + "\tName: " + name + "\tBalance: " + "$" + balance;
		}
		
		/**
		 * finds the number of the account
		 * @return accNum
		 */
		public int getAccountNumber()
		{
			return accNum;
		}
		
}