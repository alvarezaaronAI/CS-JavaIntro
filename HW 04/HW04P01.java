/* 
Author: Aaron Alvarez
Description: Computing the Area Created by Four Cities 

 */
import java.util.Scanner;

public class HW04P01 {
public static void main(String [] args){
	Scanner in = new Scanner(System.in);
		double earthRad = 6371.01;
//Ask the user for coordinates for the cities x and y in clock wise order
		System.out.print("Enter the GPS coordinates for the 1st city: ");
		double gpsx1 = in.nextDouble();
		double gpsy1 = in.nextDouble();
		
		System.out.print("Enter the GPS coordinates for the 2st city: ");
		double gpsx2 = in.nextDouble();
		double gpsy2 = in.nextDouble();
		
		System.out.print("Enter the GPS coordinates for the 3st city: ");
		double gpsx3 = in.nextDouble();
		double gpsy3 = in.nextDouble();
		
		System.out.print("Enter the GPS coordinates for the 4st city: ");
		double gpsx4 = in.nextDouble();
		double gpsy4 = in.nextDouble();
//This first calculations between cities, this will create a triangle between the first 3 cities
		//Calculate the side from city 1 to city 2 Using the great distance formula
			double distanceSide1 = earthRad*Math.acos(Math.sin(Math.toRadians(gpsx1))*Math.sin(Math.toRadians(gpsx2))+Math.cos(Math.toRadians(gpsx1))*Math.cos(Math.toRadians(gpsx2))*Math.cos(Math.toRadians(gpsy1-gpsy2)));
		//Calculate the side from city 2 to city 3 using great distance formula
			double distanceSide2 = earthRad*Math.acos(Math.sin(Math.toRadians(gpsx2))*Math.sin(Math.toRadians(gpsx3))+Math.cos(Math.toRadians(gpsx2))*Math.cos(Math.toRadians(gpsx3))*Math.cos(Math.toRadians(gpsy2-gpsy3)));
	//The distance in the middle.
		double distanceSide5 = earthRad*Math.acos(Math.sin(Math.toRadians(gpsx3))*Math.sin(Math.toRadians(gpsx1))+Math.cos(Math.toRadians(gpsx3))*Math.cos(Math.toRadians(gpsx1))*Math.cos(Math.toRadians(gpsy3-gpsy1)));
//This second calculations between cities will create a triangle between city 3 to 1 
		//Calculate the side from city 3 to city 4 Using the great distance formula
			double distanceSide3 = earthRad*Math.acos(Math.sin(Math.toRadians(gpsx3))*Math.sin(Math.toRadians(gpsx4))+Math.cos(Math.toRadians(gpsx3))*Math.cos(Math.toRadians(gpsx4))*Math.cos(Math.toRadians(gpsy3-gpsy4)));
		//Calculate the side from city 4 to city 1 Using the great distance formula
			double distanceSide4 = earthRad*Math.acos(Math.sin(Math.toRadians(gpsx4))*Math.sin(Math.toRadians(gpsx1))+Math.cos(Math.toRadians(gpsx4))*Math.cos(Math.toRadians(gpsx1))*Math.cos(Math.toRadians(gpsy4-gpsy1)));

//Calulate half of the area of the whole thing. First triangle
	double sideTri = ((distanceSide1+distanceSide2+distanceSide5)/2);
	double areaOfTri1 = Math.sqrt(sideTri*(sideTri-distanceSide1)*(sideTri-distanceSide2)*(sideTri-distanceSide5));
//Calculate the other half area of the whole thing . Second triangle
	double sideTri1 = ((distanceSide3+distanceSide4+distanceSide5)/2);
	double areaOfTri2 = Math.sqrt(sideTri1*(sideTri1-distanceSide3)*(sideTri1-distanceSide4)*(sideTri1-distanceSide5));
//Display answer rouded off.
	double areaTotal = (areaOfTri1+areaOfTri2);
	double areaTotalRounded1 = ((int)Math.round(areaTotal*1000));
	double areaTotalRounded2 = areaTotalRounded1/1000;
	
	System.out.println("The Area is: "+areaTotalRounded2);
	}
}