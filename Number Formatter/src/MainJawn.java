
public class MainJawn {

	public static void main(String[] args) 
	{
		Measurable[] myArray = new Measurable[15];
		for(int i =0; i<15; i++)
		{
			myArray[i] = new BankAccount(Math.random() * 4000 + 3000);
		}
		
		System.out.println("average Balance: " + findAverage(myArray));
	}
	
	
	private static double findAverage(Measurable[] arr)
	{
		double total =0;
		for(Measurable obj: arr)
		{
			total += obj.getMeasure();
		}
		return total/arr.length;
	}
}
