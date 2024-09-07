package assignment3_sandeep_sir;

import java.util.Scanner;

/*Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan.*/
class LoanAmortizationCalculator{
	int pa;
	double air;
	double yr;
	double mp;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the prinicpal amount:");
		pa=sc.nextInt();
		System.out.println("Enter the interest rate");
		air=sc.nextDouble();
		System.out.println("Enter the years you want to loan: ");
		yr=sc.nextDouble();
	}
	
	public void calculateMonthlyPayment() {
		double mir=(air/12)/100;
		double nom=yr*12;
		mp=pa*(mir*Math.pow(1+mir, nom))/(Math.pow(1+mir, nom)-1);
	}
	
	public void printRecord() {
		System.out.println("Monthly payment is: "+mp);
		double tapol=mp*12*yr;
		System.out.println("total amount paid over the life of the loan is: "+tapol);
	}
}

public class Loan_Amortization_Calculator {
	public static void main(String[] args) {
		LoanAmortizationCalculator lac = new LoanAmortizationCalculator();
		lac.acceptRecord();
		lac.calculateMonthlyPayment();
		lac.printRecord();
	}

}
