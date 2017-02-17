/**
 * Author: Aaron Alvarez
 * Description :  Four Patterns
 */
package Homework05;

import java.util.Scanner;
public class HW05P07 {

	private static Scanner in;

	public static void main(String[] args) {
	in = new Scanner(System.in);
	int a,b,c,d;
	int e,f,g,h;
	//Ask the user the integer
	System.out.print("Enter an integer: ");
	int userInt = in.nextInt();
	
	//Solve Pattern A
	System.out.println("Pattern A");
	for (a = 1 ; a <= userInt ; a++){
		for (e = 1; e <= a ; e++){
			System.out.print(e+" ");
		}
	 System.out.println(" ");
	}
	//Solve Pattern B
	System.out.println("Pattern B");
		for ( b = userInt ; b >= 1;  b--){
			for (f = 1; f <= b ; f++){
				System.out.print(f+" ");
			}
		  System.out.println(" ");
		}
	//Solve Pattern C
	System.out.println("Patter C");
	    for (c = 1 ; c <= userInt; c++){
	    	for (int pC = userInt-c; pC >= 1; pC--){
	    		System.out.print("  ");
	    	}
	    	for (g = c ; g >=1 ; g--){
	    		System.out.print(g+" ");
	    	}
	    System.out.println(" ");
	    }
	
	//Solve Pattern D
	System.out.println(" Pattern D ");
		for (d = 0 ; d < userInt ; d++){
			for (int pD = 0; pD <= d ; pD++ ){
				System.out.print("  ");
			}
			for (h = 0 ; h < userInt - d ; h++  ){
				System.out.print((h+1)+ " ");
			}
		    System.out.println(" ");
		}
	}
}
