package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode2149 {
    public static void main(String[] args) {
        int arr[] = {-2,3,-4,1,-7,4,-1,2};
        int arr2[]=new int[arr.length];
        int p1=0;
        int p2=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr2[p1] = arr[i];
                p1+=2;
            } else {
                arr2[p2] = arr[i];
                p2+=2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
