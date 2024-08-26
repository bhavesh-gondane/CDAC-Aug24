/*
Write a program to print the following pattern:
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/


class Demo{
	public static void main(String[] args){
		int i,j;
		for(i=0;i<=5;i++){
			for(j=0;j<9;j++){
				if(j<i){
					System.out.print("  ");
				}
				else if(j<9-i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		for (i=3;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print("  ");
            }
            for(j=0;j<9-(2*i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}