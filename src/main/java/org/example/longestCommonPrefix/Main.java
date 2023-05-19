package org.example.longestCommonPrefix;

public class Main {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
       // String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs)); // fl
        //System.out.println("flow".indexOf("flower"));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length > 0){
            String prefix = strs[0];
            for(int i = 1; i < strs.length; i++){
                while(strs[i].indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length()-1);
                }
            }
            return prefix;
        }else{
            return "";
        }

    }

}
