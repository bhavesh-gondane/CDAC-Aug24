package assignment6_sandeep_sir;
/*3.Write a program to find the maximum and minimum values in a single-dimensional array of integers.
 * */

import java.util.Arrays;
import java.util.Scanner;

class Test{
	public static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int[] arr) {
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public static void printRecord(int[] arr) {
		System.out.println("The array is: "+Arrays.toString(arr));
	}
	
	public static void max_Value(int[] arr) {
		
		int max_value=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max_value) {
				max_value=arr[i];
			}
		}
		System.out.println("Maximum value is: "+max_value);
	}
	
	public static void min_Value(int[] arr) {
		
		int min_value=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min_value) {
				min_value=arr[i];
			}
		}
		System.out.println("Minimum value is: "+min_value);
	}
}

public class que3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int a=sc.nextInt();
		int[] arr= new int[a];
		
		Test.acceptRecord(arr);
		Test.printRecord(arr);
		Test.max_Value(arr);
		Test.min_Value(arr);
		
		
	}
}
