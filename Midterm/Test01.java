/*
	Author: Aaron Alvarez
	Description : Midterm Problem 1 Distance Sound travel problem
 */
import java.util.Scanner;

public class Test01 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
	// Give the menu choice
		System.out.println ("This program will calculate the time it takes sound to travel through");
		System.out.println ("various mediums.");
		System.out.println ("======================= ");
		System.out.println (" 1. Air 1,100 f/s ");
		System.out.println (" 2. Water 4,900 f/s");
		System.out.println (" 3. Steel 16,400 f/s");
		System.out.println ("======================= ");
		System.out.print (" Choose a medium(1-3): ");
	// Let the user choice from the menu choice 
		int usersChoice = in.nextInt();
		boolean usersChoiceCheck = usersChoice > 3 || usersChoice < 1;
		if (usersChoiceCheck){
			System.out.println (" That's not in the Menu Please Run Again.");
			System.exit(1);
		}
		switch (usersChoice) {
		//This case will execute for Air 
			case 1: 
			//Let the user enter the distance and make sure its not negative if it is then, tell the user to please enter a valid num
				System.out.print("Please Enter the distance (in feet) the sound will travel in Air: " );
				double usersDistance = in.nextDouble();
				boolean usersDistanceCheck = usersDistance < 0;
				if (usersDistanceCheck) {
					System.out.println("You may not Enter a negative Distance, Please Run the program again");
					System.exit(2);
				}
			//Calculate the by diving the distance non-negative and the medium
				double calculation1Air = (usersDistance/1100);
				double calculation1AirRounded = (int)Math.round(calculation1Air*1000);
				double calculation1AirRounded2 =calculation1AirRounded/1000;
			//Print out the following answer calculated already
				System.out.println("The Sound will take "+calculation1AirRounded2+" seconds to travel a distance of "+(int)usersDistance+"ft. through");
				System.out.println("air");
				break;
				
		//This case will execute for Water
			case 2:
			//Let the user enter the distance and make sure its not negative if it is then, tell the user to please enter a valid num
				System.out.print("Please Enter the distance (in feet) the sound will travel in water: " );
				double usersDistance2 = in.nextDouble();
				boolean usersDistanceCheck2 = usersDistance2 < 0;
				if (usersDistanceCheck2) {
					System.out.println("You may not Enter a negative Distance, Please Run the program again");
					System.exit(2);
				}
			//Calculate the by diving the distance non-negative and the medium
				double calculation1Water = (usersDistance2/4900);
				double calculation1WaterRounded = (int)Math.round(calculation1Water*1000);
				double calculation1WaterRounded2 =calculation1WaterRounded/1000;
			//Print out the following answer calculated already
				System.out.println("The Sound will take "+calculation1WaterRounded2+" seconds to travel a distance of "+(int)usersDistance2+"ft. through");
				System.out.println("water");
				break;
	
		//This case will execute for Steel
			case 3:
			//Let the user enter the distance and make sure its not negative if it is then, tell the user to please enter a valid num
				System.out.print("Please Enter the distance (in feet) the sound will travel in Steel: " );
				double usersDistance3 = in.nextDouble();
				boolean usersDistanceCheck3 = usersDistance3 < 0;
				if (usersDistanceCheck3) {
					System.out.println("You may not Enter a negative Distance, Please Run the program again");
					System.exit(2);
				}
			//Calculate the by diving the distance non-negative and the medium
				double calculation1Steel = (usersDistance3/164000);
				double calculation1SteelRounded = (int)Math.round(calculation1Steel*1000);
				double calculation1SteelRounded2 =calculation1SteelRounded/1000;
			//Print out the following answer calculated already
				System.out.println("The Sound will take "+calculation1SteelRounded2+" seconds to travel a distance of "+(int)usersDistance3+"ft. through");
				System.out.println("steel");
				break;
			
			default: System.out.println ("Coming Soon!");
			
		}
		
		
		
		}
	}