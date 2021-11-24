import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Arun Agarwal
 * Gettysburg Address Project
 * Pd. 7
 */
import java.io.File;
import java.io.FileNotFoundException;

public class GettsyburgAddressMain 
{
// main method header
	public static void main(String[] args) throws FileNotFoundException 
	{
	//Creates new scanner to read each word of the file	
	Scanner file = new Scanner(new File("GettysburgAddress.txt"));
	ArrayList<String> words = new ArrayList<String>();
	
	/**
	 * while loop that adds each word to an arraylist of strings
	 */
	while (file.hasNext())
	{
		words.add(file.next());
	}
	/**
	 * for/each loop with if statement nested inside to identify the longest word
	 */
	String longestWord = words.get(0);
	for(String myFile : words)
	{
		if (longestWord.length() < myFile.length())
		{
			longestWord = myFile;
		}
	}
	System.out.println("The longest word is \"" + longestWord + "\".");
	/**
	 * for each loop that identifies the average word length
	 */
	double sum = 0;
	for(String myFile : words)
	{
		sum += myFile.length();
	}
	System.out.println("The average word length is " + sum/words.size() + " letters.");
	}

}
