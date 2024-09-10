package assignment4_sandeep_sir;

import java.util.Scanner;
/*Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define the class LoanAmortizationCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class LoanAmortizationCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method and test the functionality of the utility class.

 * */
class LAC{
	int pa;
	double air;
	double yr;
	
	
	public LAC(int pa, double air, double yr) {
		this.pa = pa;
		this.air = air;
		this.yr = yr;
	}
	
	public int getPa() {
		return pa;
	}
	
	public void setPa(int pa) {
		this.pa = pa;
	}
	
	public double getAir() {
		return air;
	}
	
	public void setAir(double air) {
		this.air = air;
	}
	
	public double getYr() {
		return yr;
	}
	
	public void setYr(double yr) {
		this.yr = yr;
	}
	
	public double calculateMonthlyPayment() {
        double mir = air / 12 / 100;
        double nom = yr * 12;
        return pa * (mir * Math.pow(1 + mir, nom)) / (Math.pow(1 + mir, nom) - 1);
    }
	
	public double calculateTotalPayment() {
        return calculateMonthlyPayment() * yr * 12;
    }
}

class Util{
	private LAC lc;
	
	public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount ");
        int pa = scanner.nextInt();
        System.out.print("Enter the annual interest rate ");
        double air = scanner.nextDouble();
        System.out.print("Enter the loan term in years");
        double yr = scanner.nextDouble();

        lc = new LAC(pa, air, yr);
    }
	
	public void printRecord() {
		double mp = lc.calculateMonthlyPayment();
        double tp = lc.calculateTotalPayment();
        
        System.out.println("Monthly Payment: ₹" + mp);
        System.out.println("Total Payment (over the life of the loan): ₹" +tp);
    }
	
	public void menuList() {
        System.out.println("1. Enter Loan Details");
        System.out.println("2. Display Loan Information");
        System.out.println("0. Exit");
    }
}
public class Loan_Amortization_Calculator {

	public static void main(String[] args) {
		Util u = new Util();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            u.menuList();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    u.acceptRecord();
                    break;
                case 2:
                    u.printRecord();
                    break;
                case 0:
                	System.out.println();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
		
	}

}
