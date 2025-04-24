package Hashing.LeetCode;

import java.util.HashSet;

public class LeetCode1832 {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        if (hs.size() < 26) {
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }
}
