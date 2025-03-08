package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode2523 {
    public static void main(String[] args) {
        int arr[]=new int[2];
        int left=10;
        int right=12;
        int k=0;
        while (left != right) {
            int i=2;
            while (i<left) {
                if(left % i == 0) {
                    left++;
                    continue;
                }
                i++;
            }
            arr[k] = left;
            k++;
            if(arr[arr.length-1] != 0) {
                break;
            }
            left++;
        }
        if(arr[arr.length-1] == 0) {
            System.out.println(-1 + " , " + -1);
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }
}
