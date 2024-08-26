//Write a program to find and print the first 5 prime numbers.

class Demo{
	public static void main(String[] args){
		int i;
		int count=0;
		System.out.println("2");
		System.out.println("3");
		for(i=4;i>=count;i++){
			if(i%1==0 && i%i==0 && i%2!=0 && i%3!=0){
				System.out.println(i);
				count++;
			}
			if(count==3){
				break;
			}	
		}
	}
}