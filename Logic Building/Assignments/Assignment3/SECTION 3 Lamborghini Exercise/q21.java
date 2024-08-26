/*
Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
*/


class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=9;i+=2){
			for(j=1;j<=i;j+=2){
				
				if(i==j){
					System.out.print(j);
					
				}
				else{
					System.out.print(j+"*");
				}
			}
			System.out.println();
		}
	}
}