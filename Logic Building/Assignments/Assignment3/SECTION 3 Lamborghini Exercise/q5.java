//Write a program to print the Fibonacci sequence up to the number 21.

class Demo{
	public static void main(String[] args){
		int n1=0,n2=1,i;
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<=21;i++){
			int n3=n1+n2;
			System.out.println(n3);
			if(n3==21){
				break;
			}
			n1=n2;
			n2=n3;
		}
	}
}

//0 1 
//0 1 1 2 3 5 8 13 21