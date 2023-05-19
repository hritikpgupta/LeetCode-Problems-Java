package org.example.containsDuplicate;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,7};
        System.out.println(containsDuplicate(num));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> msp = new HashMap<>();
        for (int i : nums) {
            if (msp.containsKey(i)) {
                return true;
            } else {
                msp.put(i, 1);
            }
        }
        return false;
    }
}
