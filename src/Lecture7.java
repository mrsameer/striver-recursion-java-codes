import java.util.LinkedList;
import java.util.Scanner;

public class Lecture7 {
    private static void printSubSequencesWhoseSumIsK(int[] arr, int idx, LinkedList<Integer> lst, int sum, int k) {
        if (idx >= arr.length) {
            if (sum == k) {
                System.out.println(lst);
            }
            return;
        }

        // 2 steps
        // 1. take it
        lst.add(arr[idx]);
        sum += arr[idx];
        printSubSequencesWhoseSumIsK(arr, idx + 1, lst, sum, k);

        //2. not take it
        sum -= lst.getLast();
        lst.removeLast();
        printSubSequencesWhoseSumIsK(arr, idx + 1, lst, sum, k);

    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        printSubSequencesWhoseSumIsK(arr, 0, new LinkedList<>(), 0, k);
    }
}
