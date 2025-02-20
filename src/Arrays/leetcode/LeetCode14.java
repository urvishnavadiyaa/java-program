package Arrays.leetcode;

import java.util.Arrays;

public class LeetCode14 {
    public static void main(String[] args) {
        int nums[] = {2,3,3,2};
        int val=3;
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        while(k != nums.length) {
            nums[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
