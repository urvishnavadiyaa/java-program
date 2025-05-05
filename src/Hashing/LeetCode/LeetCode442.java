package Hashing.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list  = new ArrayList<>();
        for (int ele : arr) {
            if (set.contains(ele)) {
                list.add(ele);
            } else {
                set.add(ele);
            }
        }
        System.out.println(list);
    }
}
