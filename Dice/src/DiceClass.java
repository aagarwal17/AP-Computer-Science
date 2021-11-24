
public class DiceClass 
{

	private int numRolls;

	public DiceClass()
	{
		numRolls = 0;
	}
	public int roll()
	{
		numRolls++;
		int roll;
		roll = (int)(Math.random()*6)+1;
		return roll;
//ANOTHER WAY TO WRITE IT:
// return (int)(Math.random()*6) +1;
	}
	public void reset()
	{
		numRolls=0;
	}
	public int getNumRolls()
	{
		return numRolls;
	}


}
