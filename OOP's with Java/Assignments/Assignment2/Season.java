//QUE: Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case

package assignment1_dt4_9;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month");
		int mon=sc.nextInt();
		switch(mon) {
		case 1:
			System.out.println("It is winter season");
			break;
		case 2:
			System.out.println("It is winter season");
			break;
		case 3:
			System.out.println("It is spring season");
			break;
		case 4:
			System.out.println("It is spring season");
			break;
		case 5:
			System.out.println("It is Summer season");
			break;
		case 6:
			System.out.println("It is Summer season");
			break;
		case 7:
			System.out.println("It is Rainy season");
			break;
		case 8:
			System.out.println("It is Rainy season");
			break;
		case 9:
			System.out.println("It is Autumn season");
			break;
		case 10:
			System.out.println("It is Autumn season");
			break;
		case 11:
			System.out.println("It is Autumn season");
			break;
		case 12:
			System.out.println("It is Winter season");
			break;
		default:
			System.out.println("Bro months are upto 12 only?!!!?");
		}
		
	}

}
