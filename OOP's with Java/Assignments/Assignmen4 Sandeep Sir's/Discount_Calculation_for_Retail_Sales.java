package assignment4_sandeep_sir;

import java.util.Scanner;
/*Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.

 * */
class DiscountCalculator {
	private int op;
	private double dp;
	
	public DiscountCalculator(int op, double dp) {
		this.op = op;
		this.dp = dp;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public double getDp() {
		return dp;
	}

	public void setDp(double dp) {
		this.dp = dp;
	}

	@Override
	public String toString() {
		return "DiscountCalculator [op=" + op + ", dp=" + dp + "]";
	}
	
	public double dac() {
		return op*(dp/100);
	}
	
	public double fp() {
		return op-(op*(dp/100));
	}
}

class DiscountCalculatorUtil {
	public Scanner sc = new Scanner(System.in);
	private DiscountCalculator dc;
	
	public void acceptRecord() {
		
		System.out.println("Enter the Original price");
		int op=sc.nextInt();
		
		System.out.println("Enter the discount percentage: ");
		double dp=sc.nextDouble();
	
		dc=new DiscountCalculator(op, dp);
				
	}
	
	public void printRecord() {
		double dac=dc.dac();
		double fp=dc.fp();
		System.out.printf("The discounted amount is: %.2f%n",dac);
		System.out.printf("The final price is: %.2f%n",fp);
	}
	
	public void menuList() {
		while(true) {
			System.out.println("1.Accept Record");
			System.out.println("2.Print Record");
			System.out.println("3.Exit");
			System.out.print("Enter option:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				acceptRecord();
				break;
			case 2:
				printRecord();
				break;
			case 3:
				System.out.println("Program Terminated");
				return;
			default:
				System.out.println("Invalid Option");
				}
	    	}
	}
}

public class Discount_Calculation_for_Retail_Sales {
	public static void main(String[] args) {
		DiscountCalculatorUtil dcu = new DiscountCalculatorUtil();
		dcu.menuList();
	}
}
