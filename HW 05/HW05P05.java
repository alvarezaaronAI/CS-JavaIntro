/**
 * Author: Aaron Alvarez
 * Description : Binary Number Converter
 */
package Homework05;
import java.util.Scanner;

public class HW05P05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int usersNum = in.nextInt();
	do {
	
		usersNum = in.nextInt();
	System.out.println("--------------------------------");
	System.out.println("| 1. Convert Binary to Decimal |");
	System.out.println("| 2. Convert Decimal to Binary |");
	System.out.println("| 3. Exit Program              |");
	System.out.println("--------------------------------");
	System.out.println("Enter your menu choice (1 - 3): ");
	
	usersNum = in.nextInt();
	
	
	
	
	switch (usersNum){
		//convert to decimal
	case 1 : System.out.println("Enter Binary to convert to Decimal: ");
			
			break;
	case 2 : System.out.println("Enter Decimal to convert to Binary");
			int usersDec = in.nextInt();
			int numberFi = 0;
			 do {
				 for (int i)
				 numberFi /= usersDec;
				 System.out.println("Looped" + numberFi);
				 
			 }
			 while ( numberFi != 0);
			
			break;
	case 3: System.out.println("Program will not exit.");
			break;
	default: System.out.println("It shouldnt land here");
	
	 }
	}
	while (usersNum != 3);

//	do{
//		decimal /= usersNumB;
//		System.out.print(decimal);
//	}
//	while ( usersNumB != 0 );	
//	//do this the opposite 
//		
//	//check
//	for( i = 0; i <= usersNumD ; i++ ){
//		
//	}
		
	}

}
