package Hashing.Program;

import java.util.HashSet;

public class Distinct_Element {
    public static void main(String[] args) {
        int arr[] = {1,4,7,2,3,5,3,1,6,8,2,2};
        HashSet<Integer> hs = new HashSet<>();
        for (int ele : arr) {
            hs.add(ele);
        }
        for (int ele : hs) {
            System.out.print(ele+" ");
        }
    }
}
