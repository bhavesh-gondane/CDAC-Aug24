/*public class Main {
	public static void main(String[] args) {
		static void displayMessage() {
			System.out.println("Message");
		}
	}
}*/


//error: Inside main method no other method can be defined				 illegal start of expression
//                static void displayMessage() {
//                ^
//snippet22.java:7: error: class, interface, enum, or record expected
//}


public class Main {
	public static void main(String[] args) {
			displayMessage();
			System.out.println("Message");
		}
	static void displayMessage() {
		System.out.println("Message");
	}
}

