//Write a program to find and print the largest digit in the number 4825.
class Demo{
	public static void main(String[] args){
		int n;
		int largest=0;
		for(n=4825;n>0;n=n/10){
			int rem=n%10;
			if(rem>largest){
				largest=rem;
			}			
		}
		System.out.println(largest);
	}
}