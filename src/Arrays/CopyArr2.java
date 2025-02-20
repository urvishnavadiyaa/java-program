package Arrays;

import java.util.Arrays;

public class CopyArr2 {
    public static void main(String[] args) {
        int arr[] ={10,21,30,43,50};
        int n = arr.length;
        int arr2[] = new int[n];
        int j =0;
        for(int i=0;i<n;i++) {
            if(arr[i] % 2 == 1) {
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i] % 2 == 0) {
                arr2[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
