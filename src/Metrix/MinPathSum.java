package Metrix;

public class MinPathSum {

    static int rs1=0;
    static int ds1=0;
    static int tsum=0;
    public static int findPosition(int [][] matrix,int i,int j,int sum) {
        int sum1 = matrix[i][j];
        int sum2 = matrix[i][j];
        int sum3 = matrix[i][j];
        int sum4 = matrix[i][j];
//        if(i == matrix.length-1) {
//            s1=i;
//            return 0;
//        } else if(j == matrix[0].length-1) {
//
//        }
      int a=i,b=j;
        if(b+1 == matrix[0].length) {
//            sum1 = Integer.MAX_VALUE;
            sum2 = sum2 + matrix[a][b+1];
            b++;
            return sum2;
        }
        else if(i+1 == matrix.length) {
//            sum2 = Integer.MAX_VALUE;
            sum1 = sum1 + matrix[i+1][j];
            return sum1;
        }

        sum3 = sum3 + matrix[i][j+1];
        sum4 = sum4 + matrix[i+1][j];

        tsum = Math.min(sum3,sum4);
        if(tsum == sum4 && rs1 == 0) {
            rs1 = tsum;
        }
        else {
            ds1 = tsum;
        }
        return tsum;
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
        int rightsum=0;
        int downsum=0;
        while(i != m || j != n) {
            int sum=matrix[i][j];

            if(j < matrix[0].length-1) {
                rightsum=findPosition(matrix,i,j+1,sum);
            }
            else {
                totalsum = totalsum + matrix[i+1][j];
                i++;
                continue;
            }

            if(i < matrix.length-1) {
                downsum=findPosition(matrix,i+1,j,sum);
            }
            else {
                totalsum = totalsum + matrix[i][j+1];
                j++;
                continue;
            }

            int sumsum=Math.min(rightsum,downsum);
            if(sumsum == rs1) {
                totalsum = totalsum +matrix[i][j+1];
                j++;
            }
            else {
                totalsum = totalsum +matrix[i+1][j];
                i++;
            }

//            if(sum2 == s1) {
//                totalsum = totalsum + s1;
//                j++;
//            }
//            else {
//                totalsum = totalsum + s2;
//                i++;
//            }
            rs1=0;
            ds1=0;
        }
        System.out.println(totalsum);
    }
}
