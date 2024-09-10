package assignment4_sandeep_sir;

import java.util.Scanner;
/*Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded 
	per year,and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define the class CompoundInterestCalculator with fields, an appropriate constructor, getter and setter methods, a 
toString method and business logic methods. Define the class CompoundInterestCalculatorUtil with methods 
acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality 
of the utility class.

 * */
class CompoundInterestCalculator{
	private double iia;
	private double air;
	private int not;
	private int yr;
	
	public CompoundInterestCalculator(double iia, double air, int not, int yr) {
		this.iia = iia;
		this.air = air;
		this.not = not;
		this.yr = yr;
	}
	
	public double getIia() {
		return iia;
	}
	public void setIia(double iia) {
		this.iia = iia;
	}
	public double getAir() {
		return air;
	}
	public void setAir(double air) {
		this.air = air;
	}
	public int getNot() {
		return not;
	}
	public void setNot(int not) {
		this.not = not;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	
	public double futureValue() {
        return iia * Math.pow((1 + (air/not)), not*yr);		
	}
	public double totalInterest() {
        return futureValue() - iia;
    }
	
	@Override
	public String toString() {
		return "CompoundInterestCalculator [iia=" + iia + ", air=" + air + ", not=" + not + ", yr=" + yr + "]";
	}
}


class CompoundInterestCalculatorUtil {
	Scanner sc = new Scanner(System.in);
    private CompoundInterestCalculator calci;

    public void acceptRecord() {
        
        System.out.print("Enter the initial investment amount ");
        double iia = sc.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double air = sc.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int not = sc.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        int yr = sc.nextInt();

        calci = new CompoundInterestCalculator(iia, air, not, yr);
    }

    public void printRecord() {
			 double futureValue=calci.futureValue();
			 double totalInterest=calci.totalInterest();
			 System.out.printf("future value is :%.2f%n",futureValue);
			 System.out.printf("total interest calculate is :%.2f%n",totalInterest);
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

public class Compound_Interest_Calculator_for_Investment {
	public static void main(String[] args) {
		CompoundInterestCalculatorUtil u=new CompoundInterestCalculatorUtil();
		u.menuList();
	}
}
