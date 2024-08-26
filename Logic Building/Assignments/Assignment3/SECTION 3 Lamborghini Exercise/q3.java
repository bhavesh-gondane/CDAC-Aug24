//Write a program to print all multiples of 7 between 1 and 100.

class Demo{
	public static void main(String[] args){
		int i;
		for(i=1;i<=100;i++){
			if(i%7==0){
				System.out.println(i);
			}
		}
	}
}