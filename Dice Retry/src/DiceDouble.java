import java.util.Scanner;
/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class DiceDouble
{
	public static void main(String[] args) 
	{
		DiceLoop dice1 = new DiceLoop ();
		DiceLoop dice2 = new DiceLoop ();
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		System.out.println("The values of roll1 and roll2, respectively, are: " + roll1 + " " + roll2);
		int count = 1;
		while (roll1 != roll2)
		{
		roll1 = dice1.roll();
		roll2 = dice2.roll(); 
		count ++;
		System.out.println("The values of roll1 and roll2, respectively, are: " + roll1 + " " + roll2);
		}
		System.out.println("You rolled " + count + " times to get doubles.");
		
		
		
		
		Scanner in = new Scanner (System.in);
		
		DiceLoop die1 = new DiceLoop ();
		DiceLoop die2 = new DiceLoop ();
		
		int rol1 = die1.roll();
		int rol2 = die2.roll();
		
		System.out.println("Please enter a value between two and twelve: ");
		int value = in.nextInt();
		in.nextLine();
		
		while (value > 12 || value < 2)
		{
			System.out.println("This is an invalid number choice");
			System.out.println("Please enter a value between two and twelve: ");
			value = in.nextInt();
			in.nextLine();
		}
		
		int counter = 0;
		while (value != rol1 + rol2)
		{
			rol1 = die1.roll();
			rol2 = die2.roll(); 
			counter ++;
			int rollSum = rol1 + rol2;
			System.out.println(rol1 + "+ " + rol2 + "= " + rollSum);
		}
		System.out.println("You rolled " + counter + " times");
	}
}


{
	System.out.println("This is an invalid number choice");
	System.out.println("Please enter a value between two and twelve: ");
	value = in.nextInt();
	in.nextLine();
}{}

