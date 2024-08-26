/*
Write a program to print the following pattern:
1
22
333
4444
55555

*/

class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}