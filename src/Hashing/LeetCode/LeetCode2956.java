package Hashing.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode2956 {
    public static void main(String[] args) {
        int[] num1 = {2,3,2};
        int[] num2 = {1,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            set1.add(num1[i]);
        }
        for (int i = 0; i < num2.length; i++) {
            set2.add(num2[i]);
        }
        int count1 = 0;
        for (int i = 0; i < num1.length; i++) {
           if (set2.contains(num1[i])) {
               count1++;
           }
        }
        int count2 = 0;
        for (int i = 0; i < num2.length; i++) {
            if (set1.contains(num2[i])) {
                count2++;
            }
        }
        list.add(count1);
        list.add(count2);
        System.out.println(list);
    }
}
