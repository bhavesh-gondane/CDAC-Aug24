import java.util.*;
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = sc.nextInt();
		if(n%4==0){
			if(n%100==0){
				if(n%400==0){
					System.out.println("Leap");
				}
				else{
					System.out.println("Not leap");
				}
			}
			else{
				System.out.println("Leap");
			}
		}
		else{
			System.out.println("Not leap");
		}
	}
}
