/*public class Switch {
	public static void main(String[] args) {
		int number = 5;
		switch(number) {
		case 5:
			System.out.println("Number is 5");
			break;
		case 5:
			System.out.println("This is another case 5");
			break;
		default:
			System.out.println("This is the default case");
		}
	}
}*/


//error: duplicate case label error    In switch statement case cannot be of same number




public class Switch {
	public static void main(String[] args) {
		int number = 5;
		switch(number) {
		case 5:
			System.out.println("Number is 5");
			break;
		case 6:
			System.out.println("This is another case 5");
			break;
		default:
			System.out.println("This is the default case");
		}
	}
}