public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 100, a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + ": ");

        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
