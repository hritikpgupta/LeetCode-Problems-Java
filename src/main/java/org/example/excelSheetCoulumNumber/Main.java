package org.example.excelSheetCoulumNumber;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }


    public static int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
