package DynamicProgramming.LeetCode;

public class LeetCode62 {
    public static int uniquePaths(int m, int n) {
        int mat[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] += mat[i-1][j] + mat[i][j-1];
                }
            }
        }
        return mat[m-1][n-1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int total = uniquePaths(m,n);
        System.out.println(total);
    }
}
