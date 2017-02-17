/* 
Author: Aaron Alvarez
Description:Social Security Validation  

 */
import java.util.Scanner;

public class HW04P04 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
//Ask the user  for to enter social security
		System.out.print("Enter a social security number: ");
		String socialSecurityNum = in.nextLine();
//Lets check weather its valid or not. Check every digit if each char is a digit or not. 

		boolean ssnChecker1 = (socialSecurityNum.length() == 11);
		boolean ssnChecker2	=(Character.isDigit(socialSecurityNum.charAt(0)));
		boolean ssnChecker3	=(Character.isDigit(socialSecurityNum.charAt(1)));
		boolean ssnChecker4	=(Character.isDigit(socialSecurityNum.charAt(2)));
		boolean ssnChecker5	=(socialSecurityNum.charAt(3) == '-');
		boolean ssnChecker6	=(Character.isDigit(socialSecurityNum.charAt(4)));
		boolean ssnChecker7	=(Character.isDigit(socialSecurityNum.charAt(5)));
		boolean ssnChecker8	=(Character.isDigit(socialSecurityNum.charAt(7)));
		boolean ssnChecker9 =(socialSecurityNum.charAt(6) == '-');
		boolean ssnChecker10 =(Character.isDigit(socialSecurityNum.charAt(8)));
		boolean ssnChecker11 =(Character.isDigit(socialSecurityNum.charAt(9)));
		boolean ssnChecker12 =(Character.isDigit(socialSecurityNum.charAt(10)));
//Display if all of the top is true. 
	if ( ssnChecker1 && ssnChecker2 && ssnChecker3  && ssnChecker4 && ssnChecker5  && ssnChecker6  && ssnChecker7  && ssnChecker8  && ssnChecker9  && ssnChecker10  && ssnChecker11  && ssnChecker12 ){
		System.out.println(socialSecurityNum + " is a valid number.");
	}
	else{
		System.out.println (socialSecurityNum + " is not a valid number.");
	}
		
	}

}