/*Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
*/


class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				if(j==i){
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