package assignment3_sandeep_sir;

import java.util.Scanner;
/*BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI).*/
class BMIndex{
	double wt;
	double ht;
	double bmi;
	
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the weight in kilograms:");
		wt=sc.nextDouble();
		System.out.println("Enetr the height in meters");
		ht=sc.nextDouble();
	}
	
	public void calculateBMI() {
		bmi=wt/(ht*ht);
	}
	
	public void classifyBMI() {
		if(bmi<18.5) {
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<24.9) {
			System.out.println("Normal weight");
		}
		else if(bmi>=25 && bmi<29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
	}
	
	public void printRecord() {
		System.out.printf("Your body mass index is: %.2f%n",bmi);
	}
}
public class Body_Mass_Index_Tracker {

	public static void main(String[] args) {
		BMIndex bmi = new BMIndex();
		bmi.acceptRecord();
		bmi.calculateBMI();
		bmi.printRecord();
		bmi.classifyBMI(); 
	}
}
