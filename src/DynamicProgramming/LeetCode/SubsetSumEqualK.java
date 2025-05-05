package DynamicProgramming.LeetCode;

public class SubsetSumEqualK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 23;

        boolean[][] ans = new boolean[arr.length+1][k + 1];
        for (int i = 0; i < arr.length; i++) {
            ans[i][0] = true;
        }

        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 1; j < k+1; j++) {
                if (arr[i-1] <= j) {
                    ans[i][j] = ans[i-1][j] || ans[i-1][j - arr[i-1]];
                } else {
                    ans[i][j] = ans[i-1][j];
                }
                if (j == k && ans[i][j]) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println(ans[arr.length][k]);
    }
}
