/*
	Author: Aaron Alvarez
	Description : Midterm Problem 2 Date Printer
 */
import java.util.Scanner;

public class Test02 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
	//Ask the question and retrieve date
		System.out.print("Enter a Date (Month/Day/Year): " );
		String usersStringDate = in.next();
		
		/* test dummy
		String x= ""+usersStringDate.substring(0,2);
		System.out.println(x); 
		*/
		
	 //Lets check weather char at 0 and char at 1 is a two dig num or a num and a /
		//If the first two chars is entered with with two digs at all cases land in the if statement
		//else if my program does only have one dig then just make sure it lands in the else
			//these two booleans check either the user entered 01(two digs) or 1 one digit
			boolean checkFirstChars = ((Character.isDigit(usersStringDate.charAt(0))) && (Character.isDigit(usersStringDate.charAt(1))) );
			boolean checkFirstChars2 = ((Character.isDigit(usersStringDate.charAt(0))) && ((usersStringDate.charAt(1)) == '/') );
			if (checkFirstChars) {
				String usersFirst2Chars= ""+usersStringDate.substring(0,2);
				switch (usersFirst2Chars) {
					case "01": System.out.print(" Formatted Date: January ");
								break;
					case "02": System.out.print("Formatted Date: February ");
								break;
					case "03": System.out.print("Formatted Date: March ");
								break;			
					case "04": System.out.print("Formatted Date: April ");
								break;			
					case "05": System.out.print("Formatted Date: May ");
								break;			
					case "06": System.out.print("Formatted Date: June ");
								break;			
					case "07": System.out.print("Formatted Date: July ");
								break;			
					case "08": System.out.print("Formatted Date: August ");
								break;			
					case "09": System.out.print("Formatted Date: September ");
								break;			
					case "10": System.out.print("Formatted Date: October ");
								break;			
					case "11": System.out.print("Formatted Date: November ");
								break;			
					case "12": System.out.print("Formatted Date: December ");
								break;			
				
					default: System.out.print("It should never land here, in my program.");
							    break;
				}
				//Print out the rest which should be what ever the user entered numbs and check wether the day is 01 or 1 
					boolean check1 = ((Character.isDigit(usersStringDate.charAt(3))) && ((usersStringDate.charAt(4)) == '/') && (Character.isDigit(usersStringDate.charAt(5)))  );
					if(check1){
						System.out.print((usersStringDate.charAt(3))+", "+(usersStringDate.substring(5,9)));
						System.exit(0);
					}
					else{
					System.out.print((usersStringDate.substring(3,5))+", "+(usersStringDate.substring(6,10)));
					}
			}
			else if(checkFirstChars2) {
				String usersFirst1Char= ""+usersStringDate.charAt(0);
					switch (usersFirst1Char) {
						case "1": System.out.print("Formatted Date: January ");
									break;
						case "2": System.out.print("Formatted Date: February ");
									break;
						case "3": System.out.print("Formatted Date: March ");
									break;			
						case "4": System.out.print("Formatted Date: April ");
									break;			
						case "5": System.out.print("Formatted Date: May ");
									break;			
						case "6": System.out.print("Formatted Date: June ");
									break;			
						case "7": System.out.print("Formatted Date: July ");
									break;			
						case "8": System.out.print("Formatted Date: August ");
									break;			
						case "9": System.out.print("Formatted Date: September ");
									break;
						default: System.out.print(" It should never land here, in my program 2 .");
								    break;
					}
					//Print out the rest which should be what ever the user entered numbs
					boolean check2 = ((Character.isDigit(usersStringDate.charAt(2))) && ((usersStringDate.charAt(3) == '/')) && (Character.isDigit(usersStringDate.charAt(4))) );
					
					if(check2){
						System.out.print((usersStringDate.charAt(2))+", "+(usersStringDate.substring(4,8)));
						System.exit(0);
					}
					else{
					System.out.print((usersStringDate.substring(2,4))+", "+(usersStringDate.substring(5,9)));
				    }
			}
			else{
				System.out.print("It should never land here, in my program 3");
			}
		}
	} 