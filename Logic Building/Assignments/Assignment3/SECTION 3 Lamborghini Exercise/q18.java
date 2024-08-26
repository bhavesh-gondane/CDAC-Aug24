/* Write a program to print the following pattern:
*
***
*****
*******
*****
***		2*i-1	n=4
*
*/


class Demo{
	public static void main(String[] args){
		int i,j;
		for (i=0;i<4;i++){
            for(j=0;j<3-i;j++){
                System.out.print("  ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=2;i>=0;i--){
            for(j=0;j<3-i;j++){
                System.out.print("  ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}