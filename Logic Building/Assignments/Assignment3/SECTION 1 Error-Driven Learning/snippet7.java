/*public class UninitializedWhileLoop {
	public static void main(String[] args) {
		int count;
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
}*/




//error: count should be initialized




public class UninitializedWhileLoop {
	public static void main(String[] args) {
		int count=0;
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
}