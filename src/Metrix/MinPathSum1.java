package Metrix;

public class MinPathSum1 {
    public static void main(String[] args) {
        int matrix[][]={{1,4,0,3},
                        {6,7,2,9},
                        {5,2,0,6}};
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i == 0 && j == 0) {
                }
                else if(i == 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i][j-1];
                }
                else if(j == 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i-1][j];
                }
                else {
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i][j-1],matrix[i-1][j]);
                }
            }
        }
        System.out.println(matrix[m-1][n-1]);
    }
}

