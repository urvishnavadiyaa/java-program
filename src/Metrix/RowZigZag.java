package Metrix;

public class RowZigZag {
    public static void main(String[] args) {
        int metrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int m=metrix.length;
        int n=metrix[0].length;

        for(int i=0;i<m;i++) {
            if(i%2 == 0) {
                for(int j=0;j<n;j++) {
                    System.out.print(metrix[i][j]+" ");
                }
            }else {
                for(int j=m-1;j>=0;j--) {
                    System.out.print(metrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
