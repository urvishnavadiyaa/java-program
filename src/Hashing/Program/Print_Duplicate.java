package Hashing.Program;

import java.util.HashSet;

public class Print_Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,4,7,2,3,5,3,1,6,6,8,2,2};
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int ele : arr) {
            if (hs.contains(ele)) {
                dup.add(ele);
            } else {
                hs.add(ele);
            }
        }
        for (int ele : dup) {
            System.out.print(ele+" ");
        }
    }
}
