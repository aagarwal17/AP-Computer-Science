/**
 * 
 * @author mellis
 *
 */
public class SavingsAccount extends BankAccount
{
	private double intRate;
	private final double MIN_BAL, MIN_BAL_FEE;
	
	/**
	 * Creates new savings account with set balance
	 * @param n Name
	 * @param b Balance
	 * @param r Interest rate
	 * @param mb Minimum balance
	 * @param mbf Minimum balance fee
	 */
	public SavingsAccount(String n, double b, double r, double mb, double mbf)
	{
		super(n, b);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	/**
	 * Creates new savings account with zero balance
	 * @param n Name
	 * @param b Balance
	 * @param mb Minimum balance
	 * @param mbf Minimum balance fee
	 */
	public SavingsAccount(String n, double r, double mb, double mbf)
	{
		super(n);
		intRate = r;
		MIN_BAL = mb;
		MIN_BAL_FEE = mbf;
	}
	
	/**
	 * removes money from account
	 * charges fee if balance goes below minimum balance
	 */
	public void withdraw(double amt)
	{
		if (getBalance() - amt >= 0 && amt >= 0)
		{
			super.withdraw(amt);
			if (getBalance() < MIN_BAL)
				super.withdraw(MIN_BAL_FEE);;
		}
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * transfers money from one account to another
	 */
	public void transfer(BankAccount other, double amt)
	{
		if (getBalance() - amt >= 0 && getName().equals(other.getName()))
		{
			super.withdraw(amt);
			other.deposit(amt);
		}
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * calculates interest and adds it to account
	 */
	public void addInterest()
	{
		super.deposit(super.getBalance() * intRate);
	}
	
	/**
	 * adds interest to account
	 */
	public void endOfMonthUpdate()
	{
		this.addInterest();
	}
}