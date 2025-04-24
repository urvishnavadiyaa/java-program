package Hashing.LeetCode;

import java.util.HashSet;

public class LeetCode2367 {
    public static void main(String[] args) {
        int[] arr = {0,1,4,6,7,10};
        int diff = 3;
        HashSet<Integer> hs = new HashSet<>();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i] - diff) && hs.contains(arr[i] - (2*diff))) {
                hs.add(arr[i]);
                c++;
            } else {
                hs.add(arr[i]);
            }
        }
        System.out.println(c);
    }
}
