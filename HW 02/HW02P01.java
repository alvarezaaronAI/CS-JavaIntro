/**
 Author :Aaron Alvarez
 Program Description:Driving Cost
*/
import java.util.Scanner;

public class HW02P01 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Ask the user to enter the driving distance
			System.out.println("Enter the Driving distance: ");
			double drivingDistance = in.nextDouble();
		//Ask the user to enter the MPG
			System.out.println("Enter the miles per gallon: ");
			double milesPG = in.nextDouble();
		//Ask the user to enter the PPG
			System.out.println("Enter the price per gallon: ");
			double pricePG = in.nextDouble();
		//Figure out the cost
			double totalCostOfDriving = ((drivingDistance/milesPG)*pricePG);
		//Print out the Answer
			System.out.println("The total cost of driving is $" + totalCostOfDriving);
		
		}
}