package Metrix;

public class DelMaxRow {
    public static void main(String[] args) {
        int metrix[][]={{12,8,0},
                        {9,1,4},
                        {5,2,6}};
        int m=metrix.length;
        int n=metrix[0].length;

        for(int i=0;i<m;i++) {
            int max=0;
            int pos=0;
            for(int j=0;j<n;j++) {
                if(metrix[i][j] > max) {
                    pos=j;
                    max=metrix[i][j];
                }
            }
            while(pos != m-1) {
                metrix[i][pos] = metrix[i][pos+1];
                pos++;
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n-1;j++) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
