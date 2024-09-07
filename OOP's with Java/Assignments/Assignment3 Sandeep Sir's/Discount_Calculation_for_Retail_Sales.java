package assignment3_sandeep_sir;

import java.util.Scanner;
/*Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount.*/
class Dis{
	int op;
	double dp;
	double da;
	double fp;
	
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the original price");
		op=sc.nextInt();
		System.out.println("Enter the percentage of discount to be given");
		dp=sc.nextDouble();
	}
	public void calculateDiscount() {
		da=op*(dp/100);
		fp=op-da;
	}
	public void printRecord() {
		System.out.println("The Discounted amount is: "+da);
		System.out.println("The final price after discount is"+fp);
	}
}
public class Discount_Calculation_for_Retail_Sales {

	public static void main(String[] args) {
		Dis d=new Dis();
		d.acceptRecord();
		d.calculateDiscount();
		d.printRecord();
	}
}
