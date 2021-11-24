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
		Scanner in = new Scanner (System.in);
		DiceLoop dice1 = new DiceLoop ();
		DiceLoop dice2 = new DiceLoop ();
		int roll1 = 0;
		int roll2 = 0;
		System.out.println("Please enter a value between one and six: ");
		int value = in.nextInt();
		in.nextLine();
		
		while (value<1 || value>6)
		{
		System.out.println("This is an invalid number choice");
		System.out.println("Please enter a value between one and six: ");
		value = in.nextInt();
		in.nextLine();
		}
		
		int count = 0;
		while (roll1 != value && roll2 != value);
		{
		roll1 = dice1.roll();
		roll2 = dice2.roll(); 
		count ++;
		System.out.println("The value of roll1 and roll2 are: " + roll1 + roll2);
		}
	}	
		System.out.println("You rolled " + count + "times");
}

