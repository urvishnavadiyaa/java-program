package Metrix;

public class Metrix1 {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},
                    {40,50,60},
                    {70,80,90},
                    {100,110,120}};
        int m=arr.length;
        int n=arr[0].length;
        int k =110;
        System.out.println("row is : " + m +" colon is : " + n);

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][j] == k) {
                    System.out.println("element found in index at : " + i + "," + j);
                }
            }
        }
        int sum=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
