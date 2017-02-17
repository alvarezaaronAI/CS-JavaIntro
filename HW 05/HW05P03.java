/**
 * Author: Aaron Alvarez
 * Description :  Bar Chart
 */
package Homework05;
import java.util.Scanner;

public class HW05P03 {

	private static Scanner in;

	public static void main(String[] args) {
	in = new Scanner (System.in);
	int i,u,y,t,r ;
	//Asking user 
	System.out.println("Enter the total sales for Store 1:" );
	int store1 = in.nextInt();
	System.out.println("Enter the total sales for Store 2:" );
	int store2 = in.nextInt();
	System.out.println("Enter the total sales for Store 3:" );
	int store3 = in.nextInt();
	System.out.println("Enter the total sales for Store 4:" );
	int store4 = in.nextInt();
	System.out.println("Enter the total sales for Store 5:" );
	int store5 = in.nextInt();
	
	//validate users input
	
	while ((store1 < 0) || (store2 < 0) || (store3 < 0) || (store4 < 0) || (store5 <0)){
	System.out.println("****Please Enter Valid Number (Postive Number)****");
	System.out.println("Enter the total sales for Store 1:" );
	 store1 = in.nextInt();
	System.out.println("Enter the total sales for Store 2:" );
	 store2 = in.nextInt();
	System.out.println("Enter the total sales for Store 3:" );
	 store3 = in.nextInt();
	System.out.println("Enter the total sales for Store 4:" );
	 store4 = in.nextInt();
	System.out.println("Enter the total sales for Store 5:" );
	 store5 = in.nextInt();
	}
	
	//solving for stores  division to 
	int store1Div = store1/100;
	int store2Div = store2/100;
	int store3Div = store3/100;
	int store4Div = store4/100;
	int store5Div = store5/100;
	
	//doing as many loops depending on the number or the input.

	System.out.print("Store 1: ");
	for (i = 1; i<=store1Div; i++){
       
		System.out.print("*");
	
	}
	System.out.println("");
	
	//Store 2
	
	System.out.print("Store 2: ");
	for (u = 1; u<=store2Div; u++){
	       
		System.out.print("*");
	
	}
	System.out.println("");
	
	//Store 3
	
	System.out.print("Store 3: ");
	for (y = 1; y<=store3Div; y++){
	       
		System.out.print("*");
	
	}
	System.out.println("");
	
	//Store 4
	
	System.out.print("Store 4: ");
	for (t = 1; t<=store4Div; t++){
	       
			System.out.print("*");
		
		}
	//enter this after each store
	System.out.println("");
	
	//Store 5
	System.out.print("Store 5: ");
	for (r = 1; r<=store5Div; r++){
	       
		System.out.print("*");
	
	}
	

	}

}
