import java.util.*;
class SquareRoot{
    static int sqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;
		
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
        System.out.print(sqrt(n));
    }
}
