/**
 * Author: Aaron Alvarez
 * Description: Array Practice 
 */

package csHomework;
import java.util.Random;
import java.util.Scanner;
public class HW07P01 {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int userNum = in.nextInt();
//check if the elements work//Optional
	int[] copiedArray = new int[createArray(userNum).length];
	for (int a = 0; a < createArray(userNum).length; a++){
		copiedArray[a] = createArray(userNum)[a];
	}
	System.out.println("This is the array: ");

	System.out.println();
	printArray(copiedArray);
	System.out.println("Odd Indexes: ");
	printOddArray(copiedArray);
	System.out.print("Even Elements ");
	System.out.println();
	printEvenArray(copiedArray);
	System.out.print("Reverse: ");
	printReverseArray(copiedArray);
	System.out.println();
	System.out.print("First, Middle, Last: ");
    printBME(copiedArray);
}
		
public static int[] createArray ( int n ){
	int[] sizeOfArray = new int[n];
		for (int i = 0; i < sizeOfArray.length; i++){
			sizeOfArray[i] = ((int)(Math.random() * (20 - 1 +1)) + 1);
 
	    }
		return sizeOfArray;
	}

public static void printArray ( int[] arrayItSelf){
	
	for (int y = 0; y < arrayItSelf.length; y++){
		System.out.print( arrayItSelf[y]+ " ");
		}
		System.out.println();
}

 public static void printOddArray ( int[] arrayItSelf){
	 for (int y = 0; y < arrayItSelf.length; y++){
		 boolean checkIndex = y%2 == 1;
		 if(checkIndex){
			System.out.print( arrayItSelf[y]+ " ");
			}
	 	}
 }
 public static void printEvenArray ( int[] arrayItSelf){
	 for (int y = 0; y < arrayItSelf.length; y++){
		boolean checkInside = arrayItSelf[y] % 2 == 0;
		if( checkInside ){
			System.out.print( arrayItSelf[y]+ " ");
		}
	 }
	
 }
 public static void printReverseArray(int[] arrayItSelf) {
	    int[] reverseArray = new int[arrayItSelf.length];
	    for(int z = 0; z < reverseArray.length; z++) {
	        reverseArray[z] = arrayItSelf[arrayItSelf.length - z - 1];
	        System.out.print(reverseArray[z]+ " ");
	    }
	   

	}
 public static void printBME (int[] arrayItSelf){
	boolean checkE = arrayItSelf.length % 2 == 0;
		if(checkE){
			//first
			System.out.print(arrayItSelf[0]+ ", ");
			//middle
			int arrayLen = arrayItSelf.length;
			int middleNum = arrayLen/2;
			System.out.print(arrayItSelf[middleNum -1]+ ", ");
			System.out.print(arrayItSelf[middleNum]+ ", ");
			//last
			System.out.print(arrayItSelf[arrayItSelf.length - 1]);
			 }
		else {
			System.out.print(arrayItSelf[0]+ ", ");
		
			int arrayLen1 = arrayItSelf.length;
			int middleNum1 = arrayLen1/2;
			System.out.print(arrayItSelf[middleNum1 ]+ ", ");
			System.out.print(arrayItSelf[arrayItSelf.length - 1]);
			}
			 }
		}


