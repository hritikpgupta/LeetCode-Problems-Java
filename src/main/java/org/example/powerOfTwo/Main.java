package org.example.powerOfTwo;

public class Main {
    public static void main(String[] args) {
        /**
         * Given an integer n, return true if it is a power of two. Otherwise, return false.
         *
         * An integer n is a power of two, if there exists an integer x such that n == 2x.
         */
        System.out.println(16);
        System.out.println(12);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n == 0 ){
            return false;
        }
        if ( n == 1){
            return true;
        }
        if(n % 2  !=0 ){
            return false;
        }

        return isPowerOfTwo(n/2);
    }
}
