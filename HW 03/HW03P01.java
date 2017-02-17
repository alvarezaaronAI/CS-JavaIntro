/**
 Author :Aaron Alvarez
 Program Description: Sequence of Three Ints
 
*/
import java.util.Scanner;

public class HW03P01 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	// Get the 3 ints from user
		System.out.println("What is the First Interger?");
		int firstNum = in.nextInt();
		System.out.println("What is the Second Interger?");
		int seconNum = in.nextInt();
		System.out.println("What is the Third Interger?");
		int thirdNum = in.nextInt();
	// 1 .Compare if the 3 ints are being STRICTLY INCREASING.
	    boolean strictlyInc = (firstNum < seconNum) && (firstNum < thirdNum) && (seconNum < thirdNum);
	// State what to do if the strictlyInc is or is not True.
		 if (strictlyInc) {
			 System.out.println(" Based on the Three Intergers you enter, this are Stritctly Increasing.");
			 
		 }
	// 2. Compare if the 3 ints are increasing
		boolean increasing = ((firstNum <= seconNum) && (firstNum < thirdNum) && (seconNum < thirdNum)) && (!(strictlyInc));
		 if (increasing){
			  System.out.println(" Based on the Three Intergers you enter, this are just Increasing.");  
		 }
	// 3. Compare if the 3 ints are being STRICTLY DECREASING
		boolean strictlyDec = (firstNum > seconNum) && (seconNum > thirdNum) && (firstNum > thirdNum);
		 if (strictlyDec) {
			 System.out.println(" Based on the Three Intergers you enter, this are Strictly Decreasing.");
		 }
    // 4. Compare if the 3 ints are decreasing
		boolean decreasing = ((firstNum > seconNum) && (seconNum >= thirdNum) && (firstNum > thirdNum)) && (!(strictlyDec));
		if (decreasing){
			System.out.println(" Based on the Three Intergers you enter, this are just decreasing.");
		}
	// 5. Compare if the 3 ints have no ORDER
		boolean noOrder = (!(strictlyInc)&& !(increasing) && !(strictlyDec)&& !(decreasing));
		if (noOrder){
			System.out.println(" Based on the Three Intergers, it has no specific Order.");
		}
		
	}
}