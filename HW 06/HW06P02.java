package Homework06;
public class HW06P02 {

	public static void main(String[] args) {
	printTable();
	}
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit =  ((9.0 / 5) * (celsius + 32.0));
		return fahrenheit;
	}
	public static double fahrenheitToCelsus(double fahrenheit){
		double celsius = ((5.0 / 9.0) * (fahrenheit - 32.0));
		return celsius;
		
	}
	public static void printTable(){
		//fahrenheit = (9.0 / 5) * celsius + 32
		//celsius = (5.0 / 9) * (fahrenheit – 32)
		System.out.printf("%-11s %-15s %-5s %-14s %s \n","Celsius","Fahrenheit","|","Fahrenheit","Celsius");
		System.out.println("-----------------------------------------------------------");
			for(double c = 40, f = 120; c >= 31 && f>=30; c--, f-=10 ){
			System.out.printf("%-11.1f %-10.1f %6s %10.1f %10.1f %s",c,celsiusToFahrenheit(c),"|",f,fahrenheitToCelsus(f),"\n");
			}
		
			}
	}