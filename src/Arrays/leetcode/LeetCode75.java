package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode75 {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,0,1,1,0,1,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
