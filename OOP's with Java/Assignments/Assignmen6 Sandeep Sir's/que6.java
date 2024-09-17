package assignment6_sandeep_sir;

/*6.	Write a program to find the missing number in an array of integers ranging from 1 to N.
 * */

import java.util.Scanner;
class Missing{
	public static Scanner sc = new Scanner(System.in);
	public static int missingNum(int arr[],int n) {
		int totalSum=n*(n+1)/2;
		
		int totalArraySum=0;
		for(int element:arr) {
			totalArraySum+=element;
		}
		return totalSum-totalArraySum;
	}
}
public class que6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size of an array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter n-1 elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Missing value is: "+Missing.missingNum(arr, n));

	}

}