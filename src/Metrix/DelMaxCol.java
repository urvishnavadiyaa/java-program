package Metrix;

public class DelMaxCol {
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
                if(metrix[j][i] > max) {
                    pos=j;
                    max=metrix[j][i];
                }
            }
            while(pos != m-1) {
                metrix[pos][i] = metrix[pos+1][i];
                pos++;
            }
        }
        for(int i=0;i<m-1;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
