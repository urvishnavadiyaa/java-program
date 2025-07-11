package Recursion.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode47 {
    static HashSet<List<Integer>> set = new HashSet<>();
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        List<Integer> l1 = new ArrayList<>();
        for (int ele : arr) {
            l1.add(ele);
        }
        List<Integer> l2 = new ArrayList<>();
        permutation2(l1, l2);
        System.out.println(list);
    }

    private static void permutation2(List<Integer> l1, List<Integer> l2) {
        if (l1.isEmpty()) {
            ans = l2;
            list.add(new ArrayList<>(l2));
            return;
        }

        for (int i = 0; i < l1.size(); i++) {
            int ele = l1.remove(i);
            l2.add(ele);
            if (set.contains(l2)) return;
            permutation2(l1, l2);
            l2.remove(l2.size() - 1);
            l1.add(i, ele);
            set.add(l2);
        }
    }
}