import java.util.*;
class Fibonacci{
	
	static int fb(int n){
		if(n<=1){
			return n;
		}
		return fb(n-1)+fb(n-2); 
	} 
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		
		int num=n1;
		
		for(int i=0;i<=num;i++){
			System.out.print("["+fb(i)+", ");
		}
	}
}