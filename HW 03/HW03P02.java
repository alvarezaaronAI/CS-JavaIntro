/**
 Author :Aaron Alvarez
 Program Description: Linear Equation Solver
 
*/
import java.util.Scanner;

public class HW03P02 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	//Ask the user to enter numbers to a b c d e f and assign it a variable.
	System.out.println ("What is 'a' variable (intergers only please)");
		int aNum = in.nextInt();
	System.out.println ("What is 'b' variable (intergers only please)");
		int bNum = in.nextInt();
	System.out.println ("What is 'c' variable (intergers only please)");	
		int cNum = in.nextInt();
	System.out.println ("What is 'd' variable (intergers only please)");
		int dNum = in.nextInt();
	System.out.println ("What is 'e' variable (intergers only please)");
		int eNum = in.nextInt();
	System.out.println ("What is 'f' variable (intergers only please)");
		int fNum = in.nextInt();
	// Check weather ab - bc is 0
		boolean checkZeroXY = (((aNum*dNum)-(bNum*cNum)) == 0);
	// Give conditions to cheack weather bottom one does not == to 0 and if it is NO SOLUTIONl
		if (!checkZeroXY){
			// Solve of equation x and y
			int xValue = ((eNum*dNum)-(bNum*fNum))/((aNum*dNum)-(bNum*cNum));
			int yValue = ((aNum*fNum)-(eNum*cNum))/((aNum*dNum)-(bNum*cNum));
			System.out.println(((aNum*xValue)+(bNum*yValue))+ " = " + eNum);
			System.out.println(((cNum*xValue)+(dNum*yValue))+ " = " + fNum);
		}
		else {
			System.out.println ("This specific values gives no Solution");
		}
			
		}
	  }