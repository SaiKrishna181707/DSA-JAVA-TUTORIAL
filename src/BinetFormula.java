public class BinetFormula {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibonacci(n));  // 55
    }

    public static int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;   // (1+√5)/2
        double psi = (1 - sqrt5) / 2;   // (1-√5)/2

        return (int) Math.round(
                (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5
        );
    }
}