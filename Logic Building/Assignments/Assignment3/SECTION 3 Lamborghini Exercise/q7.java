//Write a program to calculate the sum of the digits of the number 9876. The output should be
//30 (9 + 8 + 7 + 6).

class Demo{
	public static void main(String[] args){
		int i;
		int sum=0;
		for(i=9876;i>0;i=i/10){
			int rem=i%10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}