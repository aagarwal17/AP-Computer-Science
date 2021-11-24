import java.util.ArrayList;

public class testClass 
{

	public static void main(String[] args) 
	{
		ArrayList<NumberFormatter> funky = new ArrayList<NumberFormatter>();
		NumberFormatter defnum = new DefaultFormatter();
		NumberFormatter decnum = new DecimalFormatter();
		NumberFormatter binary = new BaseTwoFormatter();
		
		funky.add(defnum);
		funky.add(decnum);
		funky.add(binary);
		
		System.out.println(defnum.format(10));
		System.out.println(defnum.format(1005002));
		System.out.println(defnum.format(918));
		System.out.println(defnum.format(5919));
		System.out.println(defnum.format(97988));
		System.out.println(defnum.format(991001));
		
		
		System.out.println(decnum.format(10));
		System.out.println(decnum.format(1004000));
		System.out.println(decnum.format(199));
		
		System.out.println(binary.format(2));
		System.out.println(binary.format(42));
		System.out.println(binary.format(111));
	}
}