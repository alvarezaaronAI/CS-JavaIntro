/**
 Author :Aaron Alvarez
 Program Description: Choose a Random Card 
 
*/

import java.util.Scanner;
//make sure to import java.until.Random;
import java.util.Random;

public class HW03P06 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Create a new random variable
		Random rand= new Random();
	// No need to get any users information. Just make sure you can get random card.
	// make sure the computer generates a random number from 1-13
		int randomNum = rand.nextInt((13-1)+1)+1;
	// Write a switch that will display a random number from 1 to 13, 1 being Ace, and 2 being 2 ... 11 being Jack ...
		switch (randomNum) {
			case 1: System.out.print("The card you picked is Ace of ");
					break;
			case 2: System.out.print("The card you picked is 2 of ");
					break;
			case 3: System.out.print("The card you picked is 3 of ");
					break;		
			case 4: System.out.print("The card you picked is 4 of ");
					break;		
			case 5: System.out.print("The card you picked is 5 of ");
					break;		
			case 6: System.out.print("The card you picked is 6 of ");
					break;		
			case 7: System.out.print("The card you picked is 7 of ");
					break;		
			case 8: System.out.print("The card you picked is 8 of ");
					break;		
			case 9: System.out.print("The card you picked is 9 of ");
					break;		
			case 10: System.out.print("The card you picked is 10 of ");
					break;		
			case 11: System.out.print("The card you picked is Jack of ");
					break;		
			case 12: System.out.print("The card you picked is Queen of ");
					break;		
			case 13: System.out.print("The card you picked is King of ");
					break;		
			default: System.out.println("It should never land here...");
					break;
		}
	//Top should print out a random card and now we shall create a random suit out of 4 cards only or 4 possible numbers
		int randomSuit = rand.nextInt((4-1)+1)+1;
	//Create a switch with 4 possible suit cards
			switch (randomSuit) {
			case 1: System.out.print("Clubs.");
					System.out.println ("                             ");
					break;
			case 2: System.out.print("Dimonds.");
					System.out.println ("                             ");	
					break;
			case 3: System.out.print("Hearts.");
					System.out.println ("                             ");
					break;		
			case 4: System.out.print("Spades.");
					System.out.println ("                             ");
					break;		
			default: System.out.print("It should never go here too...");
					break;	
	// Trick here is to randomly generate 2 sections of the cards, numbers and letters in one and the other suits. Combine them together and done.
		}	
	}	
}