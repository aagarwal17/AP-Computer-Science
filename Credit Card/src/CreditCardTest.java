/**
 * 
 * @author Arun Agarwal
 * Pd. 7
 * Credit Card Test Class
 */
public class CreditCardTest 
{

	public static void main(String[] args) 
	{
		/**
		 * new array with five empty indexes
		 */
		CreditCard[] cards = new CreditCard[5];
		cards [0] = new CreditCard (156383, 7000, 0.19, "Bill");
		cards [1] = new CreditCard (237292, 8000, 0.20, "Joey");
		cards [2] = new CreditCard (329832, 9000, 0.21, "Chris");
		cards [3] = new CreditCard (401283, 10000, 0.22, "Austin");
		cards [4] = new CreditCard (539337, 11000, 0.23, "Matthew");
		/**
		 * for each loop that charges 300.00 on account 0
		 */
for (CreditCard card: cards)
{
	if (card.getCARDNUM() == 156383)
	{
		card.charge(300.00);
	}	
}
/**
 * for each loop that charges 600.00 on account 1
 */
for (CreditCard card : cards)
{
	if (card.getCARDNUM() == 237292)
	{
		card.charge(600.00);
	}
}
/**
 * for each loop that charges 50.00 on account 0
 */
for (CreditCard card: cards)
{
	if (card.getCARDNUM() ==156383)
	{
		card.charge(50.00);
	}
}
/**
 * for each loop that prints toString method for the testClass
 */
for (CreditCard card : cards)
{
	System.out.println(card.toString());
}
	}

}
