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
        int sum = 0;
        System.out.println("Array Length : "+arr.length);
        while(arr.length == 1){
            sum = Character.getNumericValue(arr[0]);
            arr = String.valueOf(sum).toCharArray();
            System.out.println("Array Length : "+arr.length);
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 334121;
        System.out.println(addDigits2(num));
    }
}
