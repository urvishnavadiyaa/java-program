package Hashing.Program;

import java.util.HashSet;

public class Check_Subset {
    public static void main(String[] args) {
        int arr[] = {1,4,7,2,3,5,3,1,6,6,8,2,2};
        int arr2[] = {1,4,3,3,6,2};

        HashSet<Integer> hs = new HashSet<>();
        for (int ele : arr) {
            hs.add(ele);
        }
        for (int ele : arr2) {
            if (!hs.contains(ele)) {
                System.out.println("not subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
