package org.example.removeDuplicatesFromSortedArray;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int counter = 0;
        for (Integer i : set){
            arr[counter] = i;
            counter++;
        }
        System.out.println(set);
        System.out.println(Arrays.toString(arr));
    }
}
