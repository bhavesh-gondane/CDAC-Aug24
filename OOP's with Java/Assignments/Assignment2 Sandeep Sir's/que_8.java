package assignment2_sandeep_sir;

public class que_8 {

	public static void main(String[] args) {
		/*QUE 8:-Initialize a variable of each primitive type with a user-defined value and convert it into String:
o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).
		 */
		
		
		boolean b=true;
		byte by=2;
		short s=28;
		char c = 'A';  
		int i=12;
		float f=1.2f;
		long l=21311;
		double d=123.425;
		
		//Using wrapper classes, toString() Method
		System.out.println("The values of the defined primitive data types into String are as follows:");
		System.out.println();
		System.out.println("Value of boolean b after coversion into string using wrapper class is: "+Boolean.toString(b));
		System.out.println("Value of byte by after coversion into string using wrapper class is: "+Byte.toString(by));
		System.out.println("Value of short s after coversion into string using wrapper class is: "+Short.toString(s));
		System.out.println("Value of char c after coversion into string using wrapper class is: "+Character.toString(c));
		System.out.println("Value of int i after coversion into string using wrapper class is: "+Integer.toString(i));
		System.out.println("Value of float f after coversion into string using wrapper class is: "+Float.toString(f));
		System.out.println("Value of long l after coversion into string using wrapper class is: "+Long.toString(l));
		System.out.println("Value of double d after coversion into string using wrapper class is: "+Double.toString(d));
		
		//Using valueOf() method of String class 
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Values of defined fata types using valueOf method of String class is:");
		System.out.println();
		System.out.println("Value of boolean b after coversion into string using String class is: "+String.valueOf(b));
		System.out.println("Value of byte by after coversion into string using String class is: "+String.valueOf(by));
		System.out.println("Value of short s after coversion into string using String class is: "+String.valueOf(s));
		System.out.println("Value of char c after coversion into string using String class is: "+String.valueOf(c));
		System.out.println("Value of int i after coversion into string using String class is: "+String.valueOf(i));
		System.out.println("Value of float f after coversion into string using String class is: "+String.valueOf(f));
		System.out.println("Value of long l after coversion into string using String class is: "+String.valueOf(l));
		System.out.println("Value of double d after coversion into string using String class is: "+String.valueOf(d));
		
		
		
		
		
	}

}
