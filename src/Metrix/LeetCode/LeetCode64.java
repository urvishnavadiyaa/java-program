package Metrix.LeetCode;

public class LeetCode64 {
    public static void main(String[] args) {
        int met[][]={{1,3,1},
                    {1,5,1},
                    {4,2,1}};
        int m=met.length;
        int n=met[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                } else if (i == 0) {
                    met[i][j]+=met[i][j-1];
                } else if (j == 0) {
                    met[i][j]+=met[i-1][j];
                } else {
                    met[i][j] += Math.min(met[i][j-1],met[i-1][j]);
                }
            }
        }
        System.out.println(met[m-1][n-1]);
    }
}
