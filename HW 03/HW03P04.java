/**
 Author :Aaron Alvarez
 Program Description: Compute a Paycheck
 
*/

import java.util.Scanner;

public class HW03P04 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	//Code something that will help you retrieve date that will allow you to get The hourly wage of the person.
		System.out.println("What is your hourly wage?(please use decimals)");
		double hourlyWage = in.nextDouble();
		if (hourlyWage<0){
			System.out.println ("You cannot have any negative values. Try Again");
			System.exit(0);
		}
	//Code something that will help retrieve date that will allow you to get How many hours did the person worked.
		System.out.println("How many hours did you work this week?(please use decimals)");
		double weeklyHours = in.nextDouble();
	//If statement to make sure that hourly wage OR!!! weekly hours worked are not NEGATIVE. and print out a statement
	//saying they cannot enter negative values and system.exit. if its false then it will continue to code.
		if (weeklyHours<0 ){
			System.out.println ("You cannot have any negative values. Try Again");
			System.exit(0);
		}
	//Display Hourly wage
		System.out.println("Hourly Wage: $" +hourlyWage );
	//Display hours worked
		System.out.println("Hourly Worked: " +weeklyHours );
	// If and else: if hours worked are less then or equal to 40 then compute Regular paycheck and overtime pay(which is 0, must be)and total paycheck
		if(weeklyHours<=40){
			//compute and display:  hourly pay 
			double regularPay = hourlyWage*40;
			//compute and display: over pay (this one is 0 since is less then 0 hours)
			double overPay = 0;
			//compute and display total pay 
			double totalPay = regularPay+overPay;
			System.out.println ("Regular Pay: $"+regularPay);
			System.out.println ("Overtime Pay: "+overPay);
			System.out.println ("Total Pay: $"+ totalPay);
		}
		//else hours worked is more then 40 hours then compute regular paycheck and overtime pay and total pay.
		else {
			//compute and display:  hourly pay 
			double regularPay = hourlyWage*40;
			//compute and displau: over pay by subtracting weekly hours pay - 40 and mutiplying it by hour wage and times 150% which is 1.50 in decimals
			double overPay = (((weeklyHours-40)*hourlyWage)*1.50);
			//compute and display: total pay by adding regular pay plus regularPay
			double totalPay = (regularPay+overPay);
			System.out.println ("Regular Pay: $"+regularPay);
			System.out.println ("Overtime Pay: $"+overPay);
			System.out.println ("Total Pay: $"+totalPay);			
		}
	 
		
	
		
		}
}