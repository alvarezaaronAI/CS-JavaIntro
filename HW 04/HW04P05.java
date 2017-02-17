import java.util.Scanner;

public class HW04P05 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
//Ask them a question to write a 10 dig num
	System.out.print("Write a ten digit number for me to format.");
	String phoneNumber = in.nextLine();
	
	boolean phoneChecker = (phoneNumber.length() == 10);
	if (phoneChecker){
		System.out.println("("+(phoneNumber.charAt(0))+(phoneNumber.charAt(1))+(phoneNumber.charAt(2))+")"+(phoneNumber.charAt(3))+(phoneNumber.charAt(4))+(phoneNumber.charAt(5))+"-"+(phoneNumber.charAt(6))+(phoneNumber.charAt(7))+(phoneNumber.charAt(8))+(phoneNumber.charAt(9)));
	}
	else 
		System.out.println ("Error: This is not a ten digit phone number.");
		}
	}