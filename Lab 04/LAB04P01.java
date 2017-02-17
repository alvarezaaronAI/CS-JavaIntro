/**
 * Author :Aaron Alvarez
 * Description : Sum the digits of any interger
 */
package cs201Lab4;
import java.util.Scanner;

public class LAB04P01 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter an interger of any Length: ");
		String usersNum = in.nextLine();
		int sum = 0;
		for (int i = 0; i < usersNum.length(); i++){
			//System.out.println(i);
			char eachChar = usersNum.charAt(i);
			int numValue = Character.getNumericValue(eachChar);
			sum += numValue;
		}
		System.out.print("The sum of the digits is: "+sum);
	}

}
