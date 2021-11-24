public class DiceLoop 
{
	private int numRolls;

	public DiceLoop()
	{
		numRolls = 0;
	}
	public int roll()
	{
		numRolls++;
		int roll;
		roll = (int)(Math.random()*6)+1;
		return roll;

	}
	public int getNumRolls()
	{
		return numRolls;
	}
}
