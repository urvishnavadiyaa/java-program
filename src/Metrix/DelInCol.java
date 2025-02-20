package Metrix;

public class DelInCol {
    public static void main(String[] args) {
        int arr[][]={{2,8,0},
                    {9,1,4},
                    {5,2,6}};
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++) {
            int max=Integer.MIN_VALUE;
            int pos=0;
            for(int j=0;j<m;j++) {
                if(arr[j][i] > max) {
                    max=arr[j][i];
                    pos=j;
                }
            }
            while(pos != m-1) {
                arr[pos][i] = arr[pos+1][i];
                pos++;
            }
        }
        for(int i=0;i<m-1;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
