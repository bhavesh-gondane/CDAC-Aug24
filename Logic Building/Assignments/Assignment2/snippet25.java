/*public class Switch {
	public static void main(String[] args) {
		double score = 85.0;
		switch(score) {
		case 100:
			System.out.println("Perfect score!");
			break;
		case 85:
			System.out.println("Great job!");
			break;
		default:
			System.out.println("Keep trying!");
		}
	}
}*/

	
//error:  In switch statement the double data type cannot be used 


public class Switch {
	public static void main(String[] args) {
		int score = 85;
		switch(score) {
		case 100:
			System.out.println("Perfect score!");
			break;
		case 85:
			System.out.println("Great job!");
			break;
		default:
			System.out.println("Keep trying!");
		}
	}
}