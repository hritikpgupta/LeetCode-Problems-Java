package org.example.palindrome;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("1234543210"));
    }


    static boolean isPalindrome(String value) {
        int len = value.length();
        for (int i = 0; i < len / 2; i++) {
            if (value.charAt(i) != value.charAt(len - i - 1)) return false;
        }
        return true;
    }
}
