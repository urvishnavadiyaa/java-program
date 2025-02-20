package Metrix;

public class DiagonalSum {
    public static void main(String[] args) {
        int metrix[][]={{12,8,0},
                        {9,1,4},
                        {5,2,6}};
        int m=metrix.length;
        int n=metrix[0].length;
        int sum=0;
        int j=m-1;
        for(int i=0;i<n;i++) {
            if(i == i) {
                sum = sum + metrix[i][i];
            }
            if(i+j == m-1) {
                sum = sum + metrix[i][j];
            }
            j--;
        }
        System.out.println(sum-metrix[m-1][n-1]);
    }
}
