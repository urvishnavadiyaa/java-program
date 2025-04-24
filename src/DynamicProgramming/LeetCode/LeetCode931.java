package DynamicProgramming.LeetCode;

public class LeetCode931 {
    public static void main(String[] args) {
        int[][] mat = {{2,1,3},
                        {6,5,4},
                        {7,8,9}};
        int m = mat.length;
        int n = mat[0].length;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    mat[i][j] += Math.min(mat[i-1][j] , mat[i-1][j+1]);
                } else if (j == n-1) {
                    mat[i][j] += Math.min(mat[i-1][j] , mat[i-1][j-1]);
                } else {
                    mat[i][j] += Math.min(mat[i-1][j] , Math.min(mat[i-1][j+1] , mat[i-1][j-1]));
                }
                if (i == m-1) {
                    min = Math.min(min,mat[i][j]);
                }
            }
        }
        System.out.println(min);
    }
}
