package assignment6_sandeep_sir;

/*9.	You need to implement a system to manage airplane seat assignments. The airplane has seats arranged in rows and columns. Implement functionalities to:
•	Initialize the seating arrangement with a given number of rows and columns.
•	Book a seat to mark it as occupied.
•	Cancel a booking to mark a seat as available.
•	Check seat availability to determine if a specific seat is available.
•	Display the current seating chart.

 * */

import java.util.Scanner;

public class que9 {

	private boolean seat[][];
	
	public que9(int rows,int cols){
		seat=new boolean[rows][cols];
	}
	
	public void bookSeat(int rows,int cols) {
		if(!seat[rows][cols]) {
			seat[rows][cols]=true;
			System.out.println("Seat ["+(rows+1)+","+(cols+1)+" ] booked Successfully");
		}else {
			System.out.println("Not available ,booked already.");
		}
	}
	public void CancelSeat(int rows,int cols) {
		if(seat[rows][cols]) {
			seat[rows][cols]=true;
			System.out.println("Seat ["+(rows+1)+","+(cols+1)+" ] cancel Successfully");
			
		}else {
			System.out.println("Not Possible to cancel available Seat.");
		}
	}
	 public void displaySeatingChart() {
	        System.out.println("Seating Chart (B = book, A = available):");
	        for (int i = 0; i < seat.length; i++) {
	            for (int j = 0; j < seat[i].length; j++) {
	                System.out.print(seat[i][j] ? "B " : "A ");
	            }
	            System.out.println();
	        }
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		System.out.println("Enter cols:");
		int cols=sc.nextInt();
		
		que9 p=new que9(rows,cols);
		//p.bookSeat(rows, cols);
		//p.CancelSeat(rows, cols);
		//p.menuList();
		//int choice;
		while(true) {
			//Scanner sc=new Scanner(System.in);
			System.out.println("0.Exit");
			System.out.println("1.Book seat");
			System.out.println("2.Cancel seat");
			System.out.println("3.Display:");
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Row between 1 to "+rows+"number:");
				int brows=sc.nextInt()-1;
				System.out.println("Cols between 1 to "+cols+"number:");
				int bcols=sc.nextInt()-1;
				p.bookSeat(brows, bcols);
				break;
				
			case 2:
				System.out.println("Row number:");
				int crows=sc.nextInt()-1;
				System.out.println("Cols number:");
				int ccols=sc.nextInt()-1;
				p.CancelSeat(crows, ccols);
				break;
				
			case 3:
				p.displaySeatingChart();
				break;
				
			case 4:
				System.out.println("Exit.");
				return;
				
			default:
				System.out.println("Invalid");
			}
		}

	}

}