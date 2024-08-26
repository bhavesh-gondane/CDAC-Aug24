/*Write a program to print the following pattern:
11111
22222
33333
44444
55555

*/

class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=5;j++){
				System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();
		}
	}
}