/**
 * Author: Aaron Alvarez
 * Description :  Loop Practice
 */
package Homework05;
import java.util.Scanner;

public class HW05P01 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner (System.in);
	//Ask the user the the starting questions and ask to enter values
		System.out.print("Enter the values for a and b: ");
		int usersInpA = in.nextInt();
		int usersInpB = in.nextInt();
	//Make sure to validate whether the users numbers where positive or not
		while( usersInpA < 0 || usersInpB < 0){
			System.out.println("Invalid Numbers, please enter positive numbers");
			System.out.print("Enter the values for a and b: ");
			usersInpA = in.nextInt();
	        usersInpB = in.nextInt();
		}
		int varS, varP, varSq;
		int sum = 0;
		long pro = 1;
		int sqr = 0;
	//This will do the sum of all values between users input a and b
		
		for ( varS = usersInpA; varS <= usersInpB ; varS++){
			sum += varS;
			//Test:
			//System.out.println (sum);
		}
		System.out.println("The sum of all numbers between " + 
		usersInpA + " and " + usersInpB + " is:  " + sum );
		
	//This will do the product of all values between users input a and b
		
		for (varP = usersInpA ; varP <= usersInpB ; varP++){
			boolean checkEven = varP % 2 == 0;
			if (checkEven){
				pro *= varP;
				//Test:
				//System.out.println (pro);
			}
		}
		System.out.println("The product of all even numbers between " + 
		usersInpA + " and " + usersInpB + " is:  " + pro );

	
	//This will do the sum of all squres values between users a and b
		for (varSq = usersInpA; varSq <= usersInpB; varSq++ ){
			sqr += (int)Math.pow(varSq, 2);
			//Test:
			//System.out.println (pro);
		}
		System.out.println("The sum of all squared numbers between " + 
		usersInpA + " and " + usersInpB + " is:  " + sqr );
	  
	}
}