//QUE: Write a program that checks if a person is eligible to vote based on their age.

package assignment1_dt4_9;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Congrats!! You're eligible for voting");
		}
		else {
			System.out.println("Sorry, you need to wait to enter into democracy");
		}
	}

}
