/*
Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
*/

class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=5;i>=1;i--){
			for(j=5;j>=i;j--){
				if(j!=i){
					System.out.print(j+"*");
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}