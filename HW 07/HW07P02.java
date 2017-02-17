/**
 * Author: Aaron Alvarez
 * Description: Above, Below, and Equal
 */
package csHomework;
import java.util.Scanner;
public class HW07P02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many scores are there?: ");
		int usersNumScores = in.nextInt();
		System.out.print("Enter Scores: ");
		int usersActualScores = in.nextInt();
		int[] copiedArray = new int[arrayCreater(usersNumScores).length];
		     System.out.print("Values Are: ");
		userInArray(copiedArray);
		
	}
public static int[] arrayCreater (int numbOfIndex){
	int[] sizeOfArray = new int[numbOfIndex];
	return sizeOfArray;
 }
public static void userInArray ( int[] usersArray){
	Scanner in = new Scanner (System.in);
	int[] newArray = new int[usersArray.length];
	for(int i = 0;  i < newArray.length; i++){
		   newArray[i] = in.nextInt();
		}
	HW07P01.printArray(newArray);
		
}
}

