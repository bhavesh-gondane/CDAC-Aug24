package assignment2_sandeep_sir;

public class float_1 {

	public static void main(String[] args) {
		//b:Write a program to test how many bytes are used to represent a float value using the BYTES field. (Hint: Use Float.BYTES).
//		System.out.println("Number of bytes in the Integer type is: "+Float.BYTES);
		
		//c: Write a program to find the minimum and maximum values of float using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Float.MIN_VALUE and Float.MAX_VALUE).
//		System.out.println("Minimum value of float can be: "+Float.MIN_VALUE);
//		System.out.println("Maximum value of float can be: "+Float.MAX_VALUE);
		
		//d:Declare a method-local variable number of type float with some value and convert it to a String using the toString method. (Hint: Use Float.toString(float)).
//		float number = 12.433f;
//		System.out.println("String value is: "+Float.toString(number));
		
		//e:Declare a method-local variable strNumber of type String with some value and convert it to a float value using the parseFloat method. (Hint: Use Float.parseFloat(String)).
//		String strNumber = "1234.2453";
//		System.out.println("Float value is: "+Float.parseFloat(strNumber));
		
		//f: Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a float value. (Hint: parseFloat method will throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println("Float value is: "+Float.parseFloat(strNumber));
		//It gives the NumberFormatException because the string value must be of the float value 
		
		//g: Declare a method-local variable number of type float with some value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(float)).
//		float number =123.234f;
//		float wrapper= Float.valueOf(number); 
//		System.out.println(wrapper);
		
		//h: Declare a method-local variable strNumber of type String with some float value and convert it to the corresponding wrapper class using Float.valueOf(). (Hint: Use Float.valueOf(String)).
//		String strNumber = "126.3667";
//		float wrapper = Float.valueOf(strNumber);
//		System.out.println(wrapper);
		
		//i: Declare two float variables with values 112.3 and 984.5, and add them using a method from the Float class. (Hint: Use Float.sum(float, float)).
//		float a=112.3f;
//		float b= 984.5f;
//		float add=Float.sum(a, b);
//		System.out.println(add);
		
		//j:Declare two float variables with values 112.2 and 556.6, and find the minimum and maximum values using the Float class. (Hint: Use Float.min(float, float) and Float.max(float, float)).
//		float a=112.2f;
//		float b=556.6f;
//		float min = Float.min(a, b);
//		float max = Float.max(a, b);
//		System.out.println("Minimum value is: "+min);
//		System.out.println("Maximum value is : "+max);
		
		//k: Declare a float variable with the value -25.0f. Find the square root of this value. (Hint: Use Math.sqrt() method).
//		float a=-25.0f;
//		double sqrt=Math.sqrt((double)a);
//		Math.sqrt(a);
//		System.out.println(sqrt);
		//We used here double because Math.sqrt gives the o/p only in double so we typecast it 
		//and the o/p is NaN because we are taking the negative input.
		
		
		//l:Declare two float variables with the same value, 0.0f, and divide them. (Hint: Observe the result and any special floating-point behavior).
		float a= 0.0f;
		float b= 0.0f;
		float c=a/b;
		System.out.println(c);
		//It gives NaN because on dividing 0/0 it is undefined logically, so NaN is special floating
		//point number in float and double types
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
