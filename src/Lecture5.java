import java.util.Scanner;

public class Lecture5 {

    // TC = 2^n
    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
