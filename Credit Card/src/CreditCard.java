/**
 * 
 * @author Arun Agarwal
 *	Pd. 7
 *	Credit Card Class
 */
public class CreditCard 
{
	//fields
	/**
	 * creates field variables CARDNUM, limit, balance, interestRate, and holderName
	 */
final int CARDNUM;
double limit;
double balance;
double interestRate;
String holderName;
	//constructor
/**
 * Constructor that takes the parameters below; balance is equal to 0
 * @param CARDNUM1
 * @param limit1
 * @param interestRate1
 * @param holderName1
 */
public CreditCard(int CARDNUM1, double limit1, double interestRate1, String holderName1)
{
	CARDNUM = CARDNUM1;
	limit = limit1;
	interestRate=interestRate1;
	holderName = holderName1;
	balance = 0;
}
/**
 * charge method that charges the person's credit card
 * @param amount
 */
	public void charge (double amount)
	{
		if (balance+amount < limit)
		{
			balance = balance + amount; 
		}
		else
		{
			System.out.println("You have exceeded the limit");
		}
	}
	/**
	 * credit method that subtracts an amount from the balance
	 * @param amount
	 */
	public void credit (double amount)
	{
		balance = balance-amount;
	}
	/**
	 * chargeInterest method that takes no parameter and adds the interest rate to the balance
	 */
	public void chargeInterest ()
	{
		balance= balance + (interestRate * balance);
	}
	/**
	 * accessors for each of the fields
	 * @return
	 */
	public int getCARDNUM()
	{
		return CARDNUM;
	}
	public double getLimit()
	{
		return limit;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public String getHolderName()
	{
		return holderName;
	}
	/**
	 * toString method that returns everything in a string
	 */
	public String toString()
	{
		return "CardNumber: " + getCARDNUM() + "\tName: " + getHolderName() + "\tBalance: " + getBalance() + "\tRate: " + getInterestRate() + "\tLimit: "
 + getLimit();	
	}
}
