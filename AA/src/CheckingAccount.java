/**
 * 
 * @author mellis
 *
 */
public class CheckingAccount extends BankAccount 
{
	private final double OVER_DRAFT_FEE, TRANSACTION_FEE;
	private final int FREE_TRANS;
	
	private int numTransactions;
	
	/**
	 * creates new checking account with set balance
	 * @param n Name
	 * @param b Balance
	 * @param odf Over draft fee
	 * @param tf Transaction fee
	 * @param freeTrans Number of free transactions
	 */
	public CheckingAccount(String n, double b, double odf, double tf, int freeTrans)
	{
		super(n, b);
		OVER_DRAFT_FEE = odf;
		TRANSACTION_FEE = tf;
		FREE_TRANS = freeTrans;
	}
	
	/**
	 * creates new checking account with zero balance
	 * @param n Name
	 * @param b Balance
	 * @param odf Over draft fee
	 * @param tf Transaction fee
	 * @param freeTrans Number of free transactions
	 */
	public CheckingAccount(String n, double odf, double tf, int freeTrans)
	{
		super(n);
		OVER_DRAFT_FEE = odf;
		TRANSACTION_FEE = tf;
		FREE_TRANS = freeTrans;
	}
	
	/**
	 * adds money to account
	 * charges transaction fee if over number of free transactions
	 */
	public void deposit(double amt)
	{
		if (amt >= 0)
		{
			super.deposit(amt);
			numTransactions++;
			if (numTransactions > FREE_TRANS)
				super.withdraw(TRANSACTION_FEE);
			if (super.getBalance() < 0)
				super.withdraw(OVER_DRAFT_FEE);;
		}
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * removes money from account
	 * charges transaction fee if over number of free transactions
	 */
	public void withdraw(double amt)
	{
		if (amt >= 0 && getBalance() >= 0)
		{
			super.withdraw(amt);
			numTransactions++;
			if (numTransactions > FREE_TRANS)
				super.withdraw(TRANSACTION_FEE);
			if (super.getBalance() < 0)
				super.withdraw(OVER_DRAFT_FEE);;
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
	 * resets number of transactions to zero
	 */
	public void endOfMonthUpdate()
	{
		numTransactions = 0;
	}
}
