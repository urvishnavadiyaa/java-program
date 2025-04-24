package Hashing.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1365 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            if (!freq.containsKey(sorted[i])) {
                freq.put(sorted[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = freq.get(nums[i]);
        }

        return ans;
    }
}
