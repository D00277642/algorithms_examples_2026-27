package in_class;

import utils.ArrayUtils;
import java.util.Random;

public class TestDisplayArrays {
    static void main(String[] args) {
        int[] nums = new int[10];
        Random rg = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rg.nextInt(100);
        }

        ArrayUtils.displayArray(nums);
        System.out.println("------------------");
        int target = 70;
        int index = ArrayUtils.indexOf(nums, target);
        if(index != -1) {
            System.out.println(target + " found at index " + index);
        }else{
            System.out.println(target + " not found.");
        }

        System.out.println("------------------");
        String[] names = {"Katie", "Jo", "Dan", "Alan", "Noah"};
        ArrayUtils.displayArray(names);
    }
}