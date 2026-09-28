//Exercise 1.1 Display all elements in a numeric array

package utils;

public class ArrayUtils {
    /**
     * Displays all elements in an integer array and their positions.
     * @param nums the integer array to display
     */
    public static void displayArray(String [] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ") " + data[i]);
        }
    }
}
