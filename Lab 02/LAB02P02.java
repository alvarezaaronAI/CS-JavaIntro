/**
 Author :Aaron Alvarez
 Program Description:Printing Movies Revenue total Gross and Net Income
*/
import java.util.Scanner;

public class LAB02P02 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		//Adult Tickets entered
			System.out.println("How many adult tickets were sold?  ");
			int numAdultTickets = in.nextInt();
		//Child Tickets entered
			System.out.println("How many child tickets were sold?  ");
			int numChildTickets = in.nextInt();
		//Price of Adult Tickets entered
			System.out.println("What is the price of an Adult Ticket?  ");
			double priAdultTickets = in.nextDouble();
		//Price of Child Tickets entered
			System.out.println("What is the price of an Child Ticket?  ");
			double priChildTickets = in.nextDouble();
		//Percentage entered(Assuming the user enters decimal notation)
			System.out.println("What is the percentage that is paid to the movie company?");
			double percentage = in.nextDouble();
		//Total Gross and Net Income
			double totalGrossA = numAdultTickets*priAdultTickets;
			double totalGrossC = numChildTickets*priChildTickets;
			double totalNetA = totalGrossA-(totalGrossA*percentage);
			double totalNetC = totalGrossC-(totalGrossC*percentage);
		//Printing out the Report
			System.out.println("                                   ");
			System.out.println("---------------------------------");
			System.out.println("Sales Report: ");
			System.out.println("-----------------------------------");
			System.out.println("Gross Revenue (Adult): $" + totalGrossA);
			System.out.println("Net Revenue (Adult): $"+ totalNetA);
			System.out.println("                                   ");
			System.out.println("Gross Revenue (Child): $" + totalGrossC );
			System.out.println("Net Revenue (Child): $"+ totalNetC);
			System.out.println("                                   ");
			System.out.println("Total Gross Revenue : $" + (totalGrossA+totalGrossC));
			System.out.println("Total Net Revenue : $" + ((totalGrossA+totalGrossC)-((totalGrossA+totalGrossC)*percentage)));
			System.out.println("---------------------------------");
		}
}