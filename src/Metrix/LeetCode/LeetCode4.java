package Metrix.LeetCode;

public class LeetCode4 {
    public static void main(String[] args) {
        int metrix[][]={{12,8,0,3},
                        {9,1,4,6},
                        {5,2,6,4},
                        {3,6,1,9}};
        int m=metrix.length;
        int n=metrix[0].length;
        int sum=0;
        int j=m-1;
        for(int i=0;i<n;i++) {
            if(i == i && i != j) {
                sum = sum + metrix[i][i];
            }
            if(i+j == m-1) {
                sum = sum + metrix[i][j];
            }
            j--;
        }
        System.out.println(sum);
    }
}
