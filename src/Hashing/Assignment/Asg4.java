package Hashing.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Asg4 {
    public static void main(String[] args) {
        String[] str = {"hi", "hello", "hey", "welcome", "How"};
        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String s : str) {
            int len = s.length();
            if (map.containsKey(len)) {
                map.get(len).add(s);
            } else {
                map.put(len, new ArrayList<>());
                map.get(len).add(s);
            }
        }
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.print(entry+" ");
        }
    }
}
