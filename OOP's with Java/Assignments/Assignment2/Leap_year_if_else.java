package assignment1_dt4_9;

import java.util.Scanner;

public class Leap_year_if_else {

	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		if (year % 4 == 0) {
    		if (year % 100 == 0) {
        		if (year % 400 == 0) {
            		System.out.println("It is a leap year");
        		}
        		else {
            		System.out.println("It is not a leap year");
        		}
    		} 
    		else {
        		System.out.println("It is a leap year");
    		}
		}
		else {
    		System.out.println("It is not a leap year");
	   }
		// year%4==0 && year%100!=0 || year%4==0 && year%100==0 && year%400==0
	}	
}