package Hashing.Program;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2,5,8,7,11};
        int sum = 13;
        HashSet<Integer> hs = new HashSet<>();

        for (int ele : arr) {
            int diff = sum - ele;
            if (hs.contains(diff)){
                System.out.println((sum - ele) + " " + ele);
                return;
            } else {
                hs.add(ele);
            }
        }
        System.out.println("pair not sound");
    }
}
