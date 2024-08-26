public class DecrementingLoop {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 5; i > 0; i--) {
			total = total + i;
			if (i == 3) continue;
			total = total - 1;
		}
		System.out.println(total);
	}
}

//4,7,10,11,[11]