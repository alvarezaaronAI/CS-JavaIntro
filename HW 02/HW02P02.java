/**
 Author :Aaron Alvarez
 Program Description:Stocks With commision printout 
*/
import java.util.Scanner;

public class HW02P02 {
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//User enters the cost per stocks
			System.out.println("Enter the cost per stock: ");
			double costPerStock = in.nextDouble();
		//User enter the number of stocks purchased
			System.out.println("Enter the number of stocks purchased: ");
			double numOfStocks = in.nextDouble();
		//User enter the commision
			System.out.println("Enter the percentage(As a decimal) of the commission:  ");
			double percentage = in.nextDouble();
		//Figure out the cost of Number of stocked total purchased
			double totalStocksPurchased = costPerStock*numOfStocks;
		//Figure out the commission based on the total num of stocks purchased
			double totalStocksCommission = totalStocksPurchased*percentage;
			double totalCost = totalStocksCommission+totalStocksPurchased;
		//Print out Answers 
			System.out.println("                                 ");
			System.out.println(" Total for:   ");
			System.out.println("---------------------------------");
			System.out.println("Cost for Stocks: $" +totalStocksPurchased);
			System.out.println("Cost for Commision: $" +totalStocksCommission);
			System.out.println("Total cost: $" +totalCost);
			System.out.println("---------------------------------");
			
		}
}