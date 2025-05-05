package Hashing.LeetCode;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;

public class Leetcode3121 {
    public static void main(String[] args) {
        String word = "AbBCab";
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                set.add(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lower = (char)(ch + 32);
                if (set.contains(lower) && !set.contains(ch)) {
                    count++;
                    set.add(ch);
                }
            }
        }
        System.out.println(count);
    }
}
