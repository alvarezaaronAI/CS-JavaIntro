/* 
Author: Aaron Alvarez
Description:Calculating and Displaying an Employee Payroll

 */
import java.util.Scanner;

public class HW04P06 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
//Ask a question exactly how it appears even with the little apostraphy 
	char apos = 44;
	System.out.print("Enter empoyee"+apos+"s name: ");
	String empoyeeName = in.nextLine();
//Ask the rest of the questions
	System.out.print("Enter the number of hours worked in a week: ");
	double hoursWorked = in.nextDouble();
	System.out.print("Enter hourly pay rate: ");
	double hourlyPayRate = in.nextDouble();
	System.out.print ("Enter federal tax withholding rate: ");
	double federalTaxRate = in.nextDouble();
	System.out.print ("Enter state tax withholding rate: ");
	double stateTaxRate = in.nextDouble();
//Calculate regular pay
	if (hoursWorked <=40){
		double regularPay1 = hoursWorked*hourlyPayRate;
		double overPay1 = 0;
		double grosspay1 = regularPay1+overPay1;
		double federalDec1 = grosspay1*federalTaxRate;
		double stateDec1 = grosspay1*stateTaxRate;
		double totalDec1 = stateDec1+federalDec1;
		double netPay1 = grosspay1-totalDec1;
		System.out.println("                                ");
		System.out.println("Employee Name: "+ empoyeeName);
		System.out.println("Hours Worked: "+hoursWorked);
		System.out.println("Pay Rate: $"+ hourlyPayRate);
		System.out.println("Regular Pay $"+regularPay1);
		System.out.println("Overtime Pay: $"+ overPay1);
		System.out.println("Gross Pay: $"+grosspay1);
		System.out.println("Deductions: ");
		System.out.println("     Federal Withholding("+(federalTaxRate*100)+"%): $"+federalDec1);
		System.out.println("     State Withholding ("+(stateTaxRate*100)+"%): $"+stateDec1);
		System.out.println("     Total Deduction: $"+ totalDec1);
		System.out.println("Net Pay: $"+netPay1);
	}
	else {
		double regularPay2 = 40*hourlyPayRate;
		double getOverPayAmount = hoursWorked-40;
		double overPay2 = ((getOverPayAmount*hourlyPayRate)*1.50);
		double grosspay2 = regularPay2+overPay2;
		double federalDec2 = grosspay2*federalTaxRate;
		double stateDec2 = grosspay2*stateTaxRate;
		double totalDec2 = stateDec2+federalDec2;
		double netPay2 = grosspay2-totalDec2;
		System.out.println("                                ");
		System.out.println("Employee Name: "+ empoyeeName);
		System.out.println("Hours Worked: "+hoursWorked);
		System.out.println("Pay Rate: $"+ hourlyPayRate);
		System.out.println("Regular Pay $"+regularPay2);
		System.out.println("Overtime Pay: $"+ overPay2);
		System.out.println("Gross Pay: $"+grosspay2);
		System.out.println("Deductions: ");
		System.out.println("     Federal Withholding("+(federalTaxRate*100)+"%): $"+federalDec2);
		System.out.println("     State Withholding ("+(stateTaxRate*100)+"%): $"+stateDec2);
		System.out.println("     Total Deduction: $"+ totalDec2);
		System.out.println("Net Pay: $"+netPay2);
	}
	

		}
	}