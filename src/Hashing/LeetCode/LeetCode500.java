package Hashing.LeetCode;

import java.util.*;

public class LeetCode500 {
    static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(1, "qwertyuiop");
        map.put(2, "asdfghjkl");
        map.put(3, "zxcvbnm");
    }

    public static void main(String[] args) {
        LeetCode500 obj = new LeetCode500();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = obj.findWords(words);
        System.out.println(Arrays.toString(result));
    }

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (checkInOneRow(word.toLowerCase())) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }

    public boolean checkInOneRow(String word) {
        for (String row : map.values()) {
            boolean allMatch = true;
            for (char ch : word.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) return true;
        }
        return false;
    }
}
