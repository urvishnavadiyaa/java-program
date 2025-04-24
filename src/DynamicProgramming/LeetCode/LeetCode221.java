package DynamicProgramming.LeetCode;

public class LeetCode221 {
    public static int maximalSquare(int[][] mat,int m,int n) {
        int max = 0;
        int ans[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            ans[i][0] = mat[i][0];
        }
        for (int i = 0; i < n; i++) {
            ans[0][i] = mat[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0 || mat[i-1][j] == 0 || mat[i][j-1] == 0 || mat[i-1][j-1] == 0) {
                    ans[i][j] = mat[i][j];
                } else {
                    ans[i][j] = Math.min(ans[i-1][j-1],Math.min(ans[i-1][j],ans[i][j-1])) + 1;
                    max = Math.max(max,ans[i][j]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        char metrix[][] = {{'1','0','1','1','1','1','0'},
                            {'1','0','1','1','1','1','0'},
                            {'1','1','1','1','0','1','0'},
                            {'1','0','1','1','1','1','0'},
                            {'1','1','0','1','1','1','1'}};
        int m = metrix.length;
        int n = metrix[0].length;
        int mat[][] = new int[m][n];
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                mat[i][j] = (metrix[i][j] - '0');
            }
        }
        int total = maximalSquare(mat,m,n);
        System.out.println(total*total);
    }
}
