//Exercise 1.1 Display all elements in a numeric array

package utils;

public class ArrayUtils {
    /**
     * Displays all elements in an integer array and their positions.
     * @param nums the integer array to display
     */
    public static void displayArray(int[] nums) {

        //Start at position 0
        //Keep going while there are more values
        //Move to the next position
        for (int i = 0; i < nums.length; i++) { //Go through each position in the array
            System.out.println(i + ": \"" + nums[i] + "\""); //Print the position and value
    }

}
}
