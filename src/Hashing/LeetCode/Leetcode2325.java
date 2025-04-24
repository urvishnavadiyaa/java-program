package Hashing.LeetCode;

import java.util.*;

public class Leetcode2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String mess = "vkbs bs t suepuv";

        HashMap<Character, Character> map = new HashMap<>();
        char ch1= 'a';

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !map.containsKey(ch)) {
                map.put(ch, ch1);
                ch1++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mess.length(); i++) {
            char ch = mess.charAt(i);
            if (ch == ' ') {
                sb.append(' ');
            } else {
                sb.append(map.get(ch));
            }
        }

        System.out.println(sb.toString());
    }
}
