package in_class;

import utils.ArrayUtils;

public class TestDisplayArrays {
    static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }

        ArrayUtils.displayArray(nums);
        System.out.println("------------------");
        String [] text = new String[10];

        for (int i = 0; i < text.length; i++) {
            text[i] = ""+i;
        }
        ArrayUtils.displayArray(text);

    }
}