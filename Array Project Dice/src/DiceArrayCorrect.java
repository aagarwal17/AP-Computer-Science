/**
 * 
 * @author Arun Agarwal
 *Pd. 7
 */
public class DiceArrayCorrect 
{

	public static void main(String[] args) 
	{
	Dice die1 = new Dice();
	Dice die2 = new Dice();
	
	int[] count = new int[13];
	
	for (int i=0; i<1000; i++)
		count [die1.roll() + die2.roll()] +=1;
	
	System.out.println(" You rolled " + count[i} + "" + i + "s"]);
	}

}
