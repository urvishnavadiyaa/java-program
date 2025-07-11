package DynamicProgramming.LeetCode;

public class LeetCode416 {
    public static void main(String[] args) {
        int arr[] = {2,5,11,5};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            System.out.println("false");
            return;
        }
        int findsum = sum/2;
        boolean[][] ans = new boolean[arr.length+1][findsum+1];

        for (int i = 0; i < arr.length; i++) {
            ans[i][0] = true;
        }

        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 1; j < findsum+1; j++) {
                if (arr[i-1] <= j) {
                    ans[i][j] = ans[i-1][j] || ans[i-1][j - arr[i-1]];
                } else {
                    ans[i][j] = ans[i-1][j];
                }
                if (j == findsum && ans[i][j]) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
