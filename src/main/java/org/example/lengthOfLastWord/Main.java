package org.example.lengthOfLastWord;

public class Main {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        char[] charArray = s.trim().toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                return charArray.length - 1 - i;
            }
        }
        return charArray.length;
    }
}
