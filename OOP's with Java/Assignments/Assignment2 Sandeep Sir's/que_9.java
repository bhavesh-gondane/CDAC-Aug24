package assignment2_sandeep_sir;
class Test{
	/*QUE 9:- Declare variables of each primitive type as fields of a class and check their default values. (Note: Default values depend on whether the variables are instance variables or static variables).*/
	boolean b;
	byte by;
	short s;
	char c;
	int i;
	float f;
	long l;
	double d;
	
	public void print() {
		System.out.println("Default value of boolean b is: "+b);
		System.out.println("Default value of byte by is: "+by);
		System.out.println("Default value of short s is: "+s);
		System.out.println("Default value of char c is: "+c);
		System.out.println("Default value of int i is: "+i);
		System.out.println("Default value of float f is: "+f);
		System.out.println("Default value of long l is: "+l);
		System.out.println("Default value of double d is: "+d);
		
	}
}
public class que_9 {
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
	}
}
