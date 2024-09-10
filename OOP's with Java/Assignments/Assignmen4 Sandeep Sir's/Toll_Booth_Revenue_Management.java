package assignment4_sandeep_sir;

import java.util.Scanner;

/*Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define the class TollBoothRevenueManager with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class TollBoothRevenueManagerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.

 * */

class TollBoothRevenueManager{
	private int nc;
	private int nt;
	private int nm;
//	{
//		int trc=100;
//		int trt=50;
//		int trm=30;
//	}
	public TollBoothRevenueManager(int nc, int nt, int nm) {
		this.nc = nc;
		this.nt = nt;
		this.nm = nm;
	}

	public int getNc() {
		return nc;
	}

	public void setNc(int nc) {
		this.nc = nc;
	}

	public int getNt() {
		return nt;
	}

	public void setNt(int nt) {
		this.nt = nt;
	}

	public int getNm() {
		return nm;
	}

	public void setNm(int nm) {
		this.nm = nm;
	}

	@Override
	public String toString() {
		return "TollBoothRevenueManager [nc=" + nc + ", nt=" + nt + ", nm=" + nm + "]";
	}
	
	public int totalRevenue() {
		return (nc*100)+(nt*50)+(nm*30);
	}
}

class TollBoothRevenueManagerUtil {
	public static Scanner sc = new Scanner(System.in);
	
	public TollBoothRevenueManager tbrc;
	
	public void acceptRecord() {
		System.out.println("Enter the number of cars passed: ");
		int nc = sc.nextInt();
		System.out.println("Enter the number of trucks passed: ");
		int nt = sc.nextInt();
		System.out.println("Enter the number of motrvehicles passed: ");
		int nm= sc.nextInt();
		
		tbrc=new TollBoothRevenueManager(nc, nt, nm);
	}
	
	public void printRecord() {
		int tr=tbrc.totalRevenue();
		System.out.println("The total revenue earned by the toll is: "+tr);
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
				System.out.println("0. Exit program");
				break;
			}
		}
	}
}
public class Toll_Booth_Revenue_Management {
	public static void main(String[] args) {
		TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil();
		util.menuList();
	}

}
