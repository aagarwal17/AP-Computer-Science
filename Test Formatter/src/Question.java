/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public abstract class Question 
{
private static int nextNum = 1;
private String text;
public int number;

public Question (String txt)
{
	this.text=txt;
	number = nextNum;
	nextNum++;
}
public int getNumber()
{
	return number;
}
public String getText()
{
	return text;
}
public abstract String getSolution();
}
