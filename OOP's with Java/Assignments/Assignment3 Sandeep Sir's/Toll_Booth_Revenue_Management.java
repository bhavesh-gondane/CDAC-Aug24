package assignment3_sandeep_sir;

import java.util.Scanner;
/*Toll Booth Revenue Management
Develop a system to simulate a toll booth for collecting revenue*/
class TBRM{
	int no_cars;
	int no_trucks;
	int no_motorcycle;
	int trc;
	int trt;
	int trm;
	int rev;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of cars passed through toll: ");
		no_cars=sc.nextInt();
		System.out.println("Enter the no. of trucks passed through toll: ");
		no_trucks=sc.nextInt();
		System.out.println("Enter the no. of motorcycles passed through toll: ");
		no_motorcycle=sc.nextInt();
	}
	
	public void setTollRates() {
		trc=50;
		trt=100;
		trm=30;
	}
	
	public void calculateRevenue() {
		rev=(trc*no_cars)+(trt*no_trucks)+(trm*no_motorcycle);
	}
	
	public void printRecord() {
		System.out.println("Total revenue generated is: "+rev);
	}
}
public class Toll_Booth_Revenue_Management {

	public static void main(String[] args) {
		TBRM reve = new TBRM();
		reve.acceptRecord();
		reve.setTollRates();
		reve.calculateRevenue();
		reve.printRecord();
	}

}
