import java.util.Scanner;

public class Lecture2 {

    // TC = O(N), SC = O(N)
    private static void printNameNTimes(int n) {
        // base case
        if (n == 0) return;

        // do something
        System.out.println("name");

        // recursive case
        printNameNTimes(n - 1);
    }

    // TC = O(N), SC = O(N), (Backtracking)
    private static void printOneToN(int n) {
        // base case
        if (n == 0) return;

        // recursive case
        printOneToN(n - 1);

        // do something
        System.out.println(n);
    }

    // TC = O(N), SC = O(N)
    private static void printNToOne(int n) {
        // base case
        if (n == 0) return;

        // do something
        System.out.println(n);

        // recursive case
        printNToOne(n - 1);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        // uncomment desired function call to run
//        printNameNTimes(n);
//        printOneToN(n);
//        printNToOne(n);
    }
}
