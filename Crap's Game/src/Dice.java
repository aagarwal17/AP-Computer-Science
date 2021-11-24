/**
 * 
 * @author Arun Agarwal
 * Dice Class
 * Pd. 7
 */
public class Dice 
{
/**
 * returns the roll
 * @return roll
 */ 
	public int roll()
	{
		int roll;
		roll = (int)(Math.random()*6)+1;
		return roll;

	}

}