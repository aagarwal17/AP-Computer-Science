import java.util.Scanner;

/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class PhoneNumber 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = in.next();
		in.nextLine();
		System.out.print("Please enter your phone number: ");
		String number = in.next();
		in.nextLine();
		System.out.printf("%-20s", name);
		String sub1 = number.substring(0, 3);
		String sub2 = number.substring(3, 6);
		String sub3 = number.substring(6, 10);
		System.out.print("(" + sub1 + ") " + sub2 + "-" + sub3);
		
		
	}

}
