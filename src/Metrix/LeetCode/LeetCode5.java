package Metrix.LeetCode;

public class LeetCode5 {
    public static void main(String[] args) {
        int mat[][]={{1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,2,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1}};
        int m=mat.length;
        int n=mat[0].length;
        int ans[][]= new int[m-2][n-2];
        for(int i=0;i<m-2;i++) {
            for(int j=0;j<n-2;j++) {
                int max=0;
                for(int b=i;b<i+3;b++) {
                    for(int c=j;c<j+3;c++) {
                        if(mat[b][c] > max) {
                            max = Math.max(max,mat[b][c]);
                        }
                    }
                }
                ans[i][j] = max;
            }
        }
        for(int i=0;i< ans.length;i++) {
            for (int j=0;j< ans[0].length;j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
