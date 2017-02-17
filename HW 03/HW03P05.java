/**
 Author :Aaron Alvarez
 Program Description: Rock Paper Sissors Game
 
*/

import java.util.Scanner;
//make sure to import java.until.Random;
import java.util.Random;

public class HW03P05 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Create a new random variable
		Random rand= new Random();
	// Code something that will allow the user to enter 0 to 2 no more then that.
		System.out.println ("Lets play Rock, Paper, Scissors. Think you can beat me?");
		System.out.println ("Choose a value between 0 and 2 (0 Being rock, 1 Being Paper, 2 Being Scissors)");
		int usersAns = in.nextInt();
		System.out.println("-----------------------------------------");
	//Make sure that the user didnt choice any other number besides 0 - 2, 
	//if so display the message error and close the program.
		if ((usersAns > 2 || usersAns < 0)){
			System.out.println("Error: Please choose numbers 0-2");
			System.exit(0);
		}
		else {
					
				
			// OPTIONAL : Figure out what did the user entered
			// OPTIONAL : Create a message that will allow to see what the computer choose
				switch (usersAns) {
					case 0: System.out.println("You choose: ");
							System.out.println("Rock");
							break;
					case 1: System.out.println("You choose: ");
							System.out.println("Paper");
							break;
					case 2: System.out.println("You choose: ");
							System.out.println("Scissors");
							break;
					default: System.out.println("It shouldnt never land here.");
				}
		// make sure random variable works, generating a random number for computer to choose.
				int randomCard = rand.nextInt((2-0)+1)+0;
			//OPTIONAL : Create a switch which will contain the random value from the top and display its answer
			//OPTIONAL : l, Create a message that will allow to see what the computer choose
				switch (randomCard) {
					case 0: System.out.println("Computer Choose: ");
							System.out.println("Rock");
							break;
					case 1: System.out.println("Computer Choose: ");
							System.out.println("Paper");
							break;
					case 2: System.out.println("Computer Choose: ");
							System.out.println("Scissors");
							break;
					default: System.out.println("It shouldnt never land here.");
				}
			//Make sure that what ever the user enters, its compared with the computers answer.
				if ((usersAns == 0) && (randomCard == 1) ) {
					System.out.println("Computer Wins.");
					}
				else if ((usersAns == 0) && (randomCard == 2)) {
					System.out.println("Computer Looses.");
					}
				else if ((usersAns == 1) && (randomCard == 0) ) {
					System.out.println("Computer Looses.");
					}
				else if ((usersAns == 1) && (randomCard == 2)) {
					System.out.println("Computer Wins.");
					}
				else if ((usersAns == 2) && (randomCard == 0) ){
					System.out.println("Computer Wins.");
					}
				else if ((usersAns == 2) && (randomCard == 1)){
					System.out.println("Computer Looses.");
					}
				else{
					System.out.println("Its a Draw.");
				
				}
			}
		}
	}
