/*Write a program to draw the following pattern:
*****
*****
*****
*****
***** */


class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=5;i++){
			for(j=1;j<=4;j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}