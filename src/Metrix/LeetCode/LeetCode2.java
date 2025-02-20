package Metrix.LeetCode;

public class LeetCode2 {
    public static int findMax(int mat[][],int m,int n) {
        int maxsum = 0;
        for(int i=0;i<m;i++) {
            int idx=0;
            int sum=0;
            for(int j=0;j<n;j++) {
                if(mat[i][j] == -1) {
                    continue;
                }
                if(mat[i][j] > sum) {
                    idx = j;
                    sum = mat[i][j];
                }
            }
            maxsum = Math.max(maxsum,mat[i][idx]);
            mat[i][idx] = -1;

//            while(idx != n) {
//                mat[i][idx] = mat[i][idx+1];
//            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int mat[][] = {{58,42,8,75,28},
                        {35,21,13,21,72}};
        int m = mat.length;
        int n = mat[0].length;
        int totalsum=0;
        int a = Math.max(m,n);
        while(a != -1) {
            int sum=0;
            sum =findMax(mat,m,n);
            totalsum = totalsum + sum;
            a--;
        }
        System.out.println(totalsum);
    }
}
