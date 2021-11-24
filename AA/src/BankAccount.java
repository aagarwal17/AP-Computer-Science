/**
 * 
 * @author mellis
 *
 */
public abstract class BankAccount 
{
	public static int nextAccNum = 1;
	String name;
	int acctNum;
	double balance;
	
	/**
	 * Construct a new bank account with no balance
	 * @param n Name
	 */
	public BankAccount(String n)
	{
		name = n;
		acctNum = nextAccNum;
		nextAccNum++;
		balance = 0;
	}
	
	/**
	 * Construct a new bank account with a set balance
	 * @param n Name
	 * @param b Balance
	 */
	public BankAccount(String n, double b)
	{
		name = n;
		acctNum = nextAccNum;
		nextAccNum++;
		balance = b;
	}
	
	/**
	 * adds money to bank account
	 * @param amt amount to add
	 */
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	/**
	 * removes money from bank account
	 * @param amt money to be removed
	 */
	public void withdraw(double amt)
	{
		balance -= amt;
	}
	
	/**
	 * returns name
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * returns balance
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * updates an account
	 */
	public abstract void endOfMonthUpdate();
	
	/**
	 * transfers money from one account to another
	 * to be implemented in subclasses
	 * @param other account to add to
	 * @param amt amount to be removed
	 */
	public abstract void transfer(BankAccount other, double amt);
	
	/**
	 * returns name, acctNum, and balance of bank account
	 */
	public String toString()
	{
		return acctNum + "\t" + name + "\t$" + balance;
	}
	
}

