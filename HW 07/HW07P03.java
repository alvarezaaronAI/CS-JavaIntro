/**
 * Author: Aaron Alvarez
 * Description: Grades
 */
package csHomework;
import java.util.Scanner;
public class HW07P03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int usersNumStu = in.nextInt();
		double[] studentsArray = new double[usersNumStu];
		System.out.println("Enter " + studentsArray.length +" score(s): ");
	//Assigns a value to each element based on the users numbers
		for (int i = 0; i < studentsArray.length; i++){
			studentsArray[i] = in.nextDouble();
		}
	//prints out the list but this is optional 
		for (int y = 0; y < studentsArray.length; y++){
			System.out.print( studentsArray[y]+ " ");
			}
			System.out.println();
	//checks for the largest value in the array so then i could assign
	//the largest value as the maximum grade value...DO a method that gets the Maxed num of array
		//Here goes the method. lol
		maxValue(studentsArray);
	
	//now i print out every student with an value and a grade 
		double maxGrade = maxValue(studentsArray);
		for (int a = 0; a < studentsArray.length; a++){
			int count = 1;
		boolean checkA = studentsArray[a] >= maxGrade - 15;
		boolean checkB = studentsArray[a] >= maxGrade - 25;
		boolean checkC = studentsArray[a] >= maxGrade - 35;
		boolean checkD = studentsArray[a] >= maxGrade - 45;
		if ( checkA){
				System.out.println("Student "+count+ " score is " + studentsArray[a]+ " and grade is A.");	
				count++;
			}
		if 
		( checkB){
			System.out.println("Student "+count+ " score is " + studentsArray[a]+ " and grade is A.");	
			count++;
		}
		if ( checkC){
			System.out.println("Student "+count+ " score is " + studentsArray[a]+ " and grade is A.");	
			count++;
		}
		if ( checkD){
			System.out.println("Student "+count+ " score is " + studentsArray[a]+ " and grade is A.");	
			count++;
		}
		}
		
		 
		
	}
	public static double maxValue(double[] maxedNum) {
		double max = maxedNum[0];
		for (int i = 0; i < maxedNum.length; i++) {
			if (maxedNum[i] > max) {
				max = maxedNum[i];
			}
		}
		return max;
	}
}
