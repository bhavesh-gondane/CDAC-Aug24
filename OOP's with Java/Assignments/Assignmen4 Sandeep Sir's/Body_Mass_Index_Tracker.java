package assignment4_sandeep_sir;

import java.util.Scanner;
/*BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define the class BMITracker with fields, an appropriate constructor, getter and setter methods, a toString method, 
and business logic methods. Define the class BMITrackerUtil with methods acceptRecord, printRecord, and menuList.
Define the class Program with a main method to test the functionality of the utility class

 * */
class BMITracker {
    private double weight; 
    private double height; 
    private double bmi;    

    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.bmi = calculateBMI(); 
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.bmi = calculateBMI(); 
    }

    private double calculateBMI() {
        return weight / (height * height);
    }

    public String getClassification() {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    @Override
    public String toString() {
        return String.format("BMI: %.2f, Classification: %s", bmi, getClassification());
    }
}

class BMITrackerUtil {

    public static BMITracker acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kilograms): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        return new BMITracker(weight, height);
    }

    public static void printRecord(BMITracker bmiTracker) {
        System.out.println(bmiTracker.toString());
    }

    public static void menuList() {
        System.out.println("BMI Tracker Menu:");
        System.out.println("1. Enter new BMI record");
        System.out.println("2. Print current BMI record");
        System.out.println("3. Exit");
    }
}

public class Body_Mass_Index_Tracker {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        BMITracker bmiTracker = null;
	        boolean running = true;

	        while (running) {
	            BMITrackerUtil.menuList();
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    bmiTracker = BMITrackerUtil.acceptRecord();
	                    break;
	                case 2:
	                    if (bmiTracker != null) {
	                        BMITrackerUtil.printRecord(bmiTracker);
	                    } else {
	                        System.out.println("No BMI record available. Please enter a record first.");
	                    }
	                    break;
	                case 3:
	                    running = false;
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }

	        scanner.close(); 
	}
}
