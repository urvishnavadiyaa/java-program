package Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int met[][]={{1,5,18,38},
                    {3,9,32,40},
                    {56,17,75,45},
                    {62,21,32,41}};
        int s = 78;
        int m=met.length;
        int n=met[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    met[i][j] += met[i][j-1];
                } else if (j == 0) {
                    met[i][j] += met[i-1][j];
                } else {
                    met[i][j] += Math.min(met[i][j-1],met[i-1][j]);
                }
            }
        }
        System.out.println(met[m-1][n-1]);
    }
}
