package org.example.addDigitsUntilOne;

public class Main {

    public static int addDigits2(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 1 + ((num - 1) % 9);
        }
    }
    public static int addDigits(int num) {
        if (num < 10)
            return num;
        char [] arr = String.valueOf(num).toCharArray();
        int sum ;

        do {
            sum = 0;
            for (char c : arr) {
                sum += Character.getNumericValue(c);
            }
            arr = String.valueOf(sum).toCharArray();
        }while (sum > 9);


        return sum;
    }
    public static void main(String[] args) {
        int num = 334121;
        System.out.println(addDigits2(num));
        System.out.println("-----");
        System.out.println(addDigits(num));
    }
}
