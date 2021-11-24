
public class TrueFalse extends Question
{
	private String answer;
	
	public TrueFalse(String text, String answer)
	{
		super(text);
		this.answer=answer;
	}
	
	public String getSolution()
	{
		return answer;
	}
	public String toString()
	{
		return "True or False: " + this.getText();
	}
}
