package in_class.ongoing_ca;
import java.util.Arrays;

public class ArrayUtils {
    /**
     * Checks if two arrays contain the same values,
     * regardless of their order.
     * @param a the first array
     * @param b the second array
     * @return true if the arrays contain the same values, otherwise false
     */
    public static boolean equalArraysBruteForce(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        boolean[] matched = new boolean[b.length];

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && matched[j] == false) {
                    matched[j] = true;
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * check if two arrays contain the same values using sorting
     *
     * @param a the first array
     * @param b the second array
     * @return true if the arrays contain the same values, otherwise false
     */
    public static boolean equalArraysTwoPointer(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        Arrays.sort(copyA);
        Arrays.sort(copyB);

        for (int i = 0; i < copyA.length; i++) {
            if (copyA[i] != copyB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(equalArraysBruteForce(
                new int[]{1, 2, 3}, new int[]{3, 1, 2}));

        System.out.println(equalArraysBruteForce(
                new int[]{1, 2, 3}, new int[]{1, 2, 4}));

        System.out.println(equalArraysBruteForce(
                new int[]{1, 1, 2}, new int[]{1, 2, 2}));

        System.out.println(equalArraysTwoPointer(
                new int[]{1, 2, 3}, new int[]{3, 1, 2}));

        System.out.println(equalArraysTwoPointer(
                new int[]{1, 2, 3}, new int[]{1, 2, 4}));

        System.out.println(equalArraysTwoPointer(
                new int[]{1, 1, 2}, new int[]{1, 2, 2}));
    }
}