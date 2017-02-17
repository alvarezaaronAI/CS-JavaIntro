package Homework06;
import java.util.Scanner;
public class HW06P01 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter the Number of terms and the number of terms per line: " );
		int usersNTerms = in.nextInt();
		int usersLTerms = in.nextInt();
		//Test: System.out.println(" Hi ");
	   	displaySeries(usersNTerms, usersLTerms);
	   	
	   	
		
	
		
	}
	public static int findTerm (int n){
		int n1;
			n1 = ( n * (7*n-3))/5;
			//Test 
			//System.out.print (n1 + "HTD"Heres the double" ");
		return n1;
	}

	static void displaySeries (int numberOfTerms, int termsPerLine) {
		for (int i = 1; i <=numberOfTerms; i++) {
			// Test : System.out.print(" Hey ");
			System.out.print(findTerm(i)+ " ");
			if (i % termsPerLine == 0){
				System.out.println();
			}
		
				
		
		}
	}
	
}
