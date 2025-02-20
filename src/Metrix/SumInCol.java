package Metrix;

public class SumInCol {
    public static void main(String[] args) {
        int metrix[][]={{12,8,0},
                        {9,1,4},
                        {5,2,6}};
        int m=metrix.length;
        int n=metrix[0].length;

        for(int i=0;i<m;i++) {
            int sum=Integer.MIN_VALUE;
            for(int j=0;j<n;j++) {
                if(metrix[j][i] > sum) {
                    sum =metrix[j][i];
                }
            }
            System.out.print(sum+" ");
        }
    }
}
