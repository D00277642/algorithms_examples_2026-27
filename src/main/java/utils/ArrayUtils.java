//Exercise 1.1 Display all elements in a numeric array

package utils;

public class ArrayUtils {
    /**
     * Displays all elements in an integer array and their positions.
     * @param data the integer array to display
     */
    public static void displayArray(int [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ") " + data[i]);
        }
    }

    public static int indexOf(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
