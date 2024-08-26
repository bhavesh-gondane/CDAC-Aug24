/*public class IncorrectWhileLoopControl {
	public static void main(String[] args) {
		int num = 10;
		while (num != 10) {
			System.out.println(num);
			num--;
		}
	}
}*/


//error: condn should always be in boolean i.e true or false
//    there must be == or != condn



public class IncorrectWhileLoopControl {
	public static void main(String[] args) {
		int num = 10;
		while (num == 10) {
			System.out.println(num);
			num--;
		}
	}
}