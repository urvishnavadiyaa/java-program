package Hashing.Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Asg1 {
    public static void main(String[] args) {
        String s = "Java is great. Java is fast.";
        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                sb.append(Character.toLowerCase(ch));
            }
            if ((ch == ' ' || i == s.length()-1) && !sb.isEmpty()) {
                if (map.containsKey(sb.toString())) {
                    map.put(sb.toString(), map.getOrDefault(sb.toString(),0) + 1);
                } else {
                    map.put(sb.toString(),1);
                }
                sb = new StringBuilder();
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
