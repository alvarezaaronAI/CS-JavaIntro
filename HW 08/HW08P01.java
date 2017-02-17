/*
 * Author: Aaron Alvarez
 * Description: 2D Practice 
*/

package Homework08;
import java.util.Scanner;


public class HW08P01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and colums: ");
		int row1 = in.nextInt();
		int col1 = in.nextInt();
		
		int[][] copiedArray = new int [createArray2(row1, col1).length][createArray2(row1, col1)[0].length];
		for(int i=0; i<createArray2(row1, col1).length; i++){
			  for(int j=0; j<createArray2(row1, col1)[0].length; j++){
			   copiedArray[i][j] = createArray2(row1, col1)[i][j];
			}
		}
		print2DArray(copiedArray);
		averageOEA(copiedArray);
		averageOER(copiedArray);
		averageOEC(copiedArray);
		averageODS(copiedArray);
		
}
		
		
	public static int[][] createArray2 (int rows, int colums){
		int[][] sizeOfArray = new int[rows][colums];
		for (int row = 0; row < sizeOfArray.length; row++){
			for(int col = 0; col < sizeOfArray[row].length; col++){
				sizeOfArray[row][col] = ((int)(Math.random() * (9 - 0 +1)) + 0);
			}
		}
		return sizeOfArray;
	}
	public static void print2DArray (int[][] array2DItSelf){
		for ( int row = 0; row < array2DItSelf.length; row++){
			for (int col = 0; col < array2DItSelf[row].length; col++){
				System.out.print(array2DItSelf[row][col]+ " ");
			}
			System.out.println();
		}
	}
	public static void averageOEA ( int[][] array2DItSelf){
		int[][] copiedArray = new int [array2DItSelf.length][array2DItSelf[0].length];
		for(int i=0; i<array2DItSelf.length; i++){
			  for(int j=0; j<array2DItSelf[0].length; j++){
			   copiedArray[i][j] = array2DItSelf[i][j];
			}
		}
		int totalAddArray = 0;
		for(int row = 0; row < copiedArray.length; row++){
			for(int col = 0; col < copiedArray[row].length; col++){
				totalAddArray += copiedArray[row][col];
			}
		}
		int totalArrayNums = copiedArray.length * copiedArray[0].length;
		System.out.println("Total Avarage of whole Array is : "+totalAddArray/totalArrayNums);
	}
	public static void averageOER ( int[][] array2DItSelf){
		for ( int row = 0; row < array2DItSelf.length; row++ ){
			int total = 0;
			int count = 0;
			for(int col = 0; col < array2DItSelf[0].length; col++ ){
				total += array2DItSelf[row][col];
				count++;
			}
			System.out.println("The Average of Row "+ row +" is "+ total/count);
			count = 0;
				
		}
	}
	public static void averageOEC ( int[][] array2DItSelf){
		for ( int col = 0; col < array2DItSelf[0].length; col++ ){
			int total = 0;
			int count = 0;
			for(int row = 0; row < array2DItSelf.length; row++ ){
				total += array2DItSelf[row][col];
				count++;
			}
			System.out.println("The Average of Column "+ col +" is "+ total/count);
			count = 0;
				
		}
	}
	public static void averageODS (int[][] array2DItSelf){
		int total = 0;
		int count = 0;
		for ( int row = 0; row < array2DItSelf.length; row++ ){
			for(int col = 0; col < array2DItSelf[0].length; col++ ){
				if ( row == col){
					total += array2DItSelf[row][col];
					count++;
					//Test	System.out.println("Heres the Maj Diag " + array2DItSelf[row][col]);
				}
			}	
		}
		System.out.println("Total Average Major Diagonal is: "+ total/count );
		total = 0;
		count = 0;
	for ( int row = 0, col = array2DItSelf[0].length-1; row < array2DItSelf.length && col < array2DItSelf[0].length && col != -1; row++ , col-- ){
		total += array2DItSelf[row][col];
		count++;
		//Test	System.out.println("Heres the Min Diag " + array2DItSelf[row][col]);
		
	}
	System.out.println("Total Average Minor Diagonal is: "+ total/count );
}
}