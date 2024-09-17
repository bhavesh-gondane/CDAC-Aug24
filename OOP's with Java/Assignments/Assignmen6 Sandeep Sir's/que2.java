package assignment6_sandeep_sir;
/*2.	Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to get input from the terminal into the array and another method named printRecord to print the state of the array to the terminal.
 * */
import java.util.Arrays;
import java.util.Scanner;

class Array{
	public static Scanner sc = new Scanner(System.in);
	public void acceptRecord(int arr[]) {
		System.out.println("Enter the values:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void printRecord(int arr[]) {
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(arr));
	}
}

public class que2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Array a1 = new Array();
		a1.acceptRecord(arr);
		a1.printRecord(arr);
	}

}
