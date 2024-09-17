package assignment4_dt4_9_9_shweta_maam;
/*3) Write a program that performs arithmetic operations involving different data types (int, double, float) and observes how Java handles widening conversions automatically.
 * */
public class que3 {
	public static void main(String[] args) {
		int n1 = 10;
		double n2 = 20;
		float n3 = 30;
		
		int res = n1 + (int)n2 + (int)n3;
		System.out.println("Addition is: "+res);
		
		float res1 = n1+(float)n2+n3;
		System.out.println("Addition is: "+res1);
		
		double res2=n1+n2+n3;
		System.out.println("Addition is: "+res2);
	}
}
