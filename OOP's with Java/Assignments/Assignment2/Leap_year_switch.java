package assignment1_dt4_9;

import java.util.Scanner;

public class Leap_year_switch {

	public static void main(String[] args) {
//		System.out.println("Enter a year");
//		Scanner sc = new Scanner(System.in);
//		int yr=sc.nextInt();
//		if((yr%4==0 && yr%100!=0) || (yr%4==0 && yr%100==0 && yr%400==0)) {
//			
//		}
		
//int choice = 0;
		//		int choice = sc.nextInt();
//		switch(yr) {
//		case 1:
//			System.out.println("It is a leap");
//			break;
//		//case 2:
//			//System.out.println("It is a leap");
//			//break;
//		default:
//			System.out.println("It is not a leap year");
//		}
		
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
