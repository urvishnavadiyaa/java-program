package Metrix.LeetCode;

public class LeetCode1 {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},
                        {3,2,1}};
        int m = mat.length;
        int n = mat[0].length;

        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<m;i++) {
            int sum=0;
            for(int j=0;j<n;j++) {
                sum =sum + mat[i][j];
            }
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
