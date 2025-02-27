package Arrays.leetcode;

import java.util.*;

public class LeetCode31 {
    public static void main(String[] args) {
        Integer[] arr = {2,3,1};
        List<Integer> list = Arrays.asList(arr);
        int idx=-1;
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                idx=i;
                break;
            }
        }
        if(idx == -1) {
            Collections.reverse(list);
            System.out.println(Arrays.asList(arr));
            return;
        }
        for (int i = arr.length-1; i >= idx; i--) {
            if(arr[i] > arr[idx]) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] =temp;
                break;
            }
        }
        int i=idx+1;
        int j=arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
