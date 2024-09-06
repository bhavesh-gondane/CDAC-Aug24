//QUE: Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).

package assignment1_dt4_9;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the height im meters");
		float ht=sc.nextFloat();
		System.out.println("Enter the weight");
		float wt=sc.nextFloat();
		float bmi=wt/(ht*ht);
		System.out.println("Your Body Mass Index (BMI) is: "+bmi);
		if(bmi<18.5) {
			System.out.println("You're underweight");
		}
		else if(bmi>=18.5 && bmi<25) {
			System.out.println("Hurrah!!! You're normal");
		}
		else if(bmi>=25 && bmi<35) {
			System.out.println("Sorry!!! You're Overweight");
		}
		else {
			System.out.println("You need to work hard, you're in Obesity category");
		}
		
	}

}
