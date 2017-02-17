/**
 Author :Aaron Alvarez
 Program Description: Advance Math Tutor
 
*/

import java.util.Scanner;
//make sure to import java.until.Random;
import java.util.Random;

public class HW03P07 {
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Create a new random variable
		Random rand= new Random();
	// First Give Options in which of the following does the user want to do
	
	/* Math Tutor Menu
		1. Addition Problem
		2. Subtraction Problem
		3. Multiplication Problem
		4. Random Problem
		Enter your choice:  
	*/
		System.out.println (" Math Tutor Menu");
		System.out.println (" 	1. Addition Problem");
		System.out.println (" 	2. Subtraction Problem");
		System.out.println (" 	3. Multiplication Problem");
		System.out.println (" 	4. Random Problem");
		System.out.print (" 	Enter your choice:   ");
		 int usersChoi = in.nextInt();
	//Make Sure that what ever the user enters is valid.
		if (usersChoi > 4 || usersChoi < 1){
			System.out.println (" Error: Invalid Choice, Try Again");
			System.exit(0);
		}
	//Now make the computer switch to different modes, example if the user enters 1, this should go
	//to the addition problem sections and run from there
		switch (usersChoi){
			case 1 : 
				//adding part of the sequence.
					int randomNum1 = rand.nextInt((100-0)+1)+0;
					int randomNum2 = rand.nextInt((100-0)+1)+0;
				//ask the user, what is random number 1 plus random number 2
					System.out.print ("What is "+randomNum1+ "+" +randomNum2+ "= ");
				// let the user enter the number
					int userAddAns = in.nextInt();
				//Check weather if the user gor the right answer...
					boolean checkAdd = (randomNum1+randomNum2) == userAddAns;
					
				//Based on the answer is correct or not, display correct or incorrect	
					if (checkAdd){
						System.out.println("Correct!!!");
					}
					else{
						System.out.println("Sorry incorrect, "+randomNum1+"+"+randomNum2+"= "+ (randomNum1+randomNum2)+" and not "+ userAddAns );
					}
					break;
			case 2 :
				//subtracting part of the sequence.
					int randomNum3 = rand.nextInt((100-0)+1)+0;
					int randomNum4 = rand.nextInt((100-0)+1)+0;
				//ask the user, what is random number 1 plus random number 2
					System.out.print ("What is "+randomNum3+ "-" +randomNum4+ "= ");
				// let the user enter the number
					int userSubAns = in.nextInt();
				//Check weather if the user gor the right answer...
					boolean checkSub = (randomNum3-randomNum4) == userSubAns;
					
				//Based on the answer is correct or not, display correct or incorrect	
					if (checkSub){
						System.out.println("Correct!!!");
					}
					else{
						System.out.println("Sorry incorrect, "+randomNum3+"-"+randomNum4+"= "+ (randomNum3-randomNum4)+" and not "+ userSubAns );
					}
					break;
			case 3 :
				//multiplication part of the sequence.
					int randomNum5 = rand.nextInt((100-0)+1)+0;
					int randomNum6 = rand.nextInt((100-0)+1)+0;
				//ask the user, what is random number 1 times random number 2
					System.out.print ("What is "+randomNum5+ "*" +randomNum6+ "= ");
				// let the user enter the number
					int userMultAns = in.nextInt();
				//Check weather if the user gor the right answer...
					boolean checkMult = (randomNum5*randomNum6) == userMultAns;
					
				//Based on the answer is correct or not, display correct or incorrect
					if (checkMult){
						System.out.println("Correct!!!");
					}
					else{
						System.out.println("Sorry incorrect, "+randomNum5+"*"+randomNum6+"= "+ (randomNum5*randomNum6)+" and not "+ userMultAns );
					}
					break;
			case 4 : 
				//create a random problem.
				//create a random number from 1-3 only 
					int randomProb = rand.nextInt((3-1)+1)+1;
				//if random problem = to 1 then show add problem
					if (randomProb == 1){
				//adding part of the sequence.
						int randomNum7 = rand.nextInt((100-0)+1)+0;
						int randomNum8 = rand.nextInt((100-0)+1)+0;
						System.out.print ("What is "+randomNum7+ "+" +randomNum8+ "= ");
						int userAddAns1 = in.nextInt();					
						boolean checkAdd1 = (randomNum7+randomNum8) == userAddAns1;
											
						if (checkAdd1){
							System.out.println("Correct!!!");
						}
						else{
							System.out.println("Sorry incorrect, "+randomNum7+"+"+randomNum8+"= "+ (randomNum7+randomNum8)+" and not "+ userAddAns1 );
						}
						break;
					}
					//else if random problem = to 2 then show subtraction problem
					else if (randomProb == 2){
						//subtracting part of the sequence.
							int randomNum9 = rand.nextInt((100-0)+1)+0;
							int randomNum10 = rand.nextInt((100-0)+1)+0;						
							System.out.print ("What is "+randomNum9+ "-" +randomNum10+ "= ");						
							int userSubAns1 = in.nextInt();
							boolean checkSub1 = (randomNum9-randomNum10) == userSubAns1;
												
							if (checkSub1){
								System.out.println("Correct!!!");
							}
							else{
								System.out.println("Sorry incorrect, "+randomNum9+"-"+randomNum10+"= "+ (randomNum9-randomNum10)+" and not "+ userSubAns1 );
							}
							break;
					}
					//otherwise random problem = to 3 then show multiply problem
					else {
						//multiplication part of the sequence.
							int randomNum11 = rand.nextInt((100-0)+1)+0;
							int randomNum12 = rand.nextInt((100-0)+1)+0;					
							System.out.print ("What is "+randomNum11+ "*" +randomNum12+ "= ");					
							int userMultAns1 = in.nextInt();				
							boolean checkMult1 = (randomNum11*randomNum12) == userMultAns1;
											
							if (checkMult1){
								System.out.println("Correct!!!");
							}
							else{
								System.out.println("Sorry incorrect, "+randomNum11+"*"+randomNum12+"= "+ (randomNum11*randomNum12)+" and not "+ userMultAns1 );
							}
							break;
					}	
			default: System.out.println("Nulllllll.... This shouldnt display what so ever, its just there for decoration.");
					 break;
		}
			
	}
}