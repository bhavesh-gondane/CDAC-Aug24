package assignment6_sandeep_sir;
/*5.	Write a program to find the intersection of two single-dimensional arrays.
 * */
import java.util.Arrays;
import java.util.Scanner;

class Test1{
	public static Scanner sc = new Scanner(System.in);
	public static void acceptRecords(int[] arr1, int[] arr2) {
		System.out.println("Enter the elements of 1st array: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of 2nd array: ");
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
	}
	
	public static void printRecords(int[] arr1, int[] arr2) {
		System.out.println("Array1: "+Arrays.toString(arr1));
		System.out.println("Array2: "+Arrays.toString(arr2));
	}
	
	
	public static void Intersection(int[] arr1, int[] arr2){
		System.out.print("Intersection of 1st and 2nd array is: ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
}

public class que5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of 1st array: ");
		int a=sc.nextInt();
		int[] arr1=new int[a];
		System.out.println("Enter the size of 2nd array: ");
		int b=sc.nextInt();
		int[] arr2=new int[b];
		
		
		
		Test1.acceptRecords(arr1, arr2);
		Test1.printRecords(arr1, arr2);
		Test1.Intersection(arr1, arr2);
	}
}
