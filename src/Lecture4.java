import java.util.Arrays;
import java.util.Scanner;

public class Lecture4 {
    // reverse an array
    private static void reverse(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i + 1, j - 1);
    }

    // check if given string is palindrome
    private static boolean isPalindrome(String string, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (string.charAt(i) != string.charAt(j)) return false;
        return isPalindrome(string, i + 1, j - 1);
    }

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // uncomment desired function calls to run
//        int[] arr = {1, 2, 3};
//        reverse(arr, 0, 2);
//        System.out.println(Arrays.toString(arr));
//        String s = sc.next();
//        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
