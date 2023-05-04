package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int target = 5;
        int output = list.size();
        if (list.contains(target)){
            output = list.indexOf(target);
        }else{
            for (int i = 0 ; i < list.size() ; i++){
                if (list.get(i) > target){
                    output = i;
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
