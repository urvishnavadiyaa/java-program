package Arrays.leetcode;

public class LeetCode73 {
    public static void main(String[] args) {
        int met[][] = {{0,1,2,0},
                       {3,4,5,2},
                       {1,3,1,5}};
        int n = met.length;
        int m = met[0].length;
        int col0=1;
        for (int i = 0; i < met.length; i++) {
            for (int j = 0; j < met[0].length; j++) {
                if (met[i][j] == 0) {
                     met[i][0] = 0;
                     if (j != 0) {
                         met[0][j] = 0;
                     } else {
                         col0=0;
                     }
                }
            }
        }

        for (int i = 1; i < met.length; i++) {
            for (int j = 1; j < met[0].length; j++) {
                if (met[i][0] == 0 || met[0][j] == 0) {
                    met[i][j] = 0;
                }
            }
        }
        if (met[0][0] == 0) {
            for (int i = 0; i < m; i++) {
                met[0][i] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                met[i][0] = 0;
            }
        }
        for (int i = 0; i < met.length; i++) {
            for (int j = 0; j < met[0].length; j++) {
                System.out.print(met[i][j]+" ");
            }
            System.out.println();
        }
    }
}
