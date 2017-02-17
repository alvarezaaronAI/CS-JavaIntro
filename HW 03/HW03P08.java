/**
 Author :Aaron Alvarez
 Program Description: Checking for Palindromes
 
*/

import java.util.Scanner;
//make sure to import java.until.Random;
import java.util.Random;

public class HW03P08 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Create a new random variable
		Random rand= new Random();
	// ask the user to enter a 5 digit number
		System.out.println("Please enter a 5 digit number only.");
		int usersDig = in.nextInt();
	// lets check weather the digits they enter is a valid number. If not valid then explain explicit that the digit they enter is not valid and exit program.
		boolean checkDig = (usersDig > 9999) && (usersDig < 100000);
		System.out.println(checkDig);
		if (!checkDig) {
			
			System.out.println(usersDig + " is not a 5 digit number!");
			System.out.println("Program will now exit!");
			System.exit(0);
		
		}
	
	
		else {
		// reverse the digits it self to check weather both numbers are the same , 
		//if reverse == orginal then its palindromes
			double once = usersDig % 10;
			double twice =((int)(usersDig/10)) % 10;
			double three =((int)(usersDig/100)) % 10;
			double four = ((int)(usersDig/1000)) % 10;
			double five = ((int)(usersDig/10000)) % 10;
			boolean checkPalin = (once == five) && (twice == four) && (three == three);
				if (checkPalin){
					System.out.println(usersDig+" is a palindrome!");
				}
				else {
					System.out.println(usersDig+" is not a palindrome!");
				}
			
		}
		
		}
	}