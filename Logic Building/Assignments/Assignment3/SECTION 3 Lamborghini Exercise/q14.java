/* Write a program to print the following pattern:
*
**
***
*****
*******
********* */


class Demo{
    public static void main(String args[]){
        int n;
		for(int i=1;i<=6;i++){
			if(i%2==0&&i>2){
				continue;
				}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}