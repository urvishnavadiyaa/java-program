package Hashing.LeetCode;

import java.util.HashSet;

public class LeetCode771 {
    public static void main(String[] args) {
        String jew = "aA";
        String stone = "aAAbbbb";
        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < jew.length(); i++) {
            hs.add(jew.charAt(i));
        }
        for (int i = 0; i < stone.length(); i++) {
            if (hs.contains(stone.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
