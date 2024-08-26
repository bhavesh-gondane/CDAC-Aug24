//Write a Java program to demonstrate the use of both pre-increment and post-decrement
//operators in a single expression

class Demo{
	public static void main(String[] args){
		int i=2,n;
		n = i + ++i + i--;
		System.out.println(n);
	}
}