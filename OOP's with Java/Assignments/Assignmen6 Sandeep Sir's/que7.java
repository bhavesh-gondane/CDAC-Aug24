package assignment6_sandeep_sir;

/*7.	Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality.
 * */

import java.util.Arrays;
import java.util.Scanner;

class Sda{
	private int[] arr;
	
	
	public Sda(int a) {
		arr = new int[a];
	}
	
	public void acceptRecord(int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
        } else {
            System.out.println("Index out of bounds.");
        }
    }
	
	public void printRecord() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Record at index " + i + ": " + arr[i]);
        }
    }
}

public class que7{
	public static void main(String[] args) {
		Sda s = new Sda(5);
		
		s.acceptRecord(0, 10);
        s.acceptRecord(1, 20);
        s.acceptRecord(2, 30);
        s.acceptRecord(3, 40);
        s.acceptRecord(4, 50);
        s.acceptRecord(5, 60);
        
        s.printRecord();
	}
}