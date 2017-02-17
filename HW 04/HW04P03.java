/* 
Author: Aaron Alvarez
Description:Order Three Cities  

 */
import java.util.Scanner;

public class HW04P03 {
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
//Ask the user for 3 cities
	System.out.println("Enter the first city: ");
		String firstCity = in.nextLine();
	System.out.println("Enter the second city: ");
		String secondCity = in.nextLine();
	System.out.println("Enter the third city: ");
		String thirdCity = in.nextLine();
//Convert Everything to lowercase
	String firstCity1 = firstCity.toLowerCase();
	String secondCity1 = secondCity.toLowerCase();
	String thirdCity1 = thirdCity.toLowerCase();
	if(firstCity1.compareTo(secondCity1) > 0){
// Compare and swap if is is greater
      String temp = firstCity1;
      firstCity1 = secondCity1;
      secondCity1 = temp;
    }
    if(secondCity1.compareTo(thirdCity1) > 0){
// Compare and swap if is is greater
      String temp = secondCity1;
      secondCity1 = thirdCity1;
      secondCity1 = temp;
    }  
    if(firstCity1.compareTo(secondCity1) > 0){
// Compare and swap if is is greater
      String temp = firstCity1;
      firstCity1 = secondCity1;
      secondCity1 = temp;
    }
    System.out.println("Alphabetical Order: "+firstCity1+", "+secondCity1+", "+thirdCity1);
	
	}
}