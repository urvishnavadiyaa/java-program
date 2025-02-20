package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr2[i] = sum+arr[i];
            sum=sum+arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
