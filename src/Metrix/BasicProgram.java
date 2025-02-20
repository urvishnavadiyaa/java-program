package Metrix;

public class BasicProgram {
    public static void main(String[] args) {
        int metrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int m=metrix.length;
        int n=metrix[0].length;
        System.out.println(m);
        System.out.println(n);

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }

        int h=5;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(metrix[i][j] == h) {
                    System.out.println(i + "," + j);
                }
            }
        }

        int sum=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                sum = sum + metrix[i][j];
            }
        }
        System.out.println(sum);


        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<m;i++) {
            for(int j=n-1;j>=0;j--) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(metrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
