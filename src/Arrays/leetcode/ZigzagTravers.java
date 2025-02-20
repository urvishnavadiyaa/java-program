package Arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagTravers {
    public static void main(String[] args) {
        int arr[][] = {{2, 3, 4},
                {6, 8, 1},
                {9, 7, 5}};
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            if(i % 2 == 0) {
                for (int j=0;j<arr.length;j++) {
                    if(j % 2 == 0) {
//                        System.out.print(arr[i][j]+" ");
                        list.add(arr[i][j]);
                    }
                }
            } else {
                for (int j=arr.length-1;j>=0;j--) {
                    if(j % 2 == 1) {
//                        System.out.print(arr[i][j]+" ");
                        list.add(arr[i][j]);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}