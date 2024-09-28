import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		//int temp=n;
		int rev=0,rem;
		int temp=n;
		while(n>0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(temp==rev){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}