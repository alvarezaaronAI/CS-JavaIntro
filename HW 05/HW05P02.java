/**
 * Author: Aaron Alvarez
 * Description :  Mean and Standard Deviation
 */
package Homework05;
import java.util.Scanner;

public class HW05P02 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		//declare any variables
		double usersNum, variance = 0, variance1 = 0, totalVar;

		// add a counter var to help us find the mean
		int counter = 0;
		System.out.print("Enter intergers ( Enter -1 to end): ");
		
		do {
			usersNum = in.nextDouble();
			if ( usersNum == -1){
				break;
			}
			counter += 1;
			// sums of all x^2 and sum of x
			variance += Math.pow(usersNum, 2);
			// sums of all x 
			variance1 += usersNum;

			//Test
//			System.out.println(counter);
//			System.out.println(variance);
//			System.out.println(variance1);

		}
		while (usersNum != -1 );
		double totalMean = (variance1)/(counter);
		System.out.println("Mean: " + totalMean); 
		// variance 
		totalVar = Math.sqrt(((variance - ((1.0/counter)*(Math.pow(variance1, 2)))) / (counter - 1)));


//		System.out.println(counter);
//		System.out.println(variance);
//		System.out.println(variance1);
		System.out.println("Deviation: " + totalVar );

	}

}
