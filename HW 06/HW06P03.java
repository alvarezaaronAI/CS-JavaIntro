package Homework06;
import java.util.Scanner;
public class HW06P03 {

	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String  usersIn = in.nextLine();
		//Test
		/*System.out.println(minChar(usersIn));
		System.out.println(lettChec(usersIn));
		System.out.println(uppChec(usersIn));
		System.out.println(digChec(usersIn));
		System.out.println(speChec(usersIn));
		*/
		
	if (minChar(usersIn)  && lettChec(usersIn) && uppChec(usersIn) && digChec(usersIn) && speChec(usersIn)){
		System.out.println("This password is valid.");
		
	}
	else{
		System.out.println("This password is invalid.");
	}
	}
	public static boolean minChar (String usersInput){
		if (usersInput.length() >= 11){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean lettChec (String usersInput){
		int count = 0;
		//eC: Every Char
		for (int eC = 0; eC < usersInput.length(); eC++){
			if (Character.isLetter(usersInput.charAt(eC))){
				//Test:System.out.println(usersInput.charAt(eC));
				count ++;
				//Test:System.out.println(count);
			}
		}
		if(count >= 3){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean uppChec (String usersInput){
		int count = 0;
		//eC: Every Char
		for (int eC = 0; eC < usersInput.length(); eC++){
			if (Character.isUpperCase(usersInput.charAt(eC))){
				//Test:System.out.println(usersInput.charAt(eC));
				count ++;
				//Test:System.out.println(count);
			}
		}
		if(count >= 1){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean digChec (String usersInput){
		int count = 0;
		//eC: Every Char
		for (int eC = 0; eC < usersInput.length(); eC++){
			if (Character.isDigit(usersInput.charAt(eC))){
				//Test:System.out.println(usersInput.charAt(eC));
				count ++;
				//Test:System.out.println(count);
			}
		}
		if(count >= 2){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean speChec (String usersInput){
		int count = 0;
		//eC: Every Char
		for (int eC = 0; eC < usersInput.length(); eC++){
			if (usersInput.charAt(eC) == '@' || usersInput.charAt(eC) == '%' ||
			    usersInput.charAt(eC) == '!' ||usersInput.charAt(eC) == '&' ||
			    usersInput.charAt(eC) == '$' ||usersInput.charAt(eC) == '#' ||
			    usersInput.charAt(eC) == '*' ){
				//Test:System.out.println(usersInput.charAt(eC));
				count ++;
				//Test:System.out.println(count);
			}
		}
		if(count >= 3){
			return true;
		}
		else {
			return false;
		}
	}

}
