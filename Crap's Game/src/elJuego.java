import java.util.Scanner;
/**
 * 
 * @author Arun Agarwal
 * elJuego Class
 * Pd. 7
 */ 
public class elJuego 
{

	public static void main(String[] args) 
	{
		/**
		 * Creates Scanner named in
		 */
		Scanner in = new Scanner(System.in);
		/**
		 * Creates two dice objects, die1 and die2
		 */
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		/**
		 * Declares integer variables for the two rolls (roll1 and roll2), the sum (sum1), and the point (point)
		 */
		int roll1;
		int roll2;
		int sum1;
		int point;
		/**
		 * Creates a boolean variable named play that equals true
		 */
		boolean play = true; 
		//check the first roll
		/**
		 * while loop that runs game and repeats as long as play is true
		 */
		while (play)// for the entire game to repeat
		{
			System.out.println("Hi welcome to Crap's Game! Please press enter to roll the dice: ");
			in.nextLine();
			roll1 = die1.roll();
			roll2 = die2.roll();
		
			sum1 = (roll1 + roll2);
			point = sum1;
			/**
			 * if statement that displays dice art for each roll
			 */
			if (roll1==1)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|     |\n" + "|  *  |\n" + "|     |\n" + "-------\n");
			}
			if (roll2==1)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|     |\n" + "|  *  |\n" + "|     |\n" + "-------\n");
			}
			if (roll1==2)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|*    |\n" + "|     |\n" + "|    *|\n" + "-------\n");
			}
			if (roll2==2)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|*    |\n" + "|     |\n" + "|    *|\n" + "-------\n");
			}
			if (roll1==3)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|*    |\n" + "|  *  |\n" + "|    *|\n" + "-------\n");
			}
			if (roll2==3)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|*    |\n" + "|  *  |\n" + "|    *|\n" + "-------\n");
			}
			if (roll1==4)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|     |\n" + "|*   *|\n" + "-------\n");
			}
			if (roll2==4)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|     |\n" + "|*   *|\n" + "-------\n");
			}
			if (roll1==5)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|  *  |\n" + "|*   *|\n" + "-------\n");
			}
			if (roll2==5)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|  *  |\n" + "|*   *|\n" + "-------\n");
			}
			if (roll1==6)
			{
				System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|*   *|\n" + "|*   *|\n" + "-------\n");
			}
			if (roll2==6)
			{
				System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|*   *|\n" + "|*   *|\n" + "-------\n");
			}
		System.out.println("die 1: " + roll1 + "\tdie 2: " + roll2 + "\tsum: " + sum1);
		/**
		 * if statement for first role; states what happens when you win, lose, or neither win nor lose
		 */
					if (sum1==2 || sum1==12)
					{
						System.out.println("You a loser" );
					}
					
					else if (sum1==7 || sum1==11)
					{
						System.out.println("You a winner! ");
					}
					else
					{
						point = sum1;
						System.out.println("Your point is " + sum1);
						System.out.println("Since you did not win or lose, please press enter to roll again: ");
						in.nextLine();
						/**
						 * Creates a boolean variable called rollAgain that equals true
						 */
						boolean rollAgain = true;
						/**
						 * while loop that repeats until rollAgain is false
						 */
						while (rollAgain)
						{
							roll1 = die1.roll();
							roll2 = die2.roll();
						
							sum1 = (roll1 + roll2);
							/**
							 * if statement that displays dice art for each roll
							 */
							if (roll2==1)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|     |\n" + "|  *  |\n" + "|     |\n" + "-------\n");
							}
							if (roll1==2)
							{
								System.out.println("Die1: " + roll1 + "\n-------\n" + "|*    |\n" + "|     |\n" + "|    *|\n" + "-------\n");
							}
							if (roll2==2)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|*    |\n" + "|     |\n" + "|    *|\n" + "-------\n");
							}
							if (roll1==3)
							{
								System.out.println("Die1: " + roll1 + "\n-------\n" + "|*    |\n" + "|  *  |\n" + "|    *|\n" + "-------\n");
							}
							if (roll2==3)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|*    |\n" + "|  *  |\n" + "|    *|\n" + "-------\n");
							}
							if (roll1==4)
							{
								System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|     |\n" + "|*   *|\n" + "-------\n");
							}
							if (roll2==4)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|     |\n" + "|*   *|\n" + "-------\n");
							}
							if (roll1==5)
							{
								System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|  *  |\n" + "|*   *|\n" + "-------\n");
							}
							if (roll2==5)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|  *  |\n" + "|*   *|\n" + "-------\n");
							}
							if (roll1==6)
							{
								System.out.println("Die1: " + roll1 + "\n-------\n" + "|*   *|\n" + "|*   *|\n" + "|*   *|\n" + "-------\n");
							}
							if (roll2==6)
							{
								System.out.println("Die2: " + roll2 + "\n-------\n" + "|*   *|\n" + "|*   *|\n" + "|*   *|\n" + "-------\n");
							}	
						
						System.out.println("die 1: " + roll1 + "\tdie 2: " + roll2 + "\tsum: " + sum1);
						/**
						 * if statement for subsequent rolls
						 */
							if(sum1 == point)
							{
								System.out.println("You a winner! ");
								rollAgain = false;
							}
							else if (sum1 == 7)
							{
								System.out.println("You a loser" );
								rollAgain = false;
							}
							else 
							{
								System.out.println("Please press enter to roll again: ");
								in.nextLine();
							}	
					}
			/**
			 * Prompts user if they would like to play again			
			 */
			System.out.println("Would you like to play again? Yes or No: ");
			String answer = in.next();
			in.nextLine();
			/**
			 * while loop that runs as long as answer does not equal Yes, yes, No, and no
			 */
			while(!answer.equals("Yes")&&!answer.equals("yes")&&!answer.equals("No")&&!answer.equals("no"))
			{
				System.out.println("This is an invalid input. Please type yes or no");
				answer = in.next();
				in.nextLine();
			}
		/**
		 * if statement that provides result depending on what user inputed for while loop (Yes or No)
		 */
			if (answer.equals("Yes") || answer.equals("yes"))
					{
					System.out.println("Alright, let's play again! " );
					play=true;
					}
			else if (answer.equals("No") || answer.equals("no"))
					{
					System.out.println("Thanks for playing? Cya later:) ");	
					play = false; 
					}

				}
		}
	}
}