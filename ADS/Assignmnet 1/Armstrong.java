import java.util.*; //153
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int res=0;
		while(temp>0){
			int rem=temp%10;
			res=res+rem*rem*rem;
			temp=temp/10;
		}
		if(res==n)
			System.out.println("true");
		else
			System.out.println("false");
	}
}