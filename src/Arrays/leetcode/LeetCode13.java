package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode13 {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4,4,4,5,6};
        int num2[] = new int[nums.length];
        int curr=Integer.MAX_VALUE;
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != curr) {
                curr= nums[i];
                num2[k] = curr;
                k++;
            }
        }
        System.out.println(Arrays.toString(num2));
    }
}
