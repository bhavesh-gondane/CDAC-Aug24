package assignment1_dt4_9;

import java.util.Scanner;

public class Area_of_shapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape of which area is to be calculated");
		String shape=sc.next();
		switch(shape) {
		case "Circle":
			System.out.println("Enter the radius of circle:");
			double r=sc.nextDouble();
			double ac=3.14*r*r;
			System.out.println("Area of circle is: "+ac);
			break;
		case "Square":
			System.out.println("Enter the length of side: ");
			double s=sc.nextDouble();
			double as=s*s;
			System.out.println("Area of square is: "+as);
			break;
		case "Rectangle":
			System.out.println("Enter the length of the rectangle:");
			double l=sc.nextDouble();
			System.out.println("Enter the breadth of the rectangle:");
			double b=sc.nextDouble();
			double ar=l*b;
			System.out.println("Area of the rectangle is: "+ar);
			break;
		case "Triangle":
			System.out.println("Enter the length of base");
			double b1=sc.nextDouble();
			System.out.println("Enter the length of height");
			double h=sc.nextDouble();
			double at=0.5*b1*h;
			System.out.println("The area of the Triangle is: "+at);
			break;
		default:
			System.out.println("There is no such shape");
			break;
		}
	}

}
