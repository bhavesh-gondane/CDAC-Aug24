package assignment6_sandeep_sir;
/*4.	Write a program to remove duplicate elements from a single-dimensional array of integers.
 * */
import java.util.Arrays;
import java.util.Scanner;

class Duplicate{
	public static void accepRecord(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public static void printRecord(int arr[]) {
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i]!=arr[i+1]) {
			System.out.print(arr[i]+" ");
			}
		}
	}
	
//	public static void removeDuplicate(int[] arr) {
//		
//	}
}

public class que4 {
	public static void main(String[] args) {
		System.out.println("Enter the legth of an array");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		Duplicate.accepRecord(arr);
		Duplicate.printRecord(arr);
//		Duplicate.removeDuplicate(arr);
		
		
		
		
	}
}
