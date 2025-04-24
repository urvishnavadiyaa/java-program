package Hashing.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Asg3 {

    public static void main(String[] args) {
        String[] s = {"bdddddddddd","bbbbbbbbbbc"};
        HashMap<String , List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
         for (String s1 : s) {
            int freq[] = new int[26];

            for (int i = 0; i < s1.length(); i++) {
                freq[s1.charAt(i) - 'a']++;
            }
            StringBuilder sb  = new StringBuilder();
            for (int i = 0; i < freq.length; i++) {
                sb.append('#');
                sb.append(freq[i]);
            }
            String str = sb.toString();
            if (!map.containsKey(str)) {
                map.put(str , new ArrayList<>());
            }
            map.get(str).add(s1);
        }
        for (Map.Entry<String , List<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
            System.out.print(entry.getValue()+" ");
        }
    }
}

