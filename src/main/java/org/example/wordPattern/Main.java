package org.example.wordPattern;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (words.length != pattern.length())
            return false;
        int i = 0;
        for (char c : pattern.toCharArray()) {
            boolean containsKey = map.containsKey(c);
            if (map.containsValue(words[i]) && !containsKey)
                return false;
            if (containsKey && !map.get(c).equals(words[i]))
                return false;
            else
                map.put(c, words[i]);
/*            if (map.containsKey(c)) {
                if (!Objects.equals(map.get(c), words[i])) {
                    return false;
                }
            } else {
                map.put(c, words[i]);
            }*/
            i++;
        }
        return true;
    }
}
