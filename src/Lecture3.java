import java.util.Scanner;

public class Lecture3 {

    // parameterized
    private static void sumOneToN(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOneToN(n - 1, sum + n);

    }

    // functional
    private static int sumOneToN(int n) {
        if (n == 0) return 0;
        return n + sumOneToN(n - 1);
    }

    // factorial of a number
    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        // uncomment desired methods to run
//        sumOneToN(n, 0);
//        System.out.println(sumOneToN(n));
//        System.out.println(factorial(n));
    }
}

