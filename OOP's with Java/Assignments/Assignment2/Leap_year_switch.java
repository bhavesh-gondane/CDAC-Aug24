//QUE: Write a program that checks if a given year is a leap year or not using switch-case.

package assignment1_dt4_9;

import java.util.Scanner;

public class Leap_year_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a year");
		int yr=sc.nextInt();
		switch(yr%4) {
		case 0:
			switch(yr%100) {
			case 0:
				switch(yr%400) {
				case 0:
					System.out.println("Leap");
					break;
				default:
					System.out.println("No leap");
					break;
				}
				break;
				default:
					System.out.println("leap");
					break;
			}
			break;
		default:
			System.out.println("no leap");
			break;
		}
		
	}

}
