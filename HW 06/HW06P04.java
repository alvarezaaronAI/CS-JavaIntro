package Homework06;
import java.util.Scanner;
public class HW06P04 {

	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner (System.in);
		System.out.print("Enter the side length and the symbol to use: ");
		int usersSL = in.nextInt();
		String usersSY = in.nextLine();
		priTop(usersSL, usersSY);
		priBot(usersSL, usersSY);
	}
	public static void priTop (int usersSl,String usersSy ){
		int doub = usersSl * 2;
		  for (int down = 1 ; down <= doub; down++){
			  if( down % 2 == 1){
		    	for (int across = doub-down; across >= 1; across--){
		    		System.out.print(" ");
		    	}
		    	for (int down2 = down ; down2 >=1 ; down2--){
		    		System.out.print(usersSy);
		    	}
		  System.out.println();
		   }
		  }
	}
	public static void priBot ( int usersSl, String usersSy){
		int doub  = usersSl *2;
			for (int down = 2; down < doub ; down++){
				 if( down % 2 == 1){
					for (int across = 1; across <= down ; across++ ){
						System.out.print(" ");
					}
					for (int across2 = 0 ; across2 < doub - down ; across2++  ){
						System.out.print(usersSy);
					}
				    System.out.println();
				 }
			}
	}
}
	