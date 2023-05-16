package org.example.plusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         * Explanation: The array represents the integer 4321.
         * Incrementing by one gives 4321 + 1 = 4322.
         * Thus, the result should be [4,3,2,2].
         *
         * Input: digits = [9]
         * Output: [1,0]
         * Explanation: The array represents the integer 9.
         * Incrementing by one gives 9 + 1 = 10.
         * Thus, the result should be [1,0].
         */
        int[] digits = {5,6,2,9,0};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne2(digits)));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            int val = 1 + digits[digits.length - 1];
            digits[digits.length - 1] = val;
            return digits;
        }else{
            StringBuilder stringBuilder = new StringBuilder();
            for(int i : digits){
                stringBuilder.append(i);
            }
            int number = Integer.parseInt(stringBuilder.toString()) + 1;
            return Integer.toString(number).chars().map(c -> c-'0').toArray();
        }
    }
    public static int[] plusOne2(int[] digits){
        int len = digits.length;
        for (int i = len -1 ; i >= 0 ; i --){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0 ;
            }
        }
        int result [] = new int[len + 1];
        result[0] = 1;
        return result;

    }
}
