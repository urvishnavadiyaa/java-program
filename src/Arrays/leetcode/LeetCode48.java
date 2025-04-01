    package Arrays.leetcode;

    public class LeetCode48 {
        public static void main(String[] args) {
            int met[][] = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
            int m= met.length;
            int n= met[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = i; j < n; j++) {
                    int temp =met[j][i];
                    met[j][i] = met[i][j];
                    met[i][j] = temp;
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n/2; j++) {
                    int temp =met[i][j];
                    met[i][j] = met[i][n-1-j];
                    met[i][n-1-j] = temp;
                }
            }
            System.out.print("[");
            for (int i = 0; i < met.length; i++) {
                System.out.print("[");
                for (int j = 0; j < met[0].length; j++) {
                    if (j == met[0].length-1) {
                        System.out.print(met[i][j]);
                    } else {
                        System.out.print(met[i][j] +",");
                    }
                }
                System.out.print("]");
            }
            System.out.print("]");
        }
    }
