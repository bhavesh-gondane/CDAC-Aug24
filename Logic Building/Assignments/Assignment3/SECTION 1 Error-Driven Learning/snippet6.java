/*public class MisplacedForLoopBody {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			System.out.println(i);
			System.out.println("Done");
	}
}*/


//error: for loop must be enclosed within curlybraces





public class MisplacedForLoopBody {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			System.out.println(i);
			System.out.println("Done");
	}
	}
}