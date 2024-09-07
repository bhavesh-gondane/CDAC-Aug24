package assignment2_sandeep_sir;

public class long_1 {
	public static void main(String[] args) {
		//b:Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).
//		System.out.println("Number of bytes in the Integer type is: "+Long.BYTES);
		
		//c: Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
//		System.out.println("Minimum value of long can be: "+Long.MIN_VALUE);
//		System.out.println("Maximum value of long can be: "+Long.MAX_VALUE);
		
		//d:Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).
//		long number=17234;
//		System.out.println("String value is: "+Long.toString(number));
		
		//e:Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).
//		String strNumber = "1852386";
//		System.out.println("Long value is: "+Long.parseLong(strNumber));
		
		//f:Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).
//		String strNumber = "Ab12Cd3";
//		System.out.println("Long value is: "+Long.parseLong(strNumber));
		//It throws the NumberFormatException because the value of the string must 
		//be in the long type and in its range
		
		//g:Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).
//		long number = 12364;
//		Long wrapper = Long.valueOf(number);
//		System.out.println(wrapper);
		
		//h: Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).
//		String strNumber = "2353366576";
//		Long wrapper = Long.valueOf(strNumber);
//		System.out.println(wrapper);
		
		//i:Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. (Hint: Use Long.sum(long, long)).
//		long a=1123;
//		long b=9845;
//		long sum = Long.sum(a, b);
//		System.out.println(sum);
		
		
		//j:Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).
//		long a=1122;
//		long b=5566;
//		long min=Long.min(a, b);
//		long max=Long.max(a, b);
//		System.out.println("Minimum value is: "+min);
//		System.out.println("Maximum value is: "+max);
		
		
		//k:Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).
		long var=7;
		String binary=Long.toBinaryString(var);
		String octal=Long.toOctalString(var);
		String hexa=Long.toHexString(var);
		System.out.println("Binary string is: "+binary);
		System.out.println("Octal string is: "+octal);
		System.out.println("Hexadecimal string is: "+hexa);

	}
}
