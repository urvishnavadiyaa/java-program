package Hashing.LeetCode;

import java.util.*;

public class LeetCode205 {
    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "bar";

        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i), char2 = s2.charAt(i);
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    System.out.println("false");
                    return;
                }
            }
            else {
                if (set2.contains(char2)){
                    System.out.println("false");
                    return;
                }
                map1.put(char1, char2);
                set2.add(char2);
            }
        }
        System.out.println("true");    }
}
