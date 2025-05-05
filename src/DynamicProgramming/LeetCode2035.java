package DynamicProgramming;

public class LeetCode2035 {
    public static void main(String[] args) {
        int[] arr = {2, -1, 0, 4, -2, -9};
        int sum = 0;
        int minSum = 0;
        for (int num : arr) {
            sum += num;
            if (num < 0) {
                minSum += num;
            }
        }
        int range = sum - minSum;
        int offset = -minSum;
        boolean[][] dp = new boolean[arr.length + 1][range + 1];

        for (int i = 0; i <= arr.length; i++) {
            dp[i][offset] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= range; j++) {
                if (j - arr[i - 1] >= 0 && j - arr[i - 1] <= range) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int target = (sum + offset) / 2;
        int closestSum = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[arr.length][j]) {
                closestSum = j - offset;
                break;
            }
        }
        for (int j = target + 1; j <= range; j++) {
            if (dp[arr.length][j]) {
                if (Math.abs(2 * (j - offset) - sum) < Math.abs(2 * closestSum - sum)) {
                    closestSum = j - offset;
                }
                break;
            }
        }

        int minDiff = Math.abs(sum - 2 * closestSum);
        System.out.println("Minimum absolute difference: " + minDiff);
    }
}