import java.util.Arrays;

/**
 * 
 * @author Arun Agarwal
 *Pd. 7
 */
public class ArrayTesting 
{
	public static void main (String[] args)
	{
		//Create a random integer array of twenty numbers
		int [] myArray = new int[20];
		//Currently, this array has twenty zeroes in it because Java does that for us
		
		for(int i = 0; i < myArray.length; i++)
		//We do not use a for each loop 
			myArray[i] = (int) (Math.random()*20 + 1);
		System.out.println("the average is " +  average(myArray));
		if (isPresent (myArray,13))
			System.out.println("13 appears at index " + indexOf(myArray, 13));
		else
			System.out.println("13 does not appear");
		System.out.println(Arrays.toString(myArray));
	}
	//We will write helper methods to help with task in class you are currently working in
	private static double average(int[] arr)
	{
		//Could use enhanced for loop or standard for loop
		double sum  = 0;
		for(int num : arr)
		{
			sum += num;
			return sum/arr.length;
		}
	}
	private static boolean isPresent( int [] arr, int target)
	{
		for( int num: arr)
		{
			if(num==target)
			{
				return true;
			}
			return false;
		}
		
	}
	private static int indexOf(int[] arr, int target)
	{
		//cannot use a for each loop here because this loop has no access to indexes
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
	
}
