package in_class.ongoing_ca;

public class ArrayUtils {
    public static boolean equalArraysBruteForce(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return true;
    }
}