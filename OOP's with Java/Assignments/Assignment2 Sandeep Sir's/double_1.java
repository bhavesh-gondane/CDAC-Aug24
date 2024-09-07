package assignment2_sandeep_sir;

public class double_1 {

	public static void main(String[] args) {
		//b. Write a program to test how many bytes are used to represent a double value using the BYTES field. (Hint: Use Double.BYTES).
//		System.out.println("Number of bytes in the Integer type is: "+Double.BYTES);
		
		//c:Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).
//		System.out.println("Minimum value of double can be: "+Double.MIN_VALUE);
//		System.out.println("Maximum value of double can be: "+Double.MAX_VALUE);
		
		//d:. Declare a method-local variable number of type double with some value and convert it to a String using the toString method. (Hint: Use Double.toString(double)).
//		double number = 23445225;
//		System.out.println("String value is:"+Double.toString(number));
		
		//e: Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).
//		String strNumber = "18532";
//		System.out.println("Double values is: "+Double.parseDouble(strNumber));
		
		//f: . Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. (Hint: parseDouble method will throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println("Double values is: "+Double.parseDouble(strNumber));
		//It also gives NumberFormatException
		
		//g:Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).
//		double number= 126567;
//		System.out.println(Double.valueOf(number));
		
		
		//h:Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).
//		String strNumber = "12.2435";
//		System.out.println(Double.valueOf(strNumber));
		
		//i: Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. (Hint: Use Double.sum(double, double)).
		//112.3 and 984.5
//		double a= 112.3;
//		double b= 984.5;
//		double add=Double.sum(a, b);
//		System.out.println(add);
		
		//j:Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).
//		double a= 112.2;
//		double b= 556.6;
//		System.out.println("Minimum value is: "+Double.min(a, b));
//		System.out.println("Maximum value is: "+Double.max(a, b));
		
		
		//k: Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt() method).
//		double a=-25.0;
//		double sqrt=Math.sqrt(a);
//		System.out.println(sqrt);
		//It give NaN because of the negative value. We cannot find the sqrt of negative 
		//value logically
		
		//l: Declare two double variables with the same value, 0.0, and divide them. (Hint: Observe the result and any special floating-point behavior).
		double a= 0.0;
		double b= 0.0;
		double c=a/b;
		System.out.println(c);
		//It gives NaN because on dividing 0/0 it is undefined logically, so NaN is special floating
		//point number in float and double types
		
		
		
		
		
		
		
	}

}
