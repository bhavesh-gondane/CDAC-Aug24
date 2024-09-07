package assignment3_sandeep_sir;

import java.util.Scanner;
/*Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest*/
class CIC{
	int iia;
	double air;
	int not;
	int yr;
	double fv;
	double ti;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial investment amount");
		iia=sc.nextInt();
		System.out.println("Enter annual interest rate");
		air=sc.nextDouble();
		System.out.println("Enter number of times the interest is compounded per year");
		not=sc.nextInt();
		System.out.println("ENter investment duration (in years)");
		yr=sc.nextInt();
	}
	
	public void calculateFutureValue() {
		fv=iia*Math.pow(((1+air)/not), not*yr);
		ti=fv-iia;
	}
	
	public void printRecord() {
		System.out.println("The future value is:"+fv);	//%.2f%n
		System.out.println("The total interest earned is: "+ti);
	}
	
}
public class Compound_Interest_Calculator_for_Investment {
	public static void main(String[] args) {
		CIC q1=new CIC();
		q1.acceptRecord();
		q1.calculateFutureValue();
		q1.printRecord();
		
	}

}
