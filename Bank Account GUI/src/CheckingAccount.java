/**
 * 
 * @author Arun Agarwal Pd. 7
 *Checking Account New Version for GUI
 */
public class CheckingAccount extends BankAccount
{
	//instance variables
	
	final double OVER_DRAFT_FEE;
	final double TRANSACTION_FEE;
	final double FREE_TRANS;
	private int numTransactions; 

	//constructors
	
	/**
	 * initializes a new constructor
	 * @param n initializes to name
	 * @param b initializes to balance
	 * @param odf initializes to over draft fee
	 * @param tf initializes to transaction fee
	 * @param freeTrans initializes to free transaction
	 */
	public CheckingAccount(String n, double b, double odf, double tf, int freeTrans)
	{
		super (n, b);
		OVER_DRAFT_FEE = odf;
		TRANSACTION_FEE = tf;
		FREE_TRANS = freeTrans;
	}
	
	/**
	 * initializes a new constructor
	 * @param n initializes to name
	 * @param odf initializes to over draft fee
	 * @param tf initializes to transaction fee
	 * @param freeTrans initializes to free transaction
	 */
	public CheckingAccount(String n, double odf, double tf, int freeTrans)
	{
		super (n);
		OVER_DRAFT_FEE = odf;
		TRANSACTION_FEE = tf;
		FREE_TRANS = freeTrans;
	}
	
	//methods
	
	/**
	 * deposits an amount in to an account
	 */
	public void deposit (double amt)
	{
		if (amt < 0)
		{
			throw new IllegalArgumentException("You cannot deposit no money!");
		}
		else
		{
			super.deposit(amt);
			numTransactions++;
			
			if (numTransactions > FREE_TRANS)
			{
				super.withdraw(TRANSACTION_FEE);
			}
		}
	}
	
	/**
	 * withdraws an amount from an account
	 */
	public void withdraw (double amt)
	{
		if (amt < 0 || getBalance() < 0)
		{
			throw new IllegalArgumentException("amount must be greater than zero/ you cannot withdraw if your account is negative");
		}
		else
		{
			super.withdraw(amt);
			numTransactions++;
			
			if (numTransactions > FREE_TRANS)
			{
				super.withdraw(TRANSACTION_FEE);
			}
			if (getBalance() < 0)
			{
				super.withdraw(OVER_DRAFT_FEE);
			}
			
		}
	}
	
	/**
	 * withdraws money from this account and deposits it into other account
	 */
	public void transfer (BankAccount other, double amt)
	{
		if (getBalance() >= amt && getName().equals(other.getName()))
		{
				super.transfer(other,amt);
		}
		else
				throw new IllegalArgumentException();
	}
	
	/**
	 * sets the numTransactions to zero
	 */
	public void endOfMonthUpdate()
	{
		numTransactions = 0;
	}
}
