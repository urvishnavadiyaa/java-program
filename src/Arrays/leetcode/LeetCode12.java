package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode12 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    arr[0]=i;
                    arr[1]=j;
                    System.out.println(Arrays.toString(arr));
                    return;
                }
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        System.out.println(Arrays.toString(arr));
    }
}
