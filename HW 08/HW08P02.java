/*
 * Author: Aaron Alvarez
 * Description: Cost of Manufactured Devices
*/
package Homework08;
import java.util.Scanner;
public class HW08P02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	System.out.println("How many electronic devices does the company produce?: ");
	 	int electronicDP = in.nextInt();
	System.out.println("How many different component types are used?: " );
		int differentCT = in.nextInt();
	System.out.println("What are the prices of each component?: ");
	int[] copiedArray = new int[differentCT];
	for (int a = 0; a < createArray(differentCT).length; a++){
		copiedArray[a] = createArray(differentCT)[a];
	}
	double[] copiedArray2 = new double[differentCT];
	for (int a = 0; a < createArray1A(differentCT).length; a++){
		copiedArray2[a] = createArray1A(differentCT)[a];
	}
	System.out.println("Enter the number of components used to create each device (enter the table data): ");
	int[][] copiedArray3 = new int [createArray2(differentCT, electronicDP).length][createArray2(differentCT, electronicDP)[0].length];
	for(int i=0; i<createArray2(differentCT, electronicDP).length; i++){
		  for(int j=0; j<createArray2(differentCT, electronicDP)[0].length; j++){
		   copiedArray3[i][j] = createArray2(differentCT, electronicDP)[i][j];
		}
	}
	
	System.out.println();
	System.out.println("Cost Per Component: ");
	printArray(copiedArray); 
	printArray(copiedArray2);
	System.out.println();
	System.out.println("Table Data: ");
	System.out.println("Device Number  Component Number");
	
	print2DArray(copiedArray3);
	System.out.println("-----------------------------------");
	
	}
//method 1 that creates an array with the number of different components used
	public static int[] createArray ( int lengthOfArray ){
		int[] sizeOfArray = new int[lengthOfArray];
			for (int i = 0; i < sizeOfArray.length; i++){
				sizeOfArray[i] = i+1;
				System.out.print("      ");
		    }
			return sizeOfArray;
		}
//Create a one dimension array that carries doubles and sets 
	public static double[] createArray1A ( int lengthOfArray ){
		Scanner in = new Scanner(System.in);
		double[] sizeOfArray = new double[lengthOfArray];
			for (int i = 0; i < sizeOfArray.length; i++){
				sizeOfArray[i] = in.nextDouble();
		    }
			return sizeOfArray;
		}
//Print Array One Dimension
	public static void printArray ( int[] arrayItSelf){
		
		for (int y = 0; y < arrayItSelf.length; y++){
			System.out.print( arrayItSelf[y]+ " ");
			}
			System.out.println();
	}
	public static void printArray ( double[] arrayItSelf){
		
		for (int y = 0; y < arrayItSelf.length; y++){
			System.out.print( arrayItSelf[y]+ " ");
			}
			System.out.println();
	}
//Create a 2D Array	
	public static int[][] createArray2 (int rows, int colums){
		Scanner in = new Scanner(System.in);
		int[][] sizeOfArray = new int[rows][colums];
		for (int row = 0; row < sizeOfArray.length; row++){
			for(int col = 0; col < sizeOfArray[row].length; col++){
				sizeOfArray[row][col] = in.nextInt();
			}
		}
		return sizeOfArray;
	
	}
//Print ouit a 2 dimension array
	public static void print2DArray (int[][] array2DItSelf){
		for ( int row = 0; row < array2DItSelf.length; row++){
			for (int col = 0; col < array2DItSelf[row].length; col++){
				System.out.print(array2DItSelf[row][col]+ " ");
			}
			System.out.println();
		}
	}
}
