package Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int num : arr) {
            l1.add(num);
        }
        permutation1(list, l1, l2);
        System.out.println(list);
    }

    private static void permutation1(List<List<Integer>> list, List<Integer> l1, List<Integer> l2) {
        if (l1.isEmpty()) {
            list.add(new ArrayList<>(l2));
            return;
        }

        for (int i = 0; i < l1.size(); i++) {
            int ele = l1.remove(i);
            l2.add(ele);
            permutation1(list, l1, l2);
            l2.remove(l2.size() - 1);
            l1.add(i, ele);
        }
    }
}
/*

package Recursion.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode47 {
    static HashSet<List<Integer>> set = new HashSet<>();
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        List<Integer> l1 = new ArrayList<>();
        for (int ele : arr) {
            l1.add(ele);
        }
        List<Integer> l2 = new ArrayList<>();
        permutation2(l1, l2);
        System.out.println(set);
    }

    private static void permutation2(List<Integer> l1, List<Integer> l2) {
        if (l1.isEmpty()) {
            set.add(new ArrayList<>(l2));
            return;
        }

        for (int i = 0; i < l1.size(); i++) {
            int ele = l1.remove(i);
            l2.add(ele);
            permutation2(l1, l2);
            l2.remove(l2.size()-1);
            l1.add(i, ele);
        }
    }
}

*/