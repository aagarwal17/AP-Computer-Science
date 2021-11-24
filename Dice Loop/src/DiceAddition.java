import java.util.Scanner;
/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
		
public class DiceAddition 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		DiceLoop dice1 = new DiceLoop ();
		
		DiceLoop dice2 = new DiceLoop ();
		
		int roll1 = 0;
		int roll2 = 0;
		
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
		
		int count = 0;
		while (value != roll1 + roll2);
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll(); 
			count ++;
			int rollSum = roll1 + roll2;
			System.out.println(roll1 + "+ " + roll2 + "= " + rollSum);
		}
		System.out.println("You rolled " + count + "times");
	}

}
