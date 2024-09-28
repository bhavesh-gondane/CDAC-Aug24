import java.util.*;
class Factorial{
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n1=sc.nextInt();
			System.out.println(fact(n1));//call for method
	}
}