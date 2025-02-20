package Arrays.leetcode;

public class SumOfGoodNum {
    public static void main(String[] args) {
        int nums[]={1,3,2,1,5,4};
        int k=2;
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isGood = true;
            if (i - k >= 0) {
                if (nums[i] <= nums[i - k]) {
                    isGood = false;
                }
            }
            if (i + k < n) {
                if (nums[i] <= nums[i + k]) {
                    isGood = false;
                }
            }
            if (isGood) {
                totalSum += nums[i];
            }
        }
        System.out.println(totalSum);
    }
}
