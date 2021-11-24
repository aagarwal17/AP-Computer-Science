/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class BaseTwoFormatter implements NumberFormatter
{
	public String format (int n)
	{
		
		String number = "";
		while (n != 0)
		{
			int a = (n % 2);
			number = a + number;
			n = n / 2;
		
		}
		return number;
	}
}
