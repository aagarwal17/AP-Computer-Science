/**
 * 
 * @author Arun Agarwal
 *Pd. 7
 */
public class DiceArray 
{

	public static void main(String[] args) 
	{
		/**
		 * Creates two dice objects, die1 and die2
		 */
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		/**
		 * Declares variables roll1, roll2, and sum1
		 */
		
		int roll1;
		int roll2;
		int sum1;
		
		/**
		 * declares array
		 */
		int[] values = new int[11];
		
		/**
		 * for statement that rolls die 1000 times		
		 */
		
		for (int i=0; i<1000; i++)
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			sum1 = (roll1 + roll2);
			
			/**
			 * if statements for each sum of the two die that adds one to the values,
			 * which increases the count of each number roll by one
			 */
			
			if (sum1==2)
			{
				++ values [0];
			}
			if (sum1==3)
			{
				++ values [1];
			}
			if (sum1==4)
			{
				++ values [2];
			}
			if (sum1==5)
			{
				++ values [3];
			}
			if (sum1==6)
			{
				++ values [4];
			}
			if (sum1==7)
			{
				++ values [5];
			}
			if (sum1==8)
			{
				++ values [6];
			}
			if (sum1==9)
			{
				++ values [7];
			}
			if (sum1==10)
			{
				++ values [8];
			}
			if (sum1==11)
			{
				++ values [9];
			}
			if (sum1==12)
			{
				++ values [10];
			}
		}
		
		/**
		 * Prints how many times each value 2-12 was rolled
		 */
		
		System.out.println("You rolled " + values[0] + " twos" );
		System.out.println("You rolled " + values[1] + " threes" );
		System.out.println("You rolled " + values[2] + " fours" );
		System.out.println("You rolled " + values[3] + " fives" );
		System.out.println("You rolled " + values[4] + " sixes" );
		System.out.println("You rolled " + values[5] + " sevens" );
		System.out.println("You rolled " + values[6] + " eights" );
		System.out.println("You rolled " + values[7] + " nines" );
		System.out.println("You rolled " + values[8] + " tens" );
		System.out.println("You rolled " + values[9] + " elevens" );
		System.out.println("You rolled " + values[10] + " twelves" );
	}

}
