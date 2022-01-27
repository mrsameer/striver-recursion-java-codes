import java.util.Scanner;

/**
 * print first n numbers recursively
 */
public class Lecture1 {
    private static void solve(int n) {
        if (n == 0) return;
        solve(n - 1);
        System.out.println(n);
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        solve(n);
    }
}
