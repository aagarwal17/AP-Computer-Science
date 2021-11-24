/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	private char answer;
	
	public MultipleChoice(String text, String[] answerChoices, char answer)
	{
		super(text);
		this.answerChoices = answerChoices;
		this.answer = answer;
	}
	
	public String getSolution()
	{
		return "" + answer;
	}
	
	public String toString()
	{
		String question = "";
		question += "" + this.getNumber() + ". " + this.getText() + "\n";
		char letter = 'A';
		for (String ans: answerChoices)
		{
			question += "\t" + letter + "." + ans + "\n";
			letter++;
		}
		return question;
	}
	
}
