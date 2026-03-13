import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sum(n);
        System.out.println(result);
    }
    public static int sum(int n) {
        if (n==1) return 1;
        return (n%10) + sum(n/10);
    }
}
