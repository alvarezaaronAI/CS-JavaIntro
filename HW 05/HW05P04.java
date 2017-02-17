/**
 * Author: Aaron Alvarez
 * Description: String Practice
 */
package Homework05;
import java.util.Scanner ;
public class HW05P04 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String usersStr = in.nextLine();
		System.out.println();
	//Declarations
	  int upCoun = 0, consCoun = 0;
	 // Upper case checkers
	  System.out.print("UpperCase Letters:          ");
	  //check every char
	  for (int upperC = 0; upperC<usersStr.length(); upperC++) {
			if (Character.isUpperCase(usersStr.charAt(upperC))){
				System.out.print(usersStr.charAt(upperC));
				
			}
	  }
	  System.out.println();
	 //check for each vowel place 
	  System.out.print("Vowels Replaced:            ");
	  for (int vw = 0; vw<usersStr.length(); vw++) {
		  //check wether if each section of each char is a vowel
		  if (usersStr.charAt(vw) == 'a' || usersStr.charAt(vw) == 'e' ||usersStr.charAt(vw) == 'i'||usersStr.charAt(vw) == 'o'|| usersStr.charAt(vw) == 'u'
		     || usersStr.charAt(vw) == 'A' ||usersStr.charAt(vw) == 'E' ||usersStr.charAt(vw) == 'I' ||usersStr.charAt(vw) == 'O' || usersStr.charAt(vw) == 'U' ){
			  //once you have each vowel lets modify
			  System.out.print("_");
			  //count for all vowels
			  upCoun++;
			  
		  }
		  else if (Character.isLetter(usersStr.charAt(vw))){
			  //else anything else must be a constant
			   System.out.print(usersStr.charAt(vw));
			   //count for each non vowel
			   consCoun++;
		  }
		  
	  }
	 //count each for each constant or vowels
	  System.out.println();
	  System.out.println("Number of Vowels:           "+upCoun);
	  System.out.println("Number of Constants:        "+consCoun);
	  System.out.print("Position of Vowels:         ");
	  //get all the 
	  for (int pvw = 0; pvw<usersStr.length(); pvw++) {
	  if (usersStr.charAt(pvw) == 'a' || usersStr.charAt(pvw) == 'e' ||usersStr.charAt(pvw) == 'i'||usersStr.charAt(pvw) == 'o'|| usersStr.charAt(pvw) == 'u'
			     || usersStr.charAt(pvw) == 'A' ||usersStr.charAt(pvw) == 'E' ||usersStr.charAt(pvw) == 'I' ||usersStr.charAt(pvw) == 'O' || usersStr.charAt(pvw) == 'U' ){
		 //now just get every char and just get the int 
		  System.out.print(pvw+" ");
	  }
	  }
	}

}
