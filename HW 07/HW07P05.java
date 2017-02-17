/**
 * Author: Aaron Alvarez
 * Description:  Cookie Calculations  
 */
package csHomework;

import java.util.Scanner;
public class HW07P05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many types of cookies were produced?: ");
		int usersAns = in.nextInt();
		System.out.println("Enter the names of the cookies one per line: ");
		for (int  i = 1 ; i < usersAns ; i++){
		String usersCookiesName = in.nextLine();
		System.out.println(usersCookiesName);
		}
		System.out.println();
		/*int[] copiedArray = new int[createArray(userNum).length];
		for (int a = 0; a < createArray(userNum).length; a++){
			copiedArray[a] = createArray(userNum)[a];
		}
		*/

	}
	public static String[] createArray ( int n ){
		String[] sizeOfArray = new String[n];
			
			return sizeOfArray;
		}
}
