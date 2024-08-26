/*public class IncorrectWhileCondition {
    public static void main(String[] args) {
		int count = 5;
		while (count = 0) {
			System.out.println(count);
			count--;
		}
	}
}*/



//error: the condition should always be true or false only, assignment cannot be done in condition part
//       of while statement(Either we can use == or !=)



public class IncorrectWhileCondition {
    public static void main(String[] args) {
		int count = 5;
		while (count != 0) {
			System.out.println(count);
			count--;
		}
	}
}