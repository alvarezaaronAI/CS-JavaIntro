package Test02;
import java.util.Scanner;
public class Final {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Asked the user for various information about the products and the deparment
		System.out.println("Enter the number of products: ");
		int userNumPro = in.nextInt();
		System.out.println("Enter the number of departments: ");
		int userNumDep = in.nextInt();
	//Now ask about information inside the arrays
		System.out.println("Enter the number of hours that each deparments takes time to make each product: ");
		//Copied the array to have the same values throught the program
		int[][] copied2DArray = tableACreator(userNumPro, userNumDep);
		
	//Now ask about information inside the arrays
		System.out.println("Enter the cost per hour of operation in each of the deparments: ");
		//Copied the array to have the same values throught the program
		int[] copied1DArray = tableBCreator(userNumDep);
	//print out the arrays itself table a and tableb
		System.out.println("             Table A");
		
		print2DArray(copied2DArray);
		System.out.println();
		System.out.println("             Table B");
		System.out.println("Deparments");
		print1DArray(copied1DArray);
		System.out.println();
	//calculate the average per product 
		System.out.println("----------This is the average number of hours worked per product---------");
		averageNumWPP(copied2DArray);
		System.out.println("----------This is the average number of hours worked per deparment---------");
		averageNumWPD(copied2DArray);
		System.out.println("----------This is the total cost per product---------");
		costNumPP(copied2DArray, copied1DArray);
		
	}
	//create a 2d Array with values of the user input.
	public static int[][] tableACreator (int products, int departments){
		Scanner in = new Scanner(System.in);
		int[][] tableA = new int[products][departments];
		for(int row = 0; row < tableA.length; row++){
			for(int col = 0; col < tableA[0].length; col++){
				tableA[row][col] = in.nextInt();
			}
		}
		return tableA;
	}
	//print out a 2d array that is an interger 2d array
	public static void print2DArray (int[][] array2DItSelf){
		for ( int row = 0; row < array2DItSelf.length; row++){
			for (int col = 0; col < array2DItSelf[row].length; col++){
				System.out.print(array2DItSelf[row][col]+ " ");
			}
			System.out.println();
		}
	}
	//create table b the cost of each hour of operation 
	public static int[] tableBCreator ( int deparments ){
		Scanner in = new Scanner(System.in);
		int[] tableB = new int[deparments];
			for (int rows = 0; rows < tableB.length; rows++){
				tableB[rows] = in.nextInt();
	 
		    }
			return tableB;
		}
	//prints the table b and displays it.
	public static void print1DArray ( int[] array1DItSelf){
		
		for (int rows = 0; rows < array1DItSelf.length; rows++){
			System.out.print( "$" + array1DItSelf[rows]+ " ");
			}
			System.out.println();
	}
	//calculating the average number per product and displaying it
	//averageNumWPP = average number worked per product 
	public static void averageNumWPP (int[][] array2DItSelf){
		for (int row = 0; row < array2DItSelf.length; row++){
			int total = 0;
		    double count = 0;
		    for(int col = 0; col < array2DItSelf[0].length; col++){
				total += array2DItSelf[row][col];
				count++;
			}
		System.out.println("The average number of hours worked on product "+ (row+1) +" is "+ total/count);
		}
	}
	//calculating the average number hours worked per deparment and displaying it
	//averageNumWPD = average number worked per deparment 
	public static void averageNumWPD (int[][] array2DItSelf){
			for (int col = 0; col < array2DItSelf[0].length; col++){
				int total = 0;
			    double count = 0;
			    for(int row = 0; row < array2DItSelf.length; row++){
					total += array2DItSelf[row][col];
					count++;
				}
			System.out.println("The average number of hours worked on deparment "+ (col+1) +" is "+ total/count);
			}
		}
	//calculating the total cost of each product
	//costNumPP = cost number per product
	public static void costNumPP (int[][] array2DItSelf, int[] array1DItSelf){
		//System.out.println("The total cost of product "+ (row+1) +" is ");
		double total2 = 0;
		double total = 0;
		int count = 1;
		System.out.println("The Cost of the entire company is $" + total2);
		for (int rows = 0; rows < array1DItSelf.length; rows++){
			for( int col = 0; col < array2DItSelf[rows].length; col++){
				total += array2DItSelf[rows][col]*array1DItSelf[col];
				total2 += array2DItSelf[rows][col]*array1DItSelf[col];
			}
		System.out.println("The Cost Of product "+ (count) + " is $" + total);
		System.out.println("The Cost of the entire company is The Very last one$" + total2);
		total = 0.0;
		count++;
		}
		
	}
	
}
