package assignment2_sandeep_sir;

import java.util.Scanner;

public class que_10 {
	public static void main(String[] args) {
		/*Que10: Write a program that accepts two integers and an arithmetic operator (+, -, *, /) from the command line. Perform the specified arithmetic operation based on the operator provided. (Hint: Use switch-case for operations).*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator:");
		String a=sc.nextLine();
		switch(a) {
		case "+":
			System.out.println("Enter 1st integer: ");
			int n1=sc.nextInt();
			System.out.println("Enter 2nd integer: ");
			int n2=sc.nextInt();
			int n3=n1+n2;
			System.out.println("Addition is: "+n3);
			break;
		case "-":
			System.out.println("Enter 1st integer: ");
			int a1=sc.nextInt();
			System.out.println("Enter 2nd integer: ");
			int a2=sc.nextInt();
			int a3=a1-a2;
			System.out.println("Addition is: "+a3);
			break;
		case "*":
			System.out.println("Enter 1st integer: ");
			int m1=sc.nextInt();
			System.out.println("Enter 2nd integer: ");
			int m2=sc.nextInt();
			int m3=m1*m2;
			System.out.println("Addition is: "+m3);
			break;
		case "/":
			System.out.println("Enter 1st integer: ");
			int d1=sc.nextInt();
			System.out.println("Enter 2nd integer: ");
			int d2=sc.nextInt();
			int d3=d1/d2;
			System.out.println("Addition is: "+d3);
			break;
		default:
			System.out.println("Invalid input");
		}
	}
}
