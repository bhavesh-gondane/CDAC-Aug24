/*public class InfiniteForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i--) {
		System.out.println(i);
		}
	}
}*/


//error: This loop runs infinitely because of the decrement operator, the value of i will decrease 
//     and the condition can never be false. 

public class InfiniteForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		System.out.println(i);
		}
	}
}
