class grade{
	public static void main(String[] args){
		int sc=78;
		if(sc>=90){
			System.out.println("Grade A");
		}
		else if(sc>=80 && sc<=89){
			System.out.println("Grade B");
		}
		else if(sc>=70 && sc<=79){
			System.out.println("Grade C");
		}
		else if(sc>=60 && sc<=69){
			System.out.println("Grade D");
		}
		else{
			System.out.println("F");
		}
	}
}