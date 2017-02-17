/* 
Author: Aaron Alvarez
Description:  Generating a License Plate Number  

 */
import java.util.Scanner;
import java.util.Random;
public class HW04P02 {
	public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	Random rand = new Random ();
//Generate 3 different letters based on the acs11
	int randomLet = rand.nextInt((90-65)+1)+65;
	int randomLet2 = rand.nextInt((90-65)+1)+65;
	int randomLet3 = rand.nextInt((90-65)+1)+65;
//Generate 4 different digs, i could genreate 1 big number from 1000 - 9999 but i want it to be mroe random, so random each dig
	int randomNum =  rand.nextInt((9-0)+1)+0;
	int randomNum2 = rand.nextInt((9-0)+1)+0;
	int randomNum3 = rand.nextInt((9-0)+1)+0;
	int randomNum4 = rand.nextInt((9-0)+1)+0;
//Convert to a char or a string
	char convLet1 = (char)randomLet;
	char convLet2 = (char)randomLet2;
	char convLet3 = (char)randomLet3;
	String convert1 = ""+randomNum;
	String convert2 = ""+randomNum2;
	String convert3 = ""+randomNum3;
	String convert4 = ""+randomNum4;
//Print Out the final random lets and numbers
	System.out.println("Your License plate is: "+ convLet1+convLet2+convLet3+convert1+convert2+convert3+convert4);
	
	}
}