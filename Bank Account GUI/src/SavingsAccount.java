/**
 * 
 * @author Arun Agarwal Pd. 7
 * Savings Account New Version for GUI
 */
public class SavingsAccount extends BankAccount
{
	
	//instance variables
	
	private double intRate;
	final double MIN_BAL;
	final double MIN_BAL_FEE;
	
	//constructors
	
	/**
	 * initializes a new constructor
	 * @param n initializes to name
	 * @param b initializes to balance
	 * @param r initializes to interest rate
	 * @param mb initializes to minimum balance
	 * @param mbf initializes to minimum balance fee
	 */
	public SavingsAccount(String n, double b, double r, double mb, double mbf)
	{
		super (n, b);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	/**
	 * initializes a new constructor
	 * @param n initializes to name
	 * @param r initializes to interest rate
	 * @param mb initializes to minimum balance
	 * @param mbf initializes to minimum balance fee
	 */
	public SavingsAccount(String n, double r, double mb, double mbf)
	{
		super (n);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	//methods
	
	/**
	 * deposits an amount, that must be greater than zero, into the account
	 */
	public void deposit (double amt)
	{
		if (amt < 0)
		{
			throw new IllegalArgumentException("the amount must be greater than zero");
		}
		else
		{
			super.deposit(amt);
		}
	}
	
	/**
	 * withdraws an amount from the account and will add a minimum balance fee if it goes below the minimum balance
	 */
	public void withdraw (double amt)
	{
		if (amt>getBalance())
		{
			throw new IllegalArgumentException("balance must be greater than the amount you are trying to withdraw");
		}
		if (amt<0)
		{
			throw new IllegalArgumentException("amount cannot be less than zero");
		}
		super.withdraw(amt);
		if (getBalance() < MIN_BAL)
		{
			super.withdraw(MIN_BAL_FEE);
		}
	}
	/**
	 * transfers an amount from this account and depositions it into other account
	 */
	public void transfer (BankAccount other, double amt)
	{
		if (!getName().equals(other.getName()))
		{
			throw new IllegalArgumentException("the accounts must be in the same name");
		}
		if (amt>getBalance())
		{
			throw new IllegalArgumentException("the balance cannot be smaller than the amount");
		}
		if (amt<0)
		{
			throw new IllegalArgumentException("you cannot transfer more money than you have");
		}
		super.transfer(other, amt);
	}
	
	/**
	 * adds the interest rate to the balance
	 */
	public void addInterest()
	{
		super.deposit((intRate) * getBalance());
	}
	
	/**
	 * calls the addInterest method
	 */
	public void endOfMonthUpdate()
	{
		addInterest();
	}
}