package org.example.happyNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        if (n < 10) {
            return false;
        }
        int result = 0;
        while (n > 0) {
            result += (n % 10) * (n * 10);
            n /= 10;
        }
        return isHappy(result);
    }


}
