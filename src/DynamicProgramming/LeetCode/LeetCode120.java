package DynamicProgramming.LeetCode;

public class LeetCode120 {
    public static void main(String[] args) {
        int mat[][] = {{2},
                        {3 ,4},
                        {6 ,5 ,7},
                        {4, 1, 8, 3}};
        for (int i = 1; i < mat.length; i++) {
            mat[i][0] += mat[i-1][0];
        }
        int mainmin = Integer.MIN_VALUE;
        for (int i = 1; i < mat.length; i++) {
            int min = mat[i][0];
            for (int j = 1; j < mat[i].length; j++) {
                if (j == mat[i].length-1) {
                    mat[i][j] += mat[i-1][j-1];
                } else {
                    mat[i][j] += Math.min(mat[i-1][j],mat[i-1][j-1]);
                    min = Math.min(min,mat[i][j]);
                }
            }
            mainmin = Math.max(mainmin,min);
        }
        System.out.println(mainmin);
    }
}
