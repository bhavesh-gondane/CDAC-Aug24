package assignment5_dt4_12_9_shweta_maam;

import java.util.Scanner;

/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.
 * */

class BankAccount{
	private int bal=0;
	private int dep;
	public int withd;
	
	private static Scanner sc = new Scanner(System.in);
	public void deposit() {
		System.out.println("ENter the amount to be deposited: ");
		this.dep=sc.nextInt();
		this.bal=bal+dep;
		System.out.println("Available balance is: "+bal);
	}
	
	public void withdraw() {
		System.out.println("Enter the amount to be withdrwan: ");
		this.withd=sc.nextInt();
		this.bal=bal-withd;
		System.out.println("Available balance is: "+bal);
	}
}

class SavingsAccount extends BankAccount{
	@Override
	public void withdraw() {
		if(withd>10000) {
			System.out.println("Cannot withdraw above 10000");
		}
	}
}
public class que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		SavingsAccount sa = new SavingsAccount();
		
		
		switch(choice) {
		case 1:
			sa.deposit();
			break;
		case 2:
			sa.withdraw();
		}
	}
}
