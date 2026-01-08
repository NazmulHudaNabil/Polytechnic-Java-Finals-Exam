// Prime number between 2 to 25

public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        for (i = 2; i <=25; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(i + " ");
            }
        }
    }
}
