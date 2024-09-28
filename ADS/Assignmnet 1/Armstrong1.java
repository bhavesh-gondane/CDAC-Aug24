import java.util.*;
class Armstrong1{
	static int res=0;
	
	
		static boolean show(int n1){
			int temp=n1;
			while(temp>0){
			int rem=temp%10;
			res=res+rem*rem*rem;
			temp=temp/10;
			show(temp);
		}
		if(res==temp)
		return true;
	else
		return false;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(show(n));
	}
}