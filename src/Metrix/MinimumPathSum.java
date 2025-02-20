package Metrix;

public class MinimumPathSum {
    static int s1=0;
    static int s2=0;
    public static int findPosition(int [][] matrix,int i,int j,int sum) {
        int sum1= sum;
        if(j < matrix[0].length-1){
            sum1= sum1 + matrix[i][j+1];
        }
        int sum2= sum;
        if(i < matrix.length-1){
            sum2= sum2 + matrix[i+1][j];
        }
        int sum3 = 0, sum4 = 0;
        int a=i,b=j;
        while(b != matrix[0].length) {
            sum3 = sum3 + matrix[a][b];
            b++;
        }
        while(i != matrix.length) {
            sum4 = sum4 + matrix[i][j];
            i++;
        }
        int total = Math.min(sum3,sum4);
        if(total == sum3) {
            s1=sum1;
            return sum1;
        }
        else {
            s2=sum2;
            return sum2;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,4,0,3},
                        {6,7,2,9},
                        {5,2,0,6}};
        int m = matrix.length;
        int n = matrix[0].length;

        int i=0;
        int j=0;
        int sum2=0;
        int totalsum=0;
        while(i != m && j != n) {
            int sum=matrix[i][j];
            sum2=findPosition(matrix,i,j,sum);
            if(sum2 == s1) {
                totalsum = totalsum + s1;
                j++;
            }
            else {
                totalsum = totalsum + s2;
                i++;
            }
        }
        System.out.println(totalsum);
    }
}
