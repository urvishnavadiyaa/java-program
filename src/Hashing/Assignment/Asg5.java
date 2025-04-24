package Hashing.Assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Asg5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {3,4,5,6};

        HashSet<Integer> set = new HashSet<>();
        for (int ele : a) {
            set.add(ele);
        }
        ArrayList<Integer> al = new ArrayList<>();
         for (int ele : b) {
             if (set.contains(ele)) {
                 set.remove(ele);
                 al.add(ele);
             }
         }
        System.out.println(al);
    }
}
