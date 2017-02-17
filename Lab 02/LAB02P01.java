/**
 Author :Aaron Alvarez
 Program Description: Figuring out Bills 
*/
import java.util.Scanner;

public class LAB02P01 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		//Bill Entered
			System.out.println("What is your total bill out come? ");
			double partialBill = in.nextDouble();
		//Tax percentage entered (Assuming the user enters decimal notation)
			System.out.println("What is the tax of your state? ");
			double taxBill = in.nextDouble();
		//Tip percentage entered(Assuming the user enters decimal notation)
			System.out.println("What is the percentage of tip are you giving? ");
			double tipBill = in.nextDouble();
		//People Entered
			System.out.println("With how many people will you split the bill? ");
			int peopleBill = in.nextInt();
		//Total Value of Billed TAXED!
		double 	totalBillTaxed = (partialBill*taxBill)+partialBill;
		//Total Value Bill TAXED plus Tips 
		double totalBillTiped = (totalBillTaxed*tipBill)+totalBillTaxed;
		//Print Out Total Values
		System.out.println("                                 ");
		System.out.println("---------------------------------");
		System.out.println("Subtotal: $"+ partialBill);
		System.out.println("Tax: $" + taxBill*partialBill);		
		System.out.println("Tip Total Gave: $" + totalBillTaxed*tipBill);
		System.out.println("Your Total Bill is: $" + totalBillTiped);
		System.out.println("Each person Owes: $" + totalBillTiped/peopleBill);
		System.out.println("---------------------------------");
		}
}