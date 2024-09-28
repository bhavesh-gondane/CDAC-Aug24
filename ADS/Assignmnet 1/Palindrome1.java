import java.util.Scanner;

class Palindrome1 {
    static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        
        int temp = num; 
        int rev = 0;

        while (num > 0) {
            int rem = num % 10; 
            rev = (rev*10) + rem; 
            num= num/10;
        }
        
        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n1 = sc.nextInt();
        
        boolean result = isPalindrome(n1);
        System.out.println(result);
    }
}
