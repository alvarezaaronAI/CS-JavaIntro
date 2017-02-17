/**
 Author :Aaron Alvarez
 Program Description: Quadratic Equation Solver
 
*/

import java.util.Scanner;

public class HW03P03 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Get the users information a , b , c
	//Ask the user what is a Number and so on
			System.out.println(" Lets solve some quadratic equations");
			System.out.println("What is a value?");
				double aNum = in.nextDouble();
			System.out.println("What is b value?");
				double bNum = in.nextDouble();
			System.out.println("What is c value?");
			double cNum = in.nextDouble();
	// Check if b^2--4ac is postive or negative or 0
			boolean checkForPositve = ((Math.pow(bNum,2)-(4*(aNum*cNum))) > 0);
			boolean checkForNegative = ((Math.pow(bNum,2)-(4*(aNum*cNum))) < 0);
			boolean checkForZero = ((Math.pow(bNum,2)-(4*(aNum*cNum))) == 0);
	// Solve based on positive or negative or 0
	// if the value is positive it will solve for two roots
		if (checkForPositve){
			System.out.println("--------------------------------------------");
			System.out.println(" The roots are :");
		    double partOfQua=((Math.pow(bNum,2))-(4*(aNum*cNum)));
			double valueOneR = (-bNum +(Math.sqrt(partOfQua)))/(2*aNum);
			double valueTwoR = (-bNum -(Math.sqrt(partOfQua)))/(2*aNum);
			System.out.println(valueOneR);
			System.out.println(valueTwoR);
			System.out.println(" Run again to try new numbers");
			
		}
		// if else the values gives you 0 it will give one root
		else if (checkForZero){
			System.out.println("--------------------------------------------");
			System.out.println(" The root is :");
			double partOfQua=((Math.pow(bNum,2))-(4*(aNum*cNum)));
			double oneRootAnswer = (-bNum +(Math.sqrt(partOfQua)))/(2*aNum);
			System.out.print(oneRootAnswer);
			
		}
		//else the the values is negative and it has no real roots
		else {
			System.out.println("--------------------------------------------");
			System.out.println("This values has no real roots");
			System.out.println(" Run again to try new numbers");
			
		}
		}
}