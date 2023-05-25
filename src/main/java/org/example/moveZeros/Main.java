package org.example.moveZeros;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int i = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[i] = n;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
    }
}
