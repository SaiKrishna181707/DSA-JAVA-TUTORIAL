import java.util.Scanner;

public class Leetcode9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {

        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int rem = x % 10;
            reversed = reversed * 10 + rem;
            x = x / 10;
        }

        return reversed == original;
    }
}