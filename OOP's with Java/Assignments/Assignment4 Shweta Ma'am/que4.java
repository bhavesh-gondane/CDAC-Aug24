package assignment4_dt4_9_9_shweta_maam;
/*4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  and prints the result.
 * */
public class que4 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		double sum1 = n1+n2;
		System.out.println("Addition is: "+sum1);
		
		float sum2=n1+n2;
		System.out.println("Addition is: "+sum2);
		
//		boolean sum3=(boolean)n1+(boolean)n2;		//We cannont cast from int to boolean
		
		String sum3 = Integer.toString(n1) + Integer.toString(n2);
		System.out.println("Addition is: "+sum3);	//1020
	}
}
