/**
 * 
 * @author Arun Agarwal
 *Pd. 7
 *Interfaces/Hierarchy
 */
public class BankAccount 
{
private double balance;

public BankAccount()
{
	balance = 0;
}
public void deposit(double amt)
{
	balance = amt + balance;
}
public void withdrawal(double amt)
{
	balance = balance - amt;
}
public double getBalance()
{
	return balance;
}
}
