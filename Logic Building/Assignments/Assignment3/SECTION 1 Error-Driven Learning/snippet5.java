/*public class WrongInitializationForLoop {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i++) {
			System.out.println(i);
		}
	}
}*/


//error: in place of increment use decrement operator

public class WrongInitializationForLoop {
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
}