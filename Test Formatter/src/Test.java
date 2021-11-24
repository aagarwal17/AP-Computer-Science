import java.util.ArrayList;

/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class Test 
{

	public static void main(String[] args) 
	{
		String[] ans = {"choice1","choice2","choice3","whatever"};
		MultipleChoice question = new MultipleChoice("I have a question", ans, 'B');
		System.out.println(question);
		
		String[] ans2 = {"choice1","choice2","choice3","whatever"};
		MultipleChoice question2 = new MultipleChoice("I have a question", ans2, 'B');
		System.out.println(question2);
		ArrayList<Question>test = new ArrayList<Question>();
		test.add(question2);
		test.add(new TrueFalse("Mr. Ellis has better shoes than Finn", "True"));
		String [] ans1 = {"yes", "no", "Maybe"};
		test.add(new MultipleChoice("it's what I do", ans1 {)))
	}

}
