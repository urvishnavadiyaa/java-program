package Metrix.LeetCode;

public class LeetCode3 {
    public static void main(String[] args) {
        int mat[][] = {{1,1,0},
                        {1,0,1},
                        {0,0,0}};
        int m = mat.length;
        int n = mat[0].length;
        int l=m-1;
        for(int i=0;i<m;i++) {
            int j=0;
            int k=l;
            while(j < k)  {
                if(mat[i][j] != mat[i][k]) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][k];
                    mat[i][k] = temp;
                }
                j++;
                k--;
            }
            int h=0;
            while(h != m) {
                if(mat[i][h] == 0) {
                    mat[i][h] = 1;
                } else {
                    mat[i][h] = 0;
                }
                h++;
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
