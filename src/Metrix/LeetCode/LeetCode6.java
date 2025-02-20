package Metrix.LeetCode;

public class LeetCode6 {
    public static void main(String[] args) {
        int mat[][]={{2,8,0,-1},
                    {3,4,2,-1},
                    {1,1,-1,-2},
                    {-1,-1,-2,-3}};
        int m=mat.length;
        int n=mat[0].length;

        int count=0;
        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if(mat[i][j] < 0) {
                    count = count + 1;
                }
                if(mat[i][j] > 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
