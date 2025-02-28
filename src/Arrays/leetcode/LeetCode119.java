package Arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public static void main(String[] args) {
        int n=5;
        int arr[][]= new int[n][n];

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0) {
                    temp.add(arr[i][j]);
                }
            }
            list.add(temp);
        }
        System.out.println(list);
    }
}
