package Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for (int ele : arr) {
            l1.add(ele);
        }
        List<Integer> l2 = new ArrayList<>();
        subSetArray(list, l1, l2 ,0);
        System.out.println(list);
    }

    private static List<List<Integer>> subSetArray(List<List<Integer>> list, List<Integer> l1, List<Integer> l2, int i) {
        if (l1.isEmpty()) {
            list.add(new ArrayList<>(l2));
            return list;
        }
        int e = l1.remove(i);
        l2.add(e);
        subSetArray(list, l1, l2, i+1);
        l2.remove(l2.size()-1);
        l1.add(i, e);
        subSetArray(list, l1, l2, i+1);
        return list;
    }
}
