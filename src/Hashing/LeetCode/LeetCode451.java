package Hashing.LeetCode;

import java.util.*;

public class LeetCode451 {
    public static void main(String[] args) {
        String s = "tree";
        int[] freq = new int[256];
        HashMap<Character, StringBuilder> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
            map2.putIfAbsent(ch, new StringBuilder());
            map2.get(ch).append(ch);
        }

        List<StringBuilder> list = new ArrayList<>();
        for (Map.Entry<Character, StringBuilder> entry : map2.entrySet()) {
            list.add(entry.getValue());
        }
        list.sort((a, b) -> b.length() - a.length());

        StringBuilder sb = new StringBuilder();
        for (StringBuilder part : list) {
            sb.append(part);
        }

        System.out.println(sb.toString());
    }
}
