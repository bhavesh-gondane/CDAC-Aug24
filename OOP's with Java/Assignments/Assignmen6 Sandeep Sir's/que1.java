package assignment6_sandeep_sir;
/*1.	Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to print the default values. Then accept records from the user and print the updated values of the array.
 * */
import java.util.Arrays;
import java.util.Scanner;

class SingleDimensionalArray{
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord(int arr[]) {
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void printRecord(int arr[]) {
		System.out.println("The array is:");
		System.out.println(Arrays.toString(arr));
	}
}


public class que1 {
	public static void main(String[] args) {
		int[] arr=new int[5];
//		for(int index=0;index<arr.length;index++) {
//			System.out.print(arr[index]+" ");
//		}
		System.out.println("Default values: ");
		System.out.println(Arrays.toString(arr));
		
		SingleDimensionalArray sda = new SingleDimensionalArray();
		sda.acceptRecord(arr);
		sda.printRecord(arr);
		
	}

}
