package Arrays.leetcode;
import java.util.*;
public class LeetCode3 {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int arr2[]=new int[arr.length*2];
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[i];
            arr2[i+ arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
