package Arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {   // Delay
    public static void main(String[] args) {
        int arr[][]={{1,4},
                     {4,5}};
        int m=arr.length;
        int n=arr[0].length;
        int met[][]=new int[m][n];
        int idx=0;
        if (arr.length == 1) {
            System.out.println("[" + arr[0] + ',' + arr[1] + "]");
            return;
        }
        for (int i = 1; i < m; i++) {
            int idx2=i;
            while (arr[i][0] <= arr[i-1][1] && i < arr.length-1) {
                i++;
            }
            met[idx][0] = arr[idx2-1][0];
            met[idx][1] = arr[i-1][1];
            idx++;
            if (i == arr.length-1) {
                met[idx][0] = arr[idx2][0];
                met[idx][1] = arr[idx2][1];
            }
        }
        for (int i = 0; i < met.length; i++) {
            for (int j = 0; j < met[0].length; j++) {
                System.out.print(met[i][j] + " ");
            }
            System.out.println();
        }
    }
}
