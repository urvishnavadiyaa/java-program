package Arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {   // Delay
    public static void main(String[] args) {
        int arr[][]={{1,3},
                     {2,6},
                     {8,10},
                     {15,16}};
        List<Integer> list = new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            if(i == m-1) {
                list.add(arr[i][0],arr[i][1]);
                break;
            }
            if (arr[i][1] >= arr[i + 1][0]) {
                list.add(arr[i][0],arr[i+1][1]);
                continue;
            }
            list.add(arr[i][0],arr[i][1]);
        }
        System.out.println(Arrays.asList(arr));
    }
}
