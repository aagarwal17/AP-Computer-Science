/**
 * 
 * @author Arun Agarwal
 * Pd. 7
 * Interfaces/Hierarchy SubClass Example
 *
 */
public class SavingsAccount extends BankAccount
{
public final double INT_RATE= .25;

public void addInterest()
{
	deposit(getBalance() * INT_RATE);
}
}
