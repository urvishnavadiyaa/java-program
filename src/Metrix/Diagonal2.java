package Metrix;

public class Diagonal2 {
    public static void main(String[] args) {
        int metrix[][]={{12,8,0},
                        {9,1,4},
                        {5,2,6}};
        int m=metrix.length;
        int n=metrix[0].length;
        int j=m-1;
        for(int i=0;i<m;i++) {
            if(i+j == n-1) {
                System.out.print(metrix[i][j]+" ");
                j--;
            }
        }
    }
}
