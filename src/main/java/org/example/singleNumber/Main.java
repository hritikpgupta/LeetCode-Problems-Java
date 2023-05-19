package org.example.singleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber2(arr));
    }

    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static int singleNumber(int[] nums) {
        if (nums.length > 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                if (map.containsKey(i)) {
                    int val = map.get(i);
                    map.put(i, val + 1);
                } else {
                    map.put(i, 1);
                }
            }
            if (map.containsValue(1)) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() == 1) {
                        return entry.getKey();
                    }
                }
            } else {
                return nums[0];
            }
        }
        return nums[0];
    }
}
