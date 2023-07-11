package org.example.squareRoot;

public class Main {
    public static void main(String[] args) {
        /**
         * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
         * The returned integer should be non-negative as well.
         *
         * Input: x = 4
         * Output: 2
         * Explanation: The square root of 4 is 2, so we return 2.
         *
         * Input: x = 8
         * Output: 2
         * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
         */
        System.out.println(mySqrt(400));
    }
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}
