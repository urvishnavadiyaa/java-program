package DynamicProgramming.LeetCode;

public class LeetCode63 {
    public static int uniquePathsWithObstacles(int[][] mat,int m,int n) {
        int ans[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = -1;
                    ans[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0) && mat[i][j] != -1) {
                    ans[i][j] = 1;
                } else if (mat[i][j] != -1){
                    if (Math.max(ans[i][j-1],ans[i-1][j]) > 0) {
                        if (mat[i][j - 1] == -1 || mat[i - 1][j] == -1) {
                            ans[i][j] = Math.max(ans[i][j - 1], ans[i - 1][j]);
                        } else {
                            ans[i][j] = ans[i][j - 1] + ans[i - 1][j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        return ans[m-1][n-1];
    }
    public static void main(String[] args) {
        int mat[][] = {{0 ,0 ,0},
                        {0 ,1 ,0},
                        {0 ,0 ,0}};
        int m = mat.length;
        int n = mat[0].length;
        int total = uniquePathsWithObstacles(mat,m,n);
        System.out.println(total);
    }
}
