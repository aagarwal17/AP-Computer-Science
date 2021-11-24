/**
 * 
 * @author Arun Agarwal
 *
 */
public class Circle 
{
	public static void main(String[] args)
	{
		int radius=6;
		double pi=3.14;
		int area=(int) (radius*radius*pi);
		System.out.println("area of circle:"+area);
		int circumference=(int) (2*pi*radius);
		System.out.println("circumference of circle:"+circumference);
	}
}
