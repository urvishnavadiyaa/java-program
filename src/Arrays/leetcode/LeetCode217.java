package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode217 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i+1]) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}
