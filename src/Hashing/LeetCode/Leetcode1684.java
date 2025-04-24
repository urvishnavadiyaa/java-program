package Hashing.LeetCode;

import java.util.HashSet;

public class Leetcode1684 {
    public static void main(String[] args) {
        String s = "ab";
        String[] str = {"ad","bd","aaab","baa","badab"};

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        int count = 0;
        for (String s1 : str) {
            for (int i = 0; i < s1.length(); i++) {
                if (!set.contains(s1.charAt(i))) {
                    break;
                }
                if (i == s1.length()-1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
