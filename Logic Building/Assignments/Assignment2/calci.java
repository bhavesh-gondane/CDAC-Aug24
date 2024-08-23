class calc{
	public static void main(String[] args){
		char ch='/';
		switch(ch){
			case '+':{
				int a=2;
				int b=2;
				int c=a+b;
				System.out.println(c);
				break;	
			}
			case '-':{
				int a=12;
				int b=11;
				int c=a-b;
				System.out.println(c);
				break;
			}
			case '*':{
				int a=12;
				int b=11;
				int c=a*b;
				System.out.println(c);
				break;
			}
			case '/':{
				int a=12;
				int b=0;
				
				if(b==0){
					System.out.println("Error");
				}
				else{
					int c=a/b;
					System.out.println(c);
				}
				break;
			}
			default:{
				System.out.println("Invalid input");
			}
		}
	}
}