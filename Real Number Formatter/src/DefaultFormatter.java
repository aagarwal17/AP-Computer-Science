/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class DefaultFormatter implements NumberFormatter
{
	public String format (int n)
	{
		String number= "";
		String word = String.valueOf(n);
		int length = word.length();
		int stop=3;
		int extra = length%3;
		
			for (int i = length; i>= 3; i=i-3)
			{
				if (length%3==0)
				{
					if (i==stop)
					{
						number =word.substring(i-3, i) + number;
					}
					else
					{
						number = "," + word.substring(i-3, i) + number;
					}
				}
				else
				{
					number = "," + word.substring(i-3, i) + number;
				}
			}
		if (extra ==1)
		{
			number = word.substring(0,1) + number;
		}
		else if (extra == 2) 
		{
			number=word.substring(0,2) + number;
		}	
		return number;
	}
}