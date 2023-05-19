package org.example.majorityElement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,7};
        System.out.println(majorityElement(num));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}
