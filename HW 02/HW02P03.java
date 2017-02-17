/**
 Author :Aaron Alvarez
 Program Description: Calculating Wind-Chill Temperature  
*/
import java.util.Scanner;

public class HW02P03 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	// Lets create a variable that will hold the value enter in Fahrenheight 
		System.out.println("Enter a temperature in Fahrenheight between -58F and 41F: ");
		double fahrenValue = in.nextDouble();
	// Create a variable the will hold the the wind speed 
		System.out.println("Enter a wind speed greater than or equal to 2 in miles per hour: ");
		double windSpeedValue = in.nextDouble();
		System.out.println("                                 ");
		
	/* Solve the equation t sub wc = wind - chilled temp = continue bottom
	 == 	35.74+0.6215 (t sub a) - 35.75 (v pow 0.016) + (t sub a) (v pow 0.16)
	Where (t sub a = fahrenValue) and (v = windSpeedValue) 
	*/
		double windSpeedPow = (Math.pow(windSpeedValue,0.16));
	// Solve for Total t sub wc =  Wind Chilled Temperature
		System.out.println("                                 ");
		System.out.println("---------------------------------");
		double windChillTemp = ((35.74+(0.6215*(fahrenValue)) - (35.75*(windSpeedPow)) + ((0.4275 *(fahrenValue))*windSpeedPow)));
		System.out.println("The Wind Chill Temperature is: " + windChillTemp);
		System.out.println("---------------------------------");
		
		}
}