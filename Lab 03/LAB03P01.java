/**
 Author :Aaron Alvarez
 Program Description: Pig Latin
 
*/
import java.util.Scanner;

public class LAB03P01 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
//Ask the user a question and get the user word		
		System.out.println ("Enter a word: " );
		String wordEntered = in.next();
		
	//Get the first letter, helping it separate the first letter and the rest of the word
		String firstLetter = ""+wordEntered.charAt(0);
	//Convert the first letter to lowercase.
		String covertedFirstLetter = firstLetter.toLowerCase();

		
//Count how the length of the word so then i can get the LAST LETTER ALWAYS
	int theWordLength = wordEntered.length();

	
	//Get the lastLetter
		int theLastLetter = theWordLength-1;
	//Get the rest of the word
		String restOfTheWord = wordEntered.substring(1,theLastLetter);
	
	
//Print out the final solution
	System.out.println (restOfTheWord+covertedFirstLetter+"ay");
	}
}