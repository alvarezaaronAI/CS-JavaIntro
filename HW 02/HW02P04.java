/**
 Author :Aaron Alvarez
 Program Description: Calculatiing Montly Loan Payments
*/
import java.util.Scanner;

public class HW02P04 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	//Ask user for loan
		System.out.println("What is the amout of loan: ");
		double loanValue = in.nextDouble();
	//Ask annual interest rate
		System.out.println("What is the annual interest rate: ");
		double interestValue = in.nextDouble();
		double montlyInterestPayments = ((interestValue*100)/12);
	// Ask for number of payments 
		System.out.println("Enter the number of payments: ");
		double paymentsValue = in.nextDouble();
	// Loan report
		double payment = ((montlyInterestPayments*(1+(Math.pow(montlyInterestPayments,paymentsValue)))/((1+(Math.pow(montlyInterestPayments,paymentsValue))-1))*loanValue));
		System.out.println("                                 ");
		System.out.println("---------------------------------");
		System.out.println(payment);
		System.out.println("Load Amount:              $" + loanValue);
		System.out.println("Montly Interest Rate:      " + montlyInterestPayments+ "%");
		System.out.println("Number of Payments:        " + paymentsValue);
		System.out.println("Amount Paid Back:          ");
		
		}
}