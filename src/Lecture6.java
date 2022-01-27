import java.util.LinkedList;
import java.util.Scanner;

/**
 * Print all subsequences
 */
public class Lecture6 {

    // TC = O(2 ^ n)
    // SC = O(N)
    private static void printSubSequences(int[] arr, LinkedList<Integer> lst, int idx) {
        if (idx >= arr.length) {
            System.out.println(lst);
            return;
        }

        // 2 steps

        // 1. take it
        lst.add(arr[idx]);
        printSubSequences(arr, lst,idx + 1);

        // 2. avoid it (in last call we added, so we remove it) (not take)
        lst.removeLast();
        printSubSequences(arr, lst, idx + 1);
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubSequences(arr, new LinkedList<>(), 0);
    }
}
