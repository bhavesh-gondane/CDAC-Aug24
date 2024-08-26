/*public class OffByOneDoWhileLoop {
	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.println(num);
			num--;
		} while (num > 0);
	}
}*/





public class OffByOneDoWhileLoop {
	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.println(num);
			num++;
			if(num==6) break;
		} while (num > 0);
	}
}